import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employeelist',
  templateUrl: './employeelist.component.html',
  styleUrls: ['./employeelist.component.css']
})
export class EmployeelistComponent implements OnInit{

  employee:any;
f1:boolean = true;
f2:boolean = false;
  constructor(public es:EmployeeService,public router:Router){} // DI
  
  ngOnInit(): void {
      let obj = sessionStorage.getItem("eid");
      if(obj!=null){
        let id = obj;
          this.es.findEmployeeById(id).subscribe({
            next:(data:any)=>this.employee=data,
            error:(error:any)=>console.log(error),
            complete:()=>console.log("done")
          })
      }
  }

  displayAllEmployeeList() : void {
      this.router.navigate(["employees"])
  }

  deleteEmployee(id:any): void {
    alert(id)
  }

  updateEmployee(employee:any): void {
      this.f2=true;
      this.f1=false;
  }
}
