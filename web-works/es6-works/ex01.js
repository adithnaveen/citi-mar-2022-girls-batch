console.log("hi this is from sample file");

//1. num 1=1 - global declaration 
//2. var num = 1; - local to the function from the point onwards it available every where 
//3. {let num = 1;} this shall have scoping and values can be changes 
//4. {const num = 1;} this shall have scoping and values cannot be changes 


function test() {

    for(let i=0; i<5; i++) {
        console.log(i);
    }
    console.log("i out side is " + i); 
}

test(); 


