"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(id, sname) {
        this.id = id;
        this.sname = sname;
    }
    Student.prototype.display = function () {
        console.log(" id is ".concat(this.id, " and name is ").concat(this.sname));
    };
    return Student;
}());
exports.Student = Student;
var s = new Student(101, "Thirtha");
s.display();
