import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';
import { FormControl, FormGroup } from '@angular/forms';
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit{
productRef = new FormGroup({
  id:new FormControl(),
  name:new FormControl(),
  price:new FormControl(),
  image:new FormControl()
});
// this function call only once when component loaded...
ngOnInit(): void {
    this.loadProducts();
}
dd = new Date();
submitButton:string ="Store Product";

products:Array<Product>=[];
  constructor(public ps:ProductService){}     // DI for Product Service 
  loadProducts() : void {
    
    this.ps.loadProductData().subscribe({
      next:(data:any)=> this.products=data,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("product data loaded...")
    });

  }
msg:string ="";
  storeProduct(): void {
    let product = this.productRef.value;

if(this.submitButton=="Store Product"){


  console.log(product);
  let result = this.products.find(p=>p.id==product.id); // if present it return that record 
                        // else it return undefined. 
  if(result==undefined){
    this.ps.storeProduct(product).subscribe({
      next:(data:any)=>console.log(data),
      error:(error:any)=>console.log(error),
      complete:()=>{this.loadProducts()}
    })
  }else {
    this.msg="Product is must be unique";
  }


}else {
  //alert("ready to update")
  this.ps.updateProduct(product).subscribe({
    next:(data:any)=>console.log(data),
    error:(error:any)=>console.log(error),
    complete:()=>{this.loadProducts()}
  })

  this.submitButton="Store Product";
}



    
    this.productRef.reset();
  }

  deleteProduct(pid:any):void {
    //alert(pid);
    this.ps.deleteProduct(pid).subscribe({
      next:(data:any)=>console.log(data),
      error:(error:any)=>console.log(error),
      complete:()=>{this.loadProducts()}
    })
  }

  setUpdateProduct(product:any): void {
    // productRef is form group get to get form control 
    this.productRef.get("id")?.setValue(product.id);    
    this.productRef.get("name")?.setValue(product.name);   
    this.productRef.get("price")?.setValue(product.price);   
    this.productRef.get("image")?.setValue(product.image);   
    this.submitButton="Update Product";
  }




}
