"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(n) {
        this.n = n;
    }
    Employee.prototype.display = function () {
        console.log(this.empId);
        console.log(this.salary);
        console.log(this.address);
        console.log(this.n);
    };
    return Employee;
}());
exports.Employee = Employee;
