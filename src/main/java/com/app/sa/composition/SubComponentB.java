/**
 * 
 */
package com.app.sa.composition;

/**
 * 
 */
public class SubComponentB { // Monitor Class //

    private String name;
    private String vendor;

    // To handle resolution //
    private SubComponentBLevel1 insSubComponentBLevel1 = new SubComponentBLevel1();
    /*
     * Using this we are taking composition to nested levels
     * in the following manner: Computer - Has A - Monitor;
     * Monitor - Has A - Resolution
     */

    public SubComponentB() {
        System.out.println(
                "SubComponentB::Monitor-Class-Instantiated");
    }

    /**
     * @param name
     * @param vendor
     * @param insSubComponentBLevel1
     */
    public SubComponentB(String name, String vendor,
            SubComponentBLevel1 insSubComponentBLevel1) {
        super();
        this.name = name;
        this.vendor = vendor;
        this.insSubComponentBLevel1 = insSubComponentBLevel1;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *                 the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the vendor
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * @param vendor
     *                   the vendor to set
     */
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * @return the insSubComponentBLevel1
     */
    public SubComponentBLevel1 getInsSubComponentBLevel1() {
        return insSubComponentBLevel1;
    }

    /**
     * @param insSubComponentBLevel1
     *                                   the
     *                                   insSubComponentBLevel1
     *                                   to set
     */
    public void setInsSubComponentBLevel1(
            SubComponentBLevel1 insSubComponentBLevel1) {
        this.insSubComponentBLevel1 = insSubComponentBLevel1;
    }

}
