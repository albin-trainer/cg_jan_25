"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Customer = void 0;
var Customer = /** @class */ (function () {
    function Customer(cid, cname, address) {
        this.cid = cid;
        this.cname = cname;
        this.address = address;
    }
    Customer.prototype.getData = function () {
        return "customer id is ".concat(this.cid, "  and name is ").concat(this.cname, " and address is ").concat(this.address);
    };
    return Customer;
}());
exports.Customer = Customer;
