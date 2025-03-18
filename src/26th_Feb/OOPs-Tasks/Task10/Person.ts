class Person {
    name: string;
    age: number;

    constructor(name: string, age: number) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    employeeId: number;

    constructor(name: string, age: number, employeeId: number) {
        super(name, age);
        this.employeeId = employeeId;
    }

    displayInfo(): void {
        console.log("Employee Name:",this.name," Age: ",this.age, "Employee ID: ",this.employeeId);
    }
}


let emp1 = new Employee("Sai Venkata Ramana", 22, 1010);

emp1.displayInfo();
