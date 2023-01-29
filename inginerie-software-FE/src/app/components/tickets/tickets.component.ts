import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/services/service-api/api.service';
import { FormioService } from 'src/app/services/service-formio/formio.service';

@Component({
  selector: 'app-tickets',
  templateUrl: './tickets.component.html',
  styleUrls: ['./tickets.component.scss']
})
export class TicketsComponent implements OnInit {

  form : any;

  constructor(private formioService : FormioService, private apiService : ApiService) { }

  ngOnInit(): void {
    this.getForm();
  }

  getForm(){
    this.formioService.getForm("ticket").subscribe(data =>{
      this.form = data
    })
  }

  onSubmit(event : any) {
    this.apiService.saveTicket(event.data).subscribe()
  }

}
