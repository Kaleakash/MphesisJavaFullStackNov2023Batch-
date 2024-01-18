var count=1;
function addInfo(){
var name = document.getElementById("n1").value;
var age = document.getElementById("n2").value;
var pTagRef = document.createElement("p1"); // p tag ref ready 
//var pTagValue = document.createTextNode("Hello.."); // content ready as Hello
var pTagValue = document.createTextNode("Name is "+name+" Age is "+age); // content ready as Hello


if(age>=30){
    pTagRef.setAttribute("class","abc");
}else {
    pTagRef.setAttribute("class","xyz");
}
pTagRef.setAttribute("id",count);
pTagRef.appendChild(pTagValue)  // added contents inside p tag <p>Hello</p>

document.getElementsByTagName("div")[0].appendChild(pTagRef);   // <div><p>Hello</p></div>
//document.getElementsByTagName("body")[0].appendChild(pTagRef);   // <body><p>Hello</p></body>
document.getElementById("n1").value="";
document.getElementById("n2").value="";
count++;
}