import { Component } from '@angular/core';
import { ProductInCart } from '../../../models/ProductInCart';
import { MainServiceService } from '../../../services/main-service.service';
import { Category } from '../../../models/Category';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {

  categories: Category[] = [];

  constructor(private mainServiceService:MainServiceService){
    
  }

  ngOnInit():void{
    this.getCategories()

  }

  getCategories(){
  
    this.mainServiceService.getCategories().subscribe(
      (data: Category[]) => {
        this.categories = data;
        console.log("categories")
        console.log(this.categories)
      },
      error => {
        console.error('Error fetching categories:', error);
      }
    );
    
  }

}
