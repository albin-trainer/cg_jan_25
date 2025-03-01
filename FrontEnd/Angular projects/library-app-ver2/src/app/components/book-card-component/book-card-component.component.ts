import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Book } from 'src/app/Book';

@Component({
  selector: 'book-card-component',
  templateUrl: './book-card-component.component.html',
  styleUrls: ['./book-card-component.component.css']
})
export class BookCardComponentComponent {
  @Input()
bookList:Book[]=[];
 
@Output()
delEvent:EventEmitter<number>=
 new EventEmitter<number>();
deleteBook(id:number):void{
  alert(id);
  this.delEvent.next(id);
}
}
