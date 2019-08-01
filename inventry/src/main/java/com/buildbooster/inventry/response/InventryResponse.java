package com.buildbooster.inventry.response;

import java.io.Serializable;

public class InventryResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private transient Object payload;

	private String message;

	public Object getPayload() {
		return payload;
	}

	public void setPayload(Object payload) {
		this.payload = payload;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
