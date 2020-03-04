import { Component, Input, Output } from '@angular/core';
import { Item } from './item';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

 constructor(){
   console.log("constructor inkoked");
 }
 ngOnInIt(){
 }

}
