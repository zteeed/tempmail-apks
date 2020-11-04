package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcob extends zzasf {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzcny f7488b;

    protected zzcob(zzcny zzcny) {
        this.f7488b = zzcny;
    }

    public final void G5(zzazi zzazi) {
        this.f7488b.f7482a.c(new zzazh(zzazi.f6254b, zzazi.f6255c));
    }

    public final void x0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f7488b.f7482a.a(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
