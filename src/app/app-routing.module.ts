import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SearchitemComponent } from './searchitem/searchitem.component';
import { ItemDetailsComponent } from './item-details/item-details.component';


const routes: Routes = [
  { path: '', redirectTo: 'item', pathMatch: 'full' },
 // { path: 'customer', component: CustomersListComponent },
 { path: 'searchitem', component: SearchitemComponent },
 {path : 'itemt-details',component:ItemDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
