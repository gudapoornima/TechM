var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["White"] = 2] = "White";
    Color[Color["Blue"] = 3] = "Blue";
})(Color || (Color = {}));
var Color1 = Color.Red;
var Color2 = Color.White;
var Color3 = Color.Blue;
console.log("Selected Color:", Color1);
console.log("Selected Color:", Color2);
console.log("Selected Color:", Color3);
