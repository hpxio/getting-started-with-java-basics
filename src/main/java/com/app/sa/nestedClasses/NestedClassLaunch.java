/**
 * 
 */
package com.app.sa.nestedClasses;

import com.app.sa.launch.AppLaunch;
import com.app.sa.launch.ILoadClassMethods;

/**
 * @author COM
 */
@SuppressWarnings ( "unused" )
public class NestedClassLaunch extends AppLaunch implements ILoadClassMethods {

    private AnonymousNestedClass iAnonymousNestedClass = new AnonymousNestedClass ( );
    private NonStaticNestedClass iNonStaticNestedClass = new NonStaticNestedClass ( );
    private StaticNestedClasses iStaticNestedClasses = new StaticNestedClasses ( );

    /**
     * 
     */
    public NestedClassLaunch ( ) {

    }

    /*
     * (non-Javadoc)
     * @see com.app.sa.launch.AppLaunch#callClassMethods()
     */
    @Override
    public void callClassMethods ( ) {

    }

}
