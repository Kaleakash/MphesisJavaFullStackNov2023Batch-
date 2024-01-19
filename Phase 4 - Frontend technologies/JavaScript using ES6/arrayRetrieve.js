//let num=[100,200,300,400,500];
// document.write("<br/> "+num);
// document.write("<br/> "+num.join("->"));
// document.write("<br/> Retreive element using for loop");
// for(let i=0;i<num.length;i++){
//     document.write("<br/> Value is "+num[i]);
// }
// document.write("<br/> Retreive element using for in loop")
// for(let i in num){
//     document.write("<br/> index "+i+" Value "+num[i]);
// }
// document.write("<br/> Retreive element using for of loop")
// for(let n of num){
//     document.write("<br/> Value "+n);
// }
// document.write("<br/> retrieve using callback")
// num.forEach(display);

// function display(v,i){
//     document.write("<br/>Value is "+v+" Index is "+i)
// }
// document.write("<br/> retreive using callback as function expression");
// num.forEach(function(v,i){
//     document.write("<br/> VAlue is "+v+" Index is "+i)
// });
// document.write("<br/> retreive using callback as function expression");

// num.forEach((v,i)=>document.write("<br/>Value is "+v+"Index is "+i));

//let num=[100,111,200,113,300,11,5400,500,117];

//num.map(e=>e+10).forEach(v=>document.write("<br/> Value is "+v));

//num.forEach(v=>document.write("<br/> Value is "+v));
//num.filter(v=>v%2==0).forEach(v=>document.write("<br/> Value "+v));
//num.filter(v=>v%2!=0).forEach(v=>document.write("<br/> Value "+v));
//num.map(v=>v+100).forEach(v=>document.write("<br/> Value is "+v));

let num = [10,20,30,40,50,60];
            //num.reduce()
document.write("<br/> "+num+"<br/>");
let total = num.reduce((pv,cv)=>pv+cv);
document.write(total);

let total1= num.reduce(function(pv,cv) {
    document.write("<br/>previous value "+pv);
    document.write("<br/>current value "+cv);
    return pv+cv;
})
document.write("<br/>Total at last "+total1)

