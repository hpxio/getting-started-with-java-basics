/**
 * 
 */
package com.app.sa.composition;

/**
 * 
 *
 */
public class SubComponentBLevel1 { // Monitor's Resolution
                                   // Class //

    private byte height;
    private byte widht;
    private String resolution;

    public SubComponentBLevel1() {
        System.out.println(
                "SubComponentBLevel1::Monitor-Resolution-Class-Instantiated");
    }

    /**
     * @param height
     * @param widht
     * @param resolution
     */
    public SubComponentBLevel1(byte height, byte widht,
            String resolution) {
        super();
        this.height = height;
        this.widht = widht;
        this.resolution = resolution;
    }

    /**
     * @return the height
     */
    public byte getHeight() {
        return height;
    }

    /**
     * @param height
     *                   the height to set
     */
    public void setHeight(byte height) {
        this.height = height;
    }

    /**
     * @return the widht
     */
    public byte getWidht() {
        return widht;
    }

    /**
     * @param widht
     *                  the widht to set
     */
    public void setWidht(byte widht) {
        this.widht = widht;
    }

    /**
     * @return the resolution
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * @param resolution
     *                       the resolution to set
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "SubComponentBLevel1 [height=" + height
                + ", widht=" + widht + ", resolution="
                + resolution + ", getHeight()="
                + getHeight() + ", getWidht()=" + getWidht()
                + ", getResolution()=" + getResolution()
                + "]";
    }

}
