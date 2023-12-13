import { Component, Input } from '@angular/core';

@Component({
  selector: 'main',
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class mainComponent {
  @Input()
  selectedOption!: string;
}
