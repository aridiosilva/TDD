# TDD
Test-Driven Development Technique

## What is TDD ?



## Positive and Negative Unit Test Cases

For effective testing, we must use both - Positive and Negative testing - which give enough confidence in the quality of the software. 

### What is Positive Testing ?

- Positive Testing is a type of testing which is performed on a software application by providing the VALID DATA sets as an input. 
- It checks whether the software application behaves as expected with POSITIVO INPUTS or not. 
- Positive testing is performed in order to check whether the software application does exactly what it is expected to do.

- Positive testing, many times referred to as **“Happy path testing”** is generally the first form of testing that a tester would perform on an application. 

- It is the process of running test scenarios that an end user would run for his use. Hence as implied, positive testing entails running a test scenario with only correct and valid data. If a test scenario doesn’t need data, then positive testing would require running the test exactly the manner in which it’s supposed to run and hence to ensure that the application is meeting the specifications. 
- Sometimes there may be more than one way of performing a particular function or task with an intent to give the end user more flexibility or for general product consistency. This is called **alternate path testing** which is also a kind of positive testing. In alternate path testing, the test is again performed to meet its requirements but using the different route than the obvious path. The test scenario would even consume the same kind of data to achieve the same result.

![PTS](https://github.com/aridiosilva/TDD/blob/main/Positive_testing_AridioSilva.jpg)

### What is Negative Testing ?

- Negative Testing is a testing method performed on the software application by providing invalid or improper data sets as input. 
- It checks whether the software application behaves as expected with the negative or unwanted user inputs. 
- The purpose of negative testing is to ensure that the software application does not crash and remains stable with invalid data inputs.
- Either software system should not accept the values or else it should throw an error message for these invalid data inputs.

- Negative testing commonly referred to as **error path testing** or **failure testing** is generally done to ensure the stability of the application.

- Negative testing is the process of applying as much creativity as possible and validating the application against invalid data. This means its intended purpose is to check if the errors are being shown to the user where it’s supposed to, or handling a bad value more gracefully.
- It is absolutely essential to understand why negative testing is necessary.
- The application or software’s functional reliability can be quantified only with effectively designed negative scenarios. 
- Negative testing not only aims to bring out any potential flaws that could cause serious impact on the consumption of the product on the whole but can be instrumental in determining the conditions under which the application can crash. 
- Finally, it ensures that there is sufficient error validation present in the software.

![NPS](https://github.com/aridiosilva/TDD/blob/main/Negative_testing_AridioSilva.jpg)

### What Should Be Considered in Positive and Negative Testing ?

- In both the testing, the following needs to be considered:  Input data,  An action which needs to be performed  and Output Result;

## Testing Techniques used for Positive and Negative Testing

- Following techniques are used for Positive and negative validation of testing is:

   - Boundary Value Analysis
   - Equivalence Partitioning
   
 ### Boundary Value Analysis (BVA) or Value Limits (in Black Box Testing)
 
- Is one of the software testing technique in which the test cases are designed to include values at the boundary. 
- If the input data is used within the boundary value limits, then it is said to be Positive Testing. 
- If the input data is picked outside the boundary value limits, then it is said to be Negative Testing.

![BVA](https://github.com/aridiosilva/TDD/blob/main/Negative_PositiveTesting-Valid_Invalid_Input-Boundary_or_LimitValues_AridioSilva.jpg)

-  For instace, a system can accept the numbers from 0 to 100 numeric values. All other numbers are invalid values. Under this technique, boundary values -1,0,1 and 90,100,101 will be tested.

![EX01](https://github.com/aridiosilva/TDD/blob/main/Example_of_Positive_Negative_Testing_and_Boundary_Value%20Limits_AridioSilva.jpg)


### Equivalence Partitioning:

- Is a software testing technique which divides the input data into many partitions.
- Values from each partition must be tested at least once. Partitions with valid values are used for Positive Testing. 
- While partitions with invalid values are used for negative testing.


