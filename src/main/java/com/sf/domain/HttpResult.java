package com.sf.domain;

/**
 * 描述：自定义Http请求的响应对象
 * @author 80002888
 * @date   2018年4月23日
 */
public class HttpResult {

	/**
	 * 响应状态码
	 */
	private Integer status;

	/**
	 * 响应内容
	 */
	private String content;

	public HttpResult() {
	}

	public HttpResult(Integer status, String content) {
		this.status = status;
		this.content = content;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "HttpResult [status=" + status + ", content=" + content + "]";
	}

}
