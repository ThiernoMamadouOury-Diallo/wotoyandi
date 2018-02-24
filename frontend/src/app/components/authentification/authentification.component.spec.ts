import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Authentification } from './authentification.component';

describe('Authentification', () => {
  let component: Authentification;
  let fixture: ComponentFixture<Authentification>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Authentification ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Authentification);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
