package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zztv {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f9119a;

    /* renamed from: b  reason: collision with root package name */
    private int f9120b;

    /* renamed from: c  reason: collision with root package name */
    private int f9121c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zztr f9122d;

    private zztv(zztr zztr, byte[] bArr) {
        this.f9122d = zztr;
        this.f9119a = bArr;
    }

    public final zztv a(int i) {
        this.f9120b = i;
        return this;
    }

    public final zztv b(int i) {
        this.f9121c = i;
        return this;
    }

    public final synchronized void c() {
        try {
            if (this.f9122d.f9118b) {
                this.f9122d.f9117a.o0(this.f9119a);
                this.f9122d.f9117a.r4(this.f9120b);
                this.f9122d.f9117a.a2(this.f9121c);
                this.f9122d.f9117a.G2((int[]) null);
                this.f9122d.f9117a.h3();
            }
        } catch (RemoteException e2) {
            zzbba.b("Clearcut log failed", e2);
        }
    }
}
