import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LogsComponent } from './logs.component';
import {LogsRoutingModule} from "./logs.routing.module";
import {FormsModule} from "@angular/forms";
import { LogsFilterPipe } from './logs-filter.pipe';
import {LogsService} from "../../services/shared/logs.service";



@NgModule({
  declarations: [LogsComponent, LogsFilterPipe],
  imports: [
    CommonModule,
    LogsRoutingModule,
    FormsModule
  ],
  providers: [
    LogsService
  ]
})
export class LogsModule { }
