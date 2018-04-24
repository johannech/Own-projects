# String Calculator Kata
The following is a TDD Kata, an exercise in coding, refactoring and test-first.

## Before you start
* Try not to read ahead.
* Do one task at a time. The trick is to learn to work incrementally.
* Make sure you only test for correct inputs. There is no need to test for invalid inputs for this kata.

## The kata

### Step 1: the simplest thing
Create a simple String calculator with a method `int add(String numbers)`.

* The string argument can contain 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example `""` or `"1"` or `"1,2"`.
* Start with the simplest test case of an empty string and move to one and two numbers.
* Remember to solve things as simply as possible so that you force yourself to write tests you did not think about.
* Remember to refactor after each passing test.

### Step 2: handle an unknown amount of numbers
Allow the `add()` method to handle an unknown amount of numbers.

### Step 3: handle new lines between numbers
Allow the `add()` method to handle new lines between numbers (instead of commas).

* the following input is ok:  `"1\n2,3"` (will equal 6)
* the following input is NOT ok:  `"1,\n"` (not need to prove it - just clarifying)

### Step 4: negative numbers
Calling `add()` with a negative number will throw an exception `"negatives not allowed"` - and the negative that was passed.

For example `add("1,4,-1")` should throw an exception with the message `"negatives not allowed: -1"`.

If there are multiple negatives, show all of them in the exception message.

### Step 5: ignore big numbers
Numbers bigger than 1000 should be ignored, so adding 2 + 1001  = 2

### Step 6: code coverage
Generate a code coverage report by running `mvn clean package`.  
Open the report in a browser `/target/site/jacoco/index.html`.  
Are there any parts of the code that is not covered by tests? If so, can you fix them?

### Step 7: mutation test
Generate a mutation testing report by running: `mvn clean package org.pitest:pitest-maven:mutationCoverage`.  
Open the report in a browser `/target/pit-reports/index.html`.  
Are there any warnings in the mutation coverage? If so, can you fix them?

Conditional boundaries reference: http://pitest.org/quickstart/mutators/#CONDITIONALS_BOUNDARY


## Tools
- [JaCoCo](http://www.eclemma.org/jacoco/trunk/doc/maven.html) (Code coverage)
- [Pitest](http://pitest.org/) (Mutation testing)


Text adapted from [xpeppers](https://github.com/xpeppers/string-calculator-kata).  
Credits to [Roy Osherove](http://osherove.com/tdd-kata-1) for the original idea.