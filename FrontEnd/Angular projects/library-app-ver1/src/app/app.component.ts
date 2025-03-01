import { Component } from '@angular/core';
import { Book } from './model/Book';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'library-app-ver1';
  work="capgemini";
  book:Book= {bookId:101,bookName:"Harry porter","price":500,genre:"Fantacy"}
}
