package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zztv {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f9302a;

    /* renamed from: b  reason: collision with root package name */
    private int f9303b;

    /* renamed from: c  reason: collision with root package name */
    private int f9304c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zztr f9305d;

    private zztv(zztr zztr, byte[] bArr) {
        this.f9305d = zztr;
        this.f9302a = bArr;
    }

    public final zztv a(int i) {
        this.f9303b = i;
        return this;
    }

    public final zztv b(int i) {
        this.f9304c = i;
        return this;
    }

    public final synchronized void c() {
        try {
            if (this.f9305d.f9301b) {
                this.f9305d.f9300a.u0(this.f9302a);
                this.f9305d.f9300a.L4(this.f9303b);
                this.f9305d.f9300a.k2(this.f9304c);
                this.f9305d.f9300a.R2((int[]) null);
                this.f9305d.f9300a.x3();
            }
        } catch (RemoteException e2) {
            zzbba.b("Clearcut log failed", e2);
        }
    }
}
