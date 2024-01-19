let obj = new Date();
document.write("<br/> "+obj);
document.write("<br/> "+obj.getDate());
document.write("<br/> "+obj.getMonth());// month start from 0
document.write("<br/> "+obj.getFullYear());
document.write("<br/> "+obj.getHours());
document.write("<br/> "+obj.getMinutes());
document.write("<br/> "+obj.getSeconds());
obj.setMonth(obj.getMonth()+1);
document.write("<br/> "+obj.getMonth());// month start from 0