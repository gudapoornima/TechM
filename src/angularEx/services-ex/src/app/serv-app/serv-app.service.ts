import { Injectable } from "@angular/core";

@Injectable()
export class StudentService{
    private _studentlist: Array<any> = [];
    
    constructor() {
        this._studentlist = [{ name: 'Deepak', age: 22, city: 'Hyderabad', dob: '01-01-2000' }];
    }
    returnStudentData(): Array<any>{
        return this._studentlist;
    }
    addStudentData(item: any): void{
        this._studentlist.push(item);
    }
}