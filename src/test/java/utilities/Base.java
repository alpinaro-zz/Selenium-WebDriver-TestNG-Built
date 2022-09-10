package utilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */

public abstract class Base {

    @BeforeClass
    protected void setUp() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
    }

    @AfterClass
    protected void tearDown() {

        Driver.closeDriver();
    }
}