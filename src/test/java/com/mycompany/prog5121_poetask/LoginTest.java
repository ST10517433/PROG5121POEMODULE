// Author: Jabulani Kristen Mfeka - ST10517433
package com.mycompany.prog5121_poetask;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    
    Login login = new Login("Jabulani", "Mfeka");
    
    @Test
    public void testCheckUserName_Correct() {
        assertTrue(login.checkUserName("kyl_1"));
    }
    
    @Test
    public void testCheckUserName_Incorrect() {
        assertFalse(login.checkUserName("kyle!!!!!!!"));
    }
    
    @Test
    public void testCheckPasswordComplexity_Correct() {
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
    
    @Test
    public void testCheckPasswordComplexity_Incorrect() {
        assertFalse(login.checkPasswordComplexity("password"));
    }
    
    @Test
    public void testCheckCellPhoneNumber_Correct() {
        assertTrue(login.checkCellPhoneNumber("+27838968976"));
    }
    
    @Test
    public void testCheckCellPhoneNumber_Incorrect() {
        assertFalse(login.checkCellPhoneNumber("08966553"));
    }
    
    @Test
    public void testLoginUser_Success() {
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }
    
    @Test
    public void testLoginUser_Fail() {
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertFalse(login.loginUser("kyl_1", "wrong"));
    }
}