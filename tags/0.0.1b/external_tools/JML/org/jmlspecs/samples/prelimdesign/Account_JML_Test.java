// This file was generated by jmlunit on Tue May 20 17:43:03 EDT 2008.

package org.jmlspecs.samples.prelimdesign;

/** Automatically-generated test driver for JML and JUnit based
 * testing of Account. The superclass of this class should be edited
 * to supply test data. However it's best not to edit this class
 * directly; instead use the command
 * <pre>
 *  jmlunit Account.java
 * </pre>
 * to regenerate this class whenever Account.java changes.
 */
public class Account_JML_Test
     extends Account_JML_TestData
{
    /** Initialize this class. */
    public Account_JML_Test(java.lang.String name) {
        super(name);
    }

    /** Run the tests. */
    public static void main(java.lang.String[] args) {
        org.jmlspecs.jmlunit.JMLTestRunner.run(suite());
        // You can also use a JUnit test runner such as:
        // junit.textui.TestRunner.run(suite());
    }

    /** Test to see if the code for class Account
     * has been compiled with runtime assertion checking (i.e., by jmlc).
     * Code that is not compiled with jmlc would not make an effective test,
     * since no assertion checking would be done. */
    public void test$IsRACCompiled() {
        junit.framework.Assert.assertTrue("code for class Account"
                + " was not compiled with jmlc"
                + " so no assertions will be checked!",
            org.jmlspecs.jmlrac.runtime.JMLChecker.isRACCompiled(Account.class)
            );
    }

    /** Return the test suite for this test class.  This will have
    * added to it at least test$IsRACCompiled(), and any test methods
    * written explicitly by the user in the superclass.  It will also
    * have added test suites for each testing each method and
    * constructor.
    */
    //@ ensures \result != null;
    public static junit.framework.Test suite() {
        Account_JML_Test testobj
            = new Account_JML_Test("Account_JML_Test");
        junit.framework.TestSuite testsuite = testobj.overallTestSuite();
        // Add instances of Test found by the reflection mechanism.
        testsuite.addTestSuite(Account_JML_Test.class);
        testobj.addTestSuiteForEachMethod(testsuite);
        return testsuite;
    }

    /** A JUnit test object that can run a single test method.  This
     * is defined as a nested class solely for convenience; it can't
     * be defined once and for all because it must subclass its
     * enclosing class.
     */
    protected static abstract class OneTest extends Account_JML_Test {

        /** Initialize this test object. */
        public OneTest(String name) {
            super(name);
        }

        /** The result object that holds information about testing. */
        protected junit.framework.TestResult result;

        //@ also
        //@ requires result != null;
        public void run(junit.framework.TestResult result) {
            this.result = result;
            super.run(result);
        }

        /* Run a single test and decide whether the test was
         * successful, meaningless, or a failure.  This is the
         * Template Method pattern abstraction of the inner loop in a
         * JML/JUnit test. */
        public void runTest() throws java.lang.Throwable {
            try {
                // The call being tested!
                doCall();
            }
            catch (org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e) {
                // meaningless test input
                addMeaningless();
            } catch (org.jmlspecs.jmlrac.runtime.JMLAssertionError e) {
                // test failure
                int l = org.jmlspecs.jmlrac.runtime.JMLChecker.getLevel();
                org.jmlspecs.jmlrac.runtime.JMLChecker.setLevel
                    (org.jmlspecs.jmlrac.runtime.JMLOption.NONE);
                try {
                    java.lang.String failmsg = this.failMessage(e);
                    junit.framework.AssertionFailedError err
                        = new junit.framework.AssertionFailedError(failmsg);
                    err.setStackTrace(new java.lang.StackTraceElement[]{});
                    err.initCause(e);
                    result.addFailure(this, err);
                } finally {
                    org.jmlspecs.jmlrac.runtime.JMLChecker.setLevel(l);
                }
            } catch (java.lang.Throwable e) {
                // test success
            }
        }

        /** Call the method to be tested with the appropriate arguments. */
        protected abstract void doCall() throws java.lang.Throwable;

        /** Format the error message for a test failure, based on the
         * method's arguments. */
        protected abstract java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e);

        /** Inform listeners that a meaningless test was run. */
        private void addMeaningless() {
            if (result instanceof org.jmlspecs.jmlunit.JMLTestResult) {
                ((org.jmlspecs.jmlunit.JMLTestResult)result)
                    .addMeaningless(this);
            }
        }
    }

    /** Create the tests that are to be run for testing the class
     * Account.  The framework will then run them.
     * @param overallTestSuite$ The suite accumulating all of the tests
     * for this driver class.
     */
    //@ requires overallTestSuite$ != null;
    public void addTestSuiteForEachMethod
        (junit.framework.TestSuite overallTestSuite$)
    {
        try {
            this.addTestSuiteFor$TestAccount(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
        try {
            this.addTestSuiteFor$TestBalance(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
        try {
            this.addTestSuiteFor$TestPayInterest(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
        try {
            this.addTestSuiteFor$TestDeposit(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
        try {
            this.addTestSuiteFor$TestWithdraw(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
        try {
            this.addTestSuiteFor$TestToString(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
    }

    /** Add tests for the Account contructor
     * to the overall test suite. */
    private void addTestSuiteFor$TestAccount
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("Account");
        try {
            org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                vorg_jmlspecs_samples_prelimdesign_MoneyOps$1$iter
                = this.vorg_jmlspecs_samples_prelimdesign_MoneyOpsIter("Account", 1);
            this.check_has_data
                (vorg_jmlspecs_samples_prelimdesign_MoneyOps$1$iter,
                 "this.vorg_jmlspecs_samples_prelimdesign_MoneyOpsIter(\"Account\", 1)");
            while (!vorg_jmlspecs_samples_prelimdesign_MoneyOps$1$iter.atEnd()) {
                org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                    vjava_lang_String$2$iter
                    = this.vjava_lang_StringIter("Account", 0);
                this.check_has_data
                    (vjava_lang_String$2$iter,
                     "this.vjava_lang_StringIter(\"Account\", 0)");
                while (!vjava_lang_String$2$iter.atEnd()) {
                    final org.jmlspecs.samples.prelimdesign.MoneyOps amt
                        = (org.jmlspecs.samples.prelimdesign.MoneyOps) vorg_jmlspecs_samples_prelimdesign_MoneyOps$1$iter.get();
                    final java.lang.String own
                        = (java.lang.String) vjava_lang_String$2$iter.get();
                    methodTests$.addTest
                        (new TestAccount(amt, own));
                    vjava_lang_String$2$iter.advance();
                }
                vorg_jmlspecs_samples_prelimdesign_MoneyOps$1$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the Account contructor. */
    protected static class TestAccount extends OneTest {
        /** Argument amt */
        private org.jmlspecs.samples.prelimdesign.MoneyOps amt;
        /** Argument own */
        private java.lang.String own;

        /** Initialize this instance. */
        public TestAccount(org.jmlspecs.samples.prelimdesign.MoneyOps amt, java.lang.String own) {
            super("Account"+ ":" + (amt==null? "null" :"{org.jmlspecs.samples.prelimdesign.MoneyOps}")+ "," +(own==null? "null" :("\""+own+"\"")));
            this.amt = amt;
            this.own = own;
        }

        protected void doCall() throws java.lang.Throwable {
            new Account(amt, own);
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tContructor 'Account' applied to";
            msg += "\n\tArgument amt: " + this.amt;
            msg += "\n\tArgument own: " + this.own;
            return msg;
        }
    }

    /** Add tests for the balance method
     * to the overall test suite. */
    private void addTestSuiteFor$TestBalance
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("balance");
        try {
            org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                receivers$iter
                = new org.jmlspecs.jmlunit.strategies.NonNullIteratorDecorator
                    (this.vorg_jmlspecs_samples_prelimdesign_AccountIter("balance", 0));
            this.check_has_data
                (receivers$iter,
                 "new NonNullIteratorDecorator(this.vorg_jmlspecs_samples_prelimdesign_AccountIter(\"balance\", 0))");
            while (!receivers$iter.atEnd()) {
                final org.jmlspecs.samples.prelimdesign.Account receiver$
                    = (org.jmlspecs.samples.prelimdesign.Account) receivers$iter.get();
                methodTests$.addTest
                    (new TestBalance(receiver$));
                receivers$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the balance method. */
    protected static class TestBalance extends OneTest {
        /** The receiver */
        private org.jmlspecs.samples.prelimdesign.Account receiver$;

        /** Initialize this instance. */
        public TestBalance(org.jmlspecs.samples.prelimdesign.Account receiver$) {
            super("balance");
            this.receiver$ = receiver$;
        }

        protected void doCall() throws java.lang.Throwable {
            receiver$.balance();
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tMethod 'balance' applied to";
            msg += "\n\tReceiver: " + this.receiver$;
            return msg;
        }
    }

    /** Add tests for the payInterest method
     * to the overall test suite. */
    private void addTestSuiteFor$TestPayInterest
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("payInterest");
        try {
            org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                receivers$iter
                = new org.jmlspecs.jmlunit.strategies.NonNullIteratorDecorator
                    (this.vorg_jmlspecs_samples_prelimdesign_AccountIter("payInterest", 1));
            this.check_has_data
                (receivers$iter,
                 "new NonNullIteratorDecorator(this.vorg_jmlspecs_samples_prelimdesign_AccountIter(\"payInterest\", 1))");
            while (!receivers$iter.atEnd()) {
                org.jmlspecs.jmlunit.strategies.DoubleIterator
                    vdouble$1$iter
                    = this.vdoubleIter("payInterest", 0);
                this.check_has_data
                    (vdouble$1$iter,
                     "this.vdoubleIter(\"payInterest\", 0)");
                while (!vdouble$1$iter.atEnd()) {
                    final org.jmlspecs.samples.prelimdesign.Account receiver$
                        = (org.jmlspecs.samples.prelimdesign.Account) receivers$iter.get();
                    final double rate
                        = vdouble$1$iter.getDouble();
                    methodTests$.addTest
                        (new TestPayInterest(receiver$, rate));
                    vdouble$1$iter.advance();
                }
                receivers$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the payInterest method. */
    protected static class TestPayInterest extends OneTest {
        /** The receiver */
        private org.jmlspecs.samples.prelimdesign.Account receiver$;
        /** Argument rate */
        private double rate;

        /** Initialize this instance. */
        public TestPayInterest(org.jmlspecs.samples.prelimdesign.Account receiver$, double rate) {
            super("payInterest"+ ":" + rate);
            this.receiver$ = receiver$;
            this.rate = rate;
        }

        protected void doCall() throws java.lang.Throwable {
            receiver$.payInterest(rate);
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tMethod 'payInterest' applied to";
            msg += "\n\tReceiver: " + this.receiver$;
            msg += "\n\tArgument rate: " + this.rate;
            return msg;
        }
    }

    /** Add tests for the deposit method
     * to the overall test suite. */
    private void addTestSuiteFor$TestDeposit
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("deposit");
        try {
            org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                receivers$iter
                = new org.jmlspecs.jmlunit.strategies.NonNullIteratorDecorator
                    (this.vorg_jmlspecs_samples_prelimdesign_AccountIter("deposit", 1));
            this.check_has_data
                (receivers$iter,
                 "new NonNullIteratorDecorator(this.vorg_jmlspecs_samples_prelimdesign_AccountIter(\"deposit\", 1))");
            while (!receivers$iter.atEnd()) {
                org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                    vorg_jmlspecs_samples_prelimdesign_MoneyOps$1$iter
                    = this.vorg_jmlspecs_samples_prelimdesign_MoneyOpsIter("deposit", 0);
                this.check_has_data
                    (vorg_jmlspecs_samples_prelimdesign_MoneyOps$1$iter,
                     "this.vorg_jmlspecs_samples_prelimdesign_MoneyOpsIter(\"deposit\", 0)");
                while (!vorg_jmlspecs_samples_prelimdesign_MoneyOps$1$iter.atEnd()) {
                    final org.jmlspecs.samples.prelimdesign.Account receiver$
                        = (org.jmlspecs.samples.prelimdesign.Account) receivers$iter.get();
                    final org.jmlspecs.samples.prelimdesign.MoneyOps amt
                        = (org.jmlspecs.samples.prelimdesign.MoneyOps) vorg_jmlspecs_samples_prelimdesign_MoneyOps$1$iter.get();
                    methodTests$.addTest
                        (new TestDeposit(receiver$, amt));
                    vorg_jmlspecs_samples_prelimdesign_MoneyOps$1$iter.advance();
                }
                receivers$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the deposit method. */
    protected static class TestDeposit extends OneTest {
        /** The receiver */
        private org.jmlspecs.samples.prelimdesign.Account receiver$;
        /** Argument amt */
        private org.jmlspecs.samples.prelimdesign.MoneyOps amt;

        /** Initialize this instance. */
        public TestDeposit(org.jmlspecs.samples.prelimdesign.Account receiver$, org.jmlspecs.samples.prelimdesign.MoneyOps amt) {
            super("deposit"+ ":" + (amt==null? "null" :"{org.jmlspecs.samples.prelimdesign.MoneyOps}"));
            this.receiver$ = receiver$;
            this.amt = amt;
        }

        protected void doCall() throws java.lang.Throwable {
            receiver$.deposit(amt);
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tMethod 'deposit' applied to";
            msg += "\n\tReceiver: " + this.receiver$;
            msg += "\n\tArgument amt: " + this.amt;
            return msg;
        }
    }

    /** Add tests for the withdraw method
     * to the overall test suite. */
    private void addTestSuiteFor$TestWithdraw
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("withdraw");
        try {
            org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                receivers$iter
                = new org.jmlspecs.jmlunit.strategies.NonNullIteratorDecorator
                    (this.vorg_jmlspecs_samples_prelimdesign_AccountIter("withdraw", 1));
            this.check_has_data
                (receivers$iter,
                 "new NonNullIteratorDecorator(this.vorg_jmlspecs_samples_prelimdesign_AccountIter(\"withdraw\", 1))");
            while (!receivers$iter.atEnd()) {
                org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                    vorg_jmlspecs_samples_prelimdesign_MoneyOps$1$iter
                    = this.vorg_jmlspecs_samples_prelimdesign_MoneyOpsIter("withdraw", 0);
                this.check_has_data
                    (vorg_jmlspecs_samples_prelimdesign_MoneyOps$1$iter,
                     "this.vorg_jmlspecs_samples_prelimdesign_MoneyOpsIter(\"withdraw\", 0)");
                while (!vorg_jmlspecs_samples_prelimdesign_MoneyOps$1$iter.atEnd()) {
                    final org.jmlspecs.samples.prelimdesign.Account receiver$
                        = (org.jmlspecs.samples.prelimdesign.Account) receivers$iter.get();
                    final org.jmlspecs.samples.prelimdesign.MoneyOps amt
                        = (org.jmlspecs.samples.prelimdesign.MoneyOps) vorg_jmlspecs_samples_prelimdesign_MoneyOps$1$iter.get();
                    methodTests$.addTest
                        (new TestWithdraw(receiver$, amt));
                    vorg_jmlspecs_samples_prelimdesign_MoneyOps$1$iter.advance();
                }
                receivers$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the withdraw method. */
    protected static class TestWithdraw extends OneTest {
        /** The receiver */
        private org.jmlspecs.samples.prelimdesign.Account receiver$;
        /** Argument amt */
        private org.jmlspecs.samples.prelimdesign.MoneyOps amt;

        /** Initialize this instance. */
        public TestWithdraw(org.jmlspecs.samples.prelimdesign.Account receiver$, org.jmlspecs.samples.prelimdesign.MoneyOps amt) {
            super("withdraw"+ ":" + (amt==null? "null" :"{org.jmlspecs.samples.prelimdesign.MoneyOps}"));
            this.receiver$ = receiver$;
            this.amt = amt;
        }

        protected void doCall() throws java.lang.Throwable {
            receiver$.withdraw(amt);
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tMethod 'withdraw' applied to";
            msg += "\n\tReceiver: " + this.receiver$;
            msg += "\n\tArgument amt: " + this.amt;
            return msg;
        }
    }

    /** Add tests for the toString method
     * to the overall test suite. */
    private void addTestSuiteFor$TestToString
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("toString");
        try {
            org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                receivers$iter
                = new org.jmlspecs.jmlunit.strategies.NonNullIteratorDecorator
                    (this.vorg_jmlspecs_samples_prelimdesign_AccountIter("toString", 0));
            this.check_has_data
                (receivers$iter,
                 "new NonNullIteratorDecorator(this.vorg_jmlspecs_samples_prelimdesign_AccountIter(\"toString\", 0))");
            while (!receivers$iter.atEnd()) {
                final org.jmlspecs.samples.prelimdesign.Account receiver$
                    = (org.jmlspecs.samples.prelimdesign.Account) receivers$iter.get();
                methodTests$.addTest
                    (new TestToString(receiver$));
                receivers$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the toString method. */
    protected static class TestToString extends OneTest {
        /** The receiver */
        private org.jmlspecs.samples.prelimdesign.Account receiver$;

        /** Initialize this instance. */
        public TestToString(org.jmlspecs.samples.prelimdesign.Account receiver$) {
            super("toString");
            this.receiver$ = receiver$;
        }

        protected void doCall() throws java.lang.Throwable {
            receiver$.toString();
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tMethod 'toString' applied to";
            msg += "\n\tReceiver: " + this.receiver$;
            return msg;
        }
    }

    /** Check that the iterator is non-null and not empty. */
    private void
    check_has_data(org.jmlspecs.jmlunit.strategies.IndefiniteIterator iter,
                   String call)
    {
        if (iter == null) {
            junit.framework.Assert.fail(call + " returned null");
        }
        if (iter.atEnd()) {
            junit.framework.Assert.fail(call + " returned an empty iterator");
        }
    }

    /** Converts a char to a printable String for display */
    public static String charToString(char c) {
        if (c == '\n') {
            return "NL";
        } else if (c == '\r') {
            return "CR";
        } else if (c == '\t') {
            return "TAB";
        } else if (Character.isISOControl(c)) {
            int i = (int)c;
            return "\\u"
                    + Character.forDigit((i/2048)%16,16)
                    + Character.forDigit((i/256)%16,16)
                    + Character.forDigit((i/16)%16,16)
                    + Character.forDigit((i)%16,16);
        }
        return Character.toString(c);
    }
}
