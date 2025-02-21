export class Customer{
    cid:number; //default access specifier is public (private, public and protected)
    cname:string;
    address:string;
   
    constructor (cid:number,cname:string, address:string){
        this.cid=cid;
        this.cname=cname;
        this.address=address;
    }
    public getData():string{
        return `customer id is ${this.cid} 
         and name is ${this.cname} and address is 
         ${this.address}`;
    }
}