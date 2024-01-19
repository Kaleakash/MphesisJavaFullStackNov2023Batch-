// literal style object creation 
let emp1 = {id:100,name:"Ravi",salary:12000};
document.write("<br> Object in literal style")
document.write("<br/> id is "+emp1.id);
document.write("<br/> name is "+emp1.name);
document.write("<br/> salary is "+emp1.salary);

// object creation in function style in ES5 style 
function Employee() {

        this.id=101;
        this.name = "Ramesh";
        this.salary = 14000;    // like instance variable.
        var age=21;         // this variable not behave like instance variable it is local variable 
        this.disEmployee  = function() {    // instance function or method 
            document.write("<br/> Employee object function");
            document.write("<br/> id is "+this.id);
            document.write("<br/> name is "+this.name);
            document.write("<br/> salary is "+this.salary);
        }
        let info = function() {     // this function not a part of object it is normal function consider. 
            document.write("info function")
        }
}
//Employee(); it behave like normal function 
var emp2 = new Employee();  // it behave like user defined object. 
document.write("<br/> Object creation using function style")
document.write("<br/> Id is "+emp2.id);
document.write("<br/> Name is "+emp2.name);
document.write("<br/> Salary is "+emp2.salary);
document.write("<br/> Salary is "+emp2.age);
emp2.disEmployee();
//emp2.info();