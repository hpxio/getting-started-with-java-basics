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

/**
 * Inheritance, as in real world, is the ability to assess the property of ancestor.
 * Hence, ability to use the state and behavior from base class in derived class is
 * inheritance or code re-usability. This has a lot of benefits:
 * <ol>
 * <li>Avoids re-implementing same code multiple times</li>
 * <li></li>
 * <li></li>
 * <li></li>
 * <li></li>
 * </ol>
 * <div/>
 * We will discuss a lot of important concepts related to Code Re-usability via
 * Inheritance like overriding, access modifier, implementations and different
 * types of inheritance.
 */
public class BaseClass { // Example of Shapes class //

    public String name;

    private float height;

    private float width;

    private float area;

    /*
     * ===================================================================================
     * CODING-GUIDELINES
     * ===================================================================================
     * Wrong implementation of using a Constructor. Because code is redundant and there
     * is high risk of error if requirements changes later. It should be resolved with
     * constructor-chaining which is explained in the derived class sample - SingleLevel
     * ===================================================================================
     */

    /**
     * 
     */
    public BaseClass ( ) {
        this.name = "Shape-1";
        this.height = 0F;
        this.width = 0F;
    }

    /**
     * @param name
     */
    public BaseClass ( String name ) {
        this.name = name;
        this.height = 0F;
        this.width = 0F;
    }

    /**
     * @param name
     * @param height
     * @param width
     */
    public BaseClass ( String name, float height, float width ) {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    /**
     * @return the name
     */
    public String getName ( ) {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName ( String name ) {
        this.name = name;
    }

    /**
     * @return the height
     */
    public float getHeight ( ) {
        return height;
    }

    /**
     * @param height
     *            the height to set
     */
    public void setHeight ( float height ) {
        this.height = height;
    }

    /**
     * @return the widht
     */
    public float getWidht ( ) {
        return width;
    }

    /**
     * @param widht
     *            the widht to set
     */
    public void setWidht ( float widht ) {
        this.width = widht;
    }

    /**
     * @return the area
     */
    public float getArea ( ) {
        return area;
    }

    /**
     * @param area
     *            the area to set
     */
    public void setArea ( float area ) {
        this.area = area;
    }

    /**
     * @return
     */
    public float doCalcArea ( ) {
        System.out.println ( "BaseClass::Calculate-Area-Called" );
        return ( this.area = ( float ) ( this.height * this.width ) );
    }

    public void printShapeArea ( ) {
        System.out.println ( doCalcArea ( ) );
    }
}