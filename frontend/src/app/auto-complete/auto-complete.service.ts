import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AutoCompleteService {

  constructor(private http: HttpClient) { }

  getSuggestions(text: string): Observable<string[]> {
    let url: string = '/api/suggestions';
    let params = new HttpParams();
    params = params.append('searchText', text);
  return this.http
        .get<string[]>(url, {params: params});
  }
}
