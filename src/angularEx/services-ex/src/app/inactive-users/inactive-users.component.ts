import { Component, OnInit } from '@angular/core';
import { UserService } from '../serv-app/user-service';

@Component({
  selector: 'app-inactive-users',
  templateUrl: './inactive-users.component.html',
  styleUrls: ['./inactive-users.component.css']
})
export class InactiveUsersComponent implements OnInit {
  public users: string[]=[];
  
  constructor(private userService : UserService) { }

  ngOnInit(): void {
    this.users = this.userService.inactiveUsers;
  }
   onSetToActive(id: number) {
   this.userService.setToActive(id);
  }

}