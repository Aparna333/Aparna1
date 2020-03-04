import { Injectable, OnInit } from '@angular/core';
import { HttpClient} from  '@angular/common/http';
import { Observable } from 'rxjs';
import { Item } from './item';

@Injectable({
  providedIn: 'root'
})
export class ItemserviceService{

  itemName: String;
  item:Item[];

  private baseUrl = 'http://localhost:8096/item';
  private baseUrl1='http://localhost:8096/item/seller/1/items';
  private baseUrl2='http://localhost:8096/item/sellers/1/items/1';
  private baseUrl3='http://localhost:8096/item/5/delete';

  constructor(private http: HttpClient) { }
 
   getItemByName(itemName: String): Observable<any> {
     console.log("service");
    return this.http.get(`${this.baseUrl}/get/${itemName}`);
  }
  
  additems(Itemlist:object):Observable<any> 
    { 
      console.log(Itemlist);
      return this.http.post(`${this.baseUrl1}`,Itemlist)
    }
    deleteitem(Itemid:number):Observable<any>
    {
      console.log("enter to delete");
      return this.http.delete(`${this.baseUrl3}/${Itemid}`)
    }
    
    updateitems(Itemlist:object):Observable<any> 
    { 
      console.log(Itemlist);
      console.log("in service");
      return this.http.put(`${this.baseUrl2}`,Itemlist)
    }
   /*createCustomer(customer: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}` + `/create`, customer);
  }*/
}
