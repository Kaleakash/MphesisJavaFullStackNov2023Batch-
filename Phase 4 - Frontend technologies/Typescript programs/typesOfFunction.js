// function with number of parameter and type of parameter 
function add(a, b) {
    var sum = a + b;
    console.log(sum);
}
add(10, 20);
//add("A","B");
//add(10);
//add();
// function with any type of values but number of parameter must be match. 
function info(msg) {
    console.log(msg);
}
info(100);
info("Ravi");
info(true);
//info();
// function with passing parameter and no return type 
function addNumber(a, b) {
    console.log(a + b);
    //return 100;
}
addNumber(100, 200);
// function with specific return type 
function sayHello(name) {
    return "Welcome user " + name;
}
console.log(sayHello("Ravi"));
