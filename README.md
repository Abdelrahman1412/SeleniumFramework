# SeleniumFramework
![alt text](https://miro.medium.com/max/624/1*YI4Vk_zfRg-sbjw8pgg9Eg.png "Logo Title Text 1")

## What does it do
Primarily it is for automating web applications for testing purposes, but is certainly not limited to just that. Boring web-based administration tasks can (and should) also be automated as well.
## Features!
- Maven
- TestNG integration
- PageFile
- Regression and Sanity Tests ready
- SureFire plugin
- Ready for CI
## Usage CheatSheet
- Everything you need is in the pom.xml no prerequisites needed
### Install the dependencies using this command
```
$ mvn dependency:sources
```
For javadoc run this command (optional)
```
$ mvn dependency:resolve -DClassifier=javadoc
```
### Plugins
SureFire is added in the pom file
### Running test cases
First clean the /target directory using this command
```
$ mvn clean
```
You can then install the dependencies from the above commands, Then to run the SanityTest suite use this command
```
$ mvn test -PSanityTest
```
And use this command for the RegTest suite
```
$ mvn test -PRegTest
```
