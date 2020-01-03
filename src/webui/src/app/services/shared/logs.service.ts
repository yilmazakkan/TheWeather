import {ApiService} from "../api.service";
import {Observable} from "rxjs";
import {map} from "rxjs/operators";
import {Injectable} from "@angular/core";
@Injectable({
  providedIn: 'root'
})
export class LogsService {
  private LOGS_PATH = '/weathers';
  constructor(private apiService: ApiService) {
  }
  getAllPageable(page): Observable<any> {
    return this.apiService.get(this.LOGS_PATH + '/pagination', page).pipe(map(
      res => {
        if (res) {
          return res;
        } else {
          return {};
        }
      }
    ));
  }
  getAll(): Observable<any> {
    return this.apiService.get(this.LOGS_PATH).pipe(map((
      res => {
        if (res) {
          return res;
        } else {
          return {};
        }
      }
    )));
  }
  getById(id): Observable<any> {
    return this.apiService.get(this.LOGS_PATH, id).pipe(map(
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
    return this.apiService.delete(this.LOGS_PATH + '/' + id).pipe(map(
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
