import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/services/service-api/api.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.scss']
})
export class UserListComponent implements OnInit {

  users : any;

  constructor(private apiService : ApiService) { }

  ngOnInit(): void {
    this.getUsers()
  }

  getUsers() {
    this.apiService.getUSers().subscribe(data =>{
      this.users = data;
    })
  }

}
