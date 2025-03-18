var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Shape = /** @class */ (function () {
    function Shape(color) {
        this.color = color;
    }
    Shape.prototype.draw = function () {
        console.log("Drawing a shape of color: ", this.color);
    };
    return Shape;
}());
var Circle = /** @class */ (function (_super) {
    __extends(Circle, _super);
    function Circle(color) {
        return _super.call(this, color) || this;
    }
    Circle.prototype.draw = function () {
        console.log("Drawing a circle of color: ", this.color);
    };
    return Circle;
}(Shape));
var shape1 = new Shape("Blue");
var circle1 = new Circle("Red");
shape1.draw();
circle1.draw();
