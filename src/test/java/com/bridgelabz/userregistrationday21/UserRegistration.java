package com.bridgelabz.userregistrationday21;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class UserRegistration {
    public boolean isValidUserFirstname(String firstName)
    {
        String regex = "^[A-Za-z]{3,26}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(firstName);

        if (m.matches()) {
            System.out.println("Happy");
        }else {
            System.out.println("sad");
        }
        return m.matches();
    }
    public boolean isValidUserLastname(String lastName)
    {
        String regex = "^[A-Za-z]{3,26}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lastName);
        if (m.matches()) {
            System.out.println("Happy");
        }else {
            System.out.println("sad");
        }
        return m.matches();
    }
    public  boolean isValidEmail(String email) {
        String regex =  "abc[.][a-z]{3}@bl[.]co[.][a-z]{2}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        if (m.matches()) {
            System.out.println("Happy");
        }else {
            System.out.println("sad");
        }
        return m.matches();
    }
    public  boolean isValidMobileFormat(String mobileNumber) {
        String regex =  "^(91 )([0-9]{10})$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mobileNumber);
        if (m.matches()) {
            System.out.println("Happy");
        }else {
            System.out.println("sad");
        }
        return m.matches();
    }
    public  boolean isValidPassword(String password) {
        String regex =  "^([aA-zZ]{8})[0-9]{3}[@$+&*]{1}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        if (m.matches()) {
            System.out.println("Happy");
        }else {
            System.out.println("sad");
        }
        return m.matches();
    }
    public  boolean isValidAllEmailSamples(String emails) {
        String regex =  "^[0-9a-zA-Z]+([_+-.]{1}[a-z0-9A-Z]+)*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emails);
        if (m.matches()) {
            System.out.println("Happy");
        }else {
            System.out.println("sad");
        }
        return m.matches();

    }
}
