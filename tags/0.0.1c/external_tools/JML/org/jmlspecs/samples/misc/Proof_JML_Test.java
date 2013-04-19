// This file was generated by jmlunit on Tue May 20 17:43:02 EDT 2008.

package org.jmlspecs.samples.misc;

/** Automatically-generated test driver for JML and JUnit based
 * testing of Proof. The superclass of this class should be edited
 * to supply test data. However it's best not to edit this class
 * directly; instead use the command
 * <pre>
 *  jmlunit Proof.java
 * </pre>
 * to regenerate this class whenever Proof.java changes.
 */
public class Proof_JML_Test
     extends Proof_JML_TestData
{
    /** Initialize this class. */
    public Proof_JML_Test(java.lang.String name) {
        super(name);
    }

    /** Run the tests. */
    public static void main(java.lang.String[] args) {
        org.jmlspecs.jmlunit.JMLTestRunner.run(suite());
        // You can also use a JUnit test runner such as:
        // junit.textui.TestRunner.run(suite());
    }

    /** Test to see if the code for class Proof
     * has been compiled with runtime assertion checking (i.e., by jmlc).
     * Code that is not compiled with jmlc would not make an effective test,
     * since no assertion checking would be done. */
    public void test$IsRACCompiled() {
        junit.framework.Assert.assertTrue("code for class Proof"
                + " was not compiled with jmlc"
                + " so no assertions will be checked!",
            org.jmlspecs.jmlrac.runtime.JMLChecker.isRACCompiled(Proof.class)
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
        Proof_JML_Test testobj
            = new Proof_JML_Test("Proof_JML_Test");
        junit.framework.TestSuite testsuite = testobj.overallTestSuite();
        // Add instances of Test found by the reflection mechanism.
        testsuite.addTestSuite(Proof_JML_Test.class);
        testobj.addTestSuiteForEachMethod(testsuite);
        return testsuite;
    }

    /** A JUnit test object that can run a single test method.  This
     * is defined as a nested class solely for convenience; it can't
     * be defined once and for all because it must subclass its
     * enclosing class.
     */
    protected static abstract class OneTest extends Proof_JML_Test {

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
     * Proof.  The framework will then run them.
     * @param overallTestSuite$ The suite accumulating all of the tests
     * for this driver class.
     */
    //@ requires overallTestSuite$ != null;
    public void addTestSuiteForEachMethod
        (junit.framework.TestSuite overallTestSuite$)
    {
        try {
            this.addTestSuiteFor$TestFind_min(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
        try {
            this.addTestSuiteFor$TestGetRes(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
        try {
            this.addTestSuiteFor$TestFind(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
    }

    /** Add tests for the find_min method
     * to the overall test suite. */
    private void addTestSuiteFor$TestFind_min
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("find_min");
        try {
            org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                receivers$iter
                = new org.jmlspecs.jmlunit.strategies.NonNullIteratorDecorator
                    (this.vorg_jmlspecs_samples_misc_ProofIter("find_min", 1));
            this.check_has_data
                (receivers$iter,
                 "new NonNullIteratorDecorator(this.vorg_jmlspecs_samples_misc_ProofIter(\"find_min\", 1))");
            while (!receivers$iter.atEnd()) {
                org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                    vint$_$1$iter
                    = this.vint$_Iter("find_min", 0);
                this.check_has_data
                    (vint$_$1$iter,
                     "this.vint$_Iter(\"find_min\", 0)");
                while (!vint$_$1$iter.atEnd()) {
                    final org.jmlspecs.samples.misc.Proof receiver$
                        = (org.jmlspecs.samples.misc.Proof) receivers$iter.get();
                    final int[] a
                        = (int[]) vint$_$1$iter.get();
                    methodTests$.addTest
                        (new TestFind_min(receiver$, a));
                    vint$_$1$iter.advance();
                }
                receivers$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the find_min method. */
    protected static class TestFind_min extends OneTest {
        /** The receiver */
        private org.jmlspecs.samples.misc.Proof receiver$;
        /** Argument a */
        private int[] a;

        /** Initialize this instance. */
        public TestFind_min(org.jmlspecs.samples.misc.Proof receiver$, int[] a) {
            super("find_min"+ ":" + (a==null?"null":("{int["+a.length + "]"+"}")));
            this.receiver$ = receiver$;
            this.a = a;
        }

        protected void doCall() throws java.lang.Throwable {
            receiver$.find_min(a);
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tMethod 'find_min' applied to";
            msg += "\n\tReceiver: " + this.receiver$;
            msg += "\n\tArgument a: " + this.a;
            return msg;
        }
    }

    /** Add tests for the getRes method
     * to the overall test suite. */
    private void addTestSuiteFor$TestGetRes
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("getRes");
        try {
            org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                receivers$iter
                = new org.jmlspecs.jmlunit.strategies.NonNullIteratorDecorator
                    (this.vorg_jmlspecs_samples_misc_ProofIter("getRes", 0));
            this.check_has_data
                (receivers$iter,
                 "new NonNullIteratorDecorator(this.vorg_jmlspecs_samples_misc_ProofIter(\"getRes\", 0))");
            while (!receivers$iter.atEnd()) {
                final org.jmlspecs.samples.misc.Proof receiver$
                    = (org.jmlspecs.samples.misc.Proof) receivers$iter.get();
                methodTests$.addTest
                    (new TestGetRes(receiver$));
                receivers$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the getRes method. */
    protected static class TestGetRes extends OneTest {
        /** The receiver */
        private org.jmlspecs.samples.misc.Proof receiver$;

        /** Initialize this instance. */
        public TestGetRes(org.jmlspecs.samples.misc.Proof receiver$) {
            super("getRes");
            this.receiver$ = receiver$;
        }

        protected void doCall() throws java.lang.Throwable {
            receiver$.getRes();
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tMethod 'getRes' applied to";
            msg += "\n\tReceiver: " + this.receiver$;
            return msg;
        }
    }

    /** Add tests for the find method
     * to the overall test suite. */
    private void addTestSuiteFor$TestFind
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("find");
        try {
            org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                receivers$iter
                = new org.jmlspecs.jmlunit.strategies.NonNullIteratorDecorator
                    (this.vorg_jmlspecs_samples_misc_ProofIter("find", 2));
            this.check_has_data
                (receivers$iter,
                 "new NonNullIteratorDecorator(this.vorg_jmlspecs_samples_misc_ProofIter(\"find\", 2))");
            while (!receivers$iter.atEnd()) {
                org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                    vint$_$1$iter
                    = this.vint$_Iter("find", 1);
                this.check_has_data
                    (vint$_$1$iter,
                     "this.vint$_Iter(\"find\", 1)");
                while (!vint$_$1$iter.atEnd()) {
                    org.jmlspecs.jmlunit.strategies.IntIterator
                        vint$2$iter
                        = this.vintIter("find", 0);
                    this.check_has_data
                        (vint$2$iter,
                         "this.vintIter(\"find\", 0)");
                    while (!vint$2$iter.atEnd()) {
                        final org.jmlspecs.samples.misc.Proof receiver$
                            = (org.jmlspecs.samples.misc.Proof) receivers$iter.get();
                        final int[] a
                            = (int[]) vint$_$1$iter.get();
                        final int x
                            = vint$2$iter.getInt();
                        methodTests$.addTest
                            (new TestFind(receiver$, a, x));
                        vint$2$iter.advance();
                    }
                    vint$_$1$iter.advance();
                }
                receivers$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the find method. */
    protected static class TestFind extends OneTest {
        /** The receiver */
        private org.jmlspecs.samples.misc.Proof receiver$;
        /** Argument a */
        private int[] a;
        /** Argument x */
        private int x;

        /** Initialize this instance. */
        public TestFind(org.jmlspecs.samples.misc.Proof receiver$, int[] a, int x) {
            super("find"+ ":" + (a==null?"null":("{int["+a.length + "]"+"}"))+ "," +x);
            this.receiver$ = receiver$;
            this.a = a;
            this.x = x;
        }

        protected void doCall() throws java.lang.Throwable {
            receiver$.find(a, x);
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tMethod 'find' applied to";
            msg += "\n\tReceiver: " + this.receiver$;
            msg += "\n\tArgument a: " + this.a;
            msg += "\n\tArgument x: " + this.x;
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
