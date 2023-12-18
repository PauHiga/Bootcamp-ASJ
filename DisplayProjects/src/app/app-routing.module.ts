import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ToDoComponent } from './components/project1/to-do/to-do.component';
import { FormDisplaySimpsonsComponent } from './components/project2/form-display-simpsons/form-display-simpsons.component';
import { CharactersListComponent } from './components/project3/characters-list/characters-list.component';
import { CharacterInfoComponent } from './components/project3/character-info/character-info.component';

const routes: Routes = [
  {path: 'to-do', component: ToDoComponent},
  {path: 'simpsons', component: FormDisplaySimpsonsComponent},
  {path: 'rick-and-morty', children:[
    {path:'', component: CharactersListComponent},
    {path:'character-detail/:idCharacter', component: CharactersListComponent}
  ]},
  {path:'character-detail', component: CharacterData},
  {path: '', component: ToDoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

