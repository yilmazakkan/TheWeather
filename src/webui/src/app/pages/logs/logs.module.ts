import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LogsComponent } from './logs.component';
import {LogsRoutingModule} from "./logs.routing.module";
import {FormsModule} from "@angular/forms";
import { LogsFilterPipe } from './logs-filter.pipe';



@NgModule({
  declarations: [LogsComponent, LogsFilterPipe],
  imports: [
    CommonModule,
    LogsRoutingModule,
    FormsModule
  ]
})
export class LogsModule { }
