export class Student{
    constructor(private id:number,private sname:string){
    }
    display():void{
        console.log(` id is ${this.id} and name is ${this.sname}`)
    }
}

let s:Student =new Student(101,"Thirtha");
s.display();