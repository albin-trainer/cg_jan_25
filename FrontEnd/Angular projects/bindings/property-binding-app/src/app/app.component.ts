import { Component } from '@angular/core';
import { Employee } from './Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  ename:string='';
  id:number=0;
   isEditMode: boolean = false;
   city:string="Bangalore";

  editModeOn() {
    this.isEditMode = true;
  }

  editModeOff() {
    this.isEditMode = false;
  }
  selectedEmp(e:Employee){
 this.ename=e.ename;
 this.id=e.id;
  }
  
}
