class Student1 {
    name: string;
    class: string;

    constructor(name: string, studentClass: string) {
        this.name = name;
        this.class = studentClass;
    }

    displayInfo(): void {
        console.log(`Student Name: ${this.name}, Class: ${this.class}`);
    }
}

let student = new Student("Sai Venkata Ramana", "BTech");
student.displayInfo();
