import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(public http:HttpClient) { }  // DI for HttpClient 

  // get for load the data from rest api 
  loadProductData():Observable<Product[]> {
    return this.http.get<Product[]>("http://localhost:3000/products");
  }

  // post is use store the data
  // 2 parameter 1st url and 2nd parameter json data ie product data. 
  storeProduct(product:any): any {
    return this.http.post("http://localhost:3000/products",product);
  }

  deleteProduct(pid:any):any {
    // delete record using path param
    return this.http.delete("http://localhost:3000/products/"+pid)
  }

   // post is use put the data
  // 2 parameter 1st url with product id and 2nd parameter updated or existing data. 
  updateProduct(product:any): any {
    return this.http.put("http://localhost:3000/products/"+product.id,product);
  }


}



