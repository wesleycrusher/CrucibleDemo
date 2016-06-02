package test.java;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//RunWith annotation defines class to be used as suite runner
//Developers can select another runner (AllTests.class) to execute Junit3 tests
@RunWith(Suite.class)
//this annotation contains a list of all test classes which are part of the test suite and should therefore be executed
@Suite.SuiteClasses({CalculatorTest.class})
public class CalculatorTestSuite {

}
