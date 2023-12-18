import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class RickAndMortyService {

  constructor(private http: HttpClient) { }

  public getDataApi(){
    return this.http.get('https://rickandmortyapi.com/api/character/?page=1')
  }

  getCharData(id:number){
    return this.http.get('https://rickandmortyapi.com/api/character/2')
  }
}
