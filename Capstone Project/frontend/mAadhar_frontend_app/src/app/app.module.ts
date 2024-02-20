import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { CitizenregisterComponent } from './citizenregister/citizenregister.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { CitizensdashboardComponent } from './citizensdashboard/citizensdashboard.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CitizenregisterComponent,
    AdmindashboardComponent,
    CitizensdashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,HttpClientModule,ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
