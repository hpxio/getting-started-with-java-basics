/**
 * 
 */
package com.app.xio.oop.inheritance.composition;

/**
 * 
 *
 */
public class SubComponentCSuper { // Cabinet Base Class //

    private String name;
    private String model;
    private byte height;
    private byte widht;
    private byte length;

    public SubComponentCSuper ( ) {
        System.out.println ( "SubComponentCSuper::Cabinet-Super-Class-Instantiated" );
    }

    /**
     * @param name
     * @param model
     * @param height
     * @param widht
     * @param length
     */
    public SubComponentCSuper ( String name, String model, byte height, byte widht, byte length ) {
        super ( );
        this.name = name;
        this.model = model;
        this.height = height;
        this.widht = widht;
        this.length = length;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString ( ) {
        return "SubComponentCSuper [name=" + name + ", model=" + model + ", height=" + height + ", widht=" + widht
                + ", length=" + length + "]";
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
     * @return the model
     */
    public String getModel ( ) {
        return model;
    }

    /**
     * @param model
     *            the model to set
     */
    public void setModel ( String model ) {
        this.model = model;
    }

    /**
     * @return the height
     */
    public byte getHeight ( ) {
        return height;
    }

    /**
     * @param height
     *            the height to set
     */
    public void setHeight ( byte height ) {
        this.height = height;
    }

    /**
     * @return the widht
     */
    public byte getWidht ( ) {
        return widht;
    }

    /**
     * @param widht
     *            the widht to set
     */
    public void setWidht ( byte widht ) {
        this.widht = widht;
    }

    /**
     * @return the length
     */
    public byte getLength ( ) {
        return length;
    }

    /**
     * @param length
     *            the length to set
     */
    public void setLength ( byte length ) {
        this.length = length;
    }

}
