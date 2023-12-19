import { Component } from '@angular/core';
import { UserService } from '../../services/user.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrl: './user-form.component.css'
})
export class UserFormComponent {
  
  constructor(public userService: UserService, private router: Router){}
  mensaje = "";

  ngOnInit(): void {
  }

  resetForm(form:NgForm){
    this.userService.datosUsuario = {
      id: -1
    }
    setTimeout(()=>{
      this.mensaje = '';
    }, 4000);
  }

  create(form:NgForm) {
    console.log(form.value)
    if(form.value.id != -1){
      this.userService.updateUser(form.value).subscribe(
        response =>{
          console.log(response)
          this.resetForm(form);
          this.router.navigate(['/users']);
        })
    }
    else{
      console.log(form.value)
      if(!form.valid){
        console.log('Formulario inválido')
        return
      } else {
        const nameUppercase = form.value.name.toUpperCase();
        const usuarioParaEnviar = {
          name: nameUppercase,
          job:form.value.job,
        }
        this.userService
        .createUser(usuarioParaEnviar)
        .subscribe((res)=>{
          console.log(res)
          this.mensaje = "Usuario creado exitosamente";
          this.resetForm(form);
          this.router.navigate(['/users']);
        })
      }
    }
  }
}
