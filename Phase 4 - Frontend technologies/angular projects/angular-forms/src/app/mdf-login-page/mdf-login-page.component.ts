import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-mdf-login-page',
  templateUrl: './mdf-login-page.component.html',
  styleUrls: ['./mdf-login-page.component.css']
})
export class MdfLoginPageComponent {
msg:string ="";
loginRef = new FormGroup({
  
  emailid:new FormControl(),
  password:new FormControl()

});

checkUser(): void {
  let login = this.loginRef.value;
  //console.log(login);
  if(login.emailid=="akash@gmail.com" && login.password=="123"){
    this.msg="Successfully  login";
  }else {
    this.msg="Failure try once agian";
  }
  this.loginRef.reset();
}

}


