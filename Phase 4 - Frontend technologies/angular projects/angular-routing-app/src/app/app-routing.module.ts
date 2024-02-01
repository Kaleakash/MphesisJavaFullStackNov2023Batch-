import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { LoginComponent } from './login/login.component';

// http://localhost:4200
// http://localhost:4200/aboutus
// http://localhost:4200/contactus 
// http://localhost:4200/feedback 
// http://localhost:4200/login 

const routes: Routes = [
{path:"aboutus",component:AboutusComponent},
{path:"contactus",component:ContactusComponent},
{path:"feedback",component:FeedbackComponent},
{path:"login",component:LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
