package com.bridgelabz.userregistrationday21;
import org.junit.Test;
public class UserRegistrationTestUc12 {
    UserRegistrationUc12 ur = new UserRegistrationUc12();
    @Test
    public void isValidUserFirstname() throws InvalidUserException{
        try {
            boolean actual = ur.isValidUserFirstname("saikumar");
        }catch(InvalidUserException e) {
            assertEquals(InvalidUserException.enumType.FIRSTNAME,e.type);
        }
    }
    @Test
    public void isValidUserLastname(){
        try {
            boolean actual = ur.isValidUserLastname("Gampa");
        }catch(InvalidUserException e) {
            assertEquals(InvalidUserException.enumType.LASTNAME,e.type);
        }
    }
    @Test
    public void isValidUserEmail(){
        try {
            boolean actual = ur.isValidEmail(".acr@gmail.com");
        }catch(InvalidUserException e) {
            assertEquals(InvalidUserException.enumType.EMAIL,e.type);
        }
    }
    @Test
    public void isValidUserMobileFormat(){
        try {
            boolean actual = ur.isValidMobileFormat("9100663540");
        }catch(InvalidUserException e) {
            assertEquals(InvalidUserException.enumType.MOBILENUMBER,e.type);
        }
    }
    @Test
    public void isValidUserPassword(){
        try {
            boolean actual = ur.isValidPassword("@sai9100");
        }catch(InvalidUserException e) {
            assertEquals(InvalidUserException.enumType.PASSWORD,e.type);
        }
    }
}
