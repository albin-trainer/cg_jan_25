export class Employee{
    empId:number;
    salary:number;
    address:string;
   
    display():void{
        console.log(this.empId);
        console.log(this.salary);
        console.log(this.address);
       
    }
}