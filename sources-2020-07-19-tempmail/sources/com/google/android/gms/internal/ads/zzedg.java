package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzedg implements zzdwc {

    /* renamed from: a  reason: collision with root package name */
    private final zzedp f8521a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdwp f8522b;

    public zzedg(zzedp zzedp, zzdwp zzdwp, int i) {
        this.f8521a = zzedp;
        this.f8522b = zzdwp;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a2 = this.f8521a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return zzecp.c(a2, this.f8522b.a(zzecp.c(bArr2, a2, copyOf)));
    }
}
