# Spring Batch examples

Some Spring Batch examples trying to partitionate functionalities.
Compilation of the most useful links:

* [The best Spring Batch tutorial found so far] https://github.com/maldiny/Spring-Batch-en-Castellano
* [Item readers and writers] https://docs.spring.io/spring-batch/docs/current/reference/html/appendix.html

## Projects

### 1. Simple Spring Batch
#### Based on:
* [Spring IO - batch-processing] https://spring.io/guides/gs/batch-processing/

#### Guides
This Java project is an example of a simple Spring Batch project.

Notes:

* This is NOT the simplest Spring Batch example, as the output item writer does its work on a database in memory.
* The configuration is set into a Java class. In following examples it will be stored more properly into a xml file.

### 2. Batch CSV to XML
#### Based on:
* [Javacodegeeks - Batch step example] https://examples.javacodegeeks.com/enterprise-java/spring/batch/spring-batch-step-step-example/
* [Tutorialspoint.com - Spring Batch CSV to XML] https://www.tutorialspoint.com/spring_batch/spring_batch_csv_to_xml.htm

#### Guides
This example shows a simple csv to xml Spring batch app.

Notes:
* Both examples include some DB stuff and I don't understand why, so I removed everything related to databases.
