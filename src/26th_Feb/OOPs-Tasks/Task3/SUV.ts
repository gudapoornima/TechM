class Car {
    make: string;
    model: string;
    year: number;

    constructor(make: string, model: string, year: number) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    displayInfo(): void {
        console.log(`Car: ${this.year} ${this.make} ${this.model}`);
    }
}

class SUV extends Car {
    isOffRoadCapable: boolean;

    constructor(make: string, model: string, year: number, isOffRoadCapable: boolean) {
        super(make, model, year);
        this.isOffRoadCapable = isOffRoadCapable;
    }

    toggleOffRoadCapability(): void {
        this.isOffRoadCapable = !this.isOffRoadCapable;
        console.log(`Off-road mode is now ${this.isOffRoadCapable ? "enabled" : "disabled"}.`);
    }
}

let mySUV = new SUV("Toyota", "Land Cruiser", 2023, false);
mySUV.displayInfo();
mySUV.toggleOffRoadCapability();
