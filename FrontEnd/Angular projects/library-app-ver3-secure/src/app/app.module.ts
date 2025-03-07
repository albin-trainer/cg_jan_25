import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponentComponent } from './components/menu-component/menu-component.component';
import { BooksComponentComponent } from './components/books-component/books-component.component';
import { BookFormComponentComponent } from './components/book-form-component/book-form-component.component';
import { BookCardComponentComponent } from './components/book-card-component/book-card-component.component';
import { FormsModule } from '@angular/forms';
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';
import { LoginComponent } from './components/login/login.component';
import { JwtInterceptorInterceptor } from './interceptors/jwt-interceptor.interceptor';
@NgModule({
  declarations: [
    AppComponent,
    MenuComponentComponent,
    BooksComponentComponent,
    BookFormComponentComponent,
    BookCardComponentComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,HttpClientModule
  ],
  providers: [{ provide: HTTP_INTERCEPTORS, 
    useClass: JwtInterceptorInterceptor, multi: true }],
  bootstrap: [AppComponent]
})
export class AppModule { }
