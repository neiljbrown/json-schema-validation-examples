# JSON Schema Validation Examples

## Overview
This project provides examples of how to test that your generated JSON conforms to an authored [JSON Schema](http://json-schema.org/) and, just as importantly, that your schema is a valid JSON Schema.

The JSON Schema validation used in these examples is implemented using the [json-schema-validator](https://github.com/daveclayton/json-schema-validator) library, which is written in Java. 

The examples are implemented as a set of unit tests, themselves implemented using Java, JUnit (and AssertJ).

The supporting blog post [json schema part 2 - automating JSON validation tests in java](https://neiljbrown.com/2016/09/25/json-schema-part-2-automating-json-validation-tests/) 
contains more details, including an explanation of the use-case used in the examples and the json-schema-validator library's API.

If you're new to JSON Schema you might find my earlier blog post useful - [Introducing JSON Schema](https://neiljbrown.com/2016/06/28/introducing-json-schema/). 

## Code
This project uses the [Maven Standard directory layout for Java](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html). 

The source code for the examples can be found in the src/test/java folder. The place to start is class 
com.neiljbrown.examples.jsonschemavalidator.ViewingActivitySerialisationIntegrationTest.  (See the aforementioned 
blog post for more details). 

## Building and Running the Examples 
The examples can be compiled and run using Gradle (see build.gradle).

To compile and run all the example tests, enter the  following command in the project's root folder:

``gradle test``

To generate the Javadoc use, the following command:
 
``gradle javadocTests``

Hope you find it useful.

---
Blog - [https://neiljbrown.com](https://neiljbrown.com)

Other code - [https://bitbucket.org/neilbrown](https://bitbucket.org/neilbrown) 