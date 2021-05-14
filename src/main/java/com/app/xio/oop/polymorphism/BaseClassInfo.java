/**
 *
 */
package com.app.xio.oop.polymorphism;

/**
 * @author COM
 */
public class BaseClassInfo { // Using class analogy for the demonstration //

	// Name of the car //
	private String name;
	// Type of engine used in car //
	private String engine;
	// Number of cylinders in engine //
	private short cylinders;
	// Number of Gates //
	private short gates;

	/**
	 *
	 */
	public BaseClassInfo() {
		System.out.println("BaseClassInfo::Initilaized");
	}

	/**
	 * @param name
	 * @param engine
	 * @param cylinders
	 */
	public BaseClassInfo(String name, String engine, short cylinders, short gates) {
		super();
		this.name = name;
		this.engine = engine;
		this.cylinders = cylinders;

		// Demonstration of power of encapsulation of field so that proper validation can be done //
		if ((gates % 2 != 0) || gates > 6) {
			System.out.println("Number of gates cannot be odd or greater than 6 in any Car!!");
			this.gates = 2;
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the engine
	 */
	public String getEngine() {
		return engine;
	}

	/**
	 * @param engine
	 *            the engine to set
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}

	/**
	 * @return the cylinders
	 */
	public short getCylinders() {
		return cylinders;
	}

	/**
	 * @param cylinders
	 *            the cylinders to set
	 */
	public void setCylinders(short cylinders) {
		this.cylinders = cylinders;
	}

	/**
	 * @return the gates
	 */
	public short getGates() {
		return gates;
	}

	/**
	 * @param gates
	 *            the gates to set
	 */
	public void setGates(short gates) {
		// Demonstration of power of encapsulation of field so that proper validation can be done //
		if ((gates / 2 != 0) || gates > 6) {
			System.out.println("Number of gates cannot be odd or greater than 6 in any Car!!");
			this.gates = 2;
		}
	}

	/**
	 * @return
	 */
	public String doStartEngine() {
		return "Car engine started!!";
	}

	/**
	 * @return
	 */
	public String doAccelarate() {
		return "Car Accelaration Started !!";
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaseClassInfo [name=" + name + ", engine=" + engine + ", cylinders=" + cylinders + ", gates=" + gates
				+ "]";
	}

}
