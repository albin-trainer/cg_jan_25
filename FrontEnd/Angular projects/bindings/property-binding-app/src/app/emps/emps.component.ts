import { Component, EventEmitter, Output } from '@angular/core';
import { Employee } from '../Employee';

@Component({
  selector: 'app-emps',
  templateUrl: './emps.component.html',
  styleUrls: ['./emps.component.css']
})
export class EmpsComponent {
  @Output()
  e:EventEmitter<Employee>=new EventEmitter();
emps:Employee[]=[{id:101,ename:"A"},
  {id:102,ename:"B"},
  {id:103,ename:"C"},
  {id:104,ename:"D"}];

  deleteEmp(id:number){
   this.emps= this.emps.filter(e=>e.id!=id);
  }
  choseEmp(emp:Employee){
    this.e.next(emp);
  }
}
