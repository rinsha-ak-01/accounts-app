package com.accounts.accountsapp.request;

import javax.validation.constraints.NotNull;

public class HeadDTO {

	private long id;

	@NotNull(message = "Headname can't be empty")
	private String headName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHeadName() {
		return headName;
	}

	public void setHeadName(String headName) {
		this.headName = headName;
	}

}
