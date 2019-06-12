/*
 * ===================================================================================
 * FILE-NAME: PolymorphismLaunch.java
 * -----------------------------------------------------------------------------------
 * FQN-ID: com.app.sa.polymorphism.polymorphismLaunch
 * -----------------------------------------------------------------------------------
 * DESCRIPTION:
 * -----------------------------------------------------------------------------------
 * CHANGELOG:
 * 1. File formatted and header added on 20-01-2019, 11:45 for GettingStartedWithJavaBasics.
 * -----------------------------------------------------------------------------------
 * Copyright @ 2019, iHSPA
 * ===================================================================================
 */
package com.app.sa.polymorphism;

import com.app.sa.launch.AppLaunch;
import com.app.sa.launch.ILoadClassMethods;

/**
 * @author COM
 */
public class PolymorphismLaunch extends AppLaunch implements ILoadClassMethods {

    private BaseClassInfo iBaseClassInfo = new BaseClassInfo ( "Car", "Double V-2 Engine", ( short ) 4, ( short ) 2 );

    /**
     *
     */
    public PolymorphismLaunch ( ) {
    }

    /*
     * (non-Javadoc)
     * @see com.app.sa.launch.ILoadClass#callClassMethods()
     */
    @Override
    public void callClassMethods ( ) {

        // First show the contents of base class //
        System.out.println ( iBaseClassInfo );

        // Display the class info as selected by the random picker //
        for ( int i = 0; i <= 3; i++ ) {
            System.out.println ( getClassToDisplay ( ) );

        }
    }

    /**
     * @return
     */
    private BaseClassInfo getClassToDisplay ( ) {
        // Randomly call the derived classes and show members //
        int ctr = ( int ) ( Math.random ( ) * 3 ) + 1;
        System.out.println ( "Random Picker :: " + ctr );

        switch ( ctr ) {
            case 1 :
                return new DerivedClassA ( "S348-Sicarra", "V12'", ( short ) 6, ( short ) 3 );

            case 2 :
                return new DerivedClassB ( "SClass", "V8-NanoTect-Engine", ( short ) 4, ( short ) 4 );

            case 3 :
                return new DerivedClassC ( "M3-GTR", "RDR V12", ( short ) 6, ( short ) 89 );
        }
        return null;
    }

}
