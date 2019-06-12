/*
 * ===================================================================================
 * ::FILE-NAME::
 * CopyConstructors.java
 * ::FQN ID::
 * com.app.sa.stateAndBehavior.CopyConstructors
 * ::DESCRIPTION:::
 * Demonstration of Copy Constructors in Java. Explaining concepts of Deep & Shallow
 * Copy w.r.t to Java's way of instantiation and referencing.
 * ----------------------------------------------------------------------
 * Date | Version | Editor | Remarks
 * ----------------------------------------------------------------------
 * 2019-01-03 | 0.1 | iHSPA | Class created.
 * ----------------------------------------------------------------------
 * Copyright @ 2019, iHSPA
 * ===================================================================================
 */

/**
 * 
 */
package com.app.sa.stateAndBehavior;

/**
 * @author COM
 */
public class CopyConstructors {

    private int id;
    private String name;

    public CopyConstructors ( ) {
    }

    /**
     * Deep Copy:
     * 
     * @param obj
     */
    public CopyConstructors ( CopyConstructors obj ) {
        this.id = obj.id;
        this.name = obj.name;
    }

}
