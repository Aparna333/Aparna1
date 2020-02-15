import { Component } from '@angular/core';
import { NgSwitchDefault } from '@angular/common';
import { User } from './users';

@Component({
  selector: 'app-root',
  templateUrl:'./app.component.html' ,
  styleUrls: ['./app.component.css']
})

export class AppComponent {
isValid = true;
ids = [1,2,3];
title = 'app';
count=[8,5];
	users = [
      new User('Mahesh', 20,'a@gmail.com'),
      new User('Krishna', 22,'abc@gmail.com'),
      new User('Narendra', 31,'aaaa@gmail.com')
    ];
    shide()
  {
    this.isValid = !this.isValid;
  }
  
  }
