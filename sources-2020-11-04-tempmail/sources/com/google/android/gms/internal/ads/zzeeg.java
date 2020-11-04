package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeeg;
import com.google.android.gms.internal.ads.zzeeh;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzeeg<MessageType extends zzeeh<MessageType, BuilderType>, BuilderType extends zzeeg<MessageType, BuilderType>> implements zzeho {
    /* access modifiers changed from: protected */
    public abstract BuilderType j(MessageType messagetype);

    /* renamed from: k */
    public abstract BuilderType clone();

    public final /* synthetic */ zzeho v(zzehl zzehl) {
        if (d().getClass().isInstance(zzehl)) {
            j((zzeeh) zzehl);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
