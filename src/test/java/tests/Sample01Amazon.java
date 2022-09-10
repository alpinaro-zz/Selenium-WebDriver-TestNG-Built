package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utilities.Base;
import utilities.Driver;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class Sample01Amazon extends Base {

    AmazonPages amazon = new AmazonPages();

    @Test (priority = 1)
    void isTitleContains() {

        String expectedTitle = "Amazon";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Test (priority = 2)
    void isSearchBoxEnabled() {

        Assert.assertTrue(amazon.searchBox.isEnabled());
    }

    @Test (priority = 3)
    void search() {

        String keyword = "java";
        amazon.searchBox.sendKeys(keyword + Keys.ENTER);

        String expectedResult = keyword;
        String actualResult = amazon.searchResult.getText();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}