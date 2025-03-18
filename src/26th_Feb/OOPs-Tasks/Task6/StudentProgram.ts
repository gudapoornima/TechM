class Student {
    name: string;
    rollNumber: number;

    constructor(name: string);
    constructor(name: string, rollNumber: number);
    constructor(name: string, rollNumber?: number) {
        this.name = name;
        this.rollNumber = rollNumber ?? -1; 
    }

    displayInfo(): void {
        console.log(`Student Name: ${this.name}, Roll Number: ${this.rollNumber === -1 ? "Unknown" : this.rollNumber}`);
    }
}

let student1 = new Student("Sai Venkata Ramana", 1010);
let student2 = new Student("Siddu");

student1.displayInfo();
student2.displayInfo();
