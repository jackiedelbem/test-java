7. Account TestJAVA  TEST CASE DESIGN  PUBLIC  NEW
Using JUnit Assert class, write tests for the Account class that cover the following cases:

// The deposit and withdraw methods will not accept negative numbers.
// Account cannot overstep its overdraft limit.
// The deposit and withdraw methods will deposit or withdraw the correct amount, respectively.
// The withdraw and deposit methods return the correct results.

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);
        
        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }
    
    @Test
    public void accountNotAcceptNegativeDeposit() {
        Account account = new Account(20);
       
        Assert.assertFalse(account.deposit(-20));
    }
    
    @Test
    public void accountNotAcceptNegativeWithdraw() {
        Account account = new Account(20);
       
        Assert.assertFalse(account.withdraw(-30));
    }
    
    @Test
    public void accountCannotOverstepOverdraftLimit() {
        Account account = new Account(20);
       
        Assert.assertFalse(account.withdraw(30));
    }
    
    @Test
    public void accountAcceptWithdraw() {
        Account account = new Account(20);
        account.deposit(20);
        Assert.assertTrue(account.withdraw(20));
    }
    
    @Test
    public void accountAcceptDeposit() {
        Account account = new Account(0);
 
        Assert.assertTrue(account.deposit(20));
    }
    
}