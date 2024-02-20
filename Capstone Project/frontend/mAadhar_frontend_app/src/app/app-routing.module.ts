import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { CitizenregisterComponent } from './citizenregister/citizenregister.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { CitizensdashboardComponent } from './citizensdashboard/citizensdashboard.component';

const routes: Routes = [
  {"path":"login",component:LoginComponent},
  {"path":"register",component:CitizenregisterComponent},
  {"path":"adminhome",component:AdmindashboardComponent},
  {path:"citizenshome",component:CitizensdashboardComponent},
  {path:"",redirectTo:"login",pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
