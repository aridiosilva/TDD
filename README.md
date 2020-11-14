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

     - Positive Testing is a type of testing which is performed on a software 
       application by providing the VALID DATA sets as an input. 
      
- It checks whether the software application behaves as expected with POSITIVO INPUTS or not.  

- Positive testing is performed in order to check whether the software application does exactly what it is expected to do.

- Positive testing, many times referred to as **“Happy path testing”** is generally the first form of testing that a tester would perform on an application. 

- It is the process of running test scenarios that an end user would run for his use. Hence as implied, positive testing entails running a test scenario with only correct and valid data. If a test scenario doesn’t need data, then positive testing would require running the test exactly the manner in which it’s supposed to run and hence to ensure that the application is meeting the specifications. 
- Sometimes there may be more than one way of performing a particular function or task with an intent to give the end user more flexibility or for general product consistency. This is called **alternate path testing** which is also a kind of positive testing. In alternate path testing, the test is again performed to meet its requirements but using the different route than the obvious path. The test scenario would even consume the same kind of data to achieve the same result.

![PTS](https://github.com/aridiosilva/TDD/blob/main/Positive_testing_AridioSilva.jpg)

### What is Negative Testing ?

       - Negative Testing is a testing method performed on the software application by 
         providing invalid or improper data sets as input.
         
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

How to Level Up Your Test-Driven Development expertise?  A kata is a small programming task that you build a solution to, or sometimes multiple solutions. The point is to develop programming skill through familiarity with programming patterns. The question is, are code katas useful for testers? 

### What is Kata?

- “Kata” is a Japanese martial arts term for choreographed patterns of movement. They’re also called “forms.” Both beginners and masters practice these detailed patterns over and over. The movements eventually come without thought, because your body knows what to do.

### What is Code Kata?

- How do professional athletes stay on top of their game? They practice. How about professional musicians? Practice, practice, practice.

- A “code kata” applies this idea to coding. It’s a self-contained exercise you can repeat. Every time you repeat it, you’ll learn something new. At first, you’ll learn one approach to solving a problem. As you repeat the same approach, your learning will shift toward muscle memory.

- Then you can tackle the same problem but with different approaches. A common style during the annual Global Day of Coderetreat is to repeat a problem while adding different coding constraints. For example, can you code without your mouse? Can you code without exposing properties? How about no conditionals? …A physical analogy would be running with extra weights, or fighting with one hand.

- Using self-contained exercises is the best way to practice coding. They’re outside of your production code, so there’s no worry of breaking anything. You’ll throw away what you try because you’re going to repeat the coding kata later. The goal is to gain mastery over coding tools and techniques.

- How can you learn and practice test-driven development (TDD)? I can explain the principles of TDD. But the question that comes back is, “But what do I actually do in my framework of software development?”

- That’s what code katas are for. They’re not tutorials. They’re exercises, designed to help you grow in your technical agility. 

### Where did the term kata Code come from?

The term was first coined by Dave Thomas, co-author of the book The Pragmatic Programmer as an acknowledgment to the Japanese concept of kata in the martial arts. Dave's version of the concept defines a code kata as an exercise in programming which helps a programmer sharpen their skills through practice and repetition

### Kata Testing Famework  (CodeWars)

Codewars is a community of developers, who are called Code Warriors (or just warriors), that train on improving their development skills. Think of it like a coding dojo - where developers train with each other and help each other get better through practice.

(https://github.com/codewars/codewars.com/wiki/About-Codewars)

- In the Codewars (Kata Testing Framewoek), kata are code challenges focused on improving skill and technique. Some train programming fundamentals, while others focus on complex problem solving. Others are puzzles meant to test your creative problem solving, while others are based on real world coding scenarios.
Each kata is crafted for and by the community. The author (or Sensei) who created kata will initially include one or more languages to train in. Other Code Warriors later can "translate" the kata into additional languages.

## Unit Testing 

Unit tests guide code design and allow us to quickly verify that failure modes and logic-flows work as intended.

### Basics of Unit testing

Check that your code is working as expected by creating and running unit tests. It's called unit testing because you break down the functionality of your program into discrete testable behaviors that you can test as individual units. 

Use a unit testing framework to create unit tests, run them, and report the results of these tests. Rerun unit tests when you make changes to test that your code is still working correctly.

Unit testing has the greatest effect on the quality of your code when it's an integral part of your software development workflow. 

With test driven development, you create the unit tests before you write the code, so you use the unit tests as both design documentation and functional specifications.

##  AAA (Arrange-Act-Assert) Unit Testing Pattern - Writing your Unit Tests

The AAA (Arrange, Act, Assert) pattern is a common way of writing unit tests for a method under test.

    -  The Arrange section of a unit test method initializes objects and sets
       the value of the data that is passed to the method under test.

    - The Act section invokes the method under test with the arranged parameters.

    - The Assert section verifies that the action of the method under test behaves as expected.

The AAA (Arrange-Act-Assert) pattern has become almost a standard across the industry. It suggests that you should divide your test method into three sections: arrange, act and assert. Each one of them only responsible for the part in which they are named after.

So the arrange section you only have code required to setup that specific test. Here objects would be created, mocks setup (if you are using one) and potentially expectations would be set. Then there is the Act, which should be the invocation of the method being tested. And on Assert you would simply check whether the expectations were met. 

## Example in Java of the use of AAA Unit Testing Patterning

Following this pattern does make the code quite well structured and easy to understand. In general lines, it would look like this:

```java
     import static org.junit.Assert.assertEquals;
     public class TestaCalc {
        @Test
         public void AddTest()  {
            //arrange:
            var calculator = new Calculator();
            //act:
            var result = calculator.addOperands(2, 3);
            //assert:
            Assert.AreEqual(5, result);
        }
     }
```

## Unit Testing vs Integration Testing 

In software testing, it is common that the software artifact under test depends on other units [36]. Therefore, when testing a unit (e.g., a class in object-oriented programming), developers often need to decide whether to test the unit and all its dependencies together (similar to integration testing) or to simulate these dependencies and test that unit in isolation.

By testing all dependencies together, developers gain realism: The test will more likely reflect the behavior in production [41]. However, some dependencies, such as databases and web services, may (1) slow the execution of the test [31], (2) be costly to properly setup for testing [37], and (3) require testers to have full control over such external dependencies [18]. By simulating its dependencies, developers gain focus: The test will cover only the specific unit and the expected interactions with its dependencies; moreover, inefficiencies of testing dependencies are mitigated.

### Unit Testing

Unit tests test individual units (modules, functions, classes) in isolation from the rest of the application.

In general, units are tested using only the public interface of the unit (aka “public API” or “surface area”). This is referred to as black box testing. Black box testing leads to less brittle tests, because the implementation details of a unit tend to change more over time than the public API of the unit. If you use white box testing, where tests are aware of implementation details, any change to the implementation details could break the test, even if the public API continues to function as expected. In other words, white-box testing leads to wasted rework.

the point of unit tests is to test units of code in isolation.

Martin Fowler on Unit Test

"Unit testing is often talked about in software development, and is a term that I've been familiar with during my whole time writing programs. Like most software development terminology, however, it's very ill-defined, and I see confusion can often occur when people think that it's more tightly defined than it actually is."

What Kent Beck wrote in Test Driven Development, By Example

"I call them "unit tests", but they don't match the accepted definition of unit tests very well"

Any given claim of "the point of unit tests is" will depend heavily on what definition of "unit test" is being considered.

If your perspective is that your program is composed of many small units that depend on one another, and if you constrain yourself to a style that tests each unit in isolation, then a lot of test doubles is an inevitable conclusion.

### Integration Testing

Integration testing is where you actually interact with dependent systems and/or libraries. Contrast unit tests with integration tests, which test integrations between two or more units, and functional tests, which test the application from the point of view of the user, including complete user interaction workflows from simulated UI manipulation, to data layer updates, and back to the user output (e.g., the on-screen representation of the app). Functional tests are a subset of integration tests, because they test all of the units of an application, integrated in the context of the running application.

## What is test coverage?

Code coverage refers to the amount of code covered by test cases. Coverage reports can be created by instrumenting the code and recording which lines were exercised during a test run. In general, we try to produce a high level of coverage, but code coverage starts to deliver diminishing returns as it gets closer to 100%.

In my experience, increasing coverage beyond ~90% seems to have little continued correlation with lower bug density.  Why would that be? Doesn’t 100% tested code mean that we know with 100% certainty that the code does what it was designed to do?  It turns out, it’s not that simple.

What most people don’t realize is that there are two kinds of coverage:

 - Code coverage: how much of the code is exercised, and
-  Case coverage: how many of the use-cases are covered by the test suites

Case coverage refers to use-case scenarios: How the code will behave in the context of real world environment, with real users, real networks, and even hackers intentionally trying to subvert the design of the software for nefarious purposes.

Coverage reports identify code-coverage weaknesses, not case-coverage weaknesses. The same code may apply to more than one use-case, and a single use-case may depend on code outside the subject-under-test, or even in a separate application or 3rd party API.

Because use-cases may involve the environment, multiple units, users, and networking conditions, it is impossible to cover all required use-cases with a test suite that only contains unit tests. Unit tests by definition test units in isolation, not in integration, meaning that a test suite containing only unit tests will always have close to 0% case coverage for integration and functionaluse-case scenarios.

100% code coverage does not guarantee 100% case coverage. 

Developers targeting 100% code coverage are chasing the wrong metric.

## Test Double

### What is Test Double?

- In unit test, a test double is a replacement of a dependent component (collaborator) of the object under test. A test double provides the same interface as of the collaborator. It may not be the complete interface, but for the functionality required for the test. Also, the test double does not have to behave exactly as the collaborator. The purpose is to mimic the collaborator to make the object under test think that it is actually using the collaborator.

### Different Types of Test Doubles

- Based on the role played during testing, there can be different types of test doubles, and mock object is one of them. Some other types are dummy object, fake object, and stub. Below there are five definitions based on vocabulary of Gerard Meszaros's book, and adopted in the article written by Martin Fowler that sums up the basics everyone should know about mocks:

  - **DUMMY OBJECTS** are passed around but never actually used. Usually, they are just used to fill parameter lists.
 
  - **FAKE OBJECTS** have working implementations, but usually, take some shortcut which makes them not suitable for production (an in memory database is a good example).
  
  - **STUBS** provide canned answers to calls made during the test, usually not responding at all to anything outside what's programmed in for the test. Stubs may also record information about calls, such as an email gateway stub that remembers the messages it ‘sent', or maybe only how many messages it ‘sent'.
  
  - **SPY** is used to introduce a kind of observer for a real object. So, you can do asserts on invocations, too. In contrast to a mock a spied object still acts like it would do in production. 
  
  - **MOCKS** are what we are talking about here: objects pre-programmed with expectations which form a specification of the calls they are expected to receive. What makes a mock object different from the others is that it uses behavior verification. It means that the mock object verifies that it (the mock object) is being used correctly by the object under test. If the verification succeeds, it can be considered that the object under test will correctly use the real collaborator.



## TDD Cycle and the Need of Use of Mocks in Unit-Testing

Unit testing is essential to produce good software. In consequence, I would claim that any Java developer knows (and uses) JUnit. As a unit test is intended to cover only a very small piece of code – in most cases a certain Java class – we want it to be independent of other classes. To achieve that we need to mock out these classes. In the Java world there are a couple of mocking frameworks around. 

Unit tests should be small tests (atomic), lightweight, and fast. However, an object under test might have dependencies on other objects. It might need to interact with a database, communicate with a mail server, or talk to a web service or a message queue. All these services might not be available during unit testing. Even if they are available, unit testing the object under test along with its dependencies can take unacceptable amount of time. What if...

 - The web service is not reachable?
 - The database is down for maintenance?
 - The message queue is heavy and slow?
 
These all defeat the whole purpose of unit tests being atomic, lightweight, and fast. We want unit tests to execute in a few milliseconds. If the unit tests are slow, your builds become slow, which affects the productivity of your development team. The solution is to use mocking, a way to provide test doubles for your classes being tested.

### What is Mock?

- In simple English, Mocking is make a replica or imitation of something. But in object-oriented programming, mock objects are simulated objects that mimic the behavior of real objects in controlled ways, most often as part of a software testing initiative. 

- A mock is something like a place holder for a real object. It does provide the identical interface like the mocked object. However, calling a mock’s method will not have any effects. You can do asserts on desired invocations of a mock or define behaviour when a certain method is called (for example throw an exception).  

- Mock objects allow you to set up test scenarios without bringing to bear large, unwieldy resources such as databases. Instead of calling a database for testing, you can simulate your database using a mock object in your unit tests.

### Reasons to use Mocks

In unit testing we want to test methods of one class in isolation. But classes are not isolated. They are using services and methods from other classes. So in that situation, we mock the services and methods from other classes and simulate the real behavior of them using some mocking frameworks and use that mocked methods and services to do unit testing in isolation. This is where Mocking frameworks come into play.

Using mock objects allows developers to focus their tests on the behavior of the class under test without worrying about its dependencies. For example, testing a complex algorithm based on multiple objects being in particular states can be clearly expressed using mock objects in place of real objects.

     - Mocking is a process used in unit testing when the unit being tested has external dependencies. 
     - The purpose of mocking is to isolate and focus on the code being tested and not on the behavior
       or state of external dependencies.

- Let's start assuming that you already code following some driven development methodology centered on tests (TDD, ATDD or BDD). Or simply that you want to create a test for an existing class that relies on dependencies to achieve its functionality. In any case, when unit-testing a class, we want to test only its functionality and not that of its dependencies. To achieve this, we need to provide to the object-under-test, a replacement that we can control for that dependency. This way we can force extreme return values, exception throwing or simply reduce time-consuming methods to a fixed return value. This controlled replacement is the mock, and it will help you to simplify test coding and to reduce test execution time.

### Mock Concepts and Definitions

**MOCKS** are what we are talking about here: objects pre-programmed with expectations which form a specification of the calls they are expected to receive. What makes a mock object different from the others (dummy, stubs, fake, spy) is that it uses behavior verification. It means that the mock object verifies that it (the mock object) is being used correctly by the object under test. If the verification succeeds, it can be considered that the object under test will correctly use the real collaborator.

### To Mock or Not to Mock: That Is the Question

Not everything must be mocked. Sometimes it's better to do an INTEGRATION TEST as mocking that method/feature would be just working for little actual benefit. 



### When isn’t mocking appropriate?

Mocks work best when the code being tested isn’t tightly coupled; decoupled code tends to result from Test Driven Development (TDD), which no doubt partially explains why mocking is encouraged in the TDD community. For tightly coupled code (as is often present in legacy code), it might be the case that two or more classes form one unit, which can still be tested with a unit test. If not, think about whether the paired class has a lot of its own logic and whether it matters to test it separately. If not, don’t write a mock for it.

Similarly, don’t mock value objects; there’s simply no reason to because they don’t have their own logic. Also avoid mocking concrete classes, because these trap you in a certain implementation of the class you’re mocking.

In some cases, different types of “test doubles” similar to mocks are more appropriate instead. For a more detailed discussion about the differences between and applications for mocks, stubs, fakes, dummies, and other test doubles, check out Martin Fowler’s classic article on the topic.


### When To Use Mock Objects?

 In his 'Ode To Code' K Scott Allen offers rational for the use of mock objects when unit testing and discusses his thoughts on the use of mock object frameworks. Allen begins with a sharp argument to what's likely the most common misconception about mocks:

    - Some people have a misconception that mock objects are only useful if you 
      need to simulate interaction with a resource that is difficult to use in
      unit tests - like an object that communicates with an SMTP server. This 
      isn't true.
      
As stated by Colin Mackay's article on mocks listing some common scenarios mocks are useful, we have the following: 

 - The real object has nondeterministic behavior
 - The real object is difficult to setup
 - The real object has behavior that is hard to trigger
 - The real object is slow
 - The real object is a user interface
 - The real object uses a call back
 - The real object does not yet exist

More generally, "test doubles [mocks] are useful when you want to isolate code under test." In short, according to Allen mocks are to be used to keep the tests for business components independent of all other components the component under test is dependent on;

  - 'A' uses 'B', 'A unit test' should break only if 'A' is broken, regardless of the condition of 'B'.

## How exactly should unit tests be written without mocking extensively?

By minimising side-effects in your code.

As I understand, the point of unit tests is to test units of code in isolation. This means, that:

- They should not break by any unrelated code change elsewhere in the codebase.
- Only one unit test should break by a bug in the tested unit, as opposed to integration tests (which may break in heaps).
- All of this implies, that every outside dependency of a tested unit, should be mocked out. And I mean all the outside dependencies, not only the "outside layers" such as networking, filesystem, database, etc..

This leads to a logical conclusion, that virtually every unit test needs to mock. On the other hand, a quick Google search about mocking reveals tons of articles that claim that "mocking is a code smell" and should mostly (though not completely) be avoided.

Now, to the question(s).

- How should unit tests be written properly?
- Where exactly does the line between them and the integration tests lie?

Update 1 -  Please consider the following pseudo code:

```Java
class Person {
    constructor(calculator) {}

    calculate(a, b) {
        const sum = this.calculator.add(a, b);

        // do some other stuff with the `sum`
    }
}
```

Can a test that tests the Person.calculate method without mocking the Calculator dependency (given, that the Calculator is a lightweight class that does not access "the outside world") be considered a unit test?

Taking the example code above, if calculator for example talks to a web API, then either you create fragile tests that rely on being able to interact with that web API, or you create a mock of it. If however its a deterministic, state-free set of calculation functions, then you don't (and shouldn't) mock it. If you do, you risk your mock behaving differently to the real code, leading to bugs in your tests.

Mocks should only be needed for code that read/writes to the file system, databases, URL endpoints etc; that are dependent on the environment you are running under; or that are highly stateful and non-deterministic in nature. So if you keep those parts of the code to a minimum and hide them behind abstractions, then they are easy to mock and the rest of your code avoids the need for mocks.

For the code points that do have side effects, it's worth writing tests that mock and tests that don't. The latter though need care as they will inherently be fragile and possibly slow. So you may want to only run them say overnight on a CI server, rather than every time you save and build your code. The former tests though should be run as often as practicable. As to whether each test is then a unit or integration test becomes academic and avoids "flame wars" over what is and isn't a unit test.

### General Types of Mocking frameworks

- Proxy based ( eg: EasyMock, JMock, Mockito)
- Byte code Manipulation / Classloader remapping ( eg: jMockit, PowerMock)

### What is Proxy based Mocking? How it works?

- A proxy is just an object which will be used instead of the original object. If a method of the proxy object is called than the proxy object can decide what it will do with this call:
 
   - delegate it to the original object
   - handles the call itself

- A proxy doesn’t require an instance of an interface/class if the proxy handles all method invocations itself.

- Limits of Proxy - There are a few important restrictions to the proxies. It’s not possible to:

   - intercept static method calls
   - intercept private method calls
   - intercept final method calls
   - build a proxy for a final class

### Java Mocking Frameworks

You can write mocks manually, but a few open source mocking frameworks make it a lot faster and easier to maintain your mocks if you write tests frequently (which you should!). 

Many mocking frameworks for Java code work in combination with JUnit and other popular unit testing frameworks, and are great depending on your specific needs.

Two of the most widely used are Mockito and PowerMock. 

Starting tips:

- Get your unit testing techniques in shape 
- Choose a testing framework
- Choose a mocking framework

Below some JAva Mock Frameworks been used actualy:

- **Mockito** 

    - Mockito is a powerful framework with only a few limitations. API and concepts are clear and consequently used. All needed operations are grouped in class org.mockito.Mockito. So, new developers will get used to Mockito very fast. The named limitations have only lead to slightly trouble in my projects.
    - Development of Mockito was started around 2008. Today it can be seen as old bull in world of mocking frameworks. Latest stable version is 1.10.19 from December 2014. Version 2.0 is in beta status since the beginning of 2015. However, the API did not change a lot. 
    
- **PowerMock**

   - Mockito is useful for all but the most complicated cases, for which you can use PowerMock instead. Fortunately these frameworks are compatible with each other, so you can start in Mockito for most mocks and switch to PowerMock for the more complex cases

- **EasyMock** -

   - EasyMock comes in its java and .NET versions. EasyMock also enable behavior verification, but has a couple of differences in style with jMock which are worth discussing. Here are the familiar tests again:

```Java
public class OrderEasyTester extends TestCase {
  private static String TALISKER = "Talisker";
  
  private MockControl warehouseControl;
  private Warehouse warehouseMock;
  
  public void setUp() {
    warehouseControl = MockControl.createControl(Warehouse.class);
    warehouseMock = (Warehouse) warehouseControl.getMock();    
  }

  public void testFillingRemovesInventoryIfInStock() {
    //setup - data
    Order order = new Order(TALISKER, 50);
    
    //setup - expectations
    warehouseMock.hasInventory(TALISKER, 50);
    warehouseControl.setReturnValue(true);
    warehouseMock.remove(TALISKER, 50);
    warehouseControl.replay();

    //exercise
    order.fill(warehouseMock);
    
    //verify
    warehouseControl.verify();
    assertTrue(order.isFilled());
  }

  public void testFillingDoesNotRemoveIfNotEnoughInStock() {
    Order order = new Order(TALISKER, 51);    

    warehouseMock.hasInventory(TALISKER, 51);
    warehouseControl.setReturnValue(false);
    warehouseControl.replay();

    order.fill((Warehouse) warehouseMock);

    assertFalse(order.isFilled());
    warehouseControl.verify();
  }
}
```

- EasyMock uses a record/replay metaphor for setting expectations. For each object you wish to mock you create a control and mock object. The mock satisfies the interface of the secondary object, the control gives you additional features. To indicate an expectation you call the method, with the arguments you expect on the mock. You follow this with a call to the control if you want a return value. Once you've finished setting expectations you call replay on the control - at which point the mock finishes the recording and is ready to respond to the primary object. Once done you call verify on the control.

- It seems that while people are often fazed at first sight by the record/replay metaphor, they quickly get used to it. It has an advantage over the constraints of jMock in that you are making actual method calls to the mock rather than specifying method names in strings. This means you get to use code-completion in your IDE and any refactoring of method names will automatically update the tests. The downside is that you can't have the looser constraints.

The developers of jMock are working on a new version which will use other techniques to allow you use actual method calls.


- **JMock**

- **PowerMock**

- **JMockit** 

    - jMockit is designed to make the expectation descriptions as clear as possible.The core concepts of the jMock API are the mockery, mock objects, and expectations. 
    - A mockery represents the context of the object under test, its neighboring objects; 
    - mock objects stand in for the real neighbors of the object under test while the test runs; and 
    - expectations describe how the object under test should invoke its neighbors during the test. 

## Confusing betwen Stubs and Mocks

In the Article "MOcks Aren´t Stubs" (https://martinfowler.com/articles/mocksArentStubs.html), the author Martin Fowler, states that:

- " The term 'Mock Objects' has become a popular one to describe special case objects that mimic real objects for testing. Most language environments now have frameworks that make it easy to create mock objects. What's often not realized, however, is that mock objects are but one form of special case test object, one that enables a different style of testing. "

- " how mock objects work, how they encourage testing based on behavior verification, and how the community around them uses them to develop a different style of testing."

- "But as often as not I see mock objects described poorly. In particular I see them often confused with stubs - a common helper to testing environments. I understand this confusion - I saw them as similar for a while too, but conversations with the mock developers have steadily allowed a little mock understanding to penetrate my tortoiseshell cranium."

- "This difference is actually two separate differences. On the one hand there is a difference in how test results are verified: a distinction between state verification and behavior verification. On the other hand is a whole different philosophy to the way testing and design play together, which I term here as the classical and mockist styles of Test Driven Development."

### The Difference Between Mocks and Stubs

When they were first introduced, many people easily confused mock objects with the common testing notion of using stubs. Since then it seems people have better understood the differences. However to fully understand the way people use mocks it is important to understand mocks and other kinds of test doubles.

When you're doing testing like this, you're focusing on one element of the software at a time - hence the common term unit testing. The problem is that to make a single unit work, you often need other units - hence the need for some kind of warehouse in our example.

In the two styles of testing I've shown above, the first case uses a real warehouse object and the second case uses a mock warehouse, which of course isn't a real warehouse object. Using mocks is one way to not use a real warehouse in the test, but there are other forms of unreal objects used in testing like this.

The vocabulary for talking about this soon gets messy - all sorts of words are used: stub, mock, fake, dummy. For this article I'm going to follow the vocabulary of Gerard Meszaros's book. It's not what everyone uses, but I think it's a good vocabulary. Meszaros uses the term Test Double as the generic term for any kind of pretend object used in place of a real object for testing purposes. The name comes from the notion of a Stunt Double in movies. (One of his aims was to avoid using any name that was already widely used.) Meszaros then defined five particular kinds of double: - Dummy objects are passed around but never actually used. Usually they are just used to fill parameter lists;  Fake objects actually have working implementations, but usually take some shortcut which makes them not suitable for production (an in memory database is a good example);  Stubs provide canned answers to calls made during the test, usually not responding at all to anything outside what's programmed in for the test; Spies are stubs that also record some information based on how they were called. One form of this might be an email service that records how many messages it was sent; Mocks are what we are talking about here: objects pre-programmed with expectations which form a specification of the calls they are expected to receive. 

Of these kinds of doubles, only mocks insist upon behavior verification. The other doubles can, and usually do, use state verification. Mocks actually do behave like other doubles during the exercise phase, as they need to make the SUT believe it's talking with its real collaborators - but mocks differ in the setup and the verification phases.

To explore test doubles a bit more, we need to extend our example. Many people only use a test double if the real object is awkward to work with. A more common case for a test double would be if we said that we wanted to send an email message if we failed to fill an order. The problem is that we don't want to send actual email messages out to customers during testing. So instead we create a test double of our email system, one that we can control and manipulate.

Here we can begin to see the difference between mocks and stubs. If we were writing a test for this mailing behavior, we might write a simple stub like this.

```Java
public interface MailService {
  public void send (Message msg);
}
public class MailServiceStub implements MailService {
  private List<Message> messages = new ArrayList<Message>();
  public void send (Message msg) {
    messages.add(msg);
  }
  public int numberSent() {
    return messages.size();
  }
}      
```

We can then use state verification on the stub like this.

```Java
class OrderStateTester...

  public void testOrderSendsMailIfUnfilled() {
    Order order = new Order(TALISKER, 51);
    MailServiceStub mailer = new MailServiceStub();
    order.setMailer(mailer);
    order.fill(warehouse);
    assertEquals(1, mailer.numberSent());
  }
```

Of course this is a very simple test - only that a message has been sent. We've not tested it was sent to the right person, or with the right contents, but it will do to illustrate the point.

Using mocks this test would look quite different.

```Java
class OrderInteractionTester...

  public void testOrderSendsMailIfUnfilled() {
    Order order = new Order(TALISKER, 51);
    Mock warehouse = mock(Warehouse.class);
    Mock mailer = mock(MailService.class);
    order.setMailer((MailService) mailer.proxy());

    mailer.expects(once()).method("send");
    warehouse.expects(once()).method("hasInventory")
      .withAnyArguments()
      .will(returnValue(false));

    order.fill((Warehouse) warehouse.proxy());
  }
}
```

In both cases I'm using a test double instead of the real mail service. There is a difference in that the stub uses state verification while the mock uses behavior verification.

In order to use state verification on the stub, I need to make some extra methods on the stub to help with verification. As a result the stub implements MailService but adds extra test methods.

Mock objects always use behavior verification, a stub can go either way. Meszaros refers to stubs that use behavior verification as a Test Spy. The difference is in how exactly the double runs and verifies and I'll leave that for you to explore on your own.

## Using Fakes instead of Mocks n Unit Testing

### Difference between Mocks and Fakes

When saying “mocks” is referring to the term “Mock Object,” which is where we “replace domain code with dummy implementations that both emulate real functionality and enforce assertions about the behavior of our code”. Mocks assert behavior, like:

```java  
     MyMock.Method("foo").Called(1).WithArgs("bar").Returns("raz")
```

Having only integration testing is less than ideal though as unit tests help us design more robust software by easily testing alternate code and failure paths. We should save integration tests for larger “does it really work” kinds of tests.

A great question showcasing a benefit to a traditional mock could be, “how do you know you called the s3 client with the correct parameters? With mocks, I can ensure that I passed the key value to the key parameter, and not the bucket parameter.” This is a valid concern and it should be covered under a test somewhere. The testing approach that I advocate here does not verify that you called the Minio client with the bucket and key parameters in the right order.

A great quote said, “Mocking introduces assumptions, which introduces risk [Questions To Ask Yourself When Writing Tests by Michal Charemza: Mocking introduces assumptions, and assumptions introduce risk.]”. You are assuming the client library is implemented right, you are assuming all boundaries are solid, you are assuming you know how the library actually behaves.

Mocking the library only mocks assumptions and makes your tests more brittle and subject to change when you update the code (which is what Martin Fowler concluded in Mocks Aren’t Stubs [3]). When the rubber meets the road, we are going to have to verify that we are actually using the Minio client correctly and this means integration tests (these might live in a Docker setup or a testing environment). Because we will have both unit and integration tests, there is no need for a unit test to cover the exact implementation as the integration test will cover that.

### Why "Fakes rather than Mocks"? 

A fake is a kind of test double that may contain business behavior. Fakes are merely structs that fit an interface and are a form of dependency injection where we control the behavior. The major benefit of fakes are that they decrease coupling in code, where mocks increase coupling, and coupling makes refactoring harder. Fakes provide flexibility and allow for easy testing and refactoring. They reduce dependencies compared to mocks, and are easy to maintain. By writing simple fakes that adhere to the interfaces, we can see that we do not need mocks, mocking frameworks, or mock generators to create code designed for testing. We’ve also noted that unit testing is not everything, and you must write integration tests to ensure that systems are properly integrated with one another.
