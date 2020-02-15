import {BrowserModule} from '@angular/platform-browser';
import {NgModule}      from '@angular/core';
import {AppComponent}  from './app.component';
import {FilterData} from './filterData';


@NgModule({
  imports: [     
        BrowserModule
  ],
  declarations: [
        AppComponent, FilterData  
  ],
  bootstrap: [
        AppComponent
  ]
})
export class AppModule { }
