import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {
products:Array<Product>=[];
  constructor(public ps:ProductService){}     // DI for Product Service 
  loadProducts() : void {
    
    this.ps.loadProductData().subscribe({
      next:(data:any)=> this.products=data,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("product data loaded...")
    });
    
  }
}
