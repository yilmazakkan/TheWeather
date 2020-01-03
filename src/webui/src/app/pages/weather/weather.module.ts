import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { WeatherComponent } from './weather.component';
import {WeatherRoutingModule} from "./weather.routing.module";
import {MatTableModule} from "@angular/material/table";
import {WeatherService} from "../../services/shared/weather.service";
import {FormsModule} from "@angular/forms";



@NgModule({
  declarations: [WeatherComponent],
    imports: [
        CommonModule,
        WeatherRoutingModule,
        MatTableModule,
        FormsModule
    ],
  providers: [WeatherService]
})
export class WeatherModule { }
