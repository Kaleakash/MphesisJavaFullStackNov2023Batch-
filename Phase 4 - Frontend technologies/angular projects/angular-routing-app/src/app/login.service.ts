import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Login } from './login';
@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(public http:HttpClient) { }


  
  signUp(login:any):any{
    return this.http.post("http://localhost:3000/users",login);
  }

  // select * from login where emailid=? and password =?

  loadAllUsers():Observable<Login[]> {
    return this.http.get<Login[]>("http://localhost:3000/users")
  }
  
}
