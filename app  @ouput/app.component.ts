import { Component } from '@angular/core';
import { MCounter} from './counter.component';

@Component({
  selector: 'app-root',
  styles: [`
    .app {
      display: block;
      text-align: center;
      padding: 25px;
      background: #f5f5f5;
    }
  `],
  template: `
    <div class="app">
       Parent: {{ sum }}
      <counter
        (change)="countChange($event)">
      </counter><br/>
      <counter
        (change)="countChange($event)">
      </counter><br/>
      <counter
        (change)="countChange($event)">
      </counter><br/>
      <counter
        (change)="countChange($event)">
      </counter>
    </div> `
})
export class AppComponent {
  myCount: number = 10;
  obj:MCounter;
  sum: number=0;
  countChange(event) {
    this.sum = this.sum+event.count;
  }
}
