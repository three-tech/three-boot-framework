package com.three.boot.common.exception;

import com.three.boot.common.errorcode.BootErrorCodeMessage;
import lombok.Getter;

/**
 * @author three
 * @since 2020-03-09 18:53
 * <p>
 * 业务异常
 * </p>
 */
@Getter
public class BizException extends RuntimeException {
	private BootErrorCodeMessage codeMessage;
	//用来格式化message
	private String[]             args;


	/**
	 * 只提供一个根据ErrorCodeMessage实例化的方式
	 *
	 * @param codeMessage
	 * @param args
	 * @return
	 */
	public static BizException build(BootErrorCodeMessage codeMessage, String... args) {
		return new BizException(codeMessage, args);
	}

	private BizException(BootErrorCodeMessage codeMessage, String[] args) {
		this.codeMessage = codeMessage;
		this.args = args;
	}
}
