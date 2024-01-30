import { Component } from '@angular/core';
import { MyService } from '../my.service';
import { MyAngularService } from '../my.angularservice';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent {


msg:string="";
msg1:string ="";
constructor(public mas:MyAngularService){} // DI for sevice 
  fun1(): void {
    let ms = new MyService();
    this.msg=ms.sayHello();

    this.msg1=this.mas.sayHello();
  }
}
