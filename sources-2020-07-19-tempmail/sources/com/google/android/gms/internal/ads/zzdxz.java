package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdxz implements zzdwc {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f8447c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final zzebi f8448a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdwc f8449b;

    public zzdxz(zzebi zzebi, zzdwc zzdwc) {
        this.f8448a = zzebi;
        this.f8449b = zzdwc;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] g = zzdwy.p(this.f8448a).g();
        byte[] a2 = this.f8449b.a(g, f8447c);
        byte[] a3 = ((zzdwc) zzdwy.i(this.f8448a.G(), g, zzdwc.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(a2.length + 4 + a3.length).putInt(a2.length).put(a2).put(a3).array();
    }
}
