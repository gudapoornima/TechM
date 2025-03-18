class StudentAge {
    name: string;
    age: number;

    constructor(name: string, age: number) {
        this.name = name;
        this.age = age > 0 ? age : 0;
    }

    displayInfo(): void {
        console.log(`Student Name: ${this.name}, Age: ${this.age}`);
    }
}

let stud1 = new StudentAge("Sai Venkata Ramana", 22);
let stud2 = new StudentAge("Siddu", -5); 

stud1.displayInfo();
stud2.displayInfo();
