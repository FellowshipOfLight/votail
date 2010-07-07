// This file was generated by jmlunit on Tue May 20 17:43:10 EDT 2008.

package org.jmlspecs.samples.sets;

import java.util.*;

/** Automatically-generated test driver for JML and JUnit based
 * testing of IntegerSetAsHashSet. The superclass of this class should be edited
 * to supply test data. However it's best not to edit this class
 * directly; instead use the command
 * <pre>
 *  jmlunit IntegerSetAsHashSet.java
 * </pre>
 * to regenerate this class whenever IntegerSetAsHashSet.java changes.
 */
public class IntegerSetAsHashSet_JML_Test
     extends IntegerSetAsHashSet_JML_TestData
{
    /** Initialize this class. */
    public IntegerSetAsHashSet_JML_Test(java.lang.String name) {
        super(name);
    }

    /** Run the tests. */
    public static void main(java.lang.String[] args) {
        org.jmlspecs.jmlunit.JMLTestRunner.run(suite());
        // You can also use a JUnit test runner such as:
        // junit.textui.TestRunner.run(suite());
    }

    /** Test to see if the code for class IntegerSetAsHashSet
     * has been compiled with runtime assertion checking (i.e., by jmlc).
     * Code that is not compiled with jmlc would not make an effective test,
     * since no assertion checking would be done. */
    public void test$IsRACCompiled() {
        junit.framework.Assert.assertTrue("code for class IntegerSetAsHashSet"
                + " was not compiled with jmlc"
                + " so no assertions will be checked!",
            org.jmlspecs.jmlrac.runtime.JMLChecker.isRACCompiled(IntegerSetAsHashSet.class)
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
        IntegerSetAsHashSet_JML_Test testobj
            = new IntegerSetAsHashSet_JML_Test("IntegerSetAsHashSet_JML_Test");
        junit.framework.TestSuite testsuite = testobj.overallTestSuite();
        // Add instances of Test found by the reflection mechanism.
        testsuite.addTestSuite(IntegerSetAsHashSet_JML_Test.class);
        testobj.addTestSuiteForEachMethod(testsuite);
        return testsuite;
    }

    /** A JUnit test object that can run a single test method.  This
     * is defined as a nested class solely for convenience; it can't
     * be defined once and for all because it must subclass its
     * enclosing class.
     */
    protected static abstract class OneTest extends IntegerSetAsHashSet_JML_Test {

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
     * IntegerSetAsHashSet.  The framework will then run them.
     * @param overallTestSuite$ The suite accumulating all of the tests
     * for this driver class.
     */
    //@ requires overallTestSuite$ != null;
    public void addTestSuiteForEachMethod
        (junit.framework.TestSuite overallTestSuite$)
    {
        try {
            this.addTestSuiteFor$TestIntegerSetAsHashSet(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
        try {
            this.addTestSuiteFor$TestIsMember(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
        try {
            this.addTestSuiteFor$TestInsert(overallTestSuite$);
        } catch (java.lang.Throwable ex) {
            overallTestSuite$.addTest
                (new org.jmlspecs.jmlunit.strategies.ConstructorFailed(ex));
        }
        try {
            this.addTestSuiteFor$TestRemove(overallTestSuite$);
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

    /** Add tests for the IntegerSetAsHashSet contructor
     * to the overall test suite. */
    private void addTestSuiteFor$TestIntegerSetAsHashSet
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("IntegerSetAsHashSet");
        try {
            methodTests$.addTest
                (new TestIntegerSetAsHashSet());
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the IntegerSetAsHashSet contructor. */
    protected static class TestIntegerSetAsHashSet extends OneTest {

        /** Initialize this instance. */
        public TestIntegerSetAsHashSet() {
            super("IntegerSetAsHashSet");
        }

        protected void doCall() throws java.lang.Throwable {
            new IntegerSetAsHashSet();
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tContructor 'IntegerSetAsHashSet'";
            return msg;
        }
    }

    /** Add tests for the isMember method
     * to the overall test suite. */
    private void addTestSuiteFor$TestIsMember
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("isMember");
        try {
            org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                receivers$iter
                = new org.jmlspecs.jmlunit.strategies.NonNullIteratorDecorator
                    (this.vorg_jmlspecs_samples_sets_IntegerSetAsHashSetIter("isMember", 1));
            this.check_has_data
                (receivers$iter,
                 "new NonNullIteratorDecorator(this.vorg_jmlspecs_samples_sets_IntegerSetAsHashSetIter(\"isMember\", 1))");
            while (!receivers$iter.atEnd()) {
                org.jmlspecs.jmlunit.strategies.IntIterator
                    vint$1$iter
                    = this.vintIter("isMember", 0);
                this.check_has_data
                    (vint$1$iter,
                     "this.vintIter(\"isMember\", 0)");
                while (!vint$1$iter.atEnd()) {
                    final org.jmlspecs.samples.sets.IntegerSetAsHashSet receiver$
                        = (org.jmlspecs.samples.sets.IntegerSetAsHashSet) receivers$iter.get();
                    final int i
                        = vint$1$iter.getInt();
                    methodTests$.addTest
                        (new TestIsMember(receiver$, i));
                    vint$1$iter.advance();
                }
                receivers$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the isMember method. */
    protected static class TestIsMember extends OneTest {
        /** The receiver */
        private org.jmlspecs.samples.sets.IntegerSetAsHashSet receiver$;
        /** Argument i */
        private int i;

        /** Initialize this instance. */
        public TestIsMember(org.jmlspecs.samples.sets.IntegerSetAsHashSet receiver$, int i) {
            super("isMember"+ ":" + i);
            this.receiver$ = receiver$;
            this.i = i;
        }

        protected void doCall() throws java.lang.Throwable {
            receiver$.isMember(i);
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tMethod 'isMember' applied to";
            msg += "\n\tReceiver: " + this.receiver$;
            msg += "\n\tArgument i: " + this.i;
            return msg;
        }
    }

    /** Add tests for the insert method
     * to the overall test suite. */
    private void addTestSuiteFor$TestInsert
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("insert");
        try {
            org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                receivers$iter
                = new org.jmlspecs.jmlunit.strategies.NonNullIteratorDecorator
                    (this.vorg_jmlspecs_samples_sets_IntegerSetAsHashSetIter("insert", 1));
            this.check_has_data
                (receivers$iter,
                 "new NonNullIteratorDecorator(this.vorg_jmlspecs_samples_sets_IntegerSetAsHashSetIter(\"insert\", 1))");
            while (!receivers$iter.atEnd()) {
                org.jmlspecs.jmlunit.strategies.IntIterator
                    vint$1$iter
                    = this.vintIter("insert", 0);
                this.check_has_data
                    (vint$1$iter,
                     "this.vintIter(\"insert\", 0)");
                while (!vint$1$iter.atEnd()) {
                    final org.jmlspecs.samples.sets.IntegerSetAsHashSet receiver$
                        = (org.jmlspecs.samples.sets.IntegerSetAsHashSet) receivers$iter.get();
                    final int i
                        = vint$1$iter.getInt();
                    methodTests$.addTest
                        (new TestInsert(receiver$, i));
                    vint$1$iter.advance();
                }
                receivers$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the insert method. */
    protected static class TestInsert extends OneTest {
        /** The receiver */
        private org.jmlspecs.samples.sets.IntegerSetAsHashSet receiver$;
        /** Argument i */
        private int i;

        /** Initialize this instance. */
        public TestInsert(org.jmlspecs.samples.sets.IntegerSetAsHashSet receiver$, int i) {
            super("insert"+ ":" + i);
            this.receiver$ = receiver$;
            this.i = i;
        }

        protected void doCall() throws java.lang.Throwable {
            receiver$.insert(i);
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tMethod 'insert' applied to";
            msg += "\n\tReceiver: " + this.receiver$;
            msg += "\n\tArgument i: " + this.i;
            return msg;
        }
    }

    /** Add tests for the remove method
     * to the overall test suite. */
    private void addTestSuiteFor$TestRemove
        (junit.framework.TestSuite overallTestSuite$)
    {
        junit.framework.TestSuite methodTests$
            = this.emptyTestSuiteFor("remove");
        try {
            org.jmlspecs.jmlunit.strategies.IndefiniteIterator
                receivers$iter
                = new org.jmlspecs.jmlunit.strategies.NonNullIteratorDecorator
                    (this.vorg_jmlspecs_samples_sets_IntegerSetAsHashSetIter("remove", 1));
            this.check_has_data
                (receivers$iter,
                 "new NonNullIteratorDecorator(this.vorg_jmlspecs_samples_sets_IntegerSetAsHashSetIter(\"remove\", 1))");
            while (!receivers$iter.atEnd()) {
                org.jmlspecs.jmlunit.strategies.IntIterator
                    vint$1$iter
                    = this.vintIter("remove", 0);
                this.check_has_data
                    (vint$1$iter,
                     "this.vintIter(\"remove\", 0)");
                while (!vint$1$iter.atEnd()) {
                    final org.jmlspecs.samples.sets.IntegerSetAsHashSet receiver$
                        = (org.jmlspecs.samples.sets.IntegerSetAsHashSet) receivers$iter.get();
                    final int i
                        = vint$1$iter.getInt();
                    methodTests$.addTest
                        (new TestRemove(receiver$, i));
                    vint$1$iter.advance();
                }
                receivers$iter.advance();
            }
        } catch (org.jmlspecs.jmlunit.strategies.TestSuiteFullException e$) {
            // methodTests$ doesn't want more tests
        }
        overallTestSuite$.addTest(methodTests$);
    }

    /** Test for the remove method. */
    protected static class TestRemove extends OneTest {
        /** The receiver */
        private org.jmlspecs.samples.sets.IntegerSetAsHashSet receiver$;
        /** Argument i */
        private int i;

        /** Initialize this instance. */
        public TestRemove(org.jmlspecs.samples.sets.IntegerSetAsHashSet receiver$, int i) {
            super("remove"+ ":" + i);
            this.receiver$ = receiver$;
            this.i = i;
        }

        protected void doCall() throws java.lang.Throwable {
            receiver$.remove(i);
        }

        protected java.lang.String failMessage
            (org.jmlspecs.jmlrac.runtime.JMLAssertionError e$)
        {
            java.lang.String msg = "\n\tMethod 'remove' applied to";
            msg += "\n\tReceiver: " + this.receiver$;
            msg += "\n\tArgument i: " + this.i;
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
                    (this.vorg_jmlspecs_samples_sets_IntegerSetAsHashSetIter("toString", 0));
            this.check_has_data
                (receivers$iter,
                 "new NonNullIteratorDecorator(this.vorg_jmlspecs_samples_sets_IntegerSetAsHashSetIter(\"toString\", 0))");
            while (!receivers$iter.atEnd()) {
                final org.jmlspecs.samples.sets.IntegerSetAsHashSet receiver$
                    = (org.jmlspecs.samples.sets.IntegerSetAsHashSet) receivers$iter.get();
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
        private org.jmlspecs.samples.sets.IntegerSetAsHashSet receiver$;

        /** Initialize this instance. */
        public TestToString(org.jmlspecs.samples.sets.IntegerSetAsHashSet receiver$) {
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
