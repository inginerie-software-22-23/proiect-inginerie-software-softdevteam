import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/services/service-api/api.service';
import { FormioService } from 'src/app/services/service-formio/formio.service';

@Component({
  selector: 'app-new-user',
  templateUrl: './new-user.component.html',
  styleUrls: ['./new-user.component.scss']
})
export class NewUserComponent implements OnInit {

  form : any;

  constructor(private formioService : FormioService, private apiService : ApiService) { }

  ngOnInit(): void {
    this.getForm();
  }

  getForm() {
    this.formioService.getForm("newUSer").subscribe(data =>{
      this.form  = data;
    })
  }

  onSubmit(event : any) {
    this.apiService.saveUSer(event.data).subscribe();
  }

  

}
