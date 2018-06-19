package com.nework.payplatform.admin.constant;

/**
 * CoinTypeEnum
 */
public enum CoinTypeEnum {

	ETH(1, "ETH"),NKC( 2, "NKC");

	private int code;
	private String description;

	CoinTypeEnum(int code, String description) {
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
