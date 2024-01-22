import { Component, OnInit } from '@angular/core';
import { TodolistService } from '../../../services/todolist.service';
import { toDoItem } from '../../../models/toDoItem';
import { clippingParents } from '@popperjs/core';

@Component({
  selector: 'app-to-do',
  templateUrl: './to-do.component.html',
  styleUrl: './to-do.component.css'
})

export class ToDoComponent  implements OnInit {

  constructor(public toDoListService: TodolistService){}

  newToDoItem = "";
  newDate = "";
  id = 1;
  modeDisplay = "all"
  toDoList : toDoItem[] = [];
  displayList = this.toDoList.filter(item=>item.deleted==false)
  isCompleted = false;

  ngOnInit(): void {
    this.getToDoList();
  }

  getToDoList(){
    console.log(this.toDoListService.getTodoList().subscribe((response)=>{
      console.log(response)
      this.toDoList = response;
      this.showList(this.modeDisplay)
      // this.displayList = response.filter(item=>item.deleted==false)
    }));    
  }


  //Add item to the list 

  addToList() {
    console.log(this.newToDoItem)
    if(this.newToDoItem != ""){
      let currentDate = new Date();
      this.newDate = currentDate.toDateString()

      const newEntry = {task:this.newToDoItem, date: this.newDate, completed:false, deleted:false}

      this.toDoListService.addToToDoList(newEntry).subscribe((response)=>{
        console.log(response)
        this.getToDoList();
      })
      this.newToDoItem = "";
    }
  }

  // Cross item from the list
  markAsCompleted(item : toDoItem){
    const { id, ...noIdItem } = item;
    const modifiedItem = {...noIdItem, completed:true};
    this.toDoListService.editToDoItem(item.id, modifiedItem).subscribe((response)=>{
      console.log(response);
      this.getToDoList();
    })
  }

  deleteItem(item : toDoItem){
    const { id, ...noIdItem } = item;
    const modifiedItem = {...noIdItem, deleted:true};
    this.toDoListService.editToDoItem(item.id, modifiedItem).subscribe((response)=>{
      console.log(response);
      this.getToDoList();
    })
  }

  showList(mode:string){
    console.log(mode)
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
//   id = 1;
//   toDoList = [{id: 0, task:"water plants", date:"Mon Dec 11 2023", completed:true, deleted:false}, {id: 1, task:"buy eggs", date:"Wed Dec 13 2023", completed:false, deleted:false}];
//   displayList = this.toDoList.filter(item=>item.deleted==false)
//   isCompleted = false;

//   //Add item to the list 

//   addToList() {
//     if(this.newToDoItem != ""){
//       let currentDate = new Date();
//       this.newDate = currentDate.toDateString()
//       this.id++;

//       const newEntry = {id: this.id, task:this.newToDoItem, date: this.newDate, completed:false, deleted:false}

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
//     this.toDoList = this.toDoList.map(item => item.id == id? {...item, item[deleted]=true} : item)
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
