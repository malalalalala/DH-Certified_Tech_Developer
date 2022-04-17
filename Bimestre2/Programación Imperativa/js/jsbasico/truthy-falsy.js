let a= 0 == ""; // true
let b="" == false; // true
let c=null == undefined; // true
let d=17 == "17"; // true
let e="" == true; // false
let f=null == false; // false
let g=0 == null; // false
let h=NaN == NaN; //false

console.log(a,b,c,d,e,f,g,h)

let i= 0 === ""; //false
let j="" === false; //false
let k=null === undefined; //false
let l=17 === "17"; //false
let m="" === true; //false
let n=null === false; // false
let o=0 === null; // false
let p=NaN === NaN; //false

console.log(i,j,k,l,m,n,o,p)

console.log(
    false | 3 == 4)