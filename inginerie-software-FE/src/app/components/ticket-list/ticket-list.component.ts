import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/services/service-api/api.service';

@Component({
  selector: 'app-ticket-list',
  templateUrl: './ticket-list.component.html',
  styleUrls: ['./ticket-list.component.scss']
})
export class TicketListComponent implements OnInit {

  tickets : any;

  constructor(private apiService : ApiService) { }

  ngOnInit(): void {
    this.getTickets()
  }

  getTickets() {
    this.apiService.getTickets().subscribe(data =>{
      this.tickets = data;
    })
  }

}
