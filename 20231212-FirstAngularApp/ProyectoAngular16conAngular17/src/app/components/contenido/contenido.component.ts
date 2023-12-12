import { Component } from '@angular/core';

@Component({
  selector: 'app-contenido',
  templateUrl: './contenido.component.html',
  styleUrl: './contenido.component.css'
})
export class ContenidoComponent {

  titulo = "Titulo Del Componente"

  num = Math.floor(Math.random() * 10);

  generarAleatorio(){
    this.num = Math.floor(Math.random() * 10);
  }

  RestarUno(){
    this.num--
  }
  SumarUno(){
    this.num++
  }

  compras = ["pan", "leche", "huevos"]
}
