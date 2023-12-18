import { Component, OnInit } from '@angular/core';
import { RickAndMortyService } from '../../../services/rick-and-morty.service'
import { clippingParents } from '@popperjs/core';

@Component({
  selector: 'app-characters-list',
  templateUrl: './characters-list.component.html',
  styleUrl: './characters-list.component.css'
})
export class CharactersListComponent implements OnInit{
  data: any = {};

  constructor(public RickAndMortyService:RickAndMortyService){}

  ngOnInit(): void {
    this.data = this.RickAndMortyService.getDataApi().subscribe(data => this.data = data)
  }
}
