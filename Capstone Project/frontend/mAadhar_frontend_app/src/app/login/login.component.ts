import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';

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
constructor(public ls:LoginService,public router:Router){

}
msg:string ="";
citizenLogin(): void {
  this.loginRef.get("typeofuser")?.setValue("Citizens");
  let login = this.loginRef.value;
  console.log(login);
  this.ls.signIn(login).subscribe({
    next:(result:any)=> {
      console.log(result)
      if(result=="Citizen login successfully"){
        sessionStorage.setItem("user",login.emailid);     // set in session storage. 
          this.router.navigate(["citizenshome"],{skipLocationChange:true})
      }else {
          this.msg=result;
      }
    },
    error:(error:any)=> {
      console.log(error)
    },
    complete:()=>console.log("citizen login done!")
  })

  this.loginRef.reset();
}
adminLogin(): void {
  this.loginRef.get("typeofuser")?.setValue("admin");
  let login = this.loginRef.value;
  console.log(login);
  this.ls.signIn(login).subscribe({
    next:(result:any)=> {
      console.log(result)
      if(result=="Admin login successfully"){
        this.router.navigate(["adminhome"],{skipLocationChange:true})
      }else {
          this.msg=result;
      }
    },
    error:(error:any)=> {
      console.log(error)
    },
    complete:()=>console.log("admin login done!")
  })
  this.loginRef.reset();
}
}
