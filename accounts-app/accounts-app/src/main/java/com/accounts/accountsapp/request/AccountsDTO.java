package com.accounts.accountsapp.request;

public class AccountsDTO {
	
	private long id;
	
	private long clubId;
	
	private long headId;
	
	private long subheadId;
	
	private  String type;
	
	private double amount;
	
	private String  billNo;
	
	private String invoiceNo;
	
	private String remarks;
	
	private String transactionType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getClubId() {
		return clubId;
	}

	public void setClubId(long clubId) {
		this.clubId = clubId;
	}

	public long getHeadId() {
		return headId;
	}

	public void setHeadId(long headId) {
		this.headId = headId;
	}

	public long getSubheadId() {
		return subheadId;
	}

	public void setSubheadId(long subheadId) {
		this.subheadId = subheadId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	

}
