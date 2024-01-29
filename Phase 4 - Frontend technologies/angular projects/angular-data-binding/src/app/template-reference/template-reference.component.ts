import { Component } from '@angular/core';

@Component({
  selector: 'app-template-reference',
  templateUrl: './template-reference.component.html',
  styleUrls: ['./template-reference.component.css']
})
export class TemplateReferenceComponent {
msg:string ="";
  passValue(nameref:any):void {
    let name = nameref.value;   // name is local but msg is instance 
    //alert("your name is "+name);
    this.msg = "Welcome user "+name;
    nameref.value="";   // reset value 
  }
}
