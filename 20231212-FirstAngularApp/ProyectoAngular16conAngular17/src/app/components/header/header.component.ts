import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'header',
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {
  @Output() 
  newItemEvent = new EventEmitter<string>();

  setPicture(value: string) {
    this.newItemEvent.emit(value);
  }
}
