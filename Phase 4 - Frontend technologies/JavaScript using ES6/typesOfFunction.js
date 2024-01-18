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


// arrow function : it is a part of ES6 features 

let display5 = ()=>document.write("<br/> This is arrow function");

display5();

// expression style function with addition of two numbers 

let addNumber1 = function(a,b){
    var sum = a+b;
    return sum;
}
document.write("<br/> Addition of two number using experssion "+addNumber1(100,200));

// arrow style function with addition of two numbers 
let addNumber2 = (a,b)=>a+b;
document.write("<br/> Addition of two number using arrow  "+addNumber2(100,200));

// find the largest of two number using expression style 
let findlargest1 = function(a,b){
    
    if(a>b){
        return a;
    }else {
        return b;
    }

}
document.write("<br/> Find largest of two number using expression style "+findlargest1(10,5));
// find the largest of two number using arrow style 

let findlargest2 = (a,b)=>{
    
    if(a>b){
        return a;
    }else {
        return b;
    }

}
document.write("<br/> Find largest of two number using expression style "+findlargest2(10,5));



