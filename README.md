# HW1 Additional Questions Answered

-Small variable scope Demo included in printReceipt code

## What's the constructor called that has Parameters
A constructor with parameters is called a parameterized Constructor. 

Purposes of a parameterized constructor:
-To allow you to assign specific values to your object when you instantiate it
-Force the assignment of specific values so your objects aren't created without necessary properties 
-Parameterized constructors can also be overloaded allowing multiple ways to create instances of that object

## Additonal topics learned about Parameterized Constructors
(Though not new as I've worked with it briefly, the term found is new)

-Encapsulating Inlitialization logic: when using parameterized constructors you can create what I'm going to refer to as "special rules" for creating your objects
that instructs your program to check for certain conditions when creating that object.

example: If you're creating a Person object and one of the arguments you require for creating a person is that they input an age, it would be beneficial to create
a requirement that the age cannot be less than zero and you can code this requirment inside of your constructor

class Person {
    int age;

    public Person(int age) {
        if (age < 0) {           
            this.age = 0;    // automatically set age to zero if they input a number that doesn't satisfy the condition
        } else {
            this.age = age;  // Use the age given if it satisfys the condition 
        }
    }
}
