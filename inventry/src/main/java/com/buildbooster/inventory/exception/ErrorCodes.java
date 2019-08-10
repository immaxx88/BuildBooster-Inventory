package com.buildbooster.inventory.exception;

import java.text.MessageFormat;

import org.springframework.http.HttpStatus;

public enum ErrorCodes implements ErrorCode {
	// Inventory specific response error codes and error response.
	MANDATORY_ELEMENT_MISSING(1, HttpStatus.BAD_REQUEST, "Mandatory element {0} missing in the request"),
	NOT_FOUND(2, HttpStatus.NOT_FOUND, "Element not found in db {0}"),
	FAILD_TO_SAVE(3, HttpStatus.BAD_REQUEST, "Failed to save inventory {0}"),
	ERROR_WHILE_FETCHING(4,HttpStatus.NOT_FOUND,"Records not found")
	;

	/** Begin of the error codes range. */
	public static final int ERROR_CODE_RANGE_BASE = 1000;
	/** End of the error codes range. */
	public static final int ERROR_CODE_RANGE_MAX = 1999;

	/** Error code. */
	private final Integer code;

	/** Error text message. */
	private final String message;

	private final HttpStatus httpCode;

	ErrorCodes(final Integer pCode, final HttpStatus pHttpCode, final String pMessage) {
		code = pCode + ERROR_CODE_RANGE_BASE;
		message = pMessage;
		httpCode = pHttpCode;
	}

	@Override
	public final Integer getCode() {
		return code;
	}

	public final String getMessage() {
		return message;
	}

	@Override
	public final HttpStatus getHttpCode() {
		return httpCode;
	}

	/**
	 * getter for message.
	 *
	 * @param pArguments the arguments
	 * @return the formatted message
	 */

	public final String getFormattedMessage(final Object... pArguments) {
		return MessageFormat.format(this.getMessage(), pArguments);
	}

	/**
	 * Inventory Exception.
	 *
	 * @return the Inventory exception
	 */

	public final InventoryServiceException createInventoryServiceException(final Object... pArguments) {
		return new InventoryServiceException(this, this.getFormattedMessage(pArguments));
	}

	/**
	 * Inventory Exception with variable arguments.
	 *
	 * @param pMessageArguments the message arguments
	 * @return the Inventory exception
	 */
	public final InventoryServiceException createInventoryServiceException(final Throwable pCause,
			final Object... pArguments) {
		return new InventoryServiceException(this, this.getFormattedMessage(pArguments), pCause);
	}

	/**
	 * Inventory Exception.
	 *
	 * @return the Inventory exception
	 */

	public final InventorySystemException createInventorySystemException(final Object... pArguments) {
		return new InventorySystemException(this, this.getFormattedMessage(pArguments));
	}

	/**
	 * Inventory Exception with variable arguments.
	 *
	 * @param pMessageArguments the message arguments
	 * @return the Inventory exception
	 */
	public final InventorySystemException createInventorySystemException(final Throwable pCause,
			final Object... pArguments) {
		return new InventorySystemException(this, this.getFormattedMessage(pArguments), pCause);
	}
}
