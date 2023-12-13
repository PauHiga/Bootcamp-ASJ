import { Component, Input, Output, EventEmitter } from '@angular/core';
import { clippingParents } from '@popperjs/core';

@Component({
  selector: 'app-list-item-card',
  templateUrl: './list-item-card.component.html',
  styleUrl: './list-item-card.component.css'
})
export class ListItemCardComponent {

  //Input y Output
  @Input()
  taskDate!: string;

  @Input()
  task!: string;

  @Input()
  taskId!: number;

  @Output()
  deleteItemEvent = new EventEmitter<number>();


  // Mark as completed
  isCompleted = false;

  markAsCompleted(){
    this.isCompleted = true;
  }


  // Delete item
  deleteItem() {
    this.deleteItemEvent.emit(this.taskId);
  }

}
