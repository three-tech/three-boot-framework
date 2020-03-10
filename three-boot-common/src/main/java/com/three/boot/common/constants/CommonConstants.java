package com.three.boot.common.constants;

import com.three.boot.common.cdm.BootResponse;
import com.three.boot.common.errorcode.CommonErrorCodeMessage;

/**
 * @author three
 * @since 2020-03-09 19:24
 * <p>
 * 常用常量
 * </p>
 */
public interface CommonConstants {
	String SUCCESS = "1";
	String FAILED  = "0";

	BootResponse<?> successResponse = BootResponse.of(CommonErrorCodeMessage.success);
	BootResponse<?> errorResponse   = BootResponse.of(CommonErrorCodeMessage.error);


}
