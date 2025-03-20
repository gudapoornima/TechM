import { Injectable } from "@angular/core";
import { CounterService } from "./counter-service";

@Injectable({
  providedIn: 'root' // ✅ Ensure this is provided at the root level
})
export class UserService {
  activeUsers =   ['Poornima', 'Greesh'];
  inactiveUsers = ['Shinchan', 'Shiro'];

  constructor(private counterService: CounterService) {}  

  setToActive(id: number) {
    this.activeUsers.push(this.inactiveUsers[id]);
    this.inactiveUsers.splice(id, 1);
    this.counterService.incrementInActiveToActive();
  }

  setToInactive(id: number) {
    this.inactiveUsers.push(this.activeUsers[id]);
    this.activeUsers.splice(id, 1);
    this.counterService.incrementActiveToInactive();
  }  
}
