package com.three.boot.common.cdm;

import com.three.boot.common.errorcode.BootErrorCodeMessage;
import com.three.boot.common.exception.BizException;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import static com.three.boot.common.errorcode.CommonErrorCodeMessage.success;

/**
 * @author three
 * @since 2020-03-09 18:37
 * <p>
 *
 * </p>
 */
@Data
@ApiModel("基础响应")
public class BootResponse<T> {
	@ApiModelProperty("响应码")
	private String code;
	@ApiModelProperty("响应信息")
	private String message;
	@ApiModelProperty("响应数据")
	private T      data;

	private BootResponse(String code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	private static <T> BootResponse<T> of(T data) {
		return new BootResponse<>(success.getCode(), success.getMessage(), data);
	}

	private static <T> BootResponse<T> of(BizException exception) {
		return new BootResponse<>(exception.getCodeMessage().getCode(),
				String.format(exception.getCodeMessage().getMessage(), (Object) exception.getArgs()), null);
	}

	public static <T> BootResponse<T> of(BootErrorCodeMessage codeMessage) {
		return new BootResponse<>(codeMessage.getCode(), codeMessage.getMessage(), null);
	}

}
