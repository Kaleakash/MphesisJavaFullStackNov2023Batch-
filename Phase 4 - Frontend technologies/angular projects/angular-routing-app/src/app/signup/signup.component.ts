import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { LoginService } from '../login.service';
import { Login } from '../login';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit{
loginRef = new FormGroup({
    emailid:new FormControl(),
    password:new FormControl()
  });


logins:Array<Login>=[];
  constructor(public ls:LoginService){}
msg:string ="";
  
// it call only once when component get loaded.....
ngOnInit(): void {
      this.ls.loadAllUsers().subscribe({
        next:(data:any)=>this.logins=data,
        error:(error:any)=>console.log(error),
        complete:()=>console.log("Loaded all login details")
      })
  }

  signUp() {
    let login = this.loginRef.value;    // login hold emailid and password which receive from form. 
    
    let result = this.logins.find(l=>l.emailid==login.emailid); // if present it return that record else return undefined. 
    if(result!=undefined){
        this.msg="EmailId must be unique";
    } else {
        this.ls.signUp(login).subscribe({
          next:(data:any)=>this.msg="Account created successfully",
          error:(error:any)=>console.log(error),
          complete:()=>console.log("done!")
        })
    }   
      this.loginRef.reset();

  }
}
