# TDD
Test-Driven Development Technique

## What is TDD ?



## Positive and Negative Unit Test Cases

### What is Positive Testing ?

- Positive Testing is a type of testing which is performed on a software application by providing the VALID DATA sets as an input. 
- It checks whether the software application behaves as expected with POSITIVO INPUTS or not. 
- Positive testing is performed in order to check whether the software application does exactly what it is expected to do.

![PTS](https://github.com/aridiosilva/TDD/blob/main/Positive_testing_AridioSilva.jpg)

### What is Negative Testing ?

- Negative Testing is a testing method performed on the software application by providing invalid or improper data sets as input. 
- It checks whether the software application behaves as expected with the negative or unwanted user inputs. 
- The purpose of negative testing is to ensure that the software application does not crash and remains stable with invalid data inputs.
- Either software system should not accept the values or else it should throw an error message for these invalid data inputs.

![NPS](https://github.com/aridiosilva/TDD/blob/main/Negative_testing_AridioSilva.jpg)

### What Should Be Considered in Positive and Negative Testing ?

- In both the testing, the following needs to be considered:  Input data,  An action which needs to be performed  and Output Result;

## Testing Techniques used for Positive and Negative Testing

- Following techniques are used for Positive and negative validation of testing is:

   - Boundary Value Analysis
   - Equivalence Partitioning
   
 ### Boundary Value Analysis or Value Limits (in Black Box Testing)
 
- Is one of the software testing technique in which the test cases are designed to include values at the boundary. 
- If the input data is used within the boundary value limits, then it is said to be Positive Testing. 
- If the input data is picked outside the boundary value limits, then it is said to be Negative Testing.

![BVA](https://github.com/aridiosilva/TDD/blob/main/Negative_PositiveTesting-Valid_Invalid_Input-Boundary_or_LimitValues_AridioSilva.jpg)

-  For instace, a system can accept the numbers from 0 to 100 numeric values. All other numbers are invalid values. Under this technique, boundary values -1,0,1 and 90,100,101 will be tested.
