package exception08c;
/*
 bron: http://docs.oracle.com/javase/7/docs/technotes/guides/language/catch-multiple.html
 */

public class Main {
	static class FirstException extends Exception {
		private static final long serialVersionUID = 1L;
	}

	static class SecondException extends Exception {
		private static final long serialVersionUID = 1L;
	}

	// public void rethrowException(String exceptionName) throws Exception {
	public static void rethrowException(String exceptionName)
			throws FirstException, SecondException { // voor java 7: compileerfout
		// The Java SE 7 compiler can determine that the exception thrown by the statement throw e 
		// must have come from the try block, 
		// and the only exceptions thrown by the try block can be FirstException and SecondException. 
		// Even though the exception parameter of the catch clause, e, is type Exception, 
		// the compiler can determine that it is an instance of either FirstException or SecondException		
		try {
			if (exceptionName.equals("First")) {
				throw new FirstException();
			} else {
				throw new SecondException();
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			rethrowException("First");
		} catch (FirstException | SecondException e) {
			e.printStackTrace();

		}
	}
}
