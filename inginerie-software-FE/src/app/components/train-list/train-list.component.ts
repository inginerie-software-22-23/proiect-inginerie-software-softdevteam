import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/services/service-api/api.service';

@Component({
  selector: 'app-train-list',
  templateUrl: './train-list.component.html',
  styleUrls: ['./train-list.component.scss']
})
export class TrainListComponent implements OnInit {
  trains : any;

  constructor(private apiService : ApiService) { }

  ngOnInit(): void {
    this.getTrains();
  }

  getTrains() {
    this.apiService.getTrains().subscribe(data =>{
      this.trains = data;
      console.log(this.trains)
    })
  }


}
