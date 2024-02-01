import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit{

  employees:Array<Employee>=[];
  constructor(public es:EmployeeService,
    public router:Router){}  //DI

  ngOnInit(): void {
    this.loadEmployee()  
  }

  loadEmployee() : void {
    this.es.findAllEmployee().subscribe({
      next:(data:any)=>this.employees=data,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("All Emloyee loaded...")
    })
  }

  viewDetails(id:any):void {
      //alert(id);
      sessionStorage.setItem("eid",id);
      this.router.navigate(["employeeview"]);
  }

}
