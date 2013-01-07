# testhelpers
Testhelpers is collection of classes that could help when writing test.

## Build
The build status, thanks to [cloudbees http://www.cloudbees.com] !
[![Build Status](https://redlab.ci.cloudbees.com/job/testhelpers/badge/icon)](https://redlab.ci.cloudbees.com/job/testhelpers/)

## Usage
Pull in the dependency with maven.

	<dependency>
 		<groupId>be.redlab.testhelpers</groupId>
		<artifactId>testhelpers</artifactId>
		<version>1.0.0</version>
		<scope>test</scope>
	</dependency>


## Changelog
### 1.0.1-SNAPSHOT
* package refactoring. Added ex for exceptions ( TestSuccessException has been moved here), added web for Servlet Spec implementations.
* EmptyHttpServletResponse added.
### 1.0.0 
* TestSuccessException useful for throwing in a test and expecting it as success result
* EmptyHttpServletRequest useful for mocking

