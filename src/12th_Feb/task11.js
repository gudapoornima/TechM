function celsiusToFahrenheit(c) {
    return (c * 9/5) + 32;
}

function fahrenheitToCelsius(f) {
    return (f - 32) * 5/9;
}

let c = 60, f = 45;
console.log(`${c}°C is ${celsiusToFahrenheit(c)}°F`);
console.log(`${f}°F is ${fahrenheitToCelsius(f).toFixed(6)}°C`);
