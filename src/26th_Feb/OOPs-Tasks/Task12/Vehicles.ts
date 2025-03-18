class Vehicle {
    make: string;
    model: string;

    constructor(make: string, model: string) {
        this.make = make;
        this.model = model;
    }

    displayInfo(): void {
        console.log("Vehicle Make: ",this.make," Model: ",this.model);
    }
}

class Car extends Vehicle {
    constructor(make: string, model: string) {
        super(make, model);
    }

    displayInfo(): void {
        console.log("Car Make: ",this.make, "Model: ",this.model);
    }
}

class SportsCar extends Car {
    topSpeed: number;

    constructor(make: string, model: string, topSpeed: number) {
        super(make, model); 
        this.topSpeed = topSpeed;
    }

    displayInfo(): void {
        console.log("SportsCar Make: ",this.make, "Model: ",this.model, "Top Speed: ",this.topSpeed," km/h");
    }
}


let vehicle1 = new Vehicle("Toyota", "Corolla");
let car1 = new Car("Honda", "Civic");
let sportsCar1 = new SportsCar("Ferrari", "488 Spider", 330);

vehicle1.displayInfo();
car1.displayInfo();
sportsCar1.displayInfo();
