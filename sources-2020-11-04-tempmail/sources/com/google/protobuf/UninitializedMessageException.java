package com.google.protobuf;

public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public UninitializedMessageException(m mVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
