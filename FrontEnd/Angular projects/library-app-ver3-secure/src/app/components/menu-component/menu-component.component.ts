import { Component } from '@angular/core';
import {  Router } from '@angular/router';

@Component({
  selector: 'menu-component',
  templateUrl: './menu-component.component.html',
  styleUrls: ['./menu-component.component.css']
})
export class MenuComponentComponent {
  isLoggedIn:string="";
  constructor(private router:Router){
    this.isLoggedIn=sessionStorage.getItem("isLoggedIn")||"false";
    console.log(this.isLoggedIn)
  }
 logout():void{
  sessionStorage.removeItem("token");
  sessionStorage.removeItem("username");
  sessionStorage.setItem("isLoggedIn","false");
  this.router.navigate(['/login'])
 }
}
