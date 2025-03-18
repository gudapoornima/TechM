class Shape {
    color: string;

    constructor(color: string) {
        this.color = color;
    }

    draw(): void {
        console.log("Drawing a shape of color: ",this.color);
    }
}

class Circle extends Shape {
    constructor(color: string) {
        super(color);
    }

    draw(): void {
        console.log("Drawing a circle of color: ",this.color);
    }
}

let shape1 = new Shape("Blue");
let circle1 = new Circle("Red");

shape1.draw();
circle1.draw();
