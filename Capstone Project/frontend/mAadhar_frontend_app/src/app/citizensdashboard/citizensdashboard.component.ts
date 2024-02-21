import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Citizens } from '../citizens';
import { CitizensService } from '../citizens.service';

@Component({
  selector: 'app-citizensdashboard',
  templateUrl: './citizensdashboard.component.html',
  styleUrls: ['./citizensdashboard.component.css']
})
export class CitizensdashboardComponent implements OnInit{
emailid:string ="";
citizens:any;
  constructor(public router:Router,public cs:CitizensService){}

  ngOnInit(): void {
      let obj  = sessionStorage.getItem("user");
      if(obj!=null){
          this.emailid=obj;
          this.cs.searchCitizenByEmailiId(this.emailid).subscribe({
            next:(result:any)=>{
              this.citizens=result
              console.log(this.citizens);
            },
            error:(error:any)=>console.log(error),
            complete:()=>console.log("got citizens")
          })
      }
  }
  logout(): void {
    this.router.navigate(["login"],{skipLocationChange:true})
  }
flag:boolean = false;
  viewAadharCard(): void {
      this.flag=true;
  }


}





