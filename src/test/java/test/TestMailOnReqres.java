package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import static apiMethods.GetEmailFromBody.getEmailFromBody;
import static apiMethods.GetEmailFromURL.getEmailFromURL;

public class TestMailOnReqres {

    @Test
    public void testMailComplianceFromBody() {
        final Boolean eMail = getEmailFromBody("George", "Bluth");
        Assert.assertEquals(eMail, Boolean.TRUE, "Чото не работает");
    }

    @Test
    public void testMailComplianceFromURL() {
        final Boolean eMail = getEmailFromURL("Michael", "Lawson");
        Assert.assertEquals(eMail, Boolean.TRUE, "Чото не работает");
    }
}