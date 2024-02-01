import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit{
emailid:string="";
  constructor(public router:Router){}

  ngOnInit(): void {
  
    let obj = sessionStorage.getItem("user");
    
    if(obj!=null){
        this.emailid=obj;
        this.emailid=this.emailid.substring(0,this.emailid.indexOf('@'));
    }

  }

  logout(): void {
    sessionStorage.removeItem("user");
    this.router.navigate(["login"],{skipLocationChange:true});
  }

}
