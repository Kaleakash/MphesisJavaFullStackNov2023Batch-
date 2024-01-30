import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { MyAngularService } from './my.angularservice';
import { ProductComponent } from './product/product.component';
import { HttpClientModule } from '@angular/common/http';
@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    ProductComponent
  ],
  imports: [
    BrowserModule,HttpClientModule
  ],
  providers: [MyAngularService],    // provided angular service details. 
  bootstrap: [AppComponent]
})
export class AppModule { }


