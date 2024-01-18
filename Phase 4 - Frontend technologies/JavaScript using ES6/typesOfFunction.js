// normal function 

display1();
function display1() {
    document.write("This is normal function");
}
display1();

// expression style function part of ES5 
var display3 = function display2() {
                document.write("<br/>Expression style function with name")
            }

display3();     
//display4();
// expression style fucntion without name 
var display4 = function() {
    document.write("<br/> Expression style function without name")
}
display4();
