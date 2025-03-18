var Bus2 = /** @class */ (function () {
    function Bus2(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    Bus2.prototype.start = function () {
        console.log("Year: ", this.year, "Make: ", this.make, "Model: ", this.model);
    };
    return Bus2;
}());
var myBus = new Bus2("Mercedes", "Sprinter", 2022);
myBus.start();
