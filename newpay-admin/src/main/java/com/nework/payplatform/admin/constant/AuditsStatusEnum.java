package com.nework.payplatform.admin.constant;

import java.util.ArrayList;
import java.util.List;

/**
 * AuditsStatusEnum
 */
public enum AuditsStatusEnum {

	NO_NEED_AUDIT(1, "NO_NEED_AUDIT"),NEED_AUDIT( 2, "NEED_AUDIT"), AUDIT_SUCCESS(3, "AUDIT_SUCCESS"),AUDIT_FAIL(4, "AUDIT_FAIL");

	private int code;
	private String description;

	AuditsStatusEnum(int code, String description) {
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
