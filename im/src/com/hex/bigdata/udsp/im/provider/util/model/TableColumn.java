package com.hex.bigdata.udsp.im.provider.util.model;

public class TableColumn {
	private String colName; // 字段名
	private String dataType; // 类型
	private String colComment; // 注释
	private int length; //varchar长度

	public TableColumn(String colName, String dataType) {
		super();
		this.colName = colName;
		this.dataType = dataType;
	}

	public TableColumn(String colName, String dataType, String colComment) {
		super();
		this.colName = colName;
		this.dataType = dataType;
		this.colComment = colComment;
	}


	public TableColumn(String colName, String dataType, String colComment, int length) {
		super();
		this.colName = colName;
		this.dataType = dataType;
		this.colComment = colComment;
		this.length = length;
	}

	public String getColName() {
		return colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getColComment() {
		return colComment;
	}

	public void setColComment(String colComment) {
		this.colComment = colComment;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
