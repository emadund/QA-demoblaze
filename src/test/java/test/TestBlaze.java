package test;

import base.BaseBlaze;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.HomePage;

public class TestBlaze extends BaseBlaze {
    private HomePage homePage;

    @Before

    public void testSetup() {
        homePage = new HomePage();

    }


@Test
    public void positiveTest1 () {
        System.out.println("Send message:");
        homePage.clickContact()
    .inputEmail("Zvezda@gmail.com")
            .inputName("Zvezda")
            .inputMessage("Zvezdina Zvezda");

                homePage.clickSend();
    Assert.assertEquals("Thanks for the message!!",homePage.moveToBannerText());

    }
    @Test
    public void positiveTest2 () {
        System.out.println("Checking Close button");
        homePage.clickContact()
        .inputEmail("Zvezda@gmail.com")
                .inputName("Zvezda")
                .inputMessage("Zvezdina Zvezda");
        homePage.clickClose();
        Assert.assertTrue(homePage.isHomeDisplayed());
        Assert.assertEquals("Home\n"+"(current)",homePage.homeText());
    }
    @Test
    public void positiveTest3 () {
        System.out.println("Checking X button");
        homePage.clickContact()
                .inputEmail("Zvezda@gmail.com")
                .inputName("Zvezda")
                .inputMessage("Zvezdina Zvezda");
        homePage.clickX();
        Assert.assertTrue(homePage.isHomeDisplayed());
        Assert.assertEquals("Home\n" +"(current)",homePage.homeText());
    }

}
