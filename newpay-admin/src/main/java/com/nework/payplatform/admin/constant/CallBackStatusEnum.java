package com.nework.payplatform.admin.constant;

/**
 * CallBackStatusEnum
 */
public enum CallBackStatusEnum {

	NO_TRADE_DONE(0, "NO_TRADE_DONE"),WAIT(1, "WAIT"),OK( 2, "OK"), FAIL(3, "FAIL"), COLE_AUDIT_SUCCESS(4, "COLE_AUDIT_SUCCESS");

	private int code;
	private String description;

	CallBackStatusEnum(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
}
