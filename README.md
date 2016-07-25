Proof of concept: Spock and geb functional testing with multiple browsers

# Steps
* Clone or download repository.
* Configure browser in ```src/test/resources/src/GebConfig.groovy```.
* Execute tests with:
```
gradlew clean tests
```
(or ```gradlew-test.bat``` in Windows: edit ```gradlew-test-with-proxy.bat``` to work behind a proxy). 
* Look for reports in ```build/reports/tests/index.html```.
(direct access in Windows with ```Link-to-reports```).
