/*
 * ===================================================================================
 * FILE-NAME: ValuePassingLaunch.java
 * -----------------------------------------------------------------------------------
 * FQN-ID: com.app.sa.datatypes.ValuePassingLaunch
 * -----------------------------------------------------------------------------------
 * DESCRIPTION:
 * -----------------------------------------------------------------------------------
 * CHANGELOG:
 * 1. File created on 20-01-2019, 13:36 for GettingStartedWithJavaBasics.
 * -----------------------------------------------------------------------------------
 * Copyright @ 2019, COM
 * ===================================================================================
 */
package com.app.xio.core.datatypes;

import com.app.xio.console.AppLaunch;
import com.app.xio.console.ILoadClassMethods;
import com.app.xio.console.conso.ConsoleIO;
import com.app.xio.console.conso.Messages;

/**
 * Class description goes here.
 *
 * @author
 */
public class ValuePassingLaunch extends AppLaunch implements ILoadClassMethods {

	private Messages iMessages = new Messages();

	private ValuePassing iValuePassing = new ValuePassing();
	private ResizingArrays iResizingArrays = new ResizingArrays();

	/* Class Constructor */
	public ValuePassingLaunch() {
		System.out.println("[INFO]::ValuePassing-Class-Initialized");
	}

	@Override
	public void callClassMethods() {

		// Value Passing Demonstration //
		// iValuePassing.getValRefDemo ( ); // Un-comment to visit value-passing demonstration code //

		// Array Resizing Demonstration //
		System.out
				.println(iMessages.get_INFO_MSGS_().get("INITVAL") + "index::" + iResizingArrays.getIndex());

		System.out.println(iMessages.get_INFO_MSGS_().get("INITVAL") + "originalArray");
		iResizingArrays.doDisplayArray();

		// Create array - get number of index locations //
		System.out.println(iMessages.get_INFO_MSGS_().get("INP") + "index");
		iResizingArrays.setIndex(ConsoleIO._GET_INPUT_.nextInt());

		// Get array values //
		iResizingArrays.getArrayValues();

		// Display gathered data //
		iResizingArrays.doDisplayArray();

		// Resize array //
		iResizingArrays.resizeArray(2);
	}
}