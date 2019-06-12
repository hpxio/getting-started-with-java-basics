/**
 * 
 */
package com.app.sa.javaGenerics;

import com.app.sa.launch.AppLaunch;
import com.app.sa.launch.ILoadClassMethods;

/**
 * @author COM
 */
public class GenericsLaunch extends AppLaunch implements ILoadClassMethods {

    private GenericArraylistDemo iGenericArraylistDemo = new GenericArraylistDemo ( );

    /**
     * 
     */
    public GenericsLaunch ( ) {

    }

    /*
     * (non-Javadoc)
     * @see com.app.sa.launch.AppLaunch#callClassMethods()
     */
    @Override
    public void callClassMethods ( ) {
        // Call the demo method //
        iGenericArraylistDemo.doStartDemo ( );
    }
}
