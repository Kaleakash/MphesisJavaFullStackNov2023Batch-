// // document.write("Synchronous communication");
// // document.write("<br/>1st Statement");
// // document.write("<br/>2nd Statement");
// // document.write("<br/>3rd Statement");


// document.write("ASynchronous communication");
// document.write("<br/>1st Statement");

// setTimeout(()=> {
//     document.write("<br/>2nd Statement");
// },3000); 

// setInterval(()=> {
//     document.write("<br/>3rd Statement");
// },1000);

function fun(){
    setInterval(doTask,1000);
}
var i=0;
function doTask() {
    document.getElementById("abc").innerHTML=i;
    i++;
}