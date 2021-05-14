package com.app.xio.console;

import com.app.xio.console.conso.ConsoleIO;

/**
 * Hello world!
 */
public class App {

	private static AppMenu insAppMenu = new AppMenu();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Display options for the user and call apt methods //
		insAppMenu.execUserChoice();

		// Close all the IO Buffers if any //
		ConsoleIO._GET_INPUT_.close();
	}
}
