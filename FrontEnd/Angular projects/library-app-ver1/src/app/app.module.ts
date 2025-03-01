import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BooksComponentComponent } from './components/books-component/books-component.component';
import { BookCardComponentComponent } from './components/book-card-component/book-card-component.component';

@NgModule({
  declarations: [
    AppComponent,
    BooksComponentComponent,
    BookCardComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
