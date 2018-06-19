package com.nework.payplatform.admin.constant;

/**
 * CashAuditsResultEnum
 */
public enum CashAuditsResultEnum {

	IS_PASS( 1, "IS_PASS"), UN_PASS(2, "UN_PASS");

	private int code;
	private String description;

	CashAuditsResultEnum(int code, String description) {
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
