"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var p = { "pid": 101, "pname": "Mobile", "price": 20000 };
console.log(p.pid);
console.log(p.pname);
console.log(p.price);
var products = [{ "pid": 101, "pname": "Mobile", "price": 20000 },
    { "pid": 102, "pname": "Laptop", "price": 60000 },
    { "pid": 103, "pname": "Watch", "price": 5000 }
];
products.forEach(function (p) { return console.log(p.pid + " " + p.pname + " " + p.price); });
