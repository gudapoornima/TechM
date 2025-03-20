import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PbindComponent } from './pbind.component';

describe('PbindComponent', () => {
  let component: PbindComponent;
  let fixture: ComponentFixture<PbindComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PbindComponent]
    });
    fixture = TestBed.createComponent(PbindComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
