import org.junit.Assert;
import org.junit.Test;

public class PasswordVerificationTest {
    @Test
    public void verifyPassword_true(){
        Assert.assertTrue(PasswordVerification.verifyPassword("Shamil1"));
        Assert.assertTrue(PasswordVerification.verifyPassword("345kM9JD"));
        Assert.assertTrue(PasswordVerification.verifyPassword("12345678fB"));
        Assert.assertTrue(PasswordVerification.verifyPassword("KINGS999s"));
        Assert.assertTrue(PasswordVerification.verifyPassword("majiKlamp2"));
        Assert.assertTrue(PasswordVerification.verifyPassword("A123cat"));

    }
    @Test
    public void verifyPassword_false(){
        Assert.assertFalse(PasswordVerification.verifyPassword("1"));
        Assert.assertFalse(PasswordVerification.verifyPassword("12345678"));
        Assert.assertFalse(PasswordVerification.verifyPassword("shamil123"));
        Assert.assertFalse(PasswordVerification.verifyPassword("SHAMIL123"));
        Assert.assertFalse(PasswordVerification.verifyPassword("Shamil"));
        Assert.assertFalse(PasswordVerification.verifyPassword("sham"));
    }
}
