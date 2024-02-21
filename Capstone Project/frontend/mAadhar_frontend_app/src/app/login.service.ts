import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(public httClient:HttpClient) { } // DI for HttpClient

// by default all httpClient return type json consider 
  
signIn(login:any):Observable<string> {
    return this.httClient.post("http://localhost:9090/login/signIn",login,{responseType:'text'});
  }

}
