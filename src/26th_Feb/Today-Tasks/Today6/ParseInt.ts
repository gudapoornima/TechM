let temp: unknown = "123";
let temp2: unknown=true;
let num1: number = temp as number;

console.log(num1); 
console.log(temp2);
let num2: number = parseInt(temp as string);
let num3: number = parseInt(temp2 as string);

console.log("Converted Number:", num2);
console.log("Converted Number:", num3);


