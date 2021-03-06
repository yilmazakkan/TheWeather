import {Injectable} from '@angular/core';
import {ApiService} from '../api.service';
import {Observable} from 'rxjs/Rx';
import {map} from 'rxjs/internal/operators';

@Injectable({
  providedIn: 'root'
})
export class WeatherService {

  private WEATHER_PATH = '/weather';

  constructor(private apiService: ApiService) {
  }

  getByCity(city): Observable<any> {
    return this.apiService.get(this.WEATHER_PATH+"/"+ city).pipe(map(
      res => {
        if (res) {
          return res;
        } else {
          console.log(res);
          return {};
        }
      }
    ));
  }

  getAll(): Observable<any> {
    return this.apiService.get(this.WEATHER_PATH).pipe(map(
      res => {
        if (res) {
          return res;
        } else {
          return {};
        }
      }
    ));
  }

  getAllPageable(page): Observable<any> {
    return this.apiService.get(this.WEATHER_PATH + '/pagination', page).pipe(map(
      res => {
        if (res) {
          return res;
        } else {
          console.log(res);
          return {};
        }
      }
    ));
  }

  getById(id): Observable<any> {
    return this.apiService.get(this.WEATHER_PATH, id).pipe(map(
      res => {
        if (res) {
          return res;
        } else {
          console.log(res);
          return {};
        }
      }
    ));
  }

  createWeather(weather): Observable<any> {
    return this.apiService.post(this.WEATHER_PATH, weather).pipe(map(
      res => {
        if (res) {
          return res;
        } else {
          console.log(res);
          return {};
        }
      }
    ));
  }

  delete(id): Observable<any> {
    return this.apiService.delete(this.WEATHER_PATH + '/' + id).pipe(map(
      res => {
        if (res) {
          return res;
        } else {
          console.log(res);
          return {};
        }
      }
    ));
  }
}
