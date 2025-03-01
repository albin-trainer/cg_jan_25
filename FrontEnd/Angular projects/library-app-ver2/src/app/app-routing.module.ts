import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BooksComponentComponent } from './components/books-component/books-component.component';
import { BookFormComponentComponent } from './components/book-form-component/book-form-component.component';

const routes: Routes = [
  {
    path:"books",
    component:BooksComponentComponent
  },
  {
    path:"addbook/:id",
    component:BookFormComponentComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
