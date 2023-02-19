package com.bridgelabz.userregistrationday21;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistrationUc12 {
    public boolean isValidUserFirstname(String firstName)throws InvalidUserException
    {
        String regex = "^[A-Za-z]{3,26}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(firstName);
        if (m.matches()) {
            return true ;
        }else {
            throw new InvalidUserException(InvalidUserException.enumType.FIRSTNAME);
        }
    }
    public boolean isValidUserLastname(String lastName) throws InvalidUserException
    {
        String regex = "^[A-Za-z]{3,26}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lastName);
        if (m.matches()) {
            return true;
        }else {
            throw new InvalidUserException(InvalidUserException.enumType.LASTNAME);
        }
    }
    public  boolean isValidEmail(String email) throws InvalidUserException {
        String regex =  "abc[.][a-z]{3}@bl[.]co[.][a-z]{2}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        if (m.matches()) {
            return true;
        }else {
            throw new InvalidUserException(InvalidUserException.enumType.EMAIL);
        }
    }
    public  boolean isValidMobileFormat(String mobileNumber) throws InvalidUserException {
        String regex =  "^(91 )([0-9]{10})$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mobileNumber);
        if (m.matches()) {
            return true;
        }else {
            throw new InvalidUserException(InvalidUserException.enumType.MOBILENUMBER);
        }
    }
    public  boolean isValidPassword(String password) throws InvalidUserException {
        String regex =  "^([aA-zZ]{8,})[0-9]{3}[@$+&*]{1}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        if (m.matches()) {
            return true;
        }else {
            throw new InvalidUserException(InvalidUserException.enumType.PASSWORD);
        }
    }
}
