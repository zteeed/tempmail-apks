package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class p8 extends zzbm {

    /* renamed from: c  reason: collision with root package name */
    static final p8 f4621c = new p8();

    p8() {
    }

    public final zzbp b(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzbr();
        }
        if ("mvhd".equals(str)) {
            return new zzbu();
        }
        return new zzbt(str);
    }
}
