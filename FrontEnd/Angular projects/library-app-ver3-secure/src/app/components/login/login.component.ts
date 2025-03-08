import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationServiceService } from 'src/app/services/authentication-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent  {

  username = ''
  password = ''
 
  invalidLogin = false
  

  error:string=""

  constructor(private router: Router,
    private loginservice: AuthenticationServiceService) { }
 
    checkLogin(evt:any) {
      evt.preventDefault();
 // console.log(this.username,this.password);
  
  let loginData={"username":this.username,"password":this.password};
  this.loginservice.authenticate(loginData).subscribe(
  
    (data:any)=>{console.log(data);
      sessionStorage.setItem("token","Bearer "+data.token);
      sessionStorage.setItem("username",this.username);
      sessionStorage.setItem("isLoggedIn","true");
      this.router.navigate(["/books"]) 
    }
    ,error=>{
      this.error="Invalid Login credentials";
      this.invalidLogin=true;
    }
    )
  }
}
