package com.common.constants;

public enum ErpConstant {
	FAILED(0,"ʧ��"),
	SUCCESS(1,"�ɹ�"),
	INVALID_LENGTH(10001,"�Ƿ�����"),
	EMPTY_USERNAME(10101, "�û�������Ϊ��"),
    EMPTY_PASSWORD(10102, "���벻��Ϊ��"),
    INVALID_USERNAME(10103, "�˺Ų�����"),
    INVALID_PASSWORD(10104, "�������"),
    INVALID_ACCOUNT(10105, "�˺ű�����");
	public int code;
	public String message;
	private ErpConstant(int code, String message) {
		this.code = code;
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}	
}