import { Component } from '@angular/core';  // display from abc file 
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',     //<app-root></app-root>
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})

export class AppComponent {
  id:number = 123;
  name:string = "Ravi Kumar";
  age:number = 21;
  result : boolean = true;
}
