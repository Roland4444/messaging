package abstractions;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import Message.abstractions.BinaryMessage;


public class ExchangeView implements BinaryMessage {
	public int waybillId;
	public int weighingId;
    public int waybill;
    public LocalDate dateCreate;
    public LocalTime timeCreate;
    public String comment;
    public BigDecimal brutto;
    public BigDecimal netto;
    public BigDecimal trash;
    public BigDecimal clogging;
    public BigDecimal sum;
    public String metal;
    public BigDecimal tare;
    public String mode;
    public String upload;
    public String complete;
    
    public int getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(int waybillId) {
        this.waybillId = waybillId;
    }

    public int getWeighingId() {
        return weighingId;
    }

    public void setWeighingId(int weighingId) {
        this.weighingId = weighingId;
    }

    public int getWaybill() {
        return waybill;
    }

    public void setWaybill(int waybill) {
        this.waybill = waybill;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

    public LocalTime getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(LocalTime timeCreate) {
        this.timeCreate = timeCreate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BigDecimal getBrutto() {
        return brutto;
    }

    public void setBrutto(BigDecimal brutto) {
        this.brutto = brutto;
    }

    public BigDecimal getNetto() {
        return netto;
    }

    public void setNetto(BigDecimal netto) {
        this.netto = netto;
    }

    public BigDecimal getTrash() {
        return trash;
    }

    public void setTrash(BigDecimal trash) {
        this.trash = trash;
    }

    public BigDecimal getClogging() {
        return clogging;
    }

    public void setClogging(BigDecimal clogging) {
        this.clogging = clogging;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public String isUpload() {
        return upload;
    }

    public void setUpload(String upload) {
        this.upload = upload;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public BigDecimal getTare() {
        return tare;
    }

    public void setTare(BigDecimal tare) {
        this.tare = tare;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }
	
	

}
