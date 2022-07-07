# Introduction to OOP  Tasks

## Homework Tasks

***- Homework 01 -***<br> 
- Create a Person class with age and name properties.
- Instantiate the Person class by creating a Person object in your Main class – you can use a parameterized constructor.
- Call the properties of the Person class in your Main class to print the following:
- "My name is {name} and I am {age} years old"

➡️ [Homework 01 Solution: Click here](/Lesson10-OOP-Introduction/src/homework01/Main.java)<br>

***- Homework 02 -***<br> 
- Add a method in the Person class from the previous exercise called "printPersonalInfo()" that outputs the same message.
- In your Main class, simply call this method of your Person object.

➡️ [Homework 02 Solution: Click here](/Lesson10-OOP-Introduction/src/homework02/Main.java)<br>

***- Homework 03 -***<br> 
- Create 3 more Person objects with different names and ages.
- Create an array of Persons – Person[] arr …. ;
- Add all objects to the array.
- Loop over the array and call the printPersonalInfo() method of every object.

➡️ [Homework 03 Solution: Click here](/Lesson10-OOP-Introduction/src/homework03/Main.java)<br>

***- Homework 04 -***<br> 
- Add a boolean flag "isStudent" to the Person class.
- Instantiate some Persons to be students and others to be not students.
- In your array loop, perform a check to see if the current object is a student, and only if it is, print his personal information.

➡️ [Homework 04 Solution: Click here](/Lesson10-OOP-Introduction/src/homework04/Main.java)<br>

***- Homework 05 -***<br> 
- First, receive the number of students – n.
- Then, create an array of Persons and fill it with Person objects – you will receive their name, age and isStudent property in the loop. You will create the object and assign it to arr[i]
- Then, loop over the array as in the previous exercise.

➡️ [Homework 05 Solution: Click here](/Lesson10-OOP-Introduction/src/homework05/Main.java)<br>

***- Homework 06 -***<br> 
- Let us remove our isStudent check. Instead, the printPersonalInformation() method should print the following:
- "My name is {name} and I am {age} years old. I {am} / {am not} a student."
- Achieve this by creating a second method with return type String in the Person class called "getOccupation()" which returns the following sentence: "I {am} / {am not} a student".
- Then, in your printPersonalInformation() method, simply call this method and append its result (String) to your message.

➡️ [Homework 06 Solution: Click here](/Lesson10-OOP-Introduction/src/homework06/Main.java)<br>
