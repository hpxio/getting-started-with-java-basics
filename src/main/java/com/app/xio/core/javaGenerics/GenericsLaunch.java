/**
 * 
 */
package com.app.xio.core.javaGenerics;

import com.app.xio.console.AppLaunch;
import com.app.xio.console.ILoadClassMethods;

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
