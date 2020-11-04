package com.google.protobuf;

import com.google.protobuf.m;

/* compiled from: AbstractParser */
public abstract class b<MessageType extends m> implements p<MessageType> {
    static {
        g.a();
    }

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        InvalidProtocolBufferException a2 = d(messagetype).a();
        a2.h(messagetype);
        throw a2;
    }

    private UninitializedMessageException d(MessageType messagetype) {
        if (messagetype instanceof a) {
            return ((a) messagetype).a();
        }
        return new UninitializedMessageException(messagetype);
    }

    /* renamed from: e */
    public MessageType a(d dVar, g gVar) throws InvalidProtocolBufferException {
        MessageType f2 = f(dVar, gVar);
        c(f2);
        return f2;
    }

    public MessageType f(d dVar, g gVar) throws InvalidProtocolBufferException {
        MessageType messagetype;
        try {
            e s = dVar.s();
            messagetype = (m) b(s, gVar);
            s.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e2) {
            e2.h(messagetype);
            throw e2;
        } catch (InvalidProtocolBufferException e3) {
            throw e3;
        }
    }
}
