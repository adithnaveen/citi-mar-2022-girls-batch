# citi-mar-2022-girls-batch



## Object Oriented Concepts
- Abstraction
    
    > hiding the implementation from the end user 
- Encapsulation
    > it is data hiding - Public, Private, Protected, Default(Package) - Access Specifiers 

| access | same class| same pack-inhe | same pack-non inhe | oth-pack inhe | oth-pack non inhe | 
|-------- | ------ |------ |------ |------ |------ |
| Private | Yes | NO | NO | No | No | 
| Default | Yes | Yes | Yes | No | No | 
| Protected | Yes | Yes | Yes | Yes | No | 
| Publid | Yes | yes | Yes | Yes | Yes|
|-------- | ------ |------ |------ |------ |------ |



- Inheritance

```
    - if your class does not inherit any class 
    - then it implicitly inherits from Object class 
    - when it gets compiled 

   class Employee {
       empId
       empName
       empSal
       ....

    public void display(){}

   } 

   class TeamLeader extends Employee {
       public TeamLeader() {
           // you canno wirte any statement here 
           super();

           // but you can write any statement here 
       }
   }

   TeamLeader tl1 = new TeamLeader(); 


```

- IS-A 
- HAS-A 

```
    class Employee {
        private int empId; 
        private Name name;
        private double salary; 
        ... 
    }

    class Customer{
        private int custId; 
        private Name name;
        private double income; 
    } 

    class Trainee {
        private int tId; 
        private Name name;
        ... 
    }

    class Name {
        private String firstName; 
        private String lastName; 
        private String middleName; 
    ...
    }

```

- Polymorphism

```
    class Human {
        walk
    }
    class Employee extends Human {
        timesheet
    }
    class Trainer extends Human {
        sylabuss
    }

    Human h; 
    
    h  = new Employee();
    h = new Trainer();
```

- every time as a developer you get the software you will install JDK, and every JDK will have JRE inside it 
- Access Modifiers - Abstract, static, synchronized, void etc.. 



## Database Concepts
    - DDL - Create, Truncate, Drop
    - DML - Insert, Update, Delete, Merge
    - DQL - Select
    - TCL - Savepoint, commit, rollback
    - DCL - Grant, Revoke 


- ORACLE, MYSQL, DB2, SQL SERVER ... - DBMS 
- MongoDB, Redis, cauchDB, dynamo, cockroach... - DB 
- MS - A- atomicity,  C- consitency, I - isolated, D - durability 
    + additional responsibility 
    + slower 
    + because it is managed at secondary storage level 
    + Processor
    + cache 
    + RAM 
    + HDD 

### Bank 
    - bankId (primary key [not null + unique + index])
    - bankName
    - location
### Branch 
    - branchId (primary key [not null + unique + index])
    - branchName
    - branchManager 
    ... 
    - bankId (fk)



```
    create table bank(
        bankid int primary key, 
        bankname varchar(20), 
        location varchar(50)
    ); 

    create table branch(
        branchid int primary key, 
        branchname varchar(40), 
        branchmanager varchar(30), 
        bankid int, 
        foreign key(bankid) references bank(bankid)
    ); 
```

```
    class Employee {
        // methods 
        public void hi(){}
    }

    interface IEmployee {
        public void hi();
    }
```


## JDBC
- classes are concrete until you say it is abstract 
- interfaces are 100% abstract 

1. overriding 
    - differnt classes, same method name have parent child relation 


```
    class Bank {
        public void deposite() {
            System.out.println(" you called deposite"); 
        }
    }

    class CitiBank extends Bank {
        @Override
        public void depositeddd() {
            System.out.println(" you called citi bank deposite"); 
        }
        public inertnationalTransfer() {
            System.out.println("you can do internatinal transfer"); 
        }
    }

    class SBI extends Bank {
         public void deposite() {
            System.out.println(" you called SBI bank deposite"); 
        }
    }


    Bank cb = new CitiBank(); 
    cb.deposite(); 
    ((CitiBank)cb).internationalTransfer();

    cb = new SBI(); 
    cb.deposite(); 

```
2. overloading 
    - same class, same method name, diff signatures 

Statement -> (PreparedStatement + Batch ) -> (CallableStatement + function)

## Unit Testing
## Design Patterns



### conventions 

1. variables - camelCase - empId, empSalary, amountOfBalance
2. methods - camelCase - getSalaryFromDataBase(), getInformation(), 
3. Class - PascalCase - Employee, EmployeeDataAccessObject 
4. constants - UPPER CASE - PI, MAX_NUMBER_OF_EMPLOYEES
5. Package - lower case - com.naveen.business, com.janhnvi.dao 



