var Student = /** @class */ (function () {
    function Student(name, studentClass) {
        this.name = name;
        this.class = studentClass;
    }
    Student.prototype.displayInfo = function () {
        console.log("Student Name: ".concat(this.name, ", Class: ").concat(this.class));
    };
    return Student;
}());
var student1 = new Student("Sai Venkata Ramana", "B.Tech Final Year");
student1.displayInfo();
