import { BrowserModule } from '@angular/platform-browser';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { ItemDetailsComponent } from './item-details/item-details.component';
import { SearchitemComponent } from './searchitem/searchitem.component';
import { FormsModule,NgForm} from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    ItemDetailsComponent,
    SearchitemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, HttpClientModule,FormsModule
    ,ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA]
})
export class AppModule { }
