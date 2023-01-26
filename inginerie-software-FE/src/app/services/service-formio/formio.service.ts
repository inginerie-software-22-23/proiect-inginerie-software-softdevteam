import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FormioService {
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FormioService {

  constructor(private httpService : HttpClient) { }

  getForm(name : string) : Observable<any>{
    return this.httpService.get<any>("http://localhost:3001/" + name);
  }

}
  constructor(private httpService : HttpClient) { }

  getForm(name : string) : Observable<any>{
    return this.httpService.get<any>("http://localhost:3001/" + name);
  }

}
