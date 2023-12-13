import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListItemCardComponent } from './list-item-card.component';

describe('ListItemCardComponent', () => {
  let component: ListItemCardComponent;
  let fixture: ComponentFixture<ListItemCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ListItemCardComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListItemCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
