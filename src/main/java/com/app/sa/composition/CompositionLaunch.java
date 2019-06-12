/**
 * 
 */
package com.app.sa.composition;

import com.app.sa.launch.AppLaunch;
import com.app.sa.launch.ILoadClassMethods;

/**
 * @author iHSPA
 */
public class CompositionLaunch extends AppLaunch
        implements ILoadClassMethods {

    // Get all the instances ready to launch when user
    // selects the options //
    private SubComponentA iSubComponentA = new SubComponentA(
            "Zotak", "Zotak Inc.", "1.3.4.22");

    // Another way of instantiating a class having atomic
    // values //
    private SubComponentB iSubComponentB = new SubComponentB(
            "Asus", "Asus Inc.", new SubComponentBLevel1(
                    (byte) 100, (byte) 120, "FHD"));

    // Initializing all the values for the cabinet data //
    private SubComponentC iSubComponentC = new SubComponentC(
            "Cooler Master Pro Z10", "v21,23", (byte) 120,
            (byte) 90, (byte) 110, "Gaming");

    // Create top-level component which is hold all the
    // has-a relations into one
    // type //
    private TopHierarchy insTopHierarchy = new TopHierarchy(
            iSubComponentA, iSubComponentB, iSubComponentC);

    /**
     * Interface to call the respective class methods
     * locally & uniformly.
     */
    @Override
    public void callClassMethods() {
        System.out.println(
                "-----------------------------------------------------------------------");
        System.out.println(
                "PC has been assempled, the configuratoin are as follows::");
        System.out.println(insTopHierarchy);
        System.out.println(
                "-----------------------------------------------------------------------");

        // Accessing PC's Cabinet components //
        System.out.println("::Cabinet::");
        // System.out.println (
        // insTopHierarchy.getInsCabinet ( ).getModel ( ) );
        // System.out.println (
        // insTopHierarchy.getInsCabinet ( ).getName ( ) );
        // Printing all the class members information
        // directly //
        System.out.println(insTopHierarchy.getInsCabinet());
        System.out.println(
                "-----------------------------------------------------------------------");

        System.out.println("::Monitor::");
        // Accessing PC's Monitor components //
        // System.out.println (
        // insTopHierarchy.getInsMonitor ( ).getName ( ) );
        // System.out.println (
        // insTopHierarchy.getInsMonitor ( ).getVendor ( )
        // );
        System.out.println(insTopHierarchy.getInsMonitor());
        // Accessing information for Monitor's Resolution //
        System.out.println(insTopHierarchy.getInsMonitor()
                .getInsSubComponentBLevel1());
        System.out.println(
                "-----------------------------------------------------------------------");

        // Accessing PC's Motherboard components //
        System.out.println("::Motherboard::");
        System.out.println(insTopHierarchy
                .getInsMotherBoard().getName());
        // System.out.println (
        // insTopHierarchy.getInsMotherBoard ( ).getVendor (
        // ) );
        // System.out.println (
        // insTopHierarchy.getInsMotherBoard ( ).getVersion
        // ( ) );
        System.out.println(
                insTopHierarchy.getInsMotherBoard());
        System.out.println(
                "-----------------------------------------------------------------------");
    }
}
