/**
 * 
 */
package com.app.sa.composition;

/**
 * Composition consists of a "Has A..." relationship as unlike Inheritance which holds
 * "Is A..." relation. Example, in inheritance "Dog is an Animal" or "Sedan is a Car"
 * type hierarchy. Where as in composition, "Dog has vertebral column" or "Car has engine".
 * <div/>
 * Composition is useful when we want to define detailed structure for the components
 * within a class. Hence, inheritance ties different behaviors into one common type and
 * composition define different components belonging to that common type.
 * <div/>
 * Composition here is demonstrated with an example of Computer System which have a monitor,
 * a motherboard and a cabinet. We can into granular details using this but for the
 * sake of brevity we will use only these components.
 */
public class TopHierarchy { // Computer Class //

    // Motherboard components //
    private SubComponentA insMobo = new SubComponentA ( );
    // Monitor components //
    private SubComponentB insMonitor = new SubComponentB ( );
    // Cabinet components //
    private SubComponentC insCabinet = new SubComponentC ( );

    public TopHierarchy ( ) {
        System.out.println ( "TopHierarchy::Computer-Class-Initiated" );
    }

    /**
     * @param subA
     * @param subB
     * @param subC
     */
    public TopHierarchy ( SubComponentA subA, SubComponentB subB, SubComponentC subC ) {
        this.insMobo = subA;
        this.insMonitor = subB;
        this.insCabinet = subC;
    }

    /**
     * @return the insCabinet
     */
    public SubComponentC getInsCabinet ( ) {
        return insCabinet;
    }

    /**
     * @return the insMonitor
     */
    public SubComponentB getInsMonitor ( ) {
        return insMonitor;
    }

    /**
     * @return the insMotherBoard
     */
    public SubComponentA getInsMotherBoard ( ) {
        return insMobo;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString ( ) {
        return "TopHierarchy " + ", getInsCabinet()=" + getInsCabinet ( ) + ", getInsMonitor()=" + getInsMonitor ( )
                + ", getInsMotherBoard()=" + getInsMotherBoard ( ) + "]";
    }

}
