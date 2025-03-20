import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormControl, FormGroup, AbstractControl, ValidationErrors } from '@angular/forms';

@Component({
  selector: 'app-react-form',
  templateUrl: './react-form.component.html',
  styleUrls: ['./react-form.component.css']
})
export class ReactFormComponent implements OnInit {
  public formData: any = {};

  username = new FormControl('', [
    Validators.required,
    Validators.minLength(5)
  ]);

  password = new FormControl('', [
    Validators.required,
    hasSpecialCharacter 
  ]);

  loginForm: FormGroup = this.builder.group({
    username: this.username,
    password: this.password
  });

  public showMessage: boolean = false;

  constructor(private builder: FormBuilder) {}

  ngOnInit(): void {}

  registerUser() {
    this.formData = this.loginForm.value;
    this.showMessage = true;
  }
}

function hasSpecialCharacter(control: AbstractControl): ValidationErrors | null {
  const value = control.value as string;
  const specialChars = /[!@#$^&]/; 
  return value && specialChars.test(value) ? null : { hasSpecialCharacter: true }; 
}
