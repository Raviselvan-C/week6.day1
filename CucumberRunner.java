package week6.day1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/week6/day1",glue="week6.day1",monochrome=true,publish=true)
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
