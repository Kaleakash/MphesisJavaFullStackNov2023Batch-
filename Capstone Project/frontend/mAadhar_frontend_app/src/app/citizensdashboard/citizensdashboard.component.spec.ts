import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CitizensdashboardComponent } from './citizensdashboard.component';

describe('CitizensdashboardComponent', () => {
  let component: CitizensdashboardComponent;
  let fixture: ComponentFixture<CitizensdashboardComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CitizensdashboardComponent]
    });
    fixture = TestBed.createComponent(CitizensdashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
