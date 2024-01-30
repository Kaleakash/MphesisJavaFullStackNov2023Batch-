import { Component } from '@angular/core';

@Component({
  selector: 'app-structure-directives',
  templateUrl: './structure-directives.component.html',
  styleUrls: ['./structure-directives.component.css']
})
export class StructureDirectivesComponent {
f1:boolean = true;
f2:boolean = false;
f3:boolean = false;

f4:boolean = false;
b1:string = "show";


n1:Array<number>=[10,20,30,40,50,60];
names:Array<string>=["Ravi","Ramesh","Ajay","Vijay"];

fun1(): void {
  this.f3=true;
}
toggleImg(): void {
  
  if(this.b1=="show"){
    this.b1="hide";
    this.f4=true;
  }else {
    this.b1 = "show";
    this.f4=false;
  }

}

addNames(nameRef:any){      // templatereferne 
  let name = nameRef.value;
  this.names.push(name);      // added to array variables. 
  nameRef.value="";
}




}
