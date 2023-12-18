import { Component, OnInit } from '@angular/core';
import { RickAndMortyService } from '../../../services/rick-and-morty.service';

@Component({
  selector: 'app-character-info',
  templateUrl: './character-info.component.html',
  styleUrl: './character-info.component.css'
})
export class CharacterInfoComponent implements OnInit {

  datos: any = {};

constructor(public RickAndMortyService:RickAndMortyService){}

ngOnInit(): void {
  this.datos = this.RickAndMortyService.getCharData(2);
  console.log(this.datos)
}

}
