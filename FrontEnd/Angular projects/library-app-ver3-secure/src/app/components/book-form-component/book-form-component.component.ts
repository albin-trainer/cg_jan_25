import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Route, Router,Params } from '@angular/router';
import { Observable } from 'rxjs';
import { Book } from 'src/app/Book';
import { DataServiceService } from 'src/app/services/data-service.service';

@Component({
  selector: 'app-book-form-component',
  templateUrl: './book-form-component.component.html',
  styleUrls: ['./book-form-component.component.css']
})
export class BookFormComponentComponent implements OnInit {
 
  book:Book={bookId:0,bookName:"HELLO",genre:"",cost:10,cover:"",authourId:0}
  isAdd:boolean=false;
  toDo="Edit";
constructor(private router:Router,private route:ActivatedRoute,  private ds:DataServiceService){
}
ngOnInit(): void {
  let observable:Observable<Params>=  this.route.params;

  observable.subscribe(( p:Params)=>{
      let id=p['id'];
      if(id<=0){
        this.isAdd=true;
        this.toDo="Add";
        //pull authour details from backend 
      }
      else{
      let observable:Observable<Book> = this.ds.getBookById(id);
      observable.subscribe( {
        next:(book)=> this.book=book,
        error : err=>alert(err.error)
       })

      }
      this.isAdd=false;
      this.toDo="EDIT";
    })
}
submitForm():void{
  //call dataservice 
if(this.isAdd){
  this.ds.addBook(this.book).subscribe((b)=> this.router.navigate(['/books']))
  console.log(this.book);
}
else{
  //update ....
}

 
}
}
