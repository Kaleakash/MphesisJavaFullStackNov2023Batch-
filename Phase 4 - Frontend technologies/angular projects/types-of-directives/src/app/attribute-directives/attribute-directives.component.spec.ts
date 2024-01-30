import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AttributeDirectivesComponent } from './attribute-directives.component';

describe('AttributeDirectivesComponent', () => {
  let component: AttributeDirectivesComponent;
  let fixture: ComponentFixture<AttributeDirectivesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AttributeDirectivesComponent]
    });
    fixture = TestBed.createComponent(AttributeDirectivesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
