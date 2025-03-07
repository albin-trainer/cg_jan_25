import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Book } from 'src/app/Book';
import { DataServiceService } from 'src/app/services/data-service.service';

@Component({
  selector: 'app-books-component',
  templateUrl: './books-component.component.html',
  styleUrls: ['./books-component.component.css']
})
export class BooksComponentComponent  implements OnInit {
 constructor(private ds:DataServiceService){  //DI
 } 
 books:Book[]=[];
   //automatically called after the constructor...
   public  ngOnInit():void{
    let observable:Observable<Book[]>=this.ds.getAllBooks();
    observable.subscribe({
      next:(books)=> {console.log(books);
        this.books=books;
      }
    })
   } 

   /* {bookId:101,bookName:"Harry porter",price:500,genre:"Fantancy","cover":"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8tJNhtl4fvNnXeElC-rBSFwwIxODNd_ROzQ&s"},
    {bookId:102,bookName:"Rich Dad Poor Dad",price:200,genre:"Drama","cover":"https://m.media-amazon.com/images/I/71MUrL4TV8L._AC_UC200,200_CACC,200,200_QL85_.jpg?aicid=community-reviews"},
    {bookId:103,bookName:"Alchemist",price:700,genre:"Motivation","cover":"https://cdn.dribbble.com/userupload/25879804/file/original-4e91d954cec1cc4745961f236976d83c.jpg"},
    {bookId:104,bookName:"Thirukural",price:100,genre:"AboutLife","cover":"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYDFocZWdUH7cUx9ASc-HxcKecE8os2l7Shw&s"},
  
    ];*/
  original:Book[]=this.books;
  searchText:string="somebook";
  searchBooks():void{
   console.log(this.searchText);
   //filter() returns a new array (it wont modify the original array)
   this.books=this.original.filter(b=>b.bookName.toLowerCase().
   indexOf (this.searchText.toLowerCase())>=0  || b.genre.toLowerCase().
   indexOf (this.searchText.toLowerCase())>=0)   
   ;
}
removeBook(id:number):void{
alert("REMOVING : "+id)
}
}
