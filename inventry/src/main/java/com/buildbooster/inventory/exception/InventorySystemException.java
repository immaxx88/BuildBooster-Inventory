package com.buildbooster.inventory.exception;

import org.springframework.http.HttpStatus;

public class InventorySystemException extends RuntimeException {

	/** SerialVersionUID. */
	private static final long serialVersionUID = 1448442844137156145L;

	private final int code;

	private final HttpStatus httpCode;

	/**
	 * Instantiates a new CatalogSystemException.
	 *
	 * @param pErrorCode the causing error code
	 * @param pMessage   the error message
	 */
	public InventorySystemException(final ErrorCode pErrorCode, final String pMessage) {
		super(pMessage);
		code = pErrorCode.getCode();
		httpCode = pErrorCode.getHttpCode();
	}

	/**
	 * Instantiates a new CatalogSystemException with underlying cause
	 *
	 * @param pErrorCode the causing error code
	 * @param pMessage   the error message
	 * @param pCause     the causing exception; required
	 */
	public InventorySystemException(final ErrorCode pErrorCode, final String pMessage, final Throwable pCause) {
		super(pMessage, pCause);
		code = pErrorCode.getCode();
		httpCode = pErrorCode.getHttpCode();
	}

	public int getCode() {
		return code;
	}

	public final HttpStatus getHttpCode() {
		return httpCode;
	}

}
