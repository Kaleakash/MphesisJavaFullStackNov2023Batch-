// class Product {
//     pid:number;
//     pname:string;
//     price:number;
//     constructor(pid:number=0.0,pname:string="Unkown",price:number=25000){
//         this.pid = pid;
//         this.pname=pname;
//         this.price=price;
//     }
//     disProductInfo():void {
//         console.log("Product object function")
//         console.log("pid "+this.pid);
//         console.log("pname "+this.pname);
//         console.log("price  "+this.price)
//     }
// }
// let p1 = new Product(100,"TV",56000);
// let p2 = new Product(101,"Computer");
// let p3 = new Product(102);
// let p4 = new Product();
// p1.disProductInfo();
// p2.disProductInfo();
// p3.disProductInfo();
// p4.disProductInfo();

// creating object with access specifiers with contructor parameter variable 
class Product {
   
    constructor(private pid:number=0.0,public pname:string="Unkown",
    private price:number=25000){
      
    }
    disProductInfo():void {
        console.log("Product object function")
        console.log("pid "+this.pid);
        console.log("pname "+this.pname);
        console.log("price  "+this.price)
    }
}
let p1 = new Product(100,"TV",56000);
let p2 = new Product(101,"Computer");
let p3 = new Product(102);
let p4 = new Product();
console.log(p1.pname);
p1.disProductInfo();
p2.disProductInfo();
p3.disProductInfo();
p4.disProductInfo();