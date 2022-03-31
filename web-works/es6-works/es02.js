// to show working of template string 

let s1 = "Kareena"; 
let s2 = "Vaishnavi"; 
let age = 21; 


let newString = s1 +" and " + s2 +" are friends"; 

console.log(newString);

// in es6 we have template strings 
let newString1 =`${s1} and ${s2} are friends in template string`;
console.log(newString1);


let newString2 = `${s1} age is ${age} and ${age>18?"Major":"Minor"}`;

console.log(newString2);


let names=['Reena','Rutuja', 'Meghana', 'Brishti']; 

let chars = names.map((val) => val.charAt(0));

console.log(chars);


class Person {
    constructor(name, city='bengaluru') {
        this.name = name; 
        this.city = city; 
    }

    display() {
        console.log(`Name is ${this.name}`);
        console.log(`Cith is ${this.city}`);
    }
}

p =new Person('Naveen', 'Mysuru'); 
console.log(p);
p.display(); 