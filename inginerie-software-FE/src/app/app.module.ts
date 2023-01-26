import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { FormioModule } from '@formio/angular';
import { HttpClientModule } from '@angular/common/http';
import { UserListComponent } from './components/user-list/user-list.component';
import { TrainListComponent } from './components/train-list/train-list.component';
import { HeaderComponent } from './components/header/header.component';
import { NewTrainComponent } from './components/new-train/new-train.component';
import { NewUserComponent } from './components/new-user/new-user.component';
import { TicketsComponent } from './components/tickets/tickets.component';
import { TicketListComponent } from './components/ticket-list/ticket-list.component';

@NgModule({
  declarations: [
    AppComponent,
    TrainListComponent,
    UserListComponent,
    HeaderComponent,
    NewTrainComponent,
    NewUserComponent,
    TicketsComponent,
    TicketListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormioModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
