import { Pipe, PipeTransform } from '@angular/core';
import {Weather} from "../../common/weather";

@Pipe({
  name: 'logsFilter'
})
export class LogsFilterPipe implements PipeTransform {
  transform(value: any, filterText?: any): any {
    filterText = filterText ? filterText.toLocaleLowerCase() : null;
    return filterText ? value.filter((p: Weather) => p.city.toLocaleLowerCase().indexOf(filterText) !== -1) : value;
//p:Weather Common içinde oluşturduğumuz Weatherdan geliyor.
    // if(!filterText)
    //   return value;
    // return value.filter(
    //   item => item.city.toLowerCase().indexOf(filterText.toLowerCase()) > -1
    // );
  }}


