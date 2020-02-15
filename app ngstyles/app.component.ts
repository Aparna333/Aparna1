import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})


export class AppComponent {
space
sky
obj
color:string
size:number
fontstyle:string
visible:boolean
//displayText:string
constructor() { 
    this.color = 'pink';
    this.size = 16;
    //this.displayText = 'show-class';
   //this.visible = true;
   this.fontstyle='normal';
   this.space="my name is space";
   this.sky="my name is sky";
   this.obj={
     "id":1,"name":"mine ","address":{"street":"ntr","city":"chennai","pin":"123455"}
   }
  }

  
 /* toggle() {
    this.visible = !this.visible;
    this.displayText = this.visible ? 'show-class' : 'hide-class';
  }
*/
}