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
  constructor(public ps:ProductService){} // DI for product service 

  loadProduct() {
    //this.ps.loadFakeProduct();

    this.ps.loadFakeProduct().subscribe({
      next:(value:any)=>this.products=value,    // load all products and store in produts array 
          error:(error:any)=>console.log(error),
          complete:()=>console.log("done!")
    })
  }


}
