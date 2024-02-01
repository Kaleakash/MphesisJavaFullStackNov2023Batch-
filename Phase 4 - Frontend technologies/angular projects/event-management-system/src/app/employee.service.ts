import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(public http:HttpClient) { } // DI

  // post to store the data 
  storeEmployee(employee:any):Observable<any> {
    return this.http.post("http://localhost:3000/employees",employee);
  }

  findAllEmployee():Observable<Employee[]> {
    return this.http.get<Employee[]>("http://localhost:3000/employees");
  }

  findEmployeeById(id:any):Observable<Employee> {
    return this.http.get<Employee>("http://localhost:3000/employees/"+id)
  }

  deleteEmployee(id:any):Observable<any> {
    return this.http.delete("http://localhost:3000/employees/"+id)
  }

  updateEmployee(employee:any):Observable<any> {
    return this.http.put("http://localhost:3000/employees/"+employee.id,employee);
  }

}
