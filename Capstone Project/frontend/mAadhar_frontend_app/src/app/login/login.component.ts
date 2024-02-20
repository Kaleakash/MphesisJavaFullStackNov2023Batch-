import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
loginRef = new FormGroup({
  emailid:new FormControl(),
  password:new FormControl(),
  typeofuser:new FormControl()
})

citizenLogin(): void {
  this.loginRef.get("typeofuser")?.setValue("Citizens");
  let login = this.loginRef.value;
  console.log(login);
  this.loginRef.reset();
}
adminLogin(): void {
  this.loginRef.get("typeofuser")?.setValue("admin");
  let login = this.loginRef.value;
  console.log(login);
  this.loginRef.reset();
}
}
