import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { StockData } from './stockdata';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})

export class StockDataService {

  private _url: string = "http://localhost:8102/";
  constructor(private http: HttpClient) { }

  getWebStockList(): Observable<StockData[]> {
    return this.http.get<StockData[]>(this._url);
  }

  errorHandler(error: HttpErrorResponse) {
    return throwError(error.message || "Server Error");
  }
}
