// let obj1 = [];
// let obj2 = new Array();
// document.write("<br/> Size "+obj1.length);
// document.write("<br/> Size "+obj2.length);
// let obj3  =[10,20,30,40,"Ravi",true,1000.30];
// document.write("<br/> Size "+obj3.length);
// obj1.push(100);
// obj1.push(200);
// obj1.push(300);     // add the element at last 
// obj1.unshift(1);
// obj1.unshift(2);
// obj1.unshift(3);    // add the elements at begining 
// document.write("<br/> Size "+obj1.length);
// document.write("<br/> All elements in string format "+obj1);
// obj1.pop();     // remove elements from array from last 
// obj1.shift();       // remove elements from begining 
// document.write("<br/> All elements in string format "+obj1);
// document.write("<br/> Get specific element using index "+obj1[0]);
// document.write("<br/> Get specific element using index "+obj1[1]);

let obj4  = [100,200,300,400,500];
document.write("<br/> "+obj4);
// splice 1st parameter index, 2nd parameter number of element to delete
// 3rd, 4th,5th till nth to add the elements. 
//obj4.splice(2,1);       //2nd index position element remove ie 300
//obj4.splice(2,2);       //2nd index position element remove ie 300,400
//obj4.splice(1,0,111);       // 1 index position doen't delete any element add 111
//obj4.splice(1,1,111);       // 1 index position element replace by 111.
obj4.splice(2,0,111,222,333,444);//from 2nd index position add 4 element ie 111,222,333,444
document.write("<br/> "+obj4);



