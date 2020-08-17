package basicprojectcrud.exception;

public class StudentNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3148183372399599555L;

	public StudentNotFoundException(String string) {
		super(string);
	}
}
