class Shape {
    color: string;

    constructor(color: string) {
        this.color = color;
    }
}

class Circle extends Shape {
    radius: number;

    constructor(color: string, radius: number) {
        super(color); 
        this.radius = radius;
    }

    displayDetails(): void {
        console.log(`Circle Color: ${this.color}, Radius: ${this.radius}`);
    }
}

let myCircle = new Circle("Red", 10);
myCircle.displayDetails();
