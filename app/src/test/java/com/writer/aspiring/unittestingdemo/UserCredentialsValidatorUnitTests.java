package com.writer.aspiring.unittestingdemo;


import org.junit.Test;
import static org.junit.Assert.*;

public class UserCredentialsValidatorUnitTests {

    String unMock[] = {"","Peter","Astrid","","Olivia","lincoln","Broyles"};
    String pwMock[] = {"","","Bishop","Farnsworth","Dunham","Lee","Agent"};


    @Test
    public void userCredentialsValidateForSuccessfulLogin() throws Exception{
        assertEquals(true,new UserCredentials().validCredentials(unMock[4],pwMock[4]));
    }

    @Test
    public void userCredentialsValidateForWrongCase() throws Exception{
        assertFalse(new UserCredentials().validCredentials(unMock[5],pwMock[5]));
    }

    @Test
    public void userCredentialsValidateForEmptyPassword() throws Exception{
        assertFalse(new UserCredentials().validCredentials(unMock[1],pwMock[1]));
    }

    @Test
    public void userCredentialsValidateForEmptyUsername() throws Exception{
        assertFalse(new UserCredentials().validCredentials(unMock[3],pwMock[3]));
    }

    @Test
    public void userCredentialsValidateForEmptyEntries() throws Exception{
        assertFalse(new UserCredentials().validCredentials(unMock[0],pwMock[0]));
    }

    @Test
    public void userCredentialsValidateForUsernameCorrectPasswordWrong() throws Exception{
        assertFalse(new UserCredentials().validCredentials(unMock[2],pwMock[2]));
    }

    @Test
    public void userCredentialsValidateForWrongUsername() throws Exception{
        assertFalse(new UserCredentials().validCredentials(unMock[6],pwMock[6]));
    }

}