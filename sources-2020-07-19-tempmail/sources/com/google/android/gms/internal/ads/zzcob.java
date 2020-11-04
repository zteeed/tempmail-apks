package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcob extends zzasf {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzcny f7305b;

    protected zzcob(zzcny zzcny) {
        this.f7305b = zzcny;
    }

    public final void k5(zzazi zzazi) {
        this.f7305b.f7299a.c(new zzazh(zzazi.f6071b, zzazi.f6072c));
    }

    public final void r0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f7305b.f7299a.a(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
