package com.oen.rest.ws.restfullws.exeption;

import java.time.LocalDateTime;

public class ErrorDetails {

	private String code;
	private LocalDateTime timestamp;
	private String message;
	private String description;
	
	public ErrorDetails(String code, LocalDateTime timestamp, String message, String description) {
		super();
		this.code = code;
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDescription() {
		return description;
	}
	
	
}
