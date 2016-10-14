package Runner;

/**
 * Created by SAYEM009 on 10/6/2016.
 */


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/features", tags="@live", dryRun = false, strict=false
)

public class Test_Runner {
}
