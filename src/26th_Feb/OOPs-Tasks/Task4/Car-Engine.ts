class Engine {
    horsepower: number;
    fuelType: string;

    constructor(horsepower: number, fuelType: string) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }
}

class Car1 {
    make: string;
    model: string;
    year: number;
    engine: Engine;

    constructor(make: string, model: string, year: number, engine: Engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    start(): void {
        console.log(`The ${this.year} ${this.make} ${this.model}`);
    }

    printCarDetails(): void {
        console.log(`Car: ${this.year} ${this.make} ${this.model}`);
        console.log(`Engine: ${this.engine.horsepower} HP, Fuel Type: ${this.engine.fuelType}`);
    }
}

let myEngine = new Engine(300, "Petrol");
let myCar = new Car1("BMW", "X5", 2023, myEngine);

myCar.start();
myCar.printCarDetails();
