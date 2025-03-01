import { Component, Input } from '@angular/core';
import { Book } from 'src/app/model/Book';

@Component({
  selector: 'app-book-card-component',
  templateUrl: './book-card-component.component.html',
  styleUrls: ['./book-card-component.component.css']
})
export class BookCardComponentComponent {
 @Input()
  bookList:Book[]=[];
  @Input()
  data:number=0;
}
