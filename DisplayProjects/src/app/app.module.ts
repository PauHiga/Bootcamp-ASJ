import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import {MatIconModule} from '@angular/material/icon';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HeaderComponent } from './components/display/header/header.component';
import { MainComponent } from './components/display/main/main.component';
import { FooterComponent } from './components/display/footer/footer.component';
import { ToDoComponent } from './components/project1/to-do/to-do.component';
import { ListItemCardComponent } from './components/project1/list-item-card/list-item-card.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormDisplaySimpsonsComponent } from './components/project2/form-display-simpsons/form-display-simpsons.component';
import { CharactersListComponent } from './components/project3/characters-list/characters-list.component';
import { CharacterInfoComponent } from './components/project3/character-info/character-info.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MainComponent,
    FooterComponent,
    ToDoComponent,
    ListItemCardComponent,
    FormDisplaySimpsonsComponent,
    CharactersListComponent,
    CharacterInfoComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    BrowserAnimationsModule,
    MatIconModule,
    HttpClientModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
