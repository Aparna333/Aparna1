import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'counter',
  styles: [`
    .counter {
      position: relative;
    }
    input {
      border: 0;
      border-radius: 3px;
      height: 30px;
      max-width: 100px;
      text-align: center;
    }
    button {
      outline: 0;
      cursor: pointer;
      height: 30px;
      border: 0;
      border-radius: 3px;
      background: #0088cc;
      color: #fff;
    }
  `],
  template: `
    <div class="counter">
      <button (click)="decrement()">
        Decrement
      </button>
      <input type="text" [value]="count">
      <button (click)="increment()">
        Increment
      </button>
    </div>
    <!--<div class="counter">
      <button (click)="decrement()">
        Decrement
      </button>
      <input type="text" [value]="count">
      <button (click)="increment()">
        Increment
      </button>
    </div>-->
  `
})
export class CounterComponent {
  
 @Input()
  count: number = 0;
  obj:MCounter ; 
  emit;
  constructor(){
    this.obj=new MCounter(0);
  }
  @Output()
  change: EventEmitter<MCounter> = new EventEmitter<MCounter>();
  
  increment() {
    this.count++;
    this.obj.count=1;
    this.change.emit(this.obj);
  }
  
  decrement() {
    this.count--;
    this.obj.count=-1;
    this.change.emit(this.obj);
  } 
}
 export class MCounter{
  constructor(public count:number){
  }
 }
