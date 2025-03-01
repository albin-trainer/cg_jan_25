import {from, Observable, Subscription} from 'rxjs'
      //ASSUME its in server           //data source .....
let observable:Observable<number>=from([1,2,3,4,5]);

//subscribing ....
let subscription:Subscription=observable.subscribe({
    next:x=>console.log(x),
    error:err=>console.log("Some error"),
    complete:()=>console.log("response completed")
})