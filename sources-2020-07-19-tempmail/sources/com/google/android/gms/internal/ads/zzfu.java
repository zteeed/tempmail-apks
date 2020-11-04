package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzfu implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzex f8691b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcf.zza.C0074zza f8692c;

    public zzfu(zzex zzex, zzcf.zza.C0074zza zza) {
        this.f8691b = zzex;
        this.f8692c = zza;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() throws Exception {
        if (this.f8691b.A() != null) {
            this.f8691b.A().get();
        }
        zzcf.zza z = this.f8691b.z();
        if (z == null) {
            return null;
        }
        try {
            synchronized (this.f8692c) {
                zzcf.zza.C0074zza zza = this.f8692c;
                byte[] g = z.g();
                zza.l(g, 0, g.length, zzefo.c());
            }
            return null;
        } catch (zzegl unused) {
            return null;
        }
    }
}
