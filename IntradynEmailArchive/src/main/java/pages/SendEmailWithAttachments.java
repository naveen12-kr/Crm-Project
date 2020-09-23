package pages;


import org.apache.commons.mail.*;

public class SendEmailWithAttachments extends Thread {
    public static void sendEmail()
    {
    	String path = System.getProperty("user.dir");
    	
       //Create Attachment
        EmailAttachment emailAttachment=new EmailAttachment();
        emailAttachment.setPath(path+"/target/output/SanityReport.html");
        emailAttachment.setDisposition(EmailAttachment.ATTACHMENT);
        emailAttachment.setDescription("Sanityreport.html");
        emailAttachment.setName("Sanityreport.html");
       //Initialize a new multi part email instance
        MultiPartEmail email=new MultiPartEmail();
        //Set email host
        email.setHostName("smtp.googlemail.com");
        //Set email authentication username and password
        email.setAuthenticator(new DefaultAuthenticator("intradyn.autotest@gmail.com","123mNaren@"));
        //Set email host SSL to true
        email.setSSL(true);
        try {
            //Set From email address
            email.setFrom("intradyn.autotest@gmail.com");
        } catch (EmailException e) {
            e.printStackTrace();
        }
        //Set email Subject line
        email.setSubject("Intradyn Report");
        try {
            //Set Email Message
            email.setMsg("Intradyn Suite Report");
        } catch (EmailException e) {
            e.printStackTrace();
        }
        try {
            //Set Email To Address
            email.addTo("development@intradyn.com");
        } catch (EmailException e) {
            e.printStackTrace();
        }
        //add the attachment
        try {
            email.attach(emailAttachment);
            System.out.println(">>>>>>ATtachment sent>>>>>>>>>");
           
        } catch (EmailException e) {
            e.printStackTrace();
        }
        try {
            //Send Email
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }

    }
}