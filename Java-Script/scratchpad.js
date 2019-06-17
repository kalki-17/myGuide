/*
 * This is a JavaScript Scratchpad.
 *
 * Enter some JavaScript, then Right Click or choose from the Execute Menu:
 * 1. Run to evaluate the selected text (Ctrl+R),
 * 2. Inspect to bring up an Object Inspector on the result (Ctrl+I), or,
 * 3. Display to insert the result in a comment after the selection. (Ctrl+L)
 */

function sayHello(name,timeOfDay){
  
 // console.log("hello,"+name+":time of the day is:"+timeOfDay);
  
 // return "hello,"+name+":time of the day is:"+timeOfDay;
  return ;
}
var returnvaule=sayHello("sadashiv","afternoon",42);

//console.log(returnvaule);

var f= function foo(){
 // console.log("foo function");
}

//we can use f to execute the foo function

//f();

var executor= function(fn){
  fn();
}

executor(f);

var myObj={
  "testProp":true
};

myObj.myMethod=function(){
  //console.log("this is function object");
};

myObj.myMethod();


var person={
  "firstname":"sadashiv",
  "lastname":"lalan",
  "getfullname":function(){
  return "fullname:"+this.firstname+",lastname:"+this.lastname;
},
  "address":{
    "state":"ca",
    "country":"usa",
     "isoutofstate":function(st){
    if(this.state===st){
    console.log("he is from california");
    
  }else{
  console.log("out of state");
}
  } 
  }

};

person.address.isoutofstate("cam");
