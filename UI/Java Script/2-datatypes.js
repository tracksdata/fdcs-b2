console.log('Data types intro');
//----------------------------------

/*
 Two Types
 1. Primitive Types
    -> number
    -> string
    -> undefined
    -> null
 2.Reference types


*/


// 1. Number
//---------------
var a=100;

a=12.54;

//----------------

// 2. String

ename='Praveen';
ename="James";

var trainer='Praveen';
var subject='Java Script';

console.log(trainer+" is Treaching "+subject);

var resp=trainer+" is teaching the subject "+subject;

var resp1= 
`
    The Trainer ${trainer} is teaching ${subject}

`
var price=7744;
var qty=43;

var respMsg=
`
You have selected ${qty} and Each item price is ${price}
And Total Bill has to cleared ${price*qty}
`
 // document.getElementById('d1').innerHTML=respMsg;
 document.querySelector('#d1').innerHTML=respMsg;

 //-----------------

 // 3. Undefined

 var age;

var item=null;

//------------------



