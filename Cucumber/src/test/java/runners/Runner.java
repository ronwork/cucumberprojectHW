package runners;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resource\\features\\TechfiosLogin.feature",
		strict = true,
		glue = "steps",
		tags = "",
		dryRun = false,
		monochrome = true,
		plugin = {
			
				"pretty"
				
		}
		
		
		
		
		)
public class Runner {

}
