import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(public http:HttpClient) { }  // DI for HttpClient 

  loadProductData():Observable<Product[]> {
    return this.http.get<Product[]>("http://localhost:3000/products");
  }
}
