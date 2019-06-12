/**
 * 
 */
package com.app.sa.datatypes;

import com.app.sa.launch.AppLaunch;
import com.app.sa.launch.ILoadClassMethods;

/**
 * @author COM
 */
@SuppressWarnings ( "unused" )
public class PrimitiveDataTypes extends AppLaunch implements ILoadClassMethods {

    /*
     * Java-8 Introduced a new way to make long numeric literals readable by using
     * following format
     */
    private int intVeryLongNumber = 2_147_483_647;
    private int intVeryLongNegativeNumber = -2_147_483_648;

    // This is bound to fail becuase 9.0 cannot be auto-casted to an Integer //
    // int intDecimalDemo = 2 + 9.0;

    // However this is totally allowed because 20 is integer type and is occupied
    // lesser memory addreess (2^32) hence auto-casted is possible //
    private double dblDecimalDemo = 20 + 9.0;

    // Again, here casting possible becuase the end integral part of the statement
    // gets converted into a String //
    private String strIntegerPart = "this is the number > " + 23;

    // Above statement is similar to following //
    private String strSomeOtherExperiment = "Here we go again > " + intVeryLongNegativeNumber;

    // Whole-Number family in Java //
    private byte bytSomeByteVar = 100;

    private short shSomeShortVar = 30000;

    private int intSomeIntegerVar = 200000;

    /*
     * ? Important - A long variable is always denote by 'L', it specifies the
     * compile that the value assigned is a Long value and not Integer by default.
     * Helps a lot in scenarios lile making an airthematic expression, parameter
     * passing, referencing, etc.
     */
    private long lngSomeLongVar = 1000000000000L;

    /*
     * Similar naming/assignment convention as the long variable. The F/D notifies
     * the compiler explicitly that the number preceding the letter is a Float or a
     * Double.
     */
    private float fltSomFloatVar = 34F;

    private double dblSOmeDoubleVar = 71D;

    /**
     * Takes in single value or size 16-bits. Allowed values are single charcater,
     * Unicodes & escape charcaters.
     */
    private char chSomeCharVar = '\b';
    // ?: Is this example of a single backspace //

    private boolean boolSomeBooleanVar = true;
    // or false possibly, only//

    /**
     * 
     */
    public void callClassMethods ( ) {
        System.out.println ( "Some Random Very Large Legal Integer Number > " + intVeryLongNumber );
        System.out.println ( "Some String Experiment Went Wrong Herer > " + strIntegerPart );
        System.out.println ( "Some String Experiment Went Wrong Herer > " + strSomeOtherExperiment );

        // Display Memory Occupancy model of the different whole-number datatypes //
        System.out.println ( this.wholeNumberDataTypes ( ) );

        // Display Memory Occupancy model of the different decimal-number datatypes //
        System.out.println ( this.decimalNumberDataTypes ( ) );
    }

    /**
     * @return
     */
    private String decimalNumberDataTypes ( ) {
        String res = "";
        String strMinMax = "***[INFO]::MIN-MAX VALUES ALLOWED IN DATA TYPES::[INFO]***" + '\n';
        strMinMax = strMinMax + "Float > MIN::" + Float.MIN_VALUE + " > MAX::" + Float.MAX_VALUE + '\n';
        strMinMax = strMinMax + "Double > MIN::" + Double.MIN_VALUE + " > MAX::" + Double.MAX_VALUE + '\n';
        // -----------------------------------------------------------------------------------//
        String strBitByteValues = "***[INFO]::BIT/BYTE VALUES OCCUPIED IN DATA TYPES::[INFO]***" + '\n';
        strBitByteValues = strBitByteValues + "Float::32-Bits, 4-Bytes" + '\n';
        strBitByteValues = strBitByteValues + "Double::64-Bits, 8-Bytes" + '\n';
        res = strBitByteValues + "\r\n" + strMinMax;
        return res;
    }

    /**
     * Display highest & lowest values a data type variable can store. Also display
     * equivalent Bit/Byte memory occupancy per data-type.
     * @return, String containing Data Type occupancy details
     */
    private String wholeNumberDataTypes ( ) {
        String res = "";
        String strMinMax = "***[INFO]::MIN-MAX VALUES ALLOWED IN DATA TYPES::[INFO]***" + '\n';
        strMinMax = strMinMax + "Byte > MIN::" + Byte.MIN_VALUE + " > MAX::" + Byte.MAX_VALUE + '\n';
        strMinMax = strMinMax + "Short > MIN::" + Short.MIN_VALUE + " > MAX::" + Short.MAX_VALUE + '\n';
        strMinMax = strMinMax + "Integer > MIN::" + Integer.MIN_VALUE + " > MAX::" + Integer.MAX_VALUE + '\n';
        strMinMax = strMinMax + "Long > MIN::" + Long.MIN_VALUE + " > MAX::" + Long.MAX_VALUE + '\n';
        // -----------------------------------------------------------------------------------//
        String strBitByteValues = "***[INFO]::BIT/BYTE VALUES OCCUPIED IN DATA TYPES::[INFO]***" + '\n';
        strBitByteValues = strBitByteValues + "Byte::8-Bits, 1-Byte" + '\n';
        strBitByteValues = strBitByteValues + "Short::16-Bits, 2-Bytes" + '\n';
        strBitByteValues = strBitByteValues + "Byte::32-Bits, 4-Bytes" + '\n';
        strBitByteValues = strBitByteValues + "Byte::64-Bits, 8-Bytes" + '\n';
        res = strBitByteValues + "\r\n" + strMinMax;
        return res;
    }
}
