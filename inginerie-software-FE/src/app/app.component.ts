import { AfterViewInit, Component, OnInit } from '@angular/core';
import { Formio } from 'formiojs';
import { FormioService } from './services/service-formio/formio.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit  {
  title = 'nexgen.frontend';
  form : any;

  constructor(private formioService : FormioService){

  }

  ngOnInit(): void {

  }

  
 

}
