import { Component } from '@angular/core';
import { MyService } from '../my.service';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent {
msg:string ="";
  fun1(): void {
    let ms = new MyService();
    this.msg = ms.sayHello();
  }
}
