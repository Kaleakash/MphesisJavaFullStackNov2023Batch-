export class Product {          //map to json data. 
    constructor(public id:number,
        public title:string,
        public price:number,
        public description:string,
        public images:Array<string>
        ){}
}
