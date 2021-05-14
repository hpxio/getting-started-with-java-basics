/*
 * =========================================================
 * ========================== FILE-NAME: AppMenu.java
 * ---------------------------------------------------------
 * -------------------------- FQN-ID:
 * com.app.sa.launch.AppMenu
 * ---------------------------------------------------------
 * -------------------------- DESCRIPTION: Display user
 * options and launch actions for selected menu.
 * ---------------------------------------------------------
 * -------------------------- CHANGELOG: File created and
 * header added.
 * ---------------------------------------------------------
 * -------------------------- Copyright @ 2019, iHSPA
 * =========================================================
 * ==========================
 */
package com.app.xio.console;

import com.app.xio.oop.inheritance.composition.CompositionLaunch;
import com.app.xio.console.conso.ConsoleIO;
import com.app.xio.core.datatypes.DataTypesLaunch;
import com.app.xio.core.datatypes.PrimitiveDataTypes;
import com.app.xio.core.datatypes.ValuePassingLaunch;
import com.app.xio.oop.inheritance.BaseClass;
import com.app.xio.oop.inheritance.SingleLevel;
import com.app.xio.core.javaGenerics.GenericsLaunch;
import com.app.xio.oop.polymorphism.PolymorphismLaunch;
import com.app.xio.oop.stateAndBehavior.AccessorsAndMutators;
import com.app.xio.oop.stateAndBehavior.Constructors;
import com.app.xio.oop.stateAndBehavior.StaticMembers;

public class AppMenu {

	/**
	 * Demonstration of Static Members :: See
	 * com.app.sa.stateAndBehavior.StaticMembers
	 */
	public AppMenu() {
		// Display current counter value //
		StaticMembers.getClassCounter();
		// Increment current counter value //
		StaticMembers.doIncrClassCounter();
	}

	private AppLaunch iAppLaunch;

	/*
	 * =====================================================
	 * ============================== ACCESSORS & MUTATORS
	 * =====================================================
	 * ==============================
	 */
	/**
	 * This type of declaration is very common in the Java
	 * language and generally used to declare and initialize
	 * a Class instance. What this means is, class
	 * definition is a template of how a real world entity
	 * will state or behave in given condition. When an
	 * instance is created we define an entity and name it.
	 * But it does not have any memory until we initialize
	 * it with something, it has no knowledge what and how
	 * entity will be used.
	 */
	private AccessorsAndMutators insAccMutate = new AccessorsAndMutators();

	/*
	 * =====================================================
	 * ============================== CONSTRUCTORS
	 * =====================================================
	 * ==============================
	 */
	// 1 - Default Constructor (Chaining) //
	private Constructors insConstructors0 = new Constructors();
	private Constructors insConstructors1 = new Constructors(
			(byte) 23, 890.00F);
	private Constructors insConstructors2 = new Constructors(
			"JIN", "Current");
	private Constructors insConstructors3 = new Constructors(
			(byte) 21, 400.00F, "BRYAN-FURY", "Savings");

	/*
	 * =====================================================
	 * ============================== INHERITANCE - BASICS
	 * =====================================================
	 * ==============================
	 */
	/**
	 * Demo for Single Level inheritance along with Method
	 * Overriding.
	 */
	private BaseClass insBaseClass = new BaseClass("Square",
			2, 4);
	private SingleLevel insSingleLevel = new SingleLevel();
	// Sample to trigger constructor chaining //
	private SingleLevel insSingleLevelA = new SingleLevel(
			"Circle-2", 4F);

	/*
	 * =====================================================
	 * ============================== USER MENU
	 * =====================================================
	 * ==============================
	 */
	public void showUserMenu() {
		System.out.println("[SELECT]:");
		System.out.println("[00]. EXIT");
		System.out.println(
				"[01]. Primitive Data Types - Byte/Short/Int/Float/Double/Boolean/Char");
		System.out.println(
				"[02]. Derived Data Types - Arrays/Enumerators/");
		System.out.println(
				"[03]. Derived Data Types - Value Passing");
		System.out.println(
				"[09]. Fundamentals of OOPs - Encapsulation - State, Behavior, Accessors & Mutators");
		System.out.println(
				"[11]. Fundamentals of OOPs - Encapsulation - Constructors & "
						+ "Overloading");
		System.out.println(
				"[12]. Fundamentals of OOPs - Polymorphism");
		System.out.println(
				"[13]. Fundamentals of Inheritance - Code Re-usability");
		System.out.println(
				"[14]. Fundamentals of Inheritance - Inheritance & Composition");
		System.out.println(
				"[15]. Java Generics & Collection Framework - First Class");
	}

