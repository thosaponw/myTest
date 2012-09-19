package com.hiqfood.navajo.planning;

import java.util.Date;

public class ProductionOrder {
	private String	No_Series;
	private String	No_;
	private String	SourceNo_;
	private String	Description;
	private String	LocationCode;
	private Double	Quantity;
	private Date	DueDate;
	private Integer	Status;
	private Boolean	PostConsumption;
	private Boolean	PostOutput;
	private String	Comment;
	
	public String getNo_Series() {
		return No_Series;
	}
	public void setNo_Series(String no_Series) {
		No_Series = no_Series;
	}
	public String getNo_() {
		return No_;
	}
	public void setNo_(String no_) {
		No_ = no_;
	}
	public String getSourceNo_() {
		return SourceNo_;
	}
	public void setSourceNo_(String sourceNo_) {
		SourceNo_ = sourceNo_;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Double getQuantity() {
		return Quantity;
	}
	public void setQuantity(Double quantity) {
		Quantity = quantity;
	}
	public String getLocationCode() {
		return LocationCode;
	}
	public void setLocationCode(String locationCode) {
		LocationCode = locationCode;
	}
	public Date getDueDate() {
		return DueDate;
	}
	public void setDueDate(Date dueDate) {
		DueDate = dueDate;
	}
	public Boolean getPostConsumption() {
		return PostConsumption;
	}
	public void setPostConsumption(Boolean postConsumption) {
		PostConsumption = postConsumption;
	}
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public Boolean getPostOutput() {
		return PostOutput;
	}
	public void setPostOutput(Boolean postOutput) {
		PostOutput = postOutput;
	}
}