import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormDisplaySimpsonsComponent } from './form-display-simpsons.component';

describe('FormDisplaySimpsonsComponent', () => {
  let component: FormDisplaySimpsonsComponent;
  let fixture: ComponentFixture<FormDisplaySimpsonsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [FormDisplaySimpsonsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FormDisplaySimpsonsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
