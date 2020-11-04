package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcpw implements zzela<zzcpx> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7532a;

    private zzcpw(zzelj<Context> zzelj) {
        this.f7532a = zzelj;
    }

    public static zzcpw a(zzelj<Context> zzelj) {
        return new zzcpw(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzcpx(this.f7532a.get());
    }
}
