import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ToDoComponent } from './components/project1/to-do/to-do.component';
import { FormDisplaySimpsonsComponent } from './components/project2/form-display-simpsons/form-display-simpsons.component';

const routes: Routes = [
  {path: 'toDo', component: ToDoComponent},
  {path: 'simpsons', component: FormDisplaySimpsonsComponent},
  {path: '', component: ToDoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

