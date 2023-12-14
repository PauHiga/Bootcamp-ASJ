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
  modeDisplay = "All"
  toDoList = [{taskId: 0, task:"water plants", date:"Mon Dec 11 2023", completed:false, deleted:false}, {taskId: 1, task:"buy eggs", date:"Wed Dec 13 2023", completed:false, deleted:false}];
  displayList = this.toDoList.filter(item=>item.deleted==false)
  isCompleted = false;

  //Add item to the list 

  addToList() {
    console.log(this.newToDoItem)
    if(this.newToDoItem != ""){
      let currentDate = new Date();
      this.newDate = currentDate.toDateString()
      this.taskId++;

      const newEntry = {taskId: this.taskId, task:this.newToDoItem, date: this.newDate, completed:false, deleted:false}

      this.toDoList.push(newEntry);
      this.displayList = this.toDoList.filter(item=>item.deleted==false)
      this.newToDoItem = "";
    }
  }

  // Cross item from the list
  markAsCompleted(id:number){
    this.toDoList = this.toDoList.map(item => item.taskId == id? {...item, completed:true} : item)
    this.showList(this.modeDisplay)
  }

  //remove items from the list
  deleteItem(id:number){
    this.toDoList = this.toDoList.map(item => item.taskId == id? {...item, deleted:true} : item)
    this.showList(this.modeDisplay)
  }

  showList(mode:string){
    switch (mode){
      case "all": 
        this.displayList = this.toDoList.filter(item=>item.deleted==false)
        break;
      case "completed": 
      this.displayList = this.toDoList.filter(item => item.completed == true && item.deleted==false)
        break;
      case "notCompleted": 
      this.displayList = this.toDoList.filter(item => item.completed != true && item.deleted==false)
        break;
      case "deleted": 
      this.displayList = this.toDoList.filter(item=>item.deleted==true)
        break;
      default:
        this.displayList = this.toDoList.filter(item=>item.deleted==false)
    }
  }

  // NOTA: cambiar por modos y una funcion display list dependiente del modo!!
  displayCompleted(){
    this.modeDisplay = "completed"
    this.showList(this.modeDisplay)
  }
  displayNotCompleted(){
    this.modeDisplay = "notCompleted"
    this.showList(this.modeDisplay)
  }
  displayAll(){
    this.modeDisplay = "all"
    this.showList(this.modeDisplay)
  }
  displayDeleted(){
    this.modeDisplay = "deleted"
    this.showList(this.modeDisplay)
  }
}
// import { Component } from '@angular/core';
// import { clippingParents } from '@popperjs/core';

// @Component({
//   selector: 'app-to-do',
//   templateUrl: './to-do.component.html',
//   styleUrl: './to-do.component.css'
// })

// export class ToDoComponent {

//   newToDoItem = "";
//   newDate = "";
//   taskId = 1;
//   toDoList = [{taskId: 0, task:"water plants", date:"Mon Dec 11 2023", completed:true, deleted:false}, {taskId: 1, task:"buy eggs", date:"Wed Dec 13 2023", completed:false, deleted:false}];
//   displayList = this.toDoList.filter(item=>item.deleted==false)
//   isCompleted = false;

//   //Add item to the list 

//   addToList() {
//     if(this.newToDoItem != ""){
//       let currentDate = new Date();
//       this.newDate = currentDate.toDateString()
//       this.taskId++;

//       const newEntry = {taskId: this.taskId, task:this.newToDoItem, date: this.newDate, completed:false, deleted:false}

//       this.toDoList.push(newEntry);

//       this.newToDoItem = "";
//     }
//   }

//   // Cross item from the list
//   markAsCompleted(){
//     this.isCompleted = true;
//   }

//   //remove items from the list
//   removeItems(id:number){
//     this.toDoList = this.toDoList.map(item => item.taskId == id? {...item, item[deleted]=true} : item)
//   }

//   displayCompleted(){
//     this.displayList = this.toDoList.filter(item => item.completed == true && item.deleted==false)
//   }
//   displayNotCompleted(){
//     this.displayList = this.toDoList.filter(item => item.completed != true && item.deleted==false)
//   }
//   displayAll(){
//     this.displayList = this.toDoList.filter(item=>item.deleted==false)
//   }
// }
