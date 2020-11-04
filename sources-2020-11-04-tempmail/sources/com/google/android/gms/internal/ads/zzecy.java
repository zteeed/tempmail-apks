package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzecy implements zzdwf {

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f8681f = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final zzeda f8682a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8683b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f8684c;

    /* renamed from: d  reason: collision with root package name */
    private final zzedd f8685d;

    /* renamed from: e  reason: collision with root package name */
    private final zzecw f8686e;

    public zzecy(ECPublicKey eCPublicKey, byte[] bArr, String str, zzedd zzedd, zzecw zzecw) throws GeneralSecurityException {
        zzedc.f(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f8682a = new zzeda(eCPublicKey);
        this.f8684c = bArr;
        this.f8683b = str;
        this.f8685d = zzedd;
        this.f8686e = zzecw;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzecz a2 = this.f8682a.a(this.f8683b, this.f8684c, bArr2, this.f8686e.a(), this.f8685d);
        byte[] a3 = this.f8686e.b(a2.b()).a(bArr, f8681f);
        byte[] a4 = a2.a();
        return ByteBuffer.allocate(a4.length + a3.length).put(a4).put(a3).array();
    }
}
