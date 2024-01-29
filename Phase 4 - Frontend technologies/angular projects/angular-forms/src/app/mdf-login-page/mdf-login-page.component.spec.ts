import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MdfLoginPageComponent } from './mdf-login-page.component';

describe('MdfLoginPageComponent', () => {
  let component: MdfLoginPageComponent;
  let fixture: ComponentFixture<MdfLoginPageComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MdfLoginPageComponent]
    });
    fixture = TestBed.createComponent(MdfLoginPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
