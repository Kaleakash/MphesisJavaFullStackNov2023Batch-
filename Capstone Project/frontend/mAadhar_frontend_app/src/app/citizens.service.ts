import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Citizens } from './citizens';

@Injectable({
  providedIn: 'root'
})
export class CitizensService {

  constructor(public httpClient:HttpClient) { } // DI


  searchCitizenByEmailiId(emailid:any):Observable<Citizens> {
    return this.httpClient.get<Citizens>("http://localhost:9090/citizens/searchCitizenByEmailId/"+emailid);
  }


  allCitizensInformation():Observable<Citizens[]>{
    return this.httpClient.get<Citizens[]>("http://localhost:9090/citizens/findAll");
  }
}
