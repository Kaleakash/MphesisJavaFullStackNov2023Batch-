import { Component } from '@angular/core';

@Component({
  selector: 'app-attribute-directives',
  templateUrl: './attribute-directives.component.html',
  styleUrls: ['./attribute-directives.component.css']
})
export class AttributeDirectivesComponent {
  styleVariable={'color':'green','background-color':'yellow'};
  f1:boolean = true;
  f2:boolean = false;

  fun1() : void {
    this.f1? this.f1=false: this.f1=true;
    this.f2? this.f2=false: this.f2=true;
  }
}
