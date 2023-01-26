import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NewTrainComponent } from './components/new-train/new-train.component';
import { NewUserComponent } from './components/new-user/new-user.component';
import { TicketListComponent } from './components/ticket-list/ticket-list.component';
import { TicketsComponent } from './components/tickets/tickets.component';
import { TrainListComponent } from './components/train-list/train-list.component';
import { UserListComponent } from './components/user-list/user-list.component';

const routes: Routes = [
    {path : 'train-list' , component : TrainListComponent, children:
    [
      {path : 'new-train' , component : NewTrainComponent}
    ]
  },

  { path : 'user-list', component : UserListComponent, children: [
    {path :"new-user" , component : NewUserComponent}
  ]},

  {path : 'ticket-list' , component : TicketListComponent , children :[{
    path : 'tickets', component : TicketsComponent
  }]}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
