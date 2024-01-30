import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StructureDirectivesComponent } from './structure-directives.component';

describe('StructureDirectivesComponent', () => {
  let component: StructureDirectivesComponent;
  let fixture: ComponentFixture<StructureDirectivesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [StructureDirectivesComponent]
    });
    fixture = TestBed.createComponent(StructureDirectivesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
