import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { clippingParents } from '@popperjs/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrl: './users.component.css'
})
export class UsersComponent implements OnInit {

  constructor(public userService: UserService, private router: Router){}

  usuarios:any = [];

  mensaje = "";

  ngOnInit(): void {
    this.listar();
  }

  listar(){
    this.userService.getUsers().subscribe( (res) => {
      this.usuarios = res.data;
    }
    );
  }

  delete(id:any){
    let confirmacion = confirm("desea eliminar al usuario id: " + id + "?")
    if(confirmacion){
      this.userService.deleteUser(id).subscribe(
        (response) => {
          console.log("Respuesta de eliminar:", response),
          this.listar();
        }
      )
    }
  }

  update(usuario:any){
    console.log(usuario)
    this.userService.datosUsuario = {
      id: usuario.id,
      name: usuario.first_name,
      job: usuario.last_name
    }
    this.router.navigate(['/user']);
  }

}

