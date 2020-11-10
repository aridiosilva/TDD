# TDD  - Test-Driven Development Technique

## What is TDD ?

- Test-driven development is a software development process relying on the repetition of a very short development cycle: requirements are turned into very specific test cases, then the code is improved allowing the tests to pass. This is opposed to software development allowing unproven code to be added.

- TDD refers to a style of programming in which three activities are tightly interwoven: 

   - coding, 
   - testing (in the form of writing unit tests) and 
   - design (in the form of refactoring)."

- It can be succinctly described by the following set of rules:

   - write a “single” unit test describing an aspect of the program   
   - run the test, which should fail because the program lacks that feature
   - write “just enough” code, the simplest possible, to make the test pass
   - “refactor” the code until it conforms to the simplicity criteria 
   - repeat, “accumulating” unit tests over time
   
   ![TDD Workflow](https://github.com/aridiosilva/TDD/blob/main/TDD-Workflow.png)   
   
   
- Test-Driven Development starts with designing and developing tests for every small functionality of an application. 
- TDD instructs developers to write new code only if an automated test has failed. 
- The simple concept of TDD is to write and correct the failed tests before writing new code (before development).

## Origins of TDD

While the idea of having test elaboration precede programming is not original to the Agile community, TDD constitutes a breakthrough insofar as it combines that idea with that of “developer testing”, providing developer testing with renewed respectability.

  - 1976: publication of “Software Reliability” by Glenford Myers, which states as an “axiom” that “a developer should never test their own code” (Dark Ages of Developer Testing)
  - 1990: testing discipline dominated by “black box” techniques, in particular in the form of “capture and replay” testing tools
  - 1991: independent creation of a testing framework at Taligent with striking similarities to SUnit (source)
  - 1994: Kent Beck writes the SUnit testing framework for Smalltalk (source)
  - 1998: article on Extreme Programming mentions that “we usually write the test first” (source)
  - 1998 to 2002: “Test First” is elaborated into “Test Driven”, in particular on the C2.com Wiki
  - 2000: Mock Objects are among the novel techniques developed during that period (source)
  - 2003: publication of “Test Driven Development: By Example” by Kent Beck

By 2006 TDD is a relatively mature discipline which has started encouraging further innovations derived from it, such as ATDD or BDD).
 
## Expected Benefits of TDD

- many teams report significant reductions in defect rates, at the cost of a moderate increase in initial development effort
- the same teams tend to report that these overheads are more than offset by a reduction in effort in projects’ final phases
- although empirical research has so far failed to confirm this, veteran practitioners report that TDD leads to improved design qualities in the code, and more generally a higher degree of “internal” or technical quality, for instance improving the metrics of cohesion and coupling

## Signs of Use of TDD

- “code coverage” is a common approach to evidencing the use of TDD; while high coverage does not guarantee appropriate use of TDD, coverage below 80% is likely to indicate  deficiencies in a team’s mastery of TDD
- version control logs should show that test code is checked in each time product code is checked in, in roughly comparable amounts


## Skill Levels for TDD Use

  ### a) Level Beginner

   - able to write a unit test prior to writing the corresponding code
   -  able to write code sufficient to make a failing test pass

  ### b) Level Intermediate

   - practices “test driven bug fixing”: when a defect is found, writes a test exposing the defect before correction
   - able to decompose a compound program feature into a sequence of several unit tests to be written
   - knows and can name a number of tactics to guide the writing of tests (for instance “when testing a recursive algorithm, first write a test for the recursion terminating case”)
   - able to factor out reusable elements from existing unit tests, yielding situation-specific testing tools

  ### c) Level Advanced

   - able to formulate a “roadmap” of planned unit tests for a macroscopic features (and to revise it as necessary)
   - able to “test drive” a variety of design paradigms: object-oriented, functional, event-drive
   - able to “test drive” a variety of technical domains: computation, user interfaces, persistent data access…

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

- Negative Testing is a testing method performed on the software application by providing invalid or improper data sets as input. It checks whether the software application behaves as expected with the negative or unwanted user inputs. The purpose of negative testing is to ensure that the software application does not crash and remains stable with invalid data inputs. Either software system should not accept the values or else it should throw an error message for these invalid data inputs.

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
   
 ### TECHNIQUE I - Boundary Value Analysis (BVA) or Value Limits (in Black Box Testing)
 
- Is one of the software testing technique in which the test cases are designed to include values at the boundary. 
- If the input data is used within the boundary value limits, then it is said to be Positive Testing. 
- If the input data is picked outside the boundary value limits, then it is said to be Negative Testing.

