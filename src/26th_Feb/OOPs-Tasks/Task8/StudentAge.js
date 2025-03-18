var StudentAge = /** @class */ (function () {
    function StudentAge(name, age) {
        this.name = name;
        this.age = age > 0 ? age : 0;
    }
    StudentAge.prototype.displayInfo = function () {
        console.log("Student Name: ".concat(this.name, ", Age: ").concat(this.age));
    };
    return StudentAge;
}());
var stud1 = new StudentAge("Sai Venkata Ramana", 22);
var stud2 = new StudentAge("Siddu", -5);
stud1.displayInfo();
stud2.displayInfo();
