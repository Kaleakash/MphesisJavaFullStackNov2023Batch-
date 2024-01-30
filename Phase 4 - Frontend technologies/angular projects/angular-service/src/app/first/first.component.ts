import { Component } from '@angular/core';
import { MyService } from '../my.service';
import { MyAngularService } from '../my.angularservice';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent {

constructor(public mas:MyAngularService){}    // DI means pull the service objects. 

msg:string ="";
msg1:string ="";
  fun1(): void {
    
    let ms = new MyService();
    this.msg = ms.sayHello();

    this.msg1=this.mas.sayHello();  // here we are not creating object using new keyword pulling object using DI concept. 
  }



}
