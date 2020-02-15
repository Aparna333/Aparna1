import { Component } from '@angular/core';
import {FilterData} from './filterData';
@Component({
  selector: 'app-root',
	template: `
	<input type="text" #filter (keyup)="0"/><br/>
	<table border=1>
	<!--style="border-style:solid;border-width:1px;-->
	<tr *ngFor="let point of (points | filterData: filter.value)">
	      <td>{{point}}</td>
	</tr>
	</table>`
})

export class AppComponent {
	points: string[] = [
		 'aa',
		 'bb',
		 'cc',
		 'dd' 
	];
}