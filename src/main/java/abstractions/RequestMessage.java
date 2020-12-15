package abstractions;

import Message.abstractions.BinaryMessage;

import java.util.Date;

public class RequestMessage implements BinaryMessage {
    public String ID;
    public String JSONed;
    public String Description;
    public Date TimeStamp;
    public String addressToReply;
    public enum Type{request, update, ask, responce};
    public Type type;
    public RequestMessage(String ID, String Description, String restoredinJSON ){
        this.JSONed = restoredinJSON;
        this.Description = Description;
        this.TimeStamp = new Date();
        this.ID = ID;

    };
    public static void printIT(RequestMessage req){
        System.out.println(req.ID);
        System.out.println(req.Description);
        System.out.println(req.TimeStamp);
    }
}
