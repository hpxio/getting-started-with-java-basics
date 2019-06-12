package com.app.sa.stateAndBehavior;

/**
 * Let's discuss the basic difference between class, object, instance &
 * reference in Java. These form the basic building blocks of a java program
 * hence the name of the class.
 */
public class BuildingBlocks {

    /*
     * Consider a construction of a house and you want to guide some one about how
     * the house looks and where it is situated, etc. You may define different aspects of
     * house like its color, number of rooms etc to describe how it actually looks like.
     * So in Java here's how you do it.
     */

    /**
     * Imagine Joe wants to share address of his home for party. So he shares the
     * location so that one can access information(address, color, locality, etc.) of his home.
     * Now there is possibility to reach Joe's home by two routes.
     * In the following line,
     * 
     * <pre>
     *      House JoeHome = new House()
     * </pre>
     * 
     * is address holder to the house which belongs to Joe. Here JoeHome is instance of
     * a class. Similarly,
     * 
     * <pre>
     *      House JoeHomeByAnotherPath = new House()
     * </pre>
     * 
     * is another way to access house address which belongs to Joe.
     */
    public BuildingBlocksReference JoeHome = new BuildingBlocksReference ( );

    // This is a reference variable //
    public BuildingBlocksReference JoeHomeByAnotherPath;

    /**
     * 
     */
    public void someMethod ( ) {
        JoeHomeByAnotherPath = JoeHome;

        JoeHome.setColor ( "Purple" );

        System.out.println ( JoeHomeByAnotherPath.getColor ( ) );
        // Above statement returns "Purple" //
    }

}
