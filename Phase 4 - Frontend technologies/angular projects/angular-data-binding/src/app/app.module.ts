import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { StringInterpolationComponent } from './string-interpolation/string-interpolation.component';
import { ProprtyBindingComponent } from './proprty-binding/proprty-binding.component';

@NgModule({
  declarations: [
    AppComponent,
    StringInterpolationComponent,
    ProprtyBindingComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
