import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Book } from '../Book';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {
 bookBaseURL:string="http://localhost:8080/books";
 authourBaseURL:string="http://localhost:8080/authours";
  constructor(private httpClient:HttpClient) { }

  getAllBooks(){
 let observable:Observable<Book[]>=this.httpClient.get<Book[]>(this.bookBaseURL);
 return observable;
  }
  addBook(book:Book){
    let observable:Observable<Book> 
    = this.httpClient.post<Book>(this.bookBaseURL,book);
    return observable;
  }
  getBookById(id:number){

    let observable:Observable<Book>=
    this.httpClient.get<Book>(`${this.bookBaseURL}/${id}`);
    return observable;
  }
}
