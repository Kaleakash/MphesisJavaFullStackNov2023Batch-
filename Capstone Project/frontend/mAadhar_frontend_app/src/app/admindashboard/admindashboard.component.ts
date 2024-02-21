import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CitizensService } from '../citizens.service';
import { Citizens } from '../citizens';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})
export class AdmindashboardComponent implements OnInit{
allCitizends:Array<Citizens>=[];
  constructor(public router:Router,public cs:CitizensService){}

  ngOnInit(): void {
      this.cs.allCitizensInformation().subscribe({
        next:(result:any)=> {
            this.allCitizends=result;
        },
        error:(error:any)=> {

        },
        complete:()=> console.log("done!")
      })
  }
  logout(): void {
    this.router.navigate(["login"],{skipLocationChange:true})
  }
}
