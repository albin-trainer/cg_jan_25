import { Component, Input } from '@angular/core';
import { Book } from 'src/app/model/Book';

@Component({
  selector: 'app-books-component',
  templateUrl: './books-component.component.html',
  styleUrls: ['./books-component.component.css']
})
export class BooksComponentComponent {
  x:number=99;
books:Book[]=[
  {bookId:101,bookName:"Harry porter",price:500,genre:"Fantancy","cover":"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8tJNhtl4fvNnXeElC-rBSFwwIxODNd_ROzQ&s"},
  {bookId:102,bookName:"Rich Dad Poor Dad",price:200,genre:"Drama","cover":"https://m.media-amazon.com/images/I/71MUrL4TV8L._AC_UC200,200_CACC,200,200_QL85_.jpg?aicid=community-reviews"},
  {bookId:103,bookName:"Alchemist",price:700,genre:"Motivation","cover":"https://cdn.dribbble.com/userupload/25879804/file/original-4e91d954cec1cc4745961f236976d83c.jpg"},
  {bookId:104,bookName:"Thirukural",price:100,genre:"AboutLife","cover":"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYDFocZWdUH7cUx9ASc-HxcKecE8os2l7Shw&s"},
];


}
