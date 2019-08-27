import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
//import { RTTMIOVariablesComponent } from './rttmio-list/rttmio-list.component';
import { StockDetailsComponent } from './stock-list/stock-list.component';
//import { EmployeeDetailComponent } from './employee-list/employee-detail.component';
//import { IRTTMIoService } from './rttmio.service';
import { StockDataService } from './stockdata.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    StockDetailsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [StockDataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
