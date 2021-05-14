/*
 * ===================================================================================
 * FILE-NAME:
 * FQN ID: com.app.sa.
 * DESCRIPTION:
 * ----------------------------------------------------------------------
 * Date | Version | Editor | Remarks
 * ----------------------------------------------------------------------
 * ----------------------------------------------------------------------
 * Copyright @ 2019, Harsh Shekhar Poddar
 * ===================================================================================
 */
package com.app.xio.oop.inheritance;

import com.app.xio.oop.stateAndBehavior.StaticMembers;

/**
 * 
 */
public class SingleLevel extends BaseClass { // Example of Circle class //

    private float pi = 3.14F;

    private float radius;

    private float diameter;

    /*
     * ===================================================================================
     * CODING-GUIDELINES
     * ===================================================================================
     * Proper way of chaining constructors to initialize values.
     * Same can be done in the Base Class with the help of super() method.
     * -------------------------------
     * Rules of constructor chaining :
     * -------------------------------
     * The this() expression should always be the first line of the constructor.
     * There should be at-least be one constructor without the this() keyword
     * (constructor 3 in above example).
     * ===================================================================================
     */

    /**
     * Constructor call with chaining example.
     * EDIT: Added Static member usage demonstration
     */
    public SingleLevel ( ) {
        this ( 0 );
        // Display current counter value //
        StaticMembers.getClassCounter ( );
        // Increment current counter value //
        StaticMembers.doIncrClassCounter ( );
    }

    /**
     * @param radius
     */
    public SingleLevel ( float radius ) {
        /*
         * If constructor chaining is used, make sure below call "this()" is the
         * first statement of the constructor
         */
        this ( "Circle-1", 0 );
    }

    /**
     * @param name
     * @param radius
     */
    public SingleLevel ( String name, float radius ) {
        // Example of cross-class constructor chaining //
        super ( name );
        this.radius = radius;
    }

    /**
     * @return the pi
     */
    public float getPi ( ) {
        return pi;
    }

    /**
     * @param pi
     *            the pi to set
     */
    public void setPi ( float pi ) {
        this.pi = pi;
    }

    /**
     * @return the radius
     */
    public float getRadius ( ) {
        return radius;
    }

    /**
     * @param radius
     *            the radius to set
     */
    public void setRadius ( float radius ) {
        this.radius = radius;
    }

    /**
     * @return the diameter
     */
    public float getDiameter ( ) {
        return diameter;
    }

    /**
     * @param diameter
     *            the diameter to set
     */
    public void setDiameter ( float diameter ) {
        this.diameter = diameter;
    }

    /**
     * 
     */
    public float doCalcArea ( ) {
        System.out.println ( "SingleLevel::Calculate-Area-Called" );
        this.setArea ( pi * this.radius * this.radius );
        return this.getArea ( );
    }

    public void printShapeArea ( ) {
        System.out.println ( doCalcArea ( ) );
    }

}