package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzecy implements zzdwf {

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f8498f = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final zzeda f8499a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8500b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f8501c;

    /* renamed from: d  reason: collision with root package name */
    private final zzedd f8502d;

    /* renamed from: e  reason: collision with root package name */
    private final zzecw f8503e;

    public zzecy(ECPublicKey eCPublicKey, byte[] bArr, String str, zzedd zzedd, zzecw zzecw) throws GeneralSecurityException {
        zzedc.f(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f8499a = new zzeda(eCPublicKey);
        this.f8501c = bArr;
        this.f8500b = str;
        this.f8502d = zzedd;
        this.f8503e = zzecw;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzecz a2 = this.f8499a.a(this.f8500b, this.f8501c, bArr2, this.f8503e.a(), this.f8502d);
        byte[] a3 = this.f8503e.b(a2.b()).a(bArr, f8498f);
        byte[] a4 = a2.a();
        return ByteBuffer.allocate(a4.length + a3.length).put(a4).put(a3).array();
    }
}
