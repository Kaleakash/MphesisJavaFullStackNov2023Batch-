import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeesComponent } from './employees/employees.component';
import { EmployeelistComponent } from './employeelist/employeelist.component';

const routes: Routes = [
  {path:"employees",component:EmployeesComponent},
  {path:"employeeview",component:EmployeelistComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
