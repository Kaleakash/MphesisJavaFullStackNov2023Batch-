import { Injectable } from "@angular/core";

@Injectable()           // for this class we can do DI. 
export class MyAngularService {

    sayHello() : string {
        return "Welcome to simple service with DI";
    }
    
}