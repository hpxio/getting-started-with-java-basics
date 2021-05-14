/**
 * 
 */
package com.app.xio.core.datatypes;

import com.app.xio.console.AppLaunch;
import com.app.xio.console.ILoadClassMethods;

/**
 * @author COM
 */
public class DataTypesLaunch extends AppLaunch implements ILoadClassMethods {

    private DerivedDataTypes iDerivedDataTypes = new DerivedDataTypes ( );

    /**
     * 
     */
    public DataTypesLaunch ( ) {

    }

    /*
     * (non-Javadoc)
     * @see com.app.sa.launch.AppLaunch#callClassMethods()
     */
    @Override
    public void callClassMethods ( ) {

        // Set array index size as '5' for demonstration //
        iDerivedDataTypes.setIntIndexCtr ( 5 );

        /*
         * Here the atomicity of the operation is breaking. The function is defined in such a way that the creation of
         * element is not possible without calling the display function. This is a bad coding practice and should be
         * replaced with separate methods for creating array and displaying it. But since we are creating the array for
         * the first time here it is OK.
         */
        // iDerivedDataTypes.doDisplayIntegerArrayVals ( iDerivedDataTypes.getArrayItems ( ) );

        /* FIXME: Following methods throws java.util.NoSuchElementException exception */
        // Another way of doing this, the better way would be //
        iDerivedDataTypes.getArrayItems ( );

        /* Alternate Solution : Generate an array with random numbers */
        iDerivedDataTypes.getArrayItems ( 5 );

        iDerivedDataTypes.doDisplayIntegerArrayVals ( iDerivedDataTypes.getIntSomeArray ( ) );

        // Print average of the array values //
        System.out.println ( "Average of Values in Array:: "
                + iDerivedDataTypes.getArrayValueAverage ( iDerivedDataTypes.getIntSomeArray ( ) ) );
    }
}
