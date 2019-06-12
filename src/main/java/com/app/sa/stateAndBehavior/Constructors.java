package com.app.sa.stateAndBehavior;

/**
 * Let's take this one with an example to Deposit/Withdraw amount from a USer
 * account.
 */
public class Constructors {

    // #region _DATA_MEMBERS_
    private byte bytUserId;
    private float fltBalance;

    private String strUserName;
    private String strAccountType;
    // #endregion _DATA_MEMBERS_

    // #region _CONSTRUCTORS_
    /**
     * Default Constructor - If this is explicitly given then compiler does not
     * create one automatically.
     */
    public Constructors ( ) {
        /*
         * Another way of calling a param constructor from non-param one. Kind a way to
         * init values if none given explicitely. Thi line should be the first line of
         * the constructor
         */
        this ( ( byte ) 1, 500.00F );
        System.out.println ( "Accounts Instance initialized..." );

        /**
         * It is often advaiced that constructor should not call any other
         * accessors/mutators as a coding implementation point of view. It will directly
         * skip any validation of the data, becuase of validation the data might get
         * saved but not certainly. Imagine scenario where wrong input was given and due
         * to validation the field remained blank. Also, when calling constructor we are
         * creating object hence leaving a filed dangling does not seem good coing
         * practice.
         */
    }

    /**
     * Parameterized constructor with initial values only. Notice that not all the
     * members in the class are not initialized.
     * 
     * @param userId
     * @param balance
     */
    public Constructors ( byte userId, float balance ) {

        this.bytUserId = userId;
        this.fltBalance = balance;

    }

    /**
     * Parameterized constructor with only 2 members value taken on runtine and
     * other value as defaults. Notice how the values are initialized by calling a
     * bigger constr. prototype and passing 2 default values alongwith 2 dynamically
     * given values.
     * 
     * @param name
     * @param type
     */
    public Constructors ( String name, String type ) {
        this ( ( byte ) 1, 0.00F, name, type );
    }

    /**
     * Parameterized constructor having all the data members. When implementing
     * constr. for class it is always advisable to create one bigger contr. having
     * all the members and then copy different prototypes using this() format. See
     * above constr. for example.
     * This is a good programming practice as it avoids code-redundancy and improves
     * cohesion. If change occurs it is uniformly reflected in others.
     * 
     * @param userId
     * @param balance
     * @param name
     * @param type
     */
    public Constructors ( byte userId, float balance, String name, String type ) {
        this.bytUserId = userId;
        this.fltBalance = balance;
        this.strAccountType = type;
        this.strUserName = name;
    }
    // #endregion _CONSTRUCTORS_

    // #region _ACCESSORS_AND_MUTATORS_
    /**
     * @return the strAccountType
     */
    public String getStrAccountType ( ) {
        return strAccountType;
    }

    /**
     * @param strAccountType
     *            the strAccountType to set
     */
    public void setStrAccountType ( String strAccountType ) {
        this.strAccountType = strAccountType;
    }

    /**
     * @return the strUserName
     */
    public String getStrUserName ( ) {
        return strUserName;
    }

    /**
     * @param strUserName
     *            the strUserName to set
     */
    public void setStrUserName ( String strUserName ) {
        this.strUserName = strUserName;
    }

    /**
     * @return the bytUserId
     */
    public byte getBytUserId ( ) {
        return bytUserId;
    }

    /**
     * @param bytUserId
     *            the bytUserId to set
     */
    public void setBytUserId ( byte bytUserId ) {
        this.bytUserId = bytUserId;
    }

    /**
     * @return the fltBalance
     */
    public float getFltBalance ( ) {
        return fltBalance;
    }

    /**
     * @param fltBalance
     *            the fltBalance to set
     */
    public void setFltBalance ( float fltBalance ) {
        this.fltBalance = fltBalance;
    }
    // #endregion _ACCESSORS_AND_MUTATORS_

    /**
     * Printy status of all the data members.
     */
    public String getAllMembers ( ) {
        String res = this.getBytUserId ( ) + "," + this.getStrUserName ( ) + "," + this.getStrAccountType ( ) + ","
                + this.getFltBalance ( ) + "\n";
        return res;
    }

    /**
     * Deposit given amount only if the entered amount is greater than $0.00.
     * 
     * @param amount
     */
    public void deposit ( float amount ) {
        if ( amount > 0 ) {
            this.fltBalance += amount;
        }
    }

    /**
     * Withdraw only if the account balance does not go below $0.00. If withdraw
     * successful then return remaining balance.
     * 
     * @param amount
     * @return
     */
    public void withdraw ( float amount ) {
        if ( ( this.fltBalance - amount ) >= 0 ) {
            this.fltBalance -= amount;
            System.out.println ( "Transaction Successful, Account Balance is : " + this.fltBalance );
        } else {
            System.out.println ( "Account Balance Too Low... Transaction Failed!!" );
        }
    }
}