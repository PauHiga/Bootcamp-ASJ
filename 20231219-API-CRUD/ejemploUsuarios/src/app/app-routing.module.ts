import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UsersComponent } from './component/users/users.component';
import { UserFormComponent } from './component/user-form/user-form.component';

const routes: Routes = [
  { path: 'users', component:UsersComponent},
  { path: 'user', children:[
    {path:'', component: UserFormComponent},
    {path:':id', component: UserFormComponent}
  ]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
