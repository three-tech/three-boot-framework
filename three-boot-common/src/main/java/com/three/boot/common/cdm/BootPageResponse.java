package com.three.boot.common.cdm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author three
 * @since 2020-03-09 19:42
 * <p>
 * 基础分页响应
 * </p>
 */
@Data
@ApiModel("基础分页响应")
public class BootPageResponse<T> {
	@ApiModelProperty("数据")
	private List<T> content;
	@ApiModelProperty(value = "当前页码", example = "1")
	private int     pageNo;
	@ApiModelProperty(value = "页面大小", example = "10")
	private int     pageSize;
	@ApiModelProperty(value = "总页码数", example = "10")
	private int     totalPage;
	@ApiModelProperty(value = "总记录数", example = "20")
	private long    totalRecord;

}
