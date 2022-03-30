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




```

    interface IBankDAO {
        public insert(Bank bank;)
    }

    com.citi.india
    class BankDAO  implement IBankDao{
        @Override
        public insert(Bank bank) {
                // mysql  - india
        }
    }

    com.citi.germany
    class BankDAO implements IBankDAO{
        @Override
        public insert(Bank bank) {
            // oracle - germany
        }
    }


    class IncomeTax {
        public void showTax(IBankDAO dao) {
            if(dao instanceof com.citi.india.BankDOA) {
                then return indian tax 
            } else if(dao instanceof com.citi.germanay.BankDAo) {
                return germany tax 
            }
        }

    }


    IBankDAO bankDao  =new BankDao(); 
    bankDao.insert(bank); 

     bankDAO = new BankDAO();
    bankDao.insertBank(bank); 


```

## Unit Testing
    - JUNIT 
        - 4 
        - 5 (jupiter) 
    - TESTNG

    - MDD - Model Driven Development 
    - DDD - Domain Driven Development 
    - BDD - Behviour Driven Developer 
        - Given, When, Then, But, And 
```
    Given the application is loaded 
    When user enters valid username 
    And valid password 
    Then the user is taken to home page 
```

    - TDD - Test Driven Development 
        - any thing you write should be tested 

- SDET 

```
    List<String> 
```



## Design Patterns

- S - Single Responsibility Principle 
```
    public void inertEmployee() {
        // you should write a code only to insert 
        // and dont do any other work like fetching etcc.. 
    }
```
- O -open close principle 
```
    class Vehicle {
        moving 
        abs 
    }
    class Car exends Vehicle {
        number of wheeels 
    }
    class Truck extends Vehicle {
        load of vehicle 
    }
```
- L - Liskov Substitution Principle 
- I - Interface segregation principle 
- D - Dependency Injection 
    - try to avoid new 


- GOF - Gang of Four 
    - Erric gamma 
    - kent beck 

- creational 
    - Singleton

```
    class Employee  {
        int empId; 
        String empName; 
        Company company; 
        Employee(empId, empName, Companay company)  {
            this.empId = empId; 
            this.empName = empName; 
            this.company = company;
        }

    }

    Employee emp = new Employee(101, "Janhvi", new Company()); 
    Employee emp2 = new Employee(102, "Kareena", new Company()); 
    .... 

```


    - Factory 
    ```

    Bank <- some params based on it it will created 
        SB Account
        CA Account
        RD Account 
        FD Account 
        Demat Account 
        ... 
        500 classess 

        ---------------
        SBAccount sb = new SBAccount(); 
        CAAccount ca = new CAAccount(); 
        .... 


    ```

    - Abstract Factory 
- structural 
    - adapter pattern 
    - facade 
    - 
- behavioural
    - observer pattern 
### conventions 

1. variables - camelCase - empId, empSalary, amountOfBalance
2. methods - camelCase - getSalaryFromDataBase(), getInformation(), 
3. Class - PascalCase - Employee, EmployeeDataAccessObject 
4. constants - UPPER CASE - PI, MAX_NUMBER_OF_EMPLOYEES
5. Package - lower case - com.naveen.business, com.janhnvi.dao 



<br >

# Day2 



```
    int main() {

    }

by default c executor will return 0 
    void main() {

    }
```


- Basics of Web
    - 1999 - W3C 
    - XML - the way you pass the data / descriptive data 
    - XSLT
    - XSL
    - XSD 
    - XPATH 
    - HTTP 
        - 1.0 - stateful 
        - 1.1 - Stateless - pull's 
        - 2.0 - RPC - gRPC - Push
    - Web Servers
        - tomcat 
        - Apache 
        - IIS 
        - Glassfish
        - Jetty 
        - Netty 
        - web logic 
        - web sphere... 
        - django 
        - GIN /GORM 
    - Json
    ```
        {
            empId:101, 
            empName:{
                first:"Meghana", 
                last:"Mohanthy"
            }, 
            address: {
                hno:123, 
                street:"Good Dream Blvd", 
                city:"Mumbai", 
                state:"Maharastra"
            }
        }
    ```
    - Server Codes - https://en.wikipedia.org/wiki/List_of_HTTP_status_codes
        - 1XX - is client has sent the request or more towards client 
            - 100 
        - 2XX - the server has acknowledged 
            - 200 - OK 
            - 201 - Created
        - 3XX - redirection 
            - 307 - redirection 
        - 4XX - client made a wrong requiest with URL / URI 
            - 403 - forbidden access 
            - 404 - page not found 
        - 5XX - the request was given to server but server responded with error 
            - 500 - internal server error 

- Spring
```
    Employee e = new Employee(); 
    - because java does not support holding the ref of the object 

    int *p = (*int) malloc(100); 
    .. 
    free(p); 

    in c++ 
    class Emp {
        Emp(){}
        ~Emp(){}
    }
```
- 2003 - Rod Johnson 

```
-- hey spring get me JDBC - it means you have to pass the class, which is tightly coupled 


    interface DBContracts {}

    class JDBCImplementation implements DBContracts{}
    class MongoDBImpl implenets DBContracts{}
    class DummyImpl implements DBContracts{}
```

- Spring Boot

- Javascript, ES6, Typescript, Introdution Angular