import { Component, OnInit } from '@angular/core';
import { StockDataService } from '../stockdata.service';
import {MatSortModule} from '@angular/material';
import {Sort} from '@angular/material/sort';

@Component({
  selector: 'stock-detail',
  templateUrl: './stocklist.html',
  styleUrls: ['./stocklist.css']
})

export class StockDetailsComponent implements OnInit {
  public stockVars = [];
  public errMsg;
  EditRowID: any = "";
  editField: string;
  sortedData = [];
  market: string;

//upday: boolean = this.stockVars

  constructor(private _stockdataService: StockDataService) { }
  
  ngOnInit() {
    this._stockdataService.getWebStockList()
    .subscribe(data => this.stockVars = data,
      error => this.errMsg = error.message);
  }

  // edit(val){
  //   this.EditRowID = val;
  // }

  // remove(id: any) {
  //   this.stockVars.splice(id, 1);
  // }

  changeValue(id: number, property: string, event: any) {
    this.editField = event.target.textContent;
  }

  updateList(id: number, property: string, event: any) {
    const editField = event.target.textContent;
    this.stockVars[id][property] = editField;
  }

  isMarketUp(stockVar)
  {
    //console.log(stockVar.price > stockVar.previousClose);
    if (stockVar.price > stockVar.previousClose)
    {
      this.market = "up";
      return "up";
    }
    else if (stockVar.price < stockVar.previousClose)
    {
      this.market = "down";
      return "down";
    }
    
    this.market = "noChange";
    return "noChange";
  }

  isUp(stockVar)
  {
    return stockVar.price > stockVar.previousClose;
  }

  isDown(stockVar)
  {
    return stockVar.price < stockVar.previousClose;
  }

  isNoChange(stockVar)
  {
    return stockVar.price === stockVar.previousClose;
  }

  // sortData(sort: Sort){
  //   this.sortedData = this.stockVars.slice();
  //   const data = this.stockVars.slice();

  //   if(!sort.active || sort.direction === ''){
  //     // this.sortData = data;
  //     return;
  //   }

  //   this.sortedData = data.sort( (a, b) => {
  //     const isAsc = sort.direction === 'asc';

  //     switch (sort.active) {
  //       case 'companyName': return this.compare(a.companyName, b.companyName, isAsc);
  //       case 'symbol': return this.compare(a.symbol, b.symbol, isAsc);
  //       // case 'fat': return compare(a.fat, b.fat, isAsc);
  //       // case 'carbs': return compare(a.carbs, b.carbs, isAsc);
  //       // case 'protein': return compare(a.protein, b.protein, isAsc);
  //       default: return 0;
  //     }

  //   } )

  // }

  // compare(a: number | string, b: number | string, isAsc: boolean) {
  //   return (a < b ? -1 : 1) * (isAsc ? 1 : -1);
  // }


  
  
}




