import {Component, Input, OnInit, ViewChild} from '@angular/core';
import {MatSort} from "@angular/material/sort";
import {Weather} from "../../common/weather";
import {WeatherService} from "../../services/shared/weather.service";


@Component({
  selector: 'app-weather',
  templateUrl: './weather.component.html',
  styleUrls: ['./weather.component.scss']
})
export class WeatherComponent implements OnInit {

  weathers: Weather;

  @Input() weather: Weather;
  cityName: string;

  constructor(private weatherService: WeatherService) { }

  ngOnInit() {

  }
getWeather(city){
  this.weatherService.getByCity(city).subscribe(res => {
    this.weathers = res;
    console.log(res);
  });
}
}
