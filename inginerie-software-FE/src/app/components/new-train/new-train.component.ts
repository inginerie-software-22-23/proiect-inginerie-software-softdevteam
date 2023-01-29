import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/services/service-api/api.service';
import { FormioService } from 'src/app/services/service-formio/formio.service';

@Component({
  selector: 'app-new-train',
  templateUrl: './new-train.component.html',
  styleUrls: ['./new-train.component.scss']
})
export class NewTrainComponent implements OnInit {

  form : any;
  constructor(private apiService : ApiService, private formioService : FormioService) { }

  ngOnInit(): void {
    this.formioService.getForm("newTrain").subscribe(data =>{
      this.form = data;
      console.log(this.form)
    })
  }

  onSubmit(event : any){
    this.apiService.saveTrain(event.data).subscribe();
  }

  

}
