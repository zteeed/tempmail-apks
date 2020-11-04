package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.C0107a;
import com.google.protobuf.m;

/* compiled from: AbstractMessageLite */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0107a<MessageType, BuilderType>> implements m {

    /* renamed from: b  reason: collision with root package name */
    protected int f11554b = 0;

    /* renamed from: com.google.protobuf.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractMessageLite */
    public static abstract class C0107a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0107a<MessageType, BuilderType>> implements m.a {
        protected static UninitializedMessageException g(m mVar) {
            return new UninitializedMessageException(mVar);
        }

        /* access modifiers changed from: protected */
        public abstract BuilderType e(MessageType messagetype);

        /* renamed from: f */
        public BuilderType G(m mVar) {
            if (b().getClass().isInstance(mVar)) {
                return e((a) mVar);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* access modifiers changed from: package-private */
    public UninitializedMessageException a() {
        return new UninitializedMessageException(this);
    }
}
