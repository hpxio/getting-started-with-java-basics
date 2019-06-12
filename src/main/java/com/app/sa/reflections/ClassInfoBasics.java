package com.app.sa.reflections;

import java.lang.reflect.Method;

import com.app.sa.launch.AppMenu;

/**
 * 
 */
public class ClassInfoBasics {
    private AppMenu insAppmenu = new AppMenu ( );

    /**
     * 
     */
    public ClassInfoBasics ( ) {

    }

    /**
     * 
     */

    public void getClassMembers ( ) {
        Class< ? > classInfo = insAppmenu.getClass ( );

        System.out.println ( "***[INFO]::Loading Class Information for:" + classInfo.getName ( ) + "::***" );

        for ( Method member : classInfo.getMethods ( ) ) {
            System.out.println ( member.getName ( ) );
        }
    }
}