![BVA](https://github.com/aridiosilva/TDD/blob/main/Negative_PositiveTesting-Valid_Invalid_Input-Boundary_or_LimitValues_AridioSilva.jpg)

- As the name itself implies, boundary indicates limits to something. Hence this involves designing test scenarios that only focus on the boundary values and validate how the application behaves. Therefore if the inputs are supplied within the boundary values then it is considered to be positive testing and inputs beyond the boundary values is considered to be a part of negative testing.
-  For instace, a system can accept the numbers from 0 to 100 numeric values. All other numbers are invalid values. Under this technique, boundary values -1,0,1 and 90,100,101 will be tested.

![EX01](https://github.com/aridiosilva/TDD/blob/main/Example_of_Positive_Negative_Testing_and_Boundary_Value%20Limits_AridioSilva.jpg)


### TECHNIQUE II - Equivalence Class Partitioning (ECP) or Equivalence Classes (in Black Box Testing)

- Is a software testing technique which divides the input data into many partitions.
- Values from each partition must be tested at least once. Partitions with valid values are used for Positive Testing. 
- While partitions with invalid values are used for negative testing.

- In Equivalence partitioning, the test data are segregated into various partitions. These partitions are referred to as equivalence data classes. It is assumed that the various input data (data can be a condition) in each partition behave the same way. Hence only one particular condition or situation needs to be tested from each partition as if one works then all the others in that partition is assumed to work. Similarly, if one condition in a partition doesn’t work, then none of the others will work.  
- Therefore it’s now very apparent that valid data classes (in the partitions) will comprise of positive testing whereas invalid data classes will comprise of negative testing.

## Happy & Unhappy Paths: Why You Need to Test Both

     - A happy path is a default scenario featuring no exceptional or error conditions, so the unhappy path 
       is all the other scenarios where exceptional or error conditions happen.

Congratulations! You’ve finally launched a web application after months of development. As an Agile developer, you used test-driven development from the start and achieved nearly 100% test coverage. And any new commits go through a robust continuous integration and delivery process to instantly identify issues before they hit production. What could go wrong? To your surprise, you wake up the next morning to find a mountain of bug reports in your inbox. Angry users are complaining that the software isn’t working properly and the server logs are filled with crashes. Something has gone horribly wrong despite your diligent testing.  What happened? And how can you fix it? Let’s take a look at what likely went wrong and how you can modify your testing approach to ensure that your software is intuitive and error free.  Many developers make assumptions when writing tests and fail to cover the ‘unhappy paths’.

### Happy vs. Unhappy Paths

Many developers make the mistake of only testing happy paths, or what users are supposed to do when using an application, and neglect testing unhappy paths, or the many ways that users can break your software. By doing so, they may not be prepared to properly handle errors. For example, suppose that you have a user registration form that automatically records the user’s location using their IP address and you use this information to show them relevant businesses in their area. This approach works great for most users but might fail if someone is using a VPN. If you write a test covering this use case, you could plan ahead and add the user’s location to the registration form with an option to edit it to a different location. That way, the user could easily change the setting and avoid the confusion of seeing non-local businesses after completing the registration. 

Happy and unhappy paths can be useful in both behavior-driven development (BDD) and test-driven development (TDD). In general, BDD tests ensure that the software behaves as a user would expect and should be accessible to stakeholder. TDD tests to ensure that the software functions on a technical level. In other words, you may use BDD to ensure that unhappy paths create helpful error messages or workflow reminders and use TDD to ensure that the application experience errors.

### How to Find Unhappy Paths

The biggest challenge with writing tests for unhappy paths is identifying them. When we write software, we create an intended workflow for the user, but there are countless ways that they can deviate from that workflow. 

## TDD Code Kata 

How to Level Up Your Test-Driven Development expertise?

### What is Kata?

- “Kata” is a Japanese martial arts term for choreographed patterns of movement. They’re also called “forms.” Both beginners and masters practice these detailed patterns over and over. The movements eventually come without thought, because your body knows what to do.

### What is Code Kata?

- How do professional athletes stay on top of their game? They practice. How about professional musicians? Practice, practice, practice.

- A “code kata” applies this idea to coding. It’s a self-contained exercise you can repeat. Every time you repeat it, you’ll learn something new. At first, you’ll learn one approach to solving a problem. As you repeat the same approach, your learning will shift toward muscle memory.

- Then you can tackle the same problem but with different approaches. A common style during the annual Global Day of Coderetreat is to repeat a problem while adding different coding constraints. For example, can you code without your mouse? Can you code without exposing properties? How about no conditionals? …A physical analogy would be running with extra weights, or fighting with one hand.

- Using self-contained exercises is the best way to practice coding. They’re outside of your production code, so there’s no worry of breaking anything. You’ll throw away what you try because you’re going to repeat the coding kata later. The goal is to gain mastery over coding tools and techniques.

- How can you learn and practice test-driven development (TDD)? I can explain the principles of TDD. But the question that comes back is, “But what do I actually do in my framework of software development?”

- That’s what code katas are for. They’re not tutorials. They’re exercises, designed to help you grow in your technical agility. 

