package com.nework.payplatform.admin.constant;

/**
 * DAccountStatusEnum
 */
public enum DAccountStatusEnum {

	USABLE(1, "USABLE"),DISS_USE( 2, "DISS_USE");

	private int code;
	private String description;

	DAccountStatusEnum(int code, String description) {
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
