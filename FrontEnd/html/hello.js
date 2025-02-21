function hello(){
    console.log("Hello Good afternoon");
    {
        var msg="Welcome"; //not local scope
        let msg2="Hello GE"; ///local scope 
    }
    console.log(msg);
   // console.log(msg2); //Error ....
   var name="Deepthi";
   var address="BLR";
   console.log(`${name} is living in ${address}`)//template literals ....
}
hello();
var customer={"cid":"101","cname":"Raju","address":"BLR"}; //javascript object
console.log(customer.cid);
console.log(customer.cname);

//obj destructuring
var {cname,address}=customer;
console.log(`${cname} is living in ${address}`)

sayHello("Albin");
function sayHello(name="X"){ //Default parameters
  console.log("Hello "+name);
}
