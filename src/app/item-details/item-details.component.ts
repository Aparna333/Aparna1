import { Component, OnInit, Input } from '@angular/core';
import { Item} from '../item';


@Component({
  selector: 'app-item-details',
  templateUrl: './item-details.component.html',
  styleUrls: ['./item-details.component.css']
})
export class ItemDetailsComponent implements OnInit {

  @Input() items: Item[];

  constructor() { }

  ngOnInit(): void {
  }

}
