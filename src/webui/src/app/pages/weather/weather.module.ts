import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { WeatherComponent } from './weather.component';
import {WeatherRoutingModule} from "./weather.routing.module";
import {MatTableModule} from "@angular/material/table";



@NgModule({
  declarations: [WeatherComponent],
  imports: [
    CommonModule,
    WeatherRoutingModule,
    MatTableModule
  ]
})
export class WeatherModule { }
