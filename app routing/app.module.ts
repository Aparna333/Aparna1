import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import { routes } from './app.routes';
import { AppComponent } from './app.component';
import { AboutComponent } from './about.component';
import { HomeComponent } from './home.component';
import { HelpComponent } from './help.component';
import { AboutComponent1 } from './about.component.1';
import { OtherComponent } from './other.component';

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  declarations: [
    AboutComponent,
    HomeComponent,
    AboutComponent1,
    HelpComponent,
    AppComponent,
    OtherComponent
  ],
  providers: [ ],
  bootstrap: [ AppComponent ]
})
export class AppModule {
}
