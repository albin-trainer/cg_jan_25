"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var rxjs_1 = require("rxjs");
//data source .....
var observable = (0, rxjs_1.from)([1, 2, 3, 4, 5]);
//subscribing ....
var subscription = observable.subscribe({
    next: function (x) { return console.log(x); },
    error: function (err) { return console.log("Some error"); },
    complete: function () { return console.log("response completed"); }
});
