import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationServiceService {

  constructor(private httpClient: HttpClient) { }
  authenticate(loginData:any) {
    return this.httpClient
      .post<any>("http://localhost:8080/login",loginData);
  }
      isUserLoggedIn() {
        let user = sessionStorage.getItem("username");
        console.log(!(user === null));
        return !(user === null);
      }
    
      logOut() {
        sessionStorage.removeItem("username");
        sessionStorage.removeItem("token");
      }
}
