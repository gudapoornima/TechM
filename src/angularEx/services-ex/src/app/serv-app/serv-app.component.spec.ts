import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServAppComponent } from './serv-app.component';

describe('ServAppComponent', () => {
  let component: ServAppComponent;
  let fixture: ComponentFixture<ServAppComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ServAppComponent]
    });
    fixture = TestBed.createComponent(ServAppComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
