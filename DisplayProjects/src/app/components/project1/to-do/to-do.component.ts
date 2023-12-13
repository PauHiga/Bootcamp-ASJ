import { Component } from '@angular/core';
import { clippingParents } from '@popperjs/core';

@Component({
  selector: 'app-to-do',
  templateUrl: './to-do.component.html',
  styleUrl: './to-do.component.css'
})

export class ToDoComponent {

  newToDoItem = "";
  newDate = "";
  taskId = 1;
  toDoList = [{taskId: 0, task:"water plants", date:"Mon Dec 11 2023", completed:true, deleted:false}, {taskId: 1, task:"buy eggs", date:"Wed Dec 13 2023", completed:false, deleted:false}];
  displayList = this.toDoList.filter(item=>item.deleted==false)
  isCompleted = false;

  //Add item to the list 

  addToList() {
    if(this.newToDoItem != ""){
      let currentDate = new Date();
      this.newDate = currentDate.toDateString()
      this.taskId++;

      const newEntry = {taskId: this.taskId, task:this.newToDoItem, date: this.newDate, completed:false, deleted:false}

      this.toDoList.push(newEntry);

      this.newToDoItem = "";
    }
  }

  // Cross item from the list
  markAsCompleted(){
    this.isCompleted = true;
  }

  //remove items from the list
  removeItems(id:number){
    this.toDoList = this.toDoList.map(item => item.taskId == id? {...item, item[deleted]=true} : item)
  }

  displayCompleted(){
    this.displayList = this.toDoList.filter(item => item.completed == true && item.deleted==false)
  }
  displayNotCompleted(){
    this.displayList = this.toDoList.filter(item => item.completed != true && item.deleted==false)
  }
  displayAll(){
    this.displayList = this.toDoList.filter(item=>item.deleted==false)
  }
}
