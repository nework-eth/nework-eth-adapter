package com.nework.payplatform.admin.constant;

/**
 * DAppStatusEnum
 */
public enum DAppStatusEnum {

	USABLE(1, "USABLE"),DISS_USE( 2, "DISS_USE"), NO_FEE(3, "NO_FEE");

	private int code;
	private String description;

	DAppStatusEnum(int code, String description) {
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
