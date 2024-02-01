import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  msg:string ="";
  loginRef = new FormGroup({
    emailid:new FormControl(),
    password:new FormControl()
  });

  constructor(public router:Router){}   // DI for Router API which help to navigate to another component 
  signIn(): void {
    let login = this.loginRef.value;

    if(login.emailid=="akash@gmail.com" && login.password=="123"){
        this.router.navigate(["home"]);
    }else {
        this.msg="Failure try once again";
    }

  }
}



