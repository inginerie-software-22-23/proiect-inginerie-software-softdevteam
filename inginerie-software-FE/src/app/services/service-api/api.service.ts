import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  endpoint : any = "http://localhost:8080/";
  constructor(private httpService : HttpClient) { }

  getTrains() : Observable<any[]> {
    return this.httpService.get<any[]>(this.endpoint + "train/getAll");
  }

  saveTrain(body :{}) : Observable<any>{
    return this.httpService.post<any>(this.endpoint + "train/save", body);
  }

  getUSers() : Observable<any[]> {
    return this.httpService.get<any[]>(this.endpoint + "user/getAll");
  }

  saveUSer(body : {}) : Observable<any> {
    return this.httpService.post<any>(this.endpoint + "user/save",body);
  }

  saveTicket(body : {}) : Observable<any> {
    return this.httpService.post<any>(this.endpoint + "ticket/save",body);
  }

  getTickets() : Observable<any[]> {
    return this.httpService.get<any[]>(this.endpoint + "ticket/getAll");
  }
}
