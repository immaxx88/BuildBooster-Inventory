package com.buildbooster.inventory.exception;

import org.springframework.http.HttpStatus;

/**
 * The interface for all the error codes in Catalog Service.
 *
 * @author ctpl
 *
 */
public interface ErrorCode {

	/**
	 * Retruns the unique code indetifying the cause of this error
	 *
	 * @return unique code identifying cause
	 */
	Integer getCode();

	HttpStatus getHttpCode();
}
