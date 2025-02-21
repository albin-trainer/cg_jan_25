import { Product } from "./Product";
let p:Product=
{"pid":101,"pname":"Mobile","price":20000};

console.log(p.pid)
console.log(p.pname)
console.log(p.price)

let products:Product[]=[{"pid":101,"pname":"Mobile","price":20000},
    {"pid":102,"pname":"Laptop","price":60000},
    {"pid":103,"pname":"Watch","price":5000}
];
products.forEach(p=>console.log(p.pid+" "+p.pname+" "+p.price));