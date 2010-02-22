// This file was generated by jmlunit on Tue May 20 17:43:08 EDT 2008.

package org.jmlspecs.samples.reader;

/** Automatically-generated test driver for JML and JUnit based
 * testing of BlankReader. The superclass of this class should be edited
 * to supply test data. However it's best not to edit this class
 * directly; instead use the command
 * <pre>
 *  jmlunit BlankReader.java
 * </pre>
 * to regenerate this class whenever BlankReader.java changes.
 */
public class BlankReader_JML_Test
     extends BlankReader_JML_TestData
{
    /** Initialize this class. */
    public BlankReader_JML_Test(java.lang.String name) {
        super(name);
    }

    /** Run the tests. */
    public static void main(java.lang.String[] args) {
        org.jmlspecs.jmlunit.JMLTestRunner.run(suite());
        // You can also use a JUnit test runner such as:
        // junit.textui.TestRunner.run(suite());
    }

    /** Test to see if the code for class BlankReader
     * has been compiled with runtime assertion checking (i.e., by jmlc).
     * Code that is not compiled with jmlc would not make an effective test,
     * since no assertion checking would be done. */
    public void test$IsRACCompiled() {
        junit.framework.Assert.assertTrue("code for class BlankReader"
                + " was not compiled with jmlc"
                + " so no assertions will be checked!",
            org.jmlspecs.jmlrac.runtime.JMLChecker.isRACCompiled(BlankReader.class)
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
        BlankReader_JML_Test testobj
            = new BlankReader_JML_Test("BlankReader_JML_Test");
        junit.framework.TestSuite testsuite = testobj.overallTestSuite();
        // Add instances of Test found by the reflection mechanism.
        testsuite.addTestSuite(BlankReader_JML_Test.class);
        testobj.addTestSuiteForEachMethod(testsuite);
        return testsuite;
    }

    /** A JUnit test object that can run a single test method.  This
     * is defined as a nested class solely for convenience; it can't
     * be defined once and for all because it must subclass its
     * enclosing class.
     */
    protected static abstract class OneTest extends BlankReader_JML_Test {

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
     * BlankReader.  The framework will then run them.
     * @param overallTestSuite$ The suite accumulating all of the tests
     * for this driver class.
     */
    //@ requires overallTestSuite$ != null;
    public void addTestSuiteForEachMethod
        (junit.framework.TestSuite overallTestSuite$)
    {
        try {
            this.addTestSuiteFor$TestBlankReader(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
        try {
            this.addTestSuiteFor$TestRefill(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
        try {
            this.addTestSuiteFor$TestClose(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
        try {
            this.addTestSuiteFor$TestRead(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
    }

    /** Add tests for the BlankReader contructor
     * to the overall test suite. */
    private void addTestSuiteFor$TestBlankReader
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("BlankReader");
        try {
            org.jmlspecs.jmlunit.strategies.IntIterator
                vint$1$iter
                = this.vintIter("BlankReader", 0);
            this.check_has_data
                (vint$1$iter,
                 "this.vintIter(\"BlankReader\", 0)");
            while (!vint$1$iter.atEnd()) {
                final int n
                    = vint$1$iter.getInt();
                methodTests$.addTest
                    (new TestBlankReader(n));
                vint$1$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the BlankReader contructor. */
    protected static class TestBlankReader extends OneTest {
        /** Argument n */
        private int n;

        /** Initialize this instance. */
        public TestBlankReader(int n) {
            super("BlankReader"+ ":" + n);
            this.n = n;
        }

        protected void doCall() throws java.lang.Throwable {
            new BlankReader(n);
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tContructor 'BlankReader' applied to";
            msg += "\n\tArgument n: " + this.n;
            return msg;
        }
    }

    /** Add tests for the refill method
     * to the overall test suite. */
    private void addTestSuiteFor$TestRefill
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("refill");
        try {
            org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                receivers$iter
                = new org.jmlspecs.jmlunit.strategies.NonNullIteratorDecorator
                    (this.vorg_jmlspecs_samples_reader_BlankReaderIter("refill", 0));
            this.check_has_data
                (receivers$iter,
                 "new NonNullIteratorDecorator(this.vorg_jmlspecs_samples_reader_BlankReaderIter(\"refill\", 0))");
            while (!receivers$iter.atEnd()) {
                final org.jmlspecs.samples.reader.BlankReader receiver$
                    = (org.jmlspecs.samples.reader.BlankReader) receivers$iter.get();
                methodTests$.addTest
                    (new TestRefill(receiver$));
                receivers$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the refill method. */
    protected static class TestRefill extends OneTest {
        /** The receiver */
        private org.jmlspecs.samples.reader.BlankReader receiver$;

        /** Initialize this instance. */
        public TestRefill(org.jmlspecs.samples.reader.BlankReader receiver$) {
            super("refill");
            this.receiver$ = receiver$;
        }

        protected void doCall() throws java.lang.Throwable {
            receiver$.refill();
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tMethod 'refill' applied to";
            msg += "\n\tReceiver: " + this.receiver$;
            return msg;
        }
    }

    /** Add tests for the close method
     * to the overall test suite. */
    private void addTestSuiteFor$TestClose
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("close");
        try {
            org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                receivers$iter
                = new org.jmlspecs.jmlunit.strategies.NonNullIteratorDecorator
                    (this.vorg_jmlspecs_samples_reader_BlankReaderIter("close", 0));
            this.check_has_data
                (receivers$iter,
                 "new NonNullIteratorDecorator(this.vorg_jmlspecs_samples_reader_BlankReaderIter(\"close\", 0))");
            while (!receivers$iter.atEnd()) {
                final org.jmlspecs.samples.reader.BlankReader receiver$
                    = (org.jmlspecs.samples.reader.BlankReader) receivers$iter.get();
                methodTests$.addTest
                    (new TestClose(receiver$));
                receivers$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the close method. */
    protected static class TestClose extends OneTest {
        /** The receiver */
        private org.jmlspecs.samples.reader.BlankReader receiver$;

        /** Initialize this instance. */
        public TestClose(org.jmlspecs.samples.reader.BlankReader receiver$) {
            super("close");
            this.receiver$ = receiver$;
        }

        protected void doCall() throws java.lang.Throwable {
            receiver$.close();
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tMethod 'close' applied to";
            msg += "\n\tReceiver: " + this.receiver$;
            return msg;
        }
    }

    /** Add tests for the read method
     * to the overall test suite. */
    private void addTestSuiteFor$TestRead
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("read");
        try {
            org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                receivers$iter
                = new org.jmlspecs.jmlunit.strategies.NonNullIteratorDecorator
                    (this.vorg_jmlspecs_samples_reader_BlankReaderIter("read", 0));
            this.check_has_data
                (receivers$iter,
                 "new NonNullIteratorDecorator(this.vorg_jmlspecs_samples_reader_BlankReaderIter(\"read\", 0))");
            while (!receivers$iter.atEnd()) {
                final org.jmlspecs.samples.reader.BlankReader receiver$
                    = (org.jmlspecs.samples.reader.BlankReader) receivers$iter.get();
                methodTests$.addTest
                    (new TestRead(receiver$));
                receivers$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the read method. */
    protected static class TestRead extends OneTest {
        /** The receiver */
        private org.jmlspecs.samples.reader.BlankReader receiver$;

        /** Initialize this instance. */
        public TestRead(org.jmlspecs.samples.reader.BlankReader receiver$) {
            super("read");
            this.receiver$ = receiver$;
        }

        protected void doCall() throws java.lang.Throwable {
            receiver$.read();
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tMethod 'read' applied to";
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
