import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-tdf-login-page',
  templateUrl: './tdf-login-page.component.html',
  styleUrls: ['./tdf-login-page.component.css']
})
export class TdfLoginPageComponent {
msg:string ="";
  checkUser(loginRef:NgForm):void {
    let login = loginRef.value;
    //console.log(login);
    if(login.emailid=="akash@gmail.com" && login.password =="123"){
        this.msg="Successfully login"
    }else {
        this.msg  = "Failure try once again";
    }

    loginRef.reset();     // reset the value. 
  }
}
