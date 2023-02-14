var a;
var b = null;
var c = undefined;
var d = 4;
var e = 'five';
var f = a || b || c || d || e;
// false||d||false
console.log(f);