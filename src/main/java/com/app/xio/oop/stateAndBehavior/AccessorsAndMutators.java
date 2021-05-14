package com.app.xio.oop.stateAndBehavior;

/**
 * Accessors - Getter & Mutators - Setter are ways of encapsulating and securely
 * accessing private fields of the class. As per the Java language
 * specifications a member of the class should always be private otherwise
 * stated and should be accessed by only its public accessor and mutators.
 * Let'ssee this example by using a template for Car description.
 */
public class AccessorsAndMutators {

	// #region _CLASS_CONSTRUCTOR_
	public AccessorsAndMutators() {
		System.out.println("***[INFO]::CLASS ACCESSORS & MUTATTORS LOADED::[INFO]***");
	}
	// #endregion _CLASS_CONSTRUCTOR_

	// #region _CLASS_DATA_MEMBERS_STATE_//
	// All the privat fields defined here //
	private int intId;
	private short shLaunchYear;
	private String strName;
	private String strType;
	// #endregion _CLASS_DATA_MEMBERS_STATE_//

	// #region _CLASS_MEMBERS_METHOD_BEHAVIOR_//
	// List of all the accessors and mutators //

	/**
	 * These getter & setters support two amjor functionality, first it allows to
	 * access the members safely and securely by encapsulating the definition.
	 * Another, it allows validation.
	 *
	 * @return the intId
	 */
	public int getIntId() {
		return intId;
	}

	/**
	 * Validation of input is very important in real world scenario as an end-user
	 * can input any sort of invalid responses. It should be our responsibility to
	 * handle the correct input.
	 *
	 * @param intId the intId to set
	 */
	public void setIntId(int intId) {
		if (intId < 23 || intId > 8892822) {
			System.out.println("!![ERR]::VALUE INPUT INVALID::[ERR]!!");
		} else
			this.intId = intId;
	}

	/**
	 * @return the shLaunchYear
	 */
	public short getShLaunchYear() {
		return shLaunchYear;
	}

	/**
	 * @param shLaunchYear the shLaunchYear to set
	 */
	public void setShLaunchYear(short shLaunchYear) {
		this.shLaunchYear = shLaunchYear;
	}

	/**
	 * @return the strName
	 */
	public String getStrName() {
		return strName;
	}

	/**
	 * @param strName the strName to set
	 */
	public void setStrName(String strName) {
		this.strName = strName;
	}

	/**
	 * @return the strType
	 */
	public String getStrType() {
		return strType;
	}

	/**
	 * @param strType the strType to set
	 */
	public void setStrType(String strType) {
		this.strType = strType;
	}
	// #endregion _CLASS_MEMBERS_METHOD_BEHAVIOR_//

}