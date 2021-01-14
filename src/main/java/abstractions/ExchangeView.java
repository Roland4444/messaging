package abstractions;

import Message.abstractions.BinaryMessage;

public class ExchangeView implements BinaryMessage {
    public int waybillId;
    public int weighingId;
    public int waybill;
    public String dateCreate;
    public String timeCreate;
    public String comment;
    public String brutto;
    public String netto;
    public String trash;
    public String clogging;
    public String sum;
    public String metal;
    public String tare;
    public String mode;
    public String upload;
    public String complete;
}
