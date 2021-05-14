/**
 * 
 */
package com.app.xio.oop.stateAndBehavior;

/*
 * Class is a blueprint of an object. So let's say our friend Joe bought a house
 * of certain type. So how the house looks, what all are the features in the
 * house, what are the facilities in the house are its state and behavior. In
 * Java terms looks, feature, etc are its state and facilities are its behavior.
 */
@SuppressWarnings ( "unused" )
public class BuildingBlocksReference {
    /**
     * Data members are the states of the house as stated above.
     */
    private String owner;

    public String getOwner ( ) {
        return owner;
    }

    public void setOwner ( String owner ) {
        this.owner = owner;
    }

    public String getType ( ) {
        return type;
    }

    public void setType ( String type ) {
        this.type = type;
    }

    public String getColor ( ) {
        return color;
    }

    public void setColor ( String color ) {
        this.color = color;
    }

    private String type;
    private String color;

    /**
     * 
     */
    public BuildingBlocksReference ( ) {

        this.owner = "Joe";
        this.type = "Mansion";
        this.color = "Blue";
    }

    /**
     * Member methods are the facilities this house can have/support.
     * Some facilities are just private to the house owner, example locker access,
     * bathroom facilities, kitchen accessories, etc. Similarly Java provides the
     * access modifier to mark facilities (methods) with appropriate visibility.
     */
    private void lockerRoomAccess ( ) {

    }

    // Protected are accessible in the same class and the classes of the same package //
    protected void kitchenAccessories ( ) {

    }

    public void livingRoomArea ( ) {

    }

}