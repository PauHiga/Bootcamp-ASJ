import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { toDoItem } from '../models/toDoItem';
import { NewToDoItem } from '../models/NewToDoItem';
import { Observable, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TodolistService {

  constructor(private http:HttpClient) { }

  URL_API = 'http://localhost:8080/tareas'

  getTodoList() : Observable<toDoItem[]>{
    return this.http.get<toDoItem[]>(this.URL_API);
  }

  addToToDoList(newItem : NewToDoItem) : Observable<any>{
    console.log(newItem)
    return this.http.post(this.URL_API, newItem, { responseType: 'text' });
  }

  // addToToDoList(newItem: NewToDoItem) : Observable<NewToDoItem> {        
  //   const headers = { 'Content-Type': 'application/json' };
  //   return this.http.post<NewToDoItem>(this.URL_API, newItem, { headers });    
  // }

  editToDoItem(id : number, modifiedItem : NewToDoItem){
    console.log(modifiedItem)
    return this.http.put(this.URL_API + "/" + id, modifiedItem);
  }


}
