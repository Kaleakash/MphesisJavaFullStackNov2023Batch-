import { Component } from '@angular/core';
import { MyService } from '../my.service';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent {
msg:string="";
  fun1(): void {
    let ms = new MyService();
    this.msg=ms.sayHello();
  }
}
