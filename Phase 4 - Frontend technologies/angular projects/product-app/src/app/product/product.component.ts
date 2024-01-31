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

    
    this.productRef.reset();
  }




}
