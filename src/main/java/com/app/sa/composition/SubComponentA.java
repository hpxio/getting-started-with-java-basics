/**
 * 
 */
package com.app.sa.composition;

/**
 * 
 */
public class SubComponentA { // Motherboard Class //

    private String name;
    private String vendor;
    private String version;

    public SubComponentA() {
        System.out.println(
                "SubComponentA::Motherboard-Class-Instantiated");
    }

    /**
     * @param name
     * @param vendor
     * @param version
     */
    public SubComponentA(String name, String vendor,
            String version) {
        super();
        this.name = name;
        this.vendor = vendor;
        this.version = version;
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
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     *                    the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "SubComponentA [name=" + name + ", vendor="
                + vendor + ", version=" + version
                + ", getName()=" + getName()
                + ", getVendor()=" + getVendor()
                + ", getVersion()=" + getVersion() + "]";
    }

}
