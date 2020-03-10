package com.three.boot.common.errorcode;

import lombok.Getter;

/**
 * @author three
 * @since 2020-03-09 18:49
 * <p>
 *
 * </p>
 */
@Getter
public enum CommonErrorCodeMessage implements BootErrorCodeMessage {
	success("0000", "成功"),

	error("9999", "系统异常，请稍后再试");
	private String code;
	private String message;

	CommonErrorCodeMessage(String code, String message) {
		this.code = code;
		this.message = message;
	}
}
