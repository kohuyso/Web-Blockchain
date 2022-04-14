// console.log("AAAA")
// console.log(name)
// let name = "Anh Duc dzai"
// //
// console.log(name)

// const arr = [true, 1 , 'fgf', {aa : "aaa"}];
// console.log(arr);
// console.log(...arr);

let object = {
    aa : "aaa",
    bb : "bbb"
};

let s = JSON.stringify(object);
const p = JSON.parse(s);

console.log(s);
console.log(p)

