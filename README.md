












































# TDD  - Test-Driven Development

The most important feature of software is its correctness, meaning that it does what it should do. So, the tests are essential part and interwined with the software development process, and development based on test is the exact way to achieve the correctness.

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

![Unit Test and Mock](https://github.com/aridiosilva/TDD/blob/main/Use_of_mocking_in_Unit_Testing.jpg)

### What dependencies to Develop Mocks?

What type of dependency th mocks are simulating? I´m relying on the categories proposed by Spadini et al at his study named "To Mock or Not To Mock? An Empirical
Study on Mocking Practices" (Davide Spadini, Maur´ıcio Aniche, Magiel Bruntink, Alberto Bacchelli), as the following explained:

 -  ***Domain object***: Classes that contain the (business) rules of the system. Most of these classes usually depend on other domain objects. They do not depend on any external
resources. The definition of this category fits well to the definition of Domain Object [15] and Domain Logic [16] architectural layers. Examples are entities, services and
utility classes.

 -  ***Database***: Classes that interact with an external database. These classes can be either an external library (such as Java SQL, JDBC, Hibernate, or ElasticSearch APIs) or
a class that depends on such external libraries (e.g., an implementation of the Data Access Object [16] pattern). • Native Java libraries: Libraries that are part of the Java
itself. Examples are classes from Java I/O and Java Util classes (Date, Calendar).

 -  ***Web Service***: Classes that perform some HTTP action. As with the database category, this dependency can be either an external library (such as Java HTTP) or a class that depends on such library.
 
 - ***External dependency***: Libraries (or classes that make use of libraries) that are external to the current project. Examples are Jetty and Ruby runtimes, JSON parsing libraries (such as GSON), e-mail libraries, etc. 
 
-  ***Test support***: Classes that support testing itself. Examples are fake domain objects, test data builders and web services for tests.

### Reasons to use Mocks

In unit testing we want to test methods of one class in isolation. But classes are not isolated. They are using services and methods from other classes. So in that situation, we mock the services and methods from other classes and simulate the real behavior of them using some mocking frameworks and use that mocked methods and services to do unit testing in isolation. This is where Mocking frameworks come into play.

Using mock objects allows developers to focus their tests on the behavior of the class under test without worrying about its dependencies. For example, testing a complex algorithm based on multiple objects being in particular states can be clearly expressed using mock objects in place of real objects.

     - Mocking is a process used in unit testing when the unit being tested has external dependencies. 
     - The purpose of mocking is to isolate and focus on the code being tested and not on the behavior
       or state of external dependencies.

- Let's start assuming that you already code following some driven development methodology centered on tests (TDD, ATDD or BDD). Or simply that you want to create a test for an existing class that relies on dependencies to achieve its functionality. In any case, when unit-testing a class, we want to test only its functionality and not that of its dependencies. To achieve this, we need to provide to the object-under-test, a replacement that we can control for that dependency. This way we can force extreme return values, exception throwing or simply reduce time-consuming methods to a fixed return value. This controlled replacement is the mock, and it will help you to simplify test coding and to reduce test execution time.

### Mock Concepts and Definitions

**MOCKS** are what we are talking about here: objects pre-programmed with expectations which form a specification of the calls they are expected to receive. What makes a mock object different from the others (dummy, stubs, fake, spy) is that it uses behavior verification. It means that the mock object verifies that it (the mock object) is being used correctly by the object under test. If the verification succeeds, it can be considered that the object under test will correctly use the real collaborator.

### How to effectively incorporate mocking into your unit tests

Mocking is an important part of unit testing components with integrations and those that rely on external dependencies. But what exactly is it? In tests, mocking is using mock objects with fake business logic to replicate the function of a real object. 

Mocks can produce better tests by reducing a factor that could cause the test to fail (e.g. needing to access an external resource like a database, which could be offline for reasons unrelated to your test) and helping you isolate the classes being tested. They can also save time and stop you from being charged for accessing these external resources. 

### Too much of a good thing?

Mocks are important to know how to use well, which means you have to really understand your code and its intended behavior; ideally, mocks are used only when necessary. However, new test writers sometimes go overboard, which runs the risk of slowing down tests and making them needlessly complicated. Using too many mocks can even affect whether you’re ultimately testing the right thing, e.g. testing that something is implemented in a specific way, rather than testing that the desired outcome occurs. 

### To Mock or Not to Mock: That Is the Question

Not everything must be mocked. Sometimes it's better to do an INTEGRATION TEST as mocking that method/feature would be just working for little actual benefit. 

### When isn’t mocking appropriate?

Mocks work best when the code being tested isn’t tightly coupled; decoupled code tends to result from Test Driven Development (TDD), which no doubt partially explains why mocking is encouraged in the TDD community. For tightly coupled code (as is often present in legacy code), it might be the case that two or more classes form one unit, which can still be tested with a unit test. If not, think about whether the paired class has a lot of its own logic and whether it matters to test it separately. If not, don’t write a mock for it.

Similarly, don’t mock value objects; there’s simply no reason to because they don’t have their own logic. Also avoid mocking concrete classes, because these trap you in a certain implementation of the class you’re mocking.

In some cases, different types of “test doubles” similar to mocks are more appropriate instead. For a more detailed discussion about the differences between and applications for mocks, stubs, fakes, dummies, and other test doubles, check out Martin Fowler’s classic article on the topic.

### Mock Usage Trade-offs

The use of mocks poses several challenges. Among all, a major problem is maintaining the behavior of the mock compatible with the original class. Furthermore, mocks may hide important design problems. Finally, while mocking may be the only way to test legacy systems, using them in such systems is not a straightforward task.

 - Mocks may reduce test readability and be difficult to maintain;
 - Excessive use of mocks is an indicative of poorly engineered code;
 - Use of mocks does not guarantee that your code will behave as expected in production - You´ll be always guessing that what you mock will work (and keep working) that way when using the real objects;
 - I do not remember a single case in wich I found a bug using mocks;
 - Excessive use of mocking means the existence of lot of dependencies in the class - it is a smell in the code and a symptom of a badly designed class - If the production code structure is well defined, we should use less mocks;
 - Good production code ease the process of testing and reduce the mock usage;
 - A problem when using mocks is maintaining the behavior of the mock compatible with the behavior of original class, especially when the class is poorly designed or highly coupled. As the production class tends to change often, the mock object becomes unstable and, as a consequence, more prone to change. 
 - Using mocks makes refactoring harder.
 - Using mocks can reduce the simplicity of the design.
 - The unit tests become less realistic with mocks and that, as a consequence, (an important) part of the production code will not being actually tested - However, we must pay the price of writing integration tests for these dependencies have been mocked later on, to make sure these dependencies really work as expected - no part of the production code can be missed by tests to assure they are working as expected;

### Mock Recommendations

The use of mocks in Unit Testing is a controversial topic (maybe less so now than several years ago). By none of the following practices are good enough:

   - Mocking almost every dependency (code smell);
   - Only mocking external dependencies (not all external dependencies should be mocked);
   - "no-mocks" policy;
 
![When To Mock or Not](https://github.com/aridiosilva/TDD/blob/main/When_To_Mock_or_Not_AridioSilva.jpg)
 
It is hard to decide what should be mocked and shouldn´t be mocked. But the extremes listed above not are good ones to follow. Below some points to consider when deciding what to mock: 

- Gerard Meszaros in his Book suggests that components that make testing difficult are candidates to be mocked;
- Mocking an interface rather than using one concrete implementation makes the test to become “independent of a specific implementation” - as the test exercises the abstract behavior that is offered by the interface. Without the usage of a mock, developers would have to choose one out of the many possible implementations of the interface, making the test more coupled to the specific implementation - by definition, interfaces don’t have any dependencies. Hence, they lend themselves to easy unit testing through object mocking;
- Use less mocks as you can;
- Do not mock static methods - since static method has everything you need to use it, so it defeats the purpose of mocking, and doing that is considered a bad practice;
- The objective of the tests is to make sure things are working and that the new code doesn’t cause any problems with the existing code. We do not get this level of confidence if we have a test that mocks all its collaborators;
- Should not mock the Unit under Test;00
- Unless it is the unit under test, database dependencies are always mocked;
- Complex and coupled classes should be mocked;
- Do not often mock classes that you can have full control;
- Mocking are mostly technical decision, such as dealing with unstable dependencies, the coupling between the mock and the production code, legacy systems, and hard-to-test classes are the most important ones;
- Services generally depend on other services. Some ViewModels depend on services, especially container and factory-type services. Therefore, services are generally difficult to instantiate for testing because you need the full service tree. Abstract their essence into an interface. Then all references to services should be made through that interface so they can be easily mocked up for testing purposes;

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

### How exactly should unit tests be written without mocking extensively?

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

     - framework that enables Java developers to mock certain classes that might be not possible without bytecode manipulation, e.g., final classes and static methods - in cases where the class under test is not designed for testability.

- **JMockit** 

    - jMockit is designed to make the expectation descriptions as clear as possible.The core concepts of the jMock API are the mockery, mock objects, and expectations. 
    - A mockery represents the context of the object under test, its neighboring objects; 
    - mock objects stand in for the real neighbors of the object under test while the test runs; and 
    - expectations describe how the object under test should invoke its neighbors during the test. 

## Confusing between Stubs and Mocks

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

## Using Fakes instead of Mocks in Unit Testing

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

## DAMP and DRY -  It's a balance, not a contradiction

DAMP and DRY are not contradictory, rather they balance two different aspects of a code's maintainability. Maintainable code (code that is easy to change) is the ultimate goal here.

- ***DAMP (Descriptive And Meaningful Phrases)*** promotes the readability of the code.

    - To maintain code, you first need to understand the code. To understand it, you have to read it. Consider for a moment how much time you spend reading code. It's a lot. DAMP increases maintainability by reducing the time necessary to read and understand the code.

- ***DRY (Don't repeat yourself) promotes the orthogonality of the code.***

    - Removing duplication ensures that every concept in the system has a single authoritative representation in the code. A change to a single business concept results in a single change to the code. DRY increases maintainability by isolating change (risk) to only those parts of the system that must change.

- ***So, why is duplication more acceptable in tests?***

    - Tests often contain inherent duplication because they are testing the same thing over and over again, only with slightly different input values or setup code. However, unlike production code, this duplication is usually isolated only to the scenarios within a single test fixture/file. Because of this, the duplication is minimal and obvious, which means it poses less risk to the project than other types of duplication.

     - Furthermore, removing this kind of duplication reduces the readability of the tests. The details that were previously duplicated in each test are now hidden away in some new method or class. To get the full picture of the test, you now have to mentally put all these pieces back together.

     - Therefore, since test code duplication often carries less risk, and promotes readability, its easy to see how it is considered acceptable.

 - ***As a principle, favor DRY in production code, favor DAMP in test code***. 
 
     - While both are equally important, with a little wisdom you can tip the balance in your favor.
     
     
# MockWebServer   (Testing HTTP clients)

A scriptable web server for testing HTTP clients

### Motivation:  (MockWebServer)

* This library makes it easy to test that your app Does The Right Thing when it makes HTTP and HTTPS calls. It lets you specify which responses to return and then verify that requests were made as expected.

Because it exercises your full HTTP stack, you can be confident that you're testing everything. You can even copy & paste HTTP responses from your real web server to create representative test cases. Or test that your code survives in awkward-to-reproduce situations like 500 errors or slow-loading responses.

**Example**

Use MockWebServer the same way that you use mocking frameworks like Mockito:

* Script the mocks.
* Run application code.
* Verify that the expected requests were made.

Here's a complete example:

```java
public void test() throws Exception {

  // Create a MockWebServer. These are lean enough that you can create a new  
  // instance for every unit test.
  
  MockWebServer server = new MockWebServer();

  // Schedule some responses.
  
  server.enqueue(new MockResponse().setBody("hello, world!"));
  server.enqueue(new MockResponse().setBody("sup, bra?"));
  server.enqueue(new MockResponse().setBody("yo dog"));

  // Start the server.
  
  server.start();

  // Ask the server for its URL. You'll need this to make HTTP requests.
  
  HttpUrl baseUrl = server.url("/v1/chat/");

  // Exercise your application code, which should make those HTTP requests.
  // Responses are returned in the same order that they are enqueued.
  
  Chat chat = new Chat(baseUrl);

  chat.loadMore();
  assertEquals("hello, world!", chat.messages());

  chat.loadMore();
  chat.loadMore();
  assertEquals(""
      + "hello, world!\n"
      + "sup, bra?\n"
      + "yo dog", chat.messages());

  // Optional: confirm that your app made the HTTP requests you were expecting.
  
  RecordedRequest request1 = server.takeRequest();
  assertEquals("/v1/chat/messages/", request1.getPath());
  assertNotNull(request1.getHeader("Authorization"));

  RecordedRequest request2 = server.takeRequest();
  assertEquals("/v1/chat/messages/2", request2.getPath());

  RecordedRequest request3 = server.takeRequest();
  assertEquals("/v1/chat/messages/3", request3.getPath());

  // Shut down the server. Instances cannot be reused.
  
  server.shutdown();
}
```

Your unit tests might move the server into a field so you can shut it down from your test's tearDown().

## API (MockWebServer)

### MockResponse      (MockWebServer)

Mock responses default to an empty response body and a 200 status code. You can set a custom body with a string, input stream or byte array. Also add headers with a fluent builder API.

```java
MockResponse response = new MockResponse()
    .addHeader("Content-Type", "application/json; charset=utf-8")
    .addHeader("Cache-Control", "no-cache")
    .setBody("{}");
```    
    
MockResponse can be used to simulate a slow network. This is useful for testing timeouts and interactive testing.

```java 
response.throttleBody(1024, 1, TimeUnit.SECONDS);
RecordedRequest
```
Verify requests by their method, path, HTTP version, body, and headers.

```java
RecordedRequest request = server.takeRequest();
assertEquals("POST /v1/chat/send HTTP/1.1", request.getRequestLine());
assertEquals("application/json; charset=utf-8", request.getHeader("Content-Type"));
assertEquals("{}", request.getBody().readUtf8());
```

### Dispatcher   (MockWebServer)

By default MockWebServer uses a queue to specify a series of responses. Use a Dispatcher to handle requests using another policy. One natural policy is to dispatch on the request path. You can, for example, filter the request instead of using server.enqueue().

```java 
final Dispatcher dispatcher = new Dispatcher() {

    @Override
    public MockResponse dispatch (RecordedRequest request) throws InterruptedException {

        switch (request.getPath()) {
            case "/v1/login/auth/":
                return new MockResponse().setResponseCode(200);
            case "/v1/check/version/":
                return new MockResponse().setResponseCode(200).setBody("version=9");
            case "/v1/profile/info":
                return new MockResponse().setResponseCode(200).setBody("{\\\"info\\\":{\\\"name\":\"Lucas Albuquerque\",\"age\":\"21\",\"gender\":\"male\"}}");
        }
        return new MockResponse().setResponseCode(404);
    }
};
server.setDispatcher(dispatcher);
```

### Download

*  (https://github.com/square/okhttp/tree/master/mockwebserver)
    
  testImplementation("com.squareup.okhttp3:mockwebserver:4.9.0")

     
# Test fixtures

*(based on JUnit Fixtures - Pat Hawks Jun 17, 2017) *

A test fixture is a fixed state of a set of objects used as a baseline for running tests. The purpose of a test fixture is to ensure that there is a well known and fixed environment in which tests are run so that results are repeatable. Examples of fixtures:

* Preparation of input data and setup/creation of fake or mock objects
* Loading a database with a specific, known set of data
* Copying a specific known set of files creating a test fixture will create a set of objects initialized to certain states.
* JUnit provides annotations so that test classes can have fixture run before or after every test, or one time fixtures that run before and after only once for all test methods in a class.

There are four *fixture annotations*: 

- two for *class-level fixtures* and two for *method-level* ones. 
- At the *class level*, you have *@BeforeClass* and *@AfterClass*, and at the *method (or test) level*, you have *@Before* and *@After*.

An example of usage:

```java
package test;

import java.io.Closeable;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFixturesExample {
  static class ExpensiveManagedResource implements Closeable {
    @Override
    public void close() throws IOException {}
  }

  static class ManagedResource implements Closeable {
    @Override
    public void close() throws IOException {}
  }

  @BeforeClass
  public static void setUpClass() {
    System.out.println("@BeforeClass setUpClass");
    myExpensiveManagedResource = new ExpensiveManagedResource();
  }

  @AfterClass
  public static void tearDownClass() throws IOException {
    System.out.println("@AfterClass tearDownClass");
    myExpensiveManagedResource.close();
    myExpensiveManagedResource = null;
  }

  private ManagedResource myManagedResource;
  private static ExpensiveManagedResource myExpensiveManagedResource;

  private void println(String string) {
    System.out.println(string);
  }

  @Before
  public void setUp() {
    this.println("@Before setUp");
    this.myManagedResource = new ManagedResource();
  }

  @After
  public void tearDown() throws IOException {
    this.println("@After tearDown");
    this.myManagedResource.close();
    this.myManagedResource = null;
  }

  @Test
  public void test1() {
    this.println("@Test test1()");
  }

  @Test
  public void test2() {
    this.println("@Test test2()");
  }
}
```

Will Output something like the following:

```java
@BeforeClass setUpClass
@Before setUp
@Test test2()
@After tearDown
@Before setUp
@Test test1()
@After tearDown
@AfterClass tearDownClass
```

Example of folder containing test fixtures of the java Project in Eclipse 2020-12

![](https://github.com/aridiosilva/TDD/blob/main/example_of_project_folder_containing_fixtures001.jpg)

In the followinf json code we have an example of the *current_message_multi_device.json fixtures file contents:

```JSON
{
    "messages" : [{
        "type" : 1,
        "destinationDeviceId" : 1,
        "destinationRegistrationId" : 222,
        "body" : "Zm9vYmFyego",
        "timestamp" : 1234
    },
    {
        "type" : 1,
        "destinationDeviceId" : 2,
        "destinationRegistrationId" : 333,
        "body" : "Zm9vYmFyego",
        "timestamp" : 1234
    }]
}
```

## Understanding JUnit method order execution

With the addition of the *ClassRule annotation* in *JUnit 4.9*, can be controled the JUnit test order execution.

*@ClassRule* fills a gap in the *JUnit API*, by providing *class level rules* like *@BeforeClass* and *@AfterClass* provide *class-wide* **set up** and **tear down**.

This sessiona explains how to control code execution of unit tests and where @ClassRule fits in.

The terminology used is:

* A *test* implements *@Test*
* A *test case* in a *class* with *@Test methods*

### Ordering test methods

The *simplest test case* you can write in *JUnit( is to *annotate methods* with *@Test*:

```java
package test;
import org.junit.Test;
 
public class OrderTest1 {
    @Test
    public void test1() {
        println(&quot;@Test test1()&quot;);
    }
    @Test
    public void test2() {
        println(&quot;@Test test2()&quot;);
    }
    private void println(String string) {
        OrderTestUtils.println(OrderTest1.class, string);
    }
}
```

In *OrderTest1*, the *execution order* is:

```java
OrderTest1 @Test test1()
OrderTest1 @Test test2()
```

### Managing test fixtures

If you need to initialize the same data for each test, you put that data in instance variables and initialize them in a @Before setUp method. The setUp method is called before each @Test method.

One test invocation becomes the following call sequence:

```java
Call @Before setUp
Call one @Test method
```

If that data needs to be cleaned up, implement an *@After tearDown method*. The *tearDown method* is called after each *@Test method*.

One *test invocation* becomes the following *call sequence*:

```java 
Call @Before setUp
Call one @Test method
Call @After tearDown
```

The call sequence for a class with two test methods is:

```java
Call @Before setUp
Call @Test method test1
Call @After tearDown
Call @Before setUp
Call @Test method test2
Call @After tearDown
```

For example:

```java 
package test;
 
import java.io.Closeable;
import java.io.IOException;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
public class OrderTest2 {
 
    static class ManagedResource implements Closeable {
        @Override
        public void close() throws IOException {
        }
    }
 
    private ManagedResource managedResource;
 
    private void println(String string) {
        OrderTestUtils.println(OrderTest2.class, string);
    } 
    @Before
    public void setUp() {
        this.println(&quot;@Before setUp&quot;);
        this.managedResource = new ManagedResource();
    } 
    @After
    public void tearDown() throws IOException {
        this.println(&quot;@After tearDown&quot;);
        this.managedResource.close();
        this.managedResource = null;
    } 
    @Test
    public void test1() {
        this.println(&quot;@Test test1()&quot;);
    } 
    @Test
    public void test2() {
        this.println(&quot;@Test test2()&quot;);
    }
}
```

In OrderTest2, the execution order is:

```java
OrderTest2 @Before setUp
OrderTest2 @Test test1()
OrderTest2 @After tearDown
OrderTest2 @Before setUp
OrderTest2 @Test test2()
OrderTest2 @After tearDown
```

### Managing expensive test fixtures

When a resource is expensive to manage like a connection to a server, a database, or even managing an embedded server, it’s best to only initialize that resource once for the whole test case. You want to avoid starting and stopping a server for each @Test method. Instead, initialize the server once for all the tests in the class.

To do so, we use @BeforeClass and @AfterClass methods, instead of @Before and @After to get the following call sequence:

```java
Call @BeforeClass setUpClass
Call @Test method test1
Call @Test method test2
Call @AfterClass tearDownClass
```

Let’s add class-level set up and tear down to our example:

```java
package test;
 
import java.io.Closeable;
import java.io.IOException;
 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
 
public class OrderTest3 {
 
    static class ExpensiveManagedResource implements Closeable {
        @Override
        public void close() throws IOException {
        }
    }
 
    static class ManagedResource implements Closeable {
        @Override
        public void close() throws IOException {
        }
    } 
    @BeforeClass
    public static void setUpClass() {
        OrderTestUtils.println(OrderTest3.class, &quot;@BeforeClass setUpClass&quot;);
        MyExpensiveManagedResource = new ExpensiveManagedResource();
    } 
    @AfterClass
    public static void tearDownClass() throws IOException {
        OrderTestUtils.println(OrderTest3.class, &quot;@AfterClass tearDownClass&quot;);
        MyExpensiveManagedResource.close();
        MyExpensiveManagedResource = null;
    }
 
    private ManagedResource myManagedResource;
    private static ExpensiveManagedResource MyExpensiveManagedResource;
 
    private void println(String string) {
        OrderTestUtils.println(OrderTest3.class, string);
    } 
    @Before
    public void setUp() {
        this.println(&quot;@Before setUp&quot;);
        this.myManagedResource = new ManagedResource();
    } 
    @After
    public void tearDown() throws IOException {
        this.println(&quot;@After setUp&quot;);
        this.myManagedResource.close();
        this.myManagedResource = null;
    } 
    @Test
    public void test1() {
        this.println(&quot;@Test test1()&quot;);
    } 
    @Test
    public void test2() {
        this.println(&quot;@Test test2()&quot;);
    }
}
```

In *OrderTest3*, the *execution order* is:

```java
OrderTestAll @BeforeClass setUpClass
OrderTestAll @Before setUp
OrderTestAll @Test test1()
OrderTestAll @After setUp
OrderTestAll @Before setUp
OrderTestAll @Test test2()
OrderTestAll @After setUp
OrderTestAll @AfterClass tearDownClass
```

You can see that the setUpClass and tearDownClass wrap the execution of this test case.

## Managing resources with rules

Instead of duplicating resource management code in each class, you can reuse your code, but instead of putting this common code in a superclass for all your tests. you can abstract external resource management with a JUnit Rule.

*JUnit rules* are *subclasses of* the *ExternalResource class*.

Let’s do it both ways and compare.

```java
package test;
 
import java.io.Closeable;
import java.io.IOException;
 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
 
public class OrderTest4 {
 
    static class ExpensiveExternalResource extends ExternalResource {
 
        ExpensiveExternalResource() {
            OrderTestUtils.println(ExpensiveExternalResource.class, &quot;constructor&quot;);
        } 
        @Override
        protected void after() {
            OrderTestUtils.println(ExpensiveExternalResource.class, &quot;after&quot;);
        } 
        @Override
        protected void before() throws Throwable {
            OrderTestUtils.println(ExpensiveExternalResource.class, &quot;before&quot;);
        }
    }
 
    static class ExpensiveManagedResource implements Closeable {
        @Override
        public void close() throws IOException {
        }
    }
 
    static class ManagedResource implements Closeable {
        @Override
        public void close() throws IOException {
        }
    } 
    @BeforeClass
    public static void setUpClass() {
        OrderTestUtils.println(OrderTest4.class, &quot;@BeforeClass setUpClass&quot;);
        MyExpensiveManagedResource = new ExpensiveManagedResource();
    } 
    @AfterClass
    public static void tearDownClass() throws IOException {
        OrderTestUtils.println(OrderTest4.class, &quot;@AfterClass tearDownClass&quot;);
        MyExpensiveManagedResource.close();
        MyExpensiveManagedResource = null;
    }
    
    @Rule
    public ExternalResource resource = new ExpensiveExternalResource();
 
    private ManagedResource myManagedResource;
 
    private static ExpensiveManagedResource MyExpensiveManagedResource;
 
    private void println(String string) {
        OrderTestUtils.println(OrderTest4.class, string);
    } 
    @Before
    public void setUp() {
        this.println(&quot;@Before setUp&quot;);
        this.myManagedResource = new ManagedResource();
    } 
    @After
    public void tearDown() throws IOException {
        this.println(&quot;@After tearDown()&quot;);
        this.myManagedResource.close();
        this.myManagedResource = null;
    } 
    @Test
    public void test1() {
        this.println(&quot;@Test test1()&quot;);
    } 
    @Test
    public void test2() {
        this.println(&quot;@Test test2()&quot;);
    }
}
```
The methods are run in the following order:

```java 
OrderTest4 @BeforeClass setUpClass
ExpensiveExternalResource constructor
ExpensiveExternalResource before
OrderTest4 @Before setUp
OrderTest4 @Test test1()
OrderTest4 @After setUp
ExpensiveExternalResource after
ExpensiveExternalResource constructor
ExpensiveExternalResource before
OrderTest4 @Before setUp
OrderTest4 @Test test2()
OrderTest4 @After setUp
ExpensiveExternalResource after
OrderTest4 @AfterClass tearDownClass
```

The ExternalResource before method is called just before the @Before setUp method.

The ExternalResource after method is called just before the @After setUp method.

An ExternalResource is a nice way to abstract out and resuse your resource management code. You can now compose use of your resources instead of  subclassing.

### Managing expensive resources with rules

Just like you can wrap a *test case* with *@BeforeClass* and *@AfterClass*, there was no way to do this with *rules* until *JUnit 4.9* and the *ClassRule annotation*.

The following examples shows a ClassRule at work. Deltas from the previous example are highlighted.

```java
package test;
 
import java.io.Closeable;
import java.io.IOException;
 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
 
public class OrderTest5 {
 
    static class ExpensiveExternalResource extends ExternalResource {
 
        private final String info;
 
        ExpensiveExternalResource(String info) {
            this.info = info;
            OrderTestUtils.println(ExpensiveExternalResource.class, &quot;constructor &quot; + info);
        } 
        @Override
        protected void after() {
            OrderTestUtils.println(ExpensiveExternalResource.class, &quot;after &quot; + this.info);
        } 
        @Override
        protected void before() throws Throwable {
            OrderTestUtils.println(ExpensiveExternalResource.class, &quot;before &quot; + this.info);
        }
    }
    
    static class ExpensiveManagedResource implements Closeable {
        @Override
        public void close() throws IOException {
        }
    } 
    static class ManagedResource implements Closeable {
        @Override
        public void close() throws IOException {
        }
    } 
    @BeforeClass
    public static void setUpClass() {
        OrderTestUtils.println(OrderTest5.class, &quot;@BeforeClass setUpClass&quot;);
        MyExpensiveManagedResource = new ExpensiveManagedResource();
    } 
    @AfterClass
    public static void tearDownClass() throws IOException {
        OrderTestUtils.println(OrderTest5.class, &quot;@AfterClass tearDownClass&quot;);
        MyExpensiveManagedResource.close();
        MyExpensiveManagedResource = null;
    }
 
    @Rule
    public ExternalResource resource = new ExpensiveExternalResource(&quot;instance&quot;);
 
    @ClassRule
    public static ExternalResource StaticResource = new ExpensiveExternalResource(&quot;static&quot;);
 
    private ManagedResource myManagedResource;
 
    private static ExpensiveManagedResource MyExpensiveManagedResource;
 
    private void println(String string) {
        OrderTestUtils.println(OrderTest5.class, string);
    } 
    @Before
    public void setUp() {
        this.println(&quot;@Before setUp&quot;);
        this.myManagedResource = new ManagedResource();
    } 
    @After
    public void tearDown() throws IOException {
        this.println(&quot;@After tearDown()&quot;);
        this.myManagedResource.close();
        this.myManagedResource = null;
    } 
    @Test
    public void test1() {
        this.println(&quot;@Test test1()&quot;);
    } 
    @Test
    public void test2() {
        this.println(&quot;@Test test2()&quot;);
    }
}
```

The test run shows the ClassRule kick in at the start and end of the test case:

```java
ExpensiveExternalResource constructor static
ExpensiveExternalResource before static
OrderTest5 @BeforeClass setUpClass
ExpensiveExternalResource constructor instance
ExpensiveExternalResource before instance
OrderTest5 @Before setUp
OrderTest5 @Test test1()
OrderTest5 @After tearDown()
ExpensiveExternalResource after instance
ExpensiveExternalResource constructor instance
ExpensiveExternalResource before instance
OrderTest5 @Before setUp
OrderTest5 @Test test2()
OrderTest5 @After tearDown()
ExpensiveExternalResource after instance
OrderTest5 @AfterClass tearDownClass
ExpensiveExternalResource after static
Subclassing test cases
```

What happens when you subclass a test case? For example:

```java 
package test;
import org.junit.Test;
 
public class SubOrderTest1 extends OrderTest1 {
 
    private void println(String string) {
        OrderTestUtils.println(SubOrderTest1.class, string);
    }
    @Test
    public void testSub1() {
        this.println(&quot;@Test testSub1()&quot;);
    }
    @Test
    public void testSub2() {
        this.println(&quot;@Test testSub1()&quot;);
    }
}
```

JUnit runs the given test case and then the super class test case:

```java
SubOrderTest1 @Test testSub1()
SubOrderTest1 @Test testSub1()
OrderTest1 @Test test1()
OrderTest1 @Test test2()
```
If you add a third level with a SubSubOrderTest1 class extending SubOrderTest1, you get:

```java
SubSubOrderTest1 @Test testSubSub1()
SubSubOrderTest1 @Test testSubSub1()
SubOrderTest1 @Test testSub1()
SubOrderTest1 @Test testSub1()
OrderTest1 @Test test1()
OrderTest1 @Test test2()
```

Method execution order starts with the given test case and goes up the super class chain until you get to the top of the hierarchy.

### Subclassing test cases with managed resources 

Here, things get trickier:

* The order of *@Before methods* goes from the top to the bottom of the hierarchy: parent, child, child of child.
* The order of *@After methods* goes from the bottom to the top of the hierarchy: child of child, child, parent.

For example:

```java
package test;
 
import java.io.Closeable;
import java.io.IOException;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
public class SubOrderTest2 extends OrderTest2 {
 
    static class ManagedResource implements Closeable {
        @Override
        public void close() throws IOException {
        }
    }
    private ManagedResource managedResource;
 
    private void println(String string) {
        OrderTestUtils.println(SubOrderTest2.class, string);
    }
    @Before
    public void setUpSub() {
        this.println(&quot;@Before setUpSub&quot;);
        this.managedResource = new ManagedResource();
    }
    @After
    public void tearDownSub() throws IOException {
        this.println(&quot;@After tearDownSub&quot;);
        this.managedResource.close();
        this.managedResource = null;
    }
    @Test
    public void testSub1() {
        this.println(&quot;@Test testSub1()&quot;);
    }
    @Test
    public void testSub2() {
        this.println(&quot;@Test testSub2()&quot;);
    }
}
```

Here, JUnit runs the given test case and then the super class test case:

```java
1 OrderTest2 @Before setUp
2 SubOrderTest2 @Before setUpSub
3 SubOrderTest2 @Test testSub1()
4 SubOrderTest2 @After tearDownSub
5 OrderTest2 @After tearDown
6 OrderTest2 @Before setUp
7 SubOrderTest2 @Before setUpSub
8 SubOrderTest2 @Test testSub2()
9 SubOrderTest2 @After tearDownSub
10 OrderTest2 @After tearDown
11 OrderTest2 @Before setUp
12 SubOrderTest2 @Before setUpSub
13 OrderTest2 @Test test1()
14 SubOrderTest2 @After tearDownSub
15 OrderTest2 @After tearDown
16 OrderTest2 @Before setUp
17 SubOrderTest2 @Before setUpSub
18 OrderTest2 @Test test2()
19 SubOrderTest2 @After tearDownSub
20 OrderTest2 @After tearDown
```

If you add a third level with a SubSubOrderTest2 class extending SubOrderTest2, you get:

```java
1 OrderTest2 @Before setUp
2 SubOrderTest2 @Before setUpSub
3 SubSubOrderTest2 @Before setUpSubSub
4 SubSubOrderTest2 @Test testSubSub1()
5 SubSubOrderTest2 @After tearDownSubSub
6 SubOrderTest2 @After tearDownSub
7 OrderTest2 @After tearDown
8 OrderTest2 @Before setUp
9 SubOrderTest2 @Before setUpSub
10 SubSubOrderTest2 @Before setUpSubSub
11 SubSubOrderTest2 @Test testSubSub2()
12 SubSubOrderTest2 @After tearDownSubSub
13 SubOrderTest2 @After tearDownSub
14 OrderTest2 @After tearDown
15 OrderTest2 @Before setUp
16 SubOrderTest2 @Before setUpSub
17 SubSubOrderTest2 @Before setUpSubSub
18 SubOrderTest2 @Test testSub1()
19 SubSubOrderTest2 @After tearDownSubSub
20 SubOrderTest2 @After tearDownSub
21 OrderTest2 @After tearDown
22 OrderTest2 @Before setUp
23 SubOrderTest2 @Before setUpSub
24 SubSubOrderTest2 @Before setUpSubSub
25 SubOrderTest2 @Test testSub2()
26 SubSubOrderTest2 @After tearDownSubSub
27 SubOrderTest2 @After tearDownSub
28 OrderTest2 @After tearDown
29 OrderTest2 @Before setUp
30 SubOrderTest2 @Before setUpSub
31 SubSubOrderTest2 @Before setUpSubSub
32 OrderTest2 @Test test1()
33 SubSubOrderTest2 @After tearDownSubSub
34 SubOrderTest2 @After tearDownSub
35 OrderTest2 @After tearDown
36 OrderTest2 @Before setUp
37 SubOrderTest2 @Before setUpSub
38 SubSubOrderTest2 @Before setUpSubSub
39 OrderTest2 @Test test2()
40 SubSubOrderTest2 @After tearDownSubSub
41 SubOrderTest2 @After tearDownSub
42 OrderTest2 @After tearDown
```

This demonstrates the power of *JUnit rules*. With the *new ClassRule* in *JUnit 4.9*, *rules can finally be used full strength*.
 
## Design for Testability Patterns
  
Almost every piece of code depends on some other classes, objects, modules, or procedures. To unit-test a piece of code properly, we would like to isolate the code from its dependencies. This isolation is difficult to achieve if those dependencies are hard-coded in the form of literal classnames. As presented in the Book of Gerard Maszeros titled "xUnit Test Patterns: Refactoring Test Code", pubished in 2007 with 948 pages, there are four patterns to deal with this problem and area ways to provide a means to substitute a depended-on component (DOC) to make it easy to use a Test Double(mock, etc.) while testing our code:

- ***Dependency Injection** is a way to allow the normal coupling between a SUT(System Under Testing) and its dependencies to be broken during automated testing. 
 
  - HOW IT WORKS: We avoid hard-coding the names of classes on which we depend into our code by providing some other means for the client or system confi guration to tell the SUT which objects to use for each dependency as it is executed. As part of the design of the SUT, we arrange to pass the dependency in to the SUT through the “front door.” That is, the means to specify the dependency becomes part of the API of the SUT. We can include it as an argument with each method call, include it on the constructor, or make it a settable attribute (property).
 
 ![dependency injection](https://github.com/aridiosilva/TDD/blob/main/Dependency_Injection_Pattern_Figure_Book_Maszeros.jpg)   
 
- ***Dependency Lookup*** is a way to allow the normal coupling between a SUT(System Under Testing) and its dependencies to be broken during automated testing;
  
  - HOW IT WORKS: We avoid hard-coding the names of classes on which the SUT depends into our code because static binding severely limits our options regarding how the software is confi gured as it runs. Instead, we hard-code that name of a “component broker” that returns a ready-to-use object. The component broker provides some means for the client software or perhaps a system confi guration manager to tell the SUT in question which objects to use for each component request.
  
 ![dependency lockup](https://github.com/aridiosilva/TDD/blob/main/Dependency_Lookup_Pattern_Figure_Book_Maszeros.jpg) 
   
- ***Humble Object*** is a way to bring the logic of these hard-to-instantiate objects under test in a cost-effective manner;
 
  - HOW IT WORKS: We extract all the logic from the hard-to-test component into a component that is testable via synchronous tests. This component implements a service interface consisting of methods that expose the logic of the untestable component; the only difference is that these methods are accessible via synchronous method calls. As a result, the Humble Object component becomes a very thin adapter layer that contains very little code. Each time the framework calls the Humble Object, this object delegates its responsibilities to the testable component. If the testable component needs any information from the context, the Humble Object is responsible for retrieving it and passing it to the testable component. The Humble Object code is typically so simple that we often don’t bother writing tests for it because it can be quite diffi cult to set up the environment needed to run those tests.

![humble object](https://github.com/aridiosilva/TDD/blob/main/Humble_Object_Pattern_Figure_Book_Maszeros.jpg) 

- ***Test Hook*** is a “method of last resort” for introducing test-specific behavior during automated testing;

  - HOW IT WORKS: We modify the behavior of the SUT to support testing by putting a hook directly into the SUT or into a DOC. This approach implies that we use some kind of
testing fl ag that can be checked in the appropriate place. 

 ![teste hook](https://github.com/aridiosilva/TDD/blob/main/Test_hook_Pattern_Figure_Book_Maszeros.jpg) 
  
## DEPENDENCY INJECTION PATTERN FOR TESTING - REPLACING THE DEPENDENCY BY ON MOCK (OR TEST DOUBLE)

There are a number of different ways to tell the SUT to use the Test Double, but they all involve replacing a hard-coded name with a mechanism that determines the type
of object to use at execution time. The three basic options are as follows:

- ***Parameter Injection***: We pass the dependency directly to the SUT as we invoke it.
- ***Constructor Injection***: We tell the SUT which DOC to use when we construct it.
- ***Setter Injection***: We tell the SUT about the DOC sometime between when we construct it and when we exercise it.

Each of these three variations of Dependency Injection can be hand-coded. Another option is to use an “Inversion of Control” (IoC) framework to link the various components together at runtime. This scheme avoids superfl uous diversity in how Dependency Injection is implemented across the application and can simplify the process of reconfi guring the application for different deployment models.

### DEPENDENCY INJECTION by PARAMETER INJECTION

- Parameter Injection is a form of Dependency Injection in which the SUT does not keep or initialize a reference to the DOC; instead, it is passed in as an argument of
the method being called on the SUT. All clients of the SUT—whether they are tests or production code—supply the DOC. 

- As a consequence, the SUT is more independent of the context because it makes no assumptions about the dependency other than its usage interface. The main drawback is that Parameter Injection forces the client to know about the dependency, which is more appropriate in some circumstances than in others. 

- Most of the other variants of Dependency Injection move this knowledge somewhere other than the client or at least make it optional.

- Parameter Injection is advocated by the original paper on Mock Objects. 

- It is especially effective when we are doing true TDD because that’s when we have the greatest control over the design. 

- It is possible to introduce Parameter Injection in an optional fashion by providing an alternative signature for the method in question with the extra parameter; we can then have the more traditional style method create the instance of the dependency and call the method that takes the dependency as a parameter.

### DEPENDENCY INJECTION by CONSTRUCTOR INJECTION

- Both Constructor Injection and Setter Injection involve storing a reference to the DOC as an attribute (fi eld or instance variable) of the SUT. With Dependency Injection, the fi eld is initialized from a constructor argument. 

- The SUT may optionally provide a simpler constructor that calls this constructor with the value normally used in production. When a test wants to replace the real DOC with a Test Double, it passes in the Test Double to the constructor when it builds the SUT.

- This approach to introducing Dependency Injection works well when the code includes only one or two constructors and they have small argument lists. 

- Constructor Injection is the only approach that works if the DOC is an active object that creates its own thread of execution during construction; such behavior would make for Hard-to-Test Code (page 209), and we should probably consider turning it into a Humble Executable (see Humble Object on page 695). If we have a large number of dependencies as constructor arguments, we probably need to refactor the code to remove this code smell.

### DEPENDENCY INJECTION by SETTER INJECTION

- As with Constructor Injection, the SUT holds a reference to the DOC as an attribute (fi eld) that is initialized in the constructor. 

- Where it differs is that the attribute is exposed to the client either as a public attribute or via a “setter” method. When a test wants to replace the real DOC with a Test Double, it assigns to the exposed attribute (or calls the setter with) an instance of the Test Double. 

- This approach works well when constructing the real DOC has no unpleasant side effects and assuming that nothing can happen automatically between the constructor call and
the point at which the test calls the setter for the property. 

- Setter Injection cannot be used if the SUT performs any signifi cant processing in the constructor that relies on the dependency. In that case, we must use Constructor Injection. 

- If constructing the real DOC has deleterious side effects, we can avoid creating it via the constructor by modifying the SUT to use Lazy Initialization [SBPP] to instantiate the DOC the fi rst time the SUT needs to use it.

# Google Testing on the Toilet: Separation of Concerns? That's a Wrap! 

This text was adapted from a Google Testing on the Toilet (TotT) episode. You can download a printer-friendly version of this TotT episode and post it in your office, written by  Stefan Kennedy. The following function decodes a byte array as an image using an API named SpeedyImg. What maintenance problems might arise due to referencing an API owned by a different team?

```java
SpeedyImgImage decodeImage(List<SpeedyImgDecoder> decoders, byte[] data) {
  SpeedyImgOptions options = getDefaultConvertOptions();
  for (SpeedyImgDecoder decoder : decoders) {
    SpeedyImgResult decodeResult = decoder.decode(decoder.formatBytes(data));
    SpeedyImgImage image = decodeResult.getImage(options);
    if (validateGoodImage(image)) { return image; }
  }
  throw new RuntimeException();
}
```

Details about how to call the API are mixed with domain logic, which can make the code harder to understand. For example, the call to decoder.formatBytes() is required by the API, but how the bytes are formatted isn’t relevant to the domain logic.

Additionally, if this API is used in many places across a codebase, then all usages may need to change if the way the API is used changes. For example, if the return type of this function is changed to the more generic SpeedyImgResult type, usages of SpeedyImgImage would need to be updated.

To avoid these maintenance problems, create wrapper types to hide API details behind an abstraction:

```java
Image decodeImage(List<ImageDecoder> decoders, byte[] data) {
  for (ImageDecoder decoder : decoders) {
    Image decodedImage = decoder.decode(data);
    if (validateGoodImage(decodedImage)) { return decodedImage; }
  }
  throw new RuntimeException();
}
```

Wrapping an external API follows the Separation of Concerns principle, since the logic for how the API is called is separated from the domain logic. This has many benefits, including:

 -	If the way the API is used changes, encapsulating the API in a wrapper insulates how far those changes can propagate across your codebase.
 -	You can modify the interface or the implementation of types you own, but you can’t for API types.
 -	It is easier to switch or add another API, since they can still be represented by the introduced types (e.g. ImageDecoder/Image).
 - Readability can improve as you don’t need to sift through API code to understand core logic.

Not all external APIs need to be wrapped. For example, if an API would take a huge effort to separate or is simple enough that it doesn't pollute the codebase, it may be better not to introduce wrapper types (e.g. library types like List in Java or std::vector in C++). When in doubt, keep in mind that a wrapper should only be added if it will clearly improve the code (see the YAGNI principle).

“Separation of Concerns” in the context of external APIs is also described by Martin Fowler in his blog post, Refactoring code that accesses external services. 

 # DBUnit - Testing SQL Databases 
 
 DbUnit is a JUnit extension (also usable with Ant) targeted at database-driven projects that, among other things, puts your database into a known state between test runs. This is an excellent way to avoid the myriad of problems that can occur when one test case corrupts the database and causes subsequent tests to fail or exacerbate the damage.

DbUnit has the ability to export and import your database data to and from XML datasets. Since version 2.0, DbUnit can also work with very large datasets when used in streaming mode. DbUnit can also help you to verify that your database data match an expected set of values.

Database Testing
Richard Dallaway notes about database unit testing inspired me the realization of the DbUnit framework. I think this is a very good text about this subject. Hopefully he gave me the permission to present excerpts from his notes here.

The original text is much longer and I strongly suggest you to read it as well. See resources for reference to it. - Manuel Laflamme

## Unit testing database

These are my notes on how I've gone about unit testing database functionality.

The problem is this: you have a SQL database, some stored procedures, and a layer of code sitting between your application and the database. How can you put tests in place to make sure your code really is reading and writing the right data from the database?

### Why bother?

I'm guessing some, if not a lot, of database development goes like this: set up database, write code to access database, run code, do a SELECT to see if the records showed up in the database. They did? Good, then we're done.

The problem with visual inspection is this: you don't do it often, and you don't check everything every time. It's possible that when you make changes to a system, maybe months later, you break something and some data will go missing. As a coder you may not spend much time checking the data itself, so it may take a while for this mistake to surface. I've worked on a web project where a mandatory field on a registration form was not being inserted into a database for the best part of a year. Although marketing had protested that they needed this information, the problem wasn't spotted because the data was never ever looked at it (but don't get me started on that).

Automated tests — painless tests that run often and test lots — reduce the chances of your data is going missing. I find they make it easier for me to sleep at night. (Tests have other positive features: they're good examples of how to use code, they act as documentation, they make other people's code less scary when you need to change it, they reduce debugging time).

[B]ut how do we manage the testing data in the database so that it doesn't "mess up" live data?  

### You need [multiple] databases

Some thoughts: A good test set is self-sufficient and creates all the data it needs. Testing can be simplified if you can get the database in a known state before a test is run. One ways to do this is to have a separate unit test database, which is under the control of the test cases: the test cases clean out the database before starting any tests.

Deleting and inserting data for every test may seem like a big time over head, but as tests use relatively little data, I find this approach to be quick enough (especially if you're running against a local test database).

The downside is that you need more than one database - but remember, they can all run on one server if necessary. The way I'm testing now needs four databases (well, two at a pinch):

- The production database. Live data. No testing on this database.
- Your local development database, which is where most of the testing is carried out.
A populated development database, possibly shared by all developers so you can run your application and see it work with realistic amounts of data, rather than the hand full of records you have in your test database. You may not strictly need this, but it's reassuring to see your app work with lots of data (i.e., a copy of the production database's data).
- A deployment database, or integration database, where the tests are run prior to deployment to make sure any local database changes have been applied. If you're working alone, you may be able to live without this one, but you'll have to be sure any database structure or stored procedure changes have been made to the production database before you go live with your code.
- With multiple database you have to make sure you keep the structure of the databases in sync: if you change a table definition or a stored procedure on your test machine, you'll have to remember to make those changes on the live server. The deployment database should act as a reminder to make those changes."

### Getting Started with DBunit

!<url>(http://dbunit.sourceforge.net/howto.html)

### Best Practices with DBUnit

!<url>(http://dbunit.sourceforge.net/bestpractices.html)

   
