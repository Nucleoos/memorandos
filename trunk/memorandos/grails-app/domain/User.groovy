



/**
 * User domain class.
 */
class User {
	static transients = ['pass']
	static hasMany = [authorities: Role]
	static belongsTo = Role

	/** Username */
	String username

	/** User Real Name*/
	String userRealName

	/** MD5 Password */
	String passwd

	String email

	boolean emailShow

	/** description */
	String description = ''

	/** plain password to create a MD5 password */
	String pass = '[secret]'

        /** enabled */
	boolean enabled

        //def messageListSent = [mensagensSent: Message]
        //def messageReceived = [mensagensReceived: Message]

	static constraints = {
		username(blank: false, unique: true)
		userRealName(blank: false)
		passwd(blank: false)
		enabled()
	}
}
