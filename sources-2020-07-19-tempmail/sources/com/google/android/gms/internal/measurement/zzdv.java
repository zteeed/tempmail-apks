package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdv;
import com.google.android.gms.internal.measurement.zzdw;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public abstract class zzdv<MessageType extends zzdw<MessageType, BuilderType>, BuilderType extends zzdv<MessageType, BuilderType>> implements zzgz {
    private final String o(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + String.valueOf(str).length());
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public final /* synthetic */ zzgz A(byte[] bArr) throws zzfw {
        l(bArr, 0, bArr.length);
        return this;
    }

    public final /* synthetic */ zzgz B(byte[] bArr, zzfb zzfb) throws zzfw {
        n(bArr, 0, bArr.length, zzfb);
        return this;
    }

    public final /* synthetic */ zzgz N(zzgw zzgw) {
        if (b().getClass().isInstance(zzgw)) {
            j((zzdw) zzgw);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    public abstract BuilderType j(MessageType messagetype);

    public abstract BuilderType k(zzes zzes, zzfb zzfb) throws IOException;

    public BuilderType l(byte[] bArr, int i, int i2) throws zzfw {
        try {
            zzes c2 = zzes.c(bArr, 0, i2, false);
            k(c2, zzfb.a());
            c2.d(0);
            return this;
        } catch (zzfw e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(o("byte array"), e3);
        }
    }

    public BuilderType n(byte[] bArr, int i, int i2, zzfb zzfb) throws zzfw {
        try {
            zzes c2 = zzes.c(bArr, 0, i2, false);
            k(c2, zzfb);
            c2.d(0);
            return this;
        } catch (zzfw e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(o("byte array"), e3);
        }
    }

    /* renamed from: p */
    public abstract BuilderType clone();
}
