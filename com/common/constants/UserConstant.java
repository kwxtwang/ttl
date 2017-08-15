package com.common.constants;

public enum UserConstant{
	MEMBER(0, "��ͨ�û�"), 
	ADMIN(1, "����Ա");
	private final int key;
	private final String desc;
	UserType(final int key, final String desc) {
		this.key = key;
		this.desc = desc;
	}
	public int getKey() {
		return this.key;
	}
	public String getDesc() {
		return this.desc;
	}
}