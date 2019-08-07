package com.buildbooster.inventory.exception;

import org.springframework.http.HttpStatus;

public class InventoryServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	private final int code;

	private final HttpStatus httpCode;

	/**
	 * Instantiates a new CatalogServiceException.
	 *
	 * @param pErrorCode the causing error code
	 *
	 * @param pMessage   the error message
	 */
	public InventoryServiceException(final ErrorCode pErrorCode, final String pMessage) {
		super(pMessage);
		code = pErrorCode.getCode();
		httpCode = pErrorCode.getHttpCode();
	}

	/**
	 * Instantiates a new CatalogServiceException with underlying cause
	 *
	 * @param pErrorCode the causing error code
	 * @param pMessage   the error message
	 * @param pCause     the causing exception; required
	 */
	public InventoryServiceException(final ErrorCode pErrorCode, final String pMessage, final Throwable pCause) {
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
