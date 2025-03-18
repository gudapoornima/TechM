var Student = /** @class */ (function () {
    function Student(name, rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber !== null && rollNumber !== void 0 ? rollNumber : -1;
    }
    Student.prototype.displayInfo = function () {
        console.log("Student Name: ".concat(this.name, ", Roll Number: ").concat(this.rollNumber === -1 ? "Unknown" : this.rollNumber));
    };
    return Student;
}());
var student1 = new Student("Sai Venkata Ramana", 1010);
var student2 = new Student("Siddu");
student1.displayInfo();
student2.displayInfo();
