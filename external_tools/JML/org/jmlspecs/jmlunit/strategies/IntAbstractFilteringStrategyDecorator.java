// @(#)$Id: intAbstractFilteringStrategyDecorator.java-generic,v 1.7 2005/12/24 21:20:31 chalin Exp $

// Copyright (C) 2005 Iowa State University
//
// This file is part of the runtime library of the Java Modeling Language.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public License
// as published by the Free Software Foundation; either version 2.1,
// of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with JML; see the file LesserGPL.txt.  If not, write to the Free
// Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
// 02110-1301  USA.

package org.jmlspecs.jmlunit.strategies;

/** A decorator for strategies that filters out data that is not approved.
 *
 * @author Gary T. Leavens
 */
// FIXME: adapt this file to non-null-by-default and remove the following modifier.
/*@ nullable_by_default @*/ 
public abstract class IntAbstractFilteringStrategyDecorator
    extends IntAbstractStrategy
{
    /** The test data */
    private final /*@ spec_public non_null@*/ IntStrategyType rawData;
    //@ in objectState; maps rawData.objectState \into objectState;

    //@ public normal_behavior
    //@   requires strat != null;
    //@   assignable rawData;
    //@   ensures rawData == strat;
    public IntAbstractFilteringStrategyDecorator
        (IntStrategyType strat)
    {
        rawData = strat;
    }

    // doc comment and specification inherited
    public /*@ non_null @*/ IntIterator intIterator() {
        /** The filtering iterator to return, defined to allow for an
         * explicit constructor. */
        class NewIter extends IntAbstractFilteringIteratorDecorator
        {
            /** Initialize this iterator in two steps, to avoid downcalls
             *  during initialization that lead to null pointer exceptions. */
            //@ assignable rawElems, objectState, dented, owner;
            //@ ensures !dented;
            public NewIter(IntIterator iter) {
                super(iter, (int)0);
                super.initialize();
            }

            // doc comment and specification inherited
            public /*@ pure @*/ boolean approve(int elem) {
                return IntAbstractFilteringStrategyDecorator
                    .this.approve(elem);
            }
        }
        
        return new NewIter(rawData.intIterator());
    }

    /** Return true if the element is to be returned by the
     * getInt() method. */
    //@ public normal_behavior
    //@   assignable \nothing;
    public abstract /*@ pure @*/ boolean approve(int elem);
}