	/**
	 *
	 */
	public void execUserChoice() {
		int intUserChoice;

		// Display user choices //
		showUserMenu();

		// Get user input choice //
		intUserChoice = ConsoleIO._GET_INPUT_.nextInt();

		do {

			switch (intUserChoice) {
				case 0:
					// Call Ghost GUI //
					break;

				case 1:
					// -----------------------------------------------------------------------------------------
					// //
					// Call Primitive Data Types Class //
					iAppLaunch = new PrimitiveDataTypes();
					iAppLaunch.callClassMethods();
					System.out.println(
							"Press any key to continue...");
					ConsoleIO._GET_INPUT_.nextLine();
					break;

				case 2:
					// -----------------------------------------------------------------------------------------
					// //
					// Call Derived Data Types Class //
					// FIXME: Scanner.Input() method for
					// execUserChoice() fails after returning
					// from this method //
					iAppLaunch = new DataTypesLaunch();
					iAppLaunch.callClassMethods();
					break;

				case 3:
					// -----------------------------------------------------------------------------------------
					// //
					// Value and Reference types - Value passing
					// //
					iAppLaunch = new ValuePassingLaunch();
					iAppLaunch.callClassMethods();
					break;

				case 9:
					// -----------------------------------------------------------------------------------------
					// //
					/*
					 * State & Behavior - Synonym to what is
					 * called as Class. Here the data members
					 * are entity and acc/mut are behavior of
					 * getting or setting the data.
					 */

					// Calling all the mutator to set a value to
					// the data members //
					insAccMutate.setIntId(1);
					insAccMutate.setShLaunchYear((short) 2018);
					insAccMutate.setStrName("Lamborghini");
					insAccMutate.setStrType(
							"Sports Hybrid - Super Car");

					// Now calling all the accessors to get the
					// value from the data members //
					System.out
							.println("Getting the Car Data...");
					System.out
							.println(insAccMutate.getStrName());
					System.out.println(insAccMutate.getIntId());
					System.out.println(
							insAccMutate.getShLaunchYear());
					System.out
							.println(insAccMutate.getStrType());
					break;

				case 11:
					// -----------------------------------------------------------------------------------------
					// //
					// Accounts Example - Simple Deposit &
					// Withdraw Transaction //
					System.out.println(
							insConstructors0.getFltBalance());
					insConstructors0.withdraw(40.00F);
					System.out.println(
							insConstructors0.getAllMembers());

					System.out.println(
							insConstructors1.getFltBalance());
					insConstructors1.withdraw(40.00F);
					System.out.println(
							insConstructors1.getAllMembers());

					System.out.println(
							insConstructors2.getFltBalance());
					insConstructors2.withdraw(40.00F);
					System.out.println(
							insConstructors2.getAllMembers());

					System.out.println(
							insConstructors3.getFltBalance());
					insConstructors3.withdraw(40.00F);
					System.out.println(
							insConstructors3.getAllMembers());

					break;

				case 12:
					// -----------------------------------------------------------------------------------------
					// //
					iAppLaunch = new PolymorphismLaunch();
					iAppLaunch.callClassMethods();
					break;

				case 13:
					// -----------------------------------------------------------------------------------------//
					System.out.println("Base Class - Shape");
					System.out
							.println(insBaseClass.getHeight());
					System.out.println(insBaseClass.getWidht());
					System.out.println(insBaseClass.getArea());
					System.out.println(insBaseClass.getName());
					// Calling method to calculate area of the
					// given shape //
					// System.out.println (
					// insBaseClass.doCalcArea ( ) );
					insBaseClass.printShapeArea();

					System.out.println(
							insSingleLevel.getRadius());
					System.out
							.println(insSingleLevel.getName());
					// Calling method to calculate area of
					// circle //
					// System.out.println (
					// insSingleLevel.doCalcArea ( ) );
					insSingleLevel.printShapeArea();

					System.out.println(
							insSingleLevelA.getRadius());
					System.out.println(
							insSingleLevelA.doCalcArea());

					break;

				case 14:
					// -----------------------------------------------------------------------------------------//
					iAppLaunch = new CompositionLaunch();
					iAppLaunch.callClassMethods();
					break;

				case 15:
					// -----------------------------------------------------------------------------------------//
					iAppLaunch = new GenericsLaunch();
					iAppLaunch.callClassMethods();
					break;

				default:
					// -----------------------------------------------------------------------------------------//
					System.out
							.println("!![ERR]::WRONG INPUT!!");
					break;
			}

			// Display user choices //
			showUserMenu();
		} while ((intUserChoice = ConsoleIO._GET_INPUT_
				.nextInt()) != 0);
	}
}
