function isLeapYear(year) {
    return (year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0);
}

let year = 2024;
console.log(`${year} is ${isLeapYear(year) ? "a Leap Year" : "not a Leap Year"}`);
