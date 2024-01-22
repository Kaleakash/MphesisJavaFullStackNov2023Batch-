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
    setInterval(doTask,1000);   //1st parameter callback and 2nd parameter time 
}
var i=0;
function doTask() {
    document.getElementById("abc").innerHTML=i;
    if(i%2==0){
        document.getElementsByTagName("body")[0].style.background="Pink";
        document.getElementsByTagName("h2")[0].style.color="RED";
        document.getElementsByTagName("h2")[0].style.fontSize="20pt";
    }else {
        document.getElementsByTagName("body")[0].style.background="Yellow";
        document.getElementsByTagName("h2")[0].style.color="GREEN";
        document.getElementsByTagName("h2")[0].style.fontSize="40pt";
    }
    i++;
}