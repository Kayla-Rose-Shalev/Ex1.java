In this assignment we are required to design a number formatting converter and calculator.

Firstly, this will be done by asking the user to choose a number from base 2 to 16, when 10-16 are represented correspondently by A-G, using the following format: .

for example, valid numbers include: 1011b2, 175bA (= 135, the base is decimal), 012b5, 123bG and so on. 
    >In the case that the number chosen is not valid, for example:
    “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG” ;
    the output will show an error and ask the user to enter a new number.

Secondly, once a valid number is entered, the output will present that it is a true number and it will also present its decimal value.

Afterwards, the output will ask the user to choose a second number in a similar fashion to the first one. Once the second valid number is chosen, the output will ask the user to choose a base from 2 to 16.
    >if a non-valid base is chosen, (e.g: 17), the output will present an error. 

Once a valid base is chosen, the output will present the following 3 solutions:
1. The addition of the 2 chosen numbers, where the result is presented in the chosen base.
2. The multiplication of the 2 chosen numbers, where the result is presented in the chosen base.
3. The greatest number amongst the four following: 1) chosen number #1
                                                   2) chosen number #2
                                                   3) addition result in chosen base
                                                   4) multiplication result in chosen base
   
