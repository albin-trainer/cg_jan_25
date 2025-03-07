import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BooksComponentComponent } from './components/books-component/books-component.component';
import { BookFormComponentComponent } from './components/book-form-component/book-form-component.component';
import { LoginComponent } from './components/login/login.component';

const routes: Routes = [
  {
    path:"books",
    component:BooksComponentComponent
  },
  {
    path:"addbook/:id",
    component:BookFormComponentComponent
  },
  {
    path:"login",
    component:LoginComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
