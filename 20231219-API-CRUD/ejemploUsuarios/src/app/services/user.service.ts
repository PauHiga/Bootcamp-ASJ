import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }

  URL_API = 'https://reqres.in/api/users'

  datosUsuario: any = {
    id: -1,
    name: '',
    job: ''
  };

  //GET usuarios
  public getUsers():Observable<any>{
    return this.http.get(this.URL_API);
  }

  //POST Nuevo usuario
  public createUser(usuario:any):Observable<any>{
    console.log("Llamando a API")
    return this.http.post(this.URL_API, usuario)
  }

  //DELETE usuario
  public deleteUser(id:any):Observable<any>{
    return this.http.delete(this.URL_API + "/" + id)
  }

  //PUT usuario
  public updateUser(usuario:any){
    return this.http.put(this.URL_API + '/' + usuario.id, usuario)
  }
  

}
