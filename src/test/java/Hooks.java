import functionLibrary.CommonFunctions;
import io.cucumber.java.Before;

public class Hooks {
    CommonFunctions commonFunctions=new CommonFunctions();
    @Before
    public void beforeTest()
    {
        commonFunctions.openBrowser();
    }

    public void afterTest()
    {
        commonFunctions.closeBrowser();
    }
}
