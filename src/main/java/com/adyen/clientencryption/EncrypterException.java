package com.adyen.clientencryption;

public class EncrypterException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2699577096011945290L;

	/**
	 * Wrapping exception for all JCE encryption related exceptions
	 * @param message
	 * @param cause
	 */
	public EncrypterException(String message, Throwable cause) {
		super(message, cause);
	}
}
