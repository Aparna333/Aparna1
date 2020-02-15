import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';


import { EmployeeComponent } from './employee.component';
import { ComponentComponent } from './component/component.component';
@NgModule({
  declarations: [
    AppComponent,EmployeeComponent, ComponentComponent   ],
  imports: [
    BrowserModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
