package com.three.boot.common.errorcode;

import com.three.boot.common.exception.BizException;

/**
 * @author three
 * @since 2020-03-09 18:48
 * <p>
 * 基础错误码
 * </p>
 */
public interface BootErrorCodeMessage {
	String getCode();

	String getMessage();

	default BizException throwException(String... args) {
		throw BizException.build(this, args);
	}

}
