import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CitizenregisterComponent } from './citizenregister.component';

describe('CitizenregisterComponent', () => {
  let component: CitizenregisterComponent;
  let fixture: ComponentFixture<CitizenregisterComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CitizenregisterComponent]
    });
    fixture = TestBed.createComponent(CitizenregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
