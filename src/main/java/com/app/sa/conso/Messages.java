/*
 * ===================================================================================
 * FILE-NAME: Messages.java
 * -----------------------------------------------------------------------------------
 * FQN-ID: com.app.sa.conso.Messages
 * -----------------------------------------------------------------------------------
 * DESCRIPTION:
 * -----------------------------------------------------------------------------------
 * CHANGELOG:
 * 1. File created on 20-01-2019, 14:59 for GettingStartedWithJavaBasics.
 * -----------------------------------------------------------------------------------
 * Copyright @ 2019, COM
 * ===================================================================================
 */
package com.app.sa.conso;

import java.util.HashMap;

/**
 * Class description goes here.
 *
 * @author
 */
public class Messages {

    /* Class Constructor */
    public Messages ( ) {
        addErrorMessages ( );
        addInfoMessages ( );
    }

    /**
     * TODO: Needed when using LOG4J
     *
     * @param logFilePath
     */
    public Messages ( String logFilePath ) {
        this ( );
        this.logFilePath = logFilePath;
    }

    /**
     *
     */
    private String logFilePath = null;

    /**
     *
     */
    private HashMap<String, String> _ERROR_MSGS_ = new HashMap<> ( );

    /**
     *
     */
    private HashMap<String, String> _INFO_MSGS_ = new HashMap<> ( );

    /**
     *
     */
    private HashMap<String, String> _WARN_MSGS_ = new HashMap<> ( );

    /*
     * -----------------------------------------------------------------------------------
     * ERROR MESSAGES
     * -----------------------------------------------------------------------------------
     */
    private String _ERR_WRONG_INPUT_ERROR_ = "!![ERROR]::WRONG USER INPUT!!";
    private String _ERR_WRONG_FORMAT_ERROR_ = "!![ERROR]::WRONG INPUT FORMAT!!";
    private String _ERR_WRONG_OPTION_ERROR_ = "!![ERROR]::WRONG INPUT OPTION!!";
    private String _ERR_UNEXPECTED_INPUT_VALUE_ERROR_ = "!![ERROR]::UNEXPECTED TYPE OF VALUE!!";
    private String _ERR_INPUT_NULL_ERROR_ = "!![ERROR]::INPUT VALUE IS NULL!!";

    private String _ERR_INPUT_SMALLER_ERROR_ = "!![ERROR]::INPUT VALUE IS SMALLER THAN::";
    private String _ERR_INPUT_GREATER_ERROR_ = "!![ERROR]::INPUT VALUE IS GREATER THAN::";
    private String _ERR_INPUT_EQUAL_ERROR_ = "!![ERROR]::INPUT VALUE IS EQUAL TO::";

    /*
     * -----------------------------------------------------------------------------------
     * WARNING MESSAGES
     * -----------------------------------------------------------------------------------
     */


    /*
     * -----------------------------------------------------------------------------------
     * INFO MESSAGES
     * -----------------------------------------------------------------------------------
     */
    private String _INFO_ENTER_VALUES_FOR_ = "**[INFO]::ENTER VALUES FOR::";
    private String _INFO_INITIAL_DATA_VALUE_ = "**[INFO]::INITIAL DATA VALUE::";
    private String _INFO_AFTER_CHANGING_VALUE_ = "**[INFO]::AFTER CHANGING VALUE FOR::";
    private String _INFO_TOTAL_ELEMENTS_IN_ = "**[INFO]::TOTAL ELEMENTS IN::";



    /**
     * @return
     */
    public HashMap<String, String> get_ERROR_MSGS_ ( ) {
        return _ERROR_MSGS_;
    }

    /**
     * @param _ERROR_MSGS_
     */
    public void set_ERROR_MSGS_ ( HashMap<String, String> _ERROR_MSGS_ ) {
        this._ERROR_MSGS_ = _ERROR_MSGS_;
    }

    /**
     * @return
     */
    public String getLogFilePath ( ) {
        return logFilePath;
    }

    /**
     * @param logFilePath
     */
    public void setLogFilePath ( String logFilePath ) {
        this.logFilePath = logFilePath;
    }

    /**
     * @return
     */
    public HashMap<String, String> get_INFO_MSGS_ ( ) {
        return _INFO_MSGS_;
    }

    /**
     * @param _INFO_MSGS_
     */
    public void set_INFO_MSGS_ ( HashMap<String, String> _INFO_MSGS_ ) {
        this._INFO_MSGS_ = _INFO_MSGS_;
    }

    /**
     * @return
     */
    public HashMap<String, String> get_WARN_MSGS_ ( ) {
        return _WARN_MSGS_;
    }

    /**
     * @param _WARN_MSGS_
     */
    public void set_WARN_MSGS_ ( HashMap<String, String> _WARN_MSGS_ ) {
        this._WARN_MSGS_ = _WARN_MSGS_;
    }

    /**
     *
     */
    private void addErrorMessages ( ) {
        _ERROR_MSGS_.put ( "INP", _ERR_WRONG_INPUT_ERROR_ );
        _ERROR_MSGS_.put ( "FRM", _ERR_WRONG_FORMAT_ERROR_ );
        _ERROR_MSGS_.put ( "OPT", _ERR_WRONG_OPTION_ERROR_ );
        _ERROR_MSGS_.put ( "UNEXINP", _ERR_UNEXPECTED_INPUT_VALUE_ERROR_ );
        _ERROR_MSGS_.put ( "EQINP", _ERR_INPUT_EQUAL_ERROR_ );
        _ERROR_MSGS_.put ( "GTINP", _ERR_INPUT_GREATER_ERROR_ );
        _ERROR_MSGS_.put ( "STINP", _ERR_INPUT_SMALLER_ERROR_ );
        _ERROR_MSGS_.put ( "NULLINP", _ERR_INPUT_NULL_ERROR_ );

    }

    /**
     *
     */
    private void addInfoMessages ( ) {
        _INFO_MSGS_.put ( "INP", _INFO_ENTER_VALUES_FOR_ );
        _INFO_MSGS_.put ( "INITVAL", _INFO_INITIAL_DATA_VALUE_ );
        _INFO_MSGS_.put ( "AFTER", _INFO_AFTER_CHANGING_VALUE_ );
        _INFO_MSGS_.put ( "TOTAL", _INFO_TOTAL_ELEMENTS_IN_ );
    }

    /**
     * @param param
     *         Name of the parameter to format message for.
     * @param type
     *         1 = WARNING | 2 = INFO | 0 = ERROR
     * @param seed
     *         String message identifier to be used for creating a formatted message (ERROR|INFO|WARNING)
     *
     * @return Constructed message for the given parameter
     */
    public String formatMessage ( String param, int type, String seed ) {
        String msg = null;

        // Check if param is a valid value //
        if ( param == null || param.equalsIgnoreCase ( "" ) ) {
            return "UN-FORMATTED-ERROR::" + param;
        }

        // Check if seed is a valid value //
        if ( seed == null || seed.equalsIgnoreCase ( "" ) ) {
            return "UN-FORMATTED-ERROR::" + seed;
        }

        if ( type == 0 ) { // ERROR MAP //
            msg = get_ERROR_MSGS_ ( ).get ( seed ) + param + "::[ERROR]!!";
        } else if ( type == 1 ) { // WARNING //
            msg = get_WARN_MSGS_ ( ).get ( seed ) + param + "::[WARN]^^";
        } else if ( type == 2 ) { // INFO //
            msg = get_INFO_MSGS_ ( ).get ( seed ) + param + "::[INFO]**";
        } else
            msg = "UN-FORMATTED-ERROR::" + param;

        return msg;
    }
}
