let a = "ini umur saya di js";
let umur = 22;
// to run in console node CodeJs.js

// console.log(a, " ", umur);

let a2 = 5,
  b = 3;
// console.log("ini penjumlahan ", a2 + b);

let z, x, y;

z = x = y = 50;
// console.log(z + x + y);

function sayHallo(name) {
  return `Hallo ${name}`;
}

// console.log(sayHallo("Rofiq"));

// console.log(3 << 3);

function forich(array) {
  for (ind in array) {
    console.log(array[ind]);
  }
}

forich(["apel", "jeruk"]);

["apel", "jeruk"].forEach((item) => {
  console.log(item + " ya");
});

let myArr = ["A", "B", "C"];
myArr[0] = "AA";

console.log("ini myArr", myArr);

let myArr2 = [...myArr];

console.log("ini myArr2", myArr2);
