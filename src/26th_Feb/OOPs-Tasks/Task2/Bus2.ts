class Bus2 {
    make: string;
    model: string;
    year: number;

    constructor(make: string, model: string, year: number) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    start(): void {
        console.log("Year: ",this.year,"Make: ",this.make, "Model: ",this.model);
    }
}

let myBus = new Bus2("Mercedes", "Sprinter", 2022);
myBus.start();
