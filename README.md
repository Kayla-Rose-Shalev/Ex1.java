In this assignment we are required to design a number formatting converter and calculator.

Firstly, this will be done by asking the user to input a number from base 2 to 16, when 10-16 are represented correspondingly by A-G, using the following format: <number><b><base.

for example, valid numbers include: 1011b2, 135bA, 1937, 012b5, 123bG. EFbG and so on. 
    >In the case that the number chosen is not valid, for example:
    “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG” ;
    the output will present an error and start over the code prompting the user for a new first number:
    
     ERR: num1 is in the wrong format! (users input)

     Ex1 class solution:
     Enter a string as number#1 (or "quit" to end the program): 

List of conditions that apply for a number to be valid:
- If made up of only digits and no other characters (meaning it is a decimal number).
- in any other case, it must fit the format of <number><b><base from [2,16]>. (in other words, it must contain a number, than the lower-case letter b, than a number from 2-9, or a letter from A-G.)
- in the <number> part, capital lettters A-G are permitted since they represent the numbers 10 through 16.

Once a valid first number is entered, the output will present that it is a true number and it will also present its decimal value:

    num1= (users input) is number: true , value: (converted decimal value of users input)
    
Afterwards, the output will ask the user to choose a second number in a similar fashion to the first one:

    Enter a string as number#2 (or "quit" to end the program): 

Once the second valid number is chosen, the output will ask the user to choose a base from 2 to 16:

    num2= (users input) is number: true , value: (converted decimal value of users input)
    Enter a base for output: (a number [2,16])

if a non-valid base is chosen, (e.g: 17), the output will present an error and start over the code prompting the user for a new first number:

    ERR: wrong base, should be [2,16], got (wrong base inputed by user)
    Enter a string as number#1 (or "quit" to end the program): 

Once a valid base is chosen, the output will present the following 3 solutions:
1. The addition of the 2 chosen numbers, where the result is presented in the chosen base.
2. The multiplication of the 2 chosen numbers, where the result is presented in the chosen base.
3. The greatest number amongst the four following: 1) chosen number #1, 2) chosen number #2, 3) addition result in chosen base, 4) multiplication result in chosen base

        first chosen number + second chosen number = result in chosen base by user
        first chosen number * second chosen number = result in chosen base by user
        Max number over [first chosen number, second chosen number, addition result in chosen base by user, multiplication result in chosen base by user]
       

   
