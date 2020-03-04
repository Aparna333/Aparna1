import { Component, OnInit, Output } from '@angular/core';
import { ItemserviceService } from '../itemservice.service';
import { Item } from '../item';

@Component({
  selector: 'app-searchitem',
  templateUrl: './searchitem.component.html',
  styleUrls: ['./searchitem.component.css']
})
export class SearchitemComponent implements OnInit {
   
  title = 'my-project';
  items: Item[];
  itemName: String;
  itemId: number;
  price: number;
  stockNumber: number;
  description: String;
  remarks: string;
  manufacturer: String;
  deleteditem: number;

  items1:Item = new Item();

  constructor(private dataService:ItemserviceService) {
    console.log("constructor invoked");
  }
  ngOnInit(): void {
    this.itemName="";
  }
  getItem(){
    console.log("invokes getItem()");
    this.dataService.getItemByName(this.itemName).subscribe(items=>this.items=items);
  }
  additems() 
  {
    this.items1.itemName=this.itemName;
    this.items1.manufacturer=this.manufacturer;
    this.items1.price=this.price;
    this.items1.description=this.description;
    this.items1.stockNumber=this.stockNumber;
    this.items1.remarks=this.remarks;
    this.dataService.additems(this.items1).subscribe(Itemlist=>this.items=Itemlist);
  } 
  deleteitem() 
  { 
    console.log("in .ts");
    this.dataService.deleteitem(this.deleteditem).subscribe(Item=>this.items=this.items)
  }
  updateitem() 
  {
    console.log("in update");
    this.items1.itemName=this.itemName;
    this.items1.manufacturer=this.manufacturer;
    this.items1.price=this.price;
    this.items1.description=this.description;
    this.items1.stockNumber=this.stockNumber;
    this.items1.remarks=this.remarks;
    this.dataService.updateitems(this.items1).subscribe(Itemlist=>this.items=this.items);
  }

onSubmit(){
    this.getItem();
    this.deleteitem();
    this.additems();
    this.updateitem();
  }
}

