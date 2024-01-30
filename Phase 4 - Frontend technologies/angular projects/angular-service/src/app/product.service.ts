import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'    // equal to app.module.ts file in provider section 
})
export class ProductService {

  constructor(public http:HttpClient) { }   // pre-defined API di which help to access rest api.

  loadFakeProduct(): void {
    this.http.get("https://api.escuelajs.co/api/v1/products").subscribe({
      next:(value:any)=>console.log(value),
      error:(error:any)=>console.log(error),
      complete:()=>console.log("done!")
    });
  }

}
