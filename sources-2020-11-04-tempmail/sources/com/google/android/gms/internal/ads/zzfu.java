package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzfu implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzex f8874b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcf.zza.C0073zza f8875c;

    public zzfu(zzex zzex, zzcf.zza.C0073zza zza) {
        this.f8874b = zzex;
        this.f8875c = zza;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() throws Exception {
        if (this.f8874b.A() != null) {
            this.f8874b.A().get();
        }
        zzcf.zza z = this.f8874b.z();
        if (z == null) {
            return null;
        }
        try {
            synchronized (this.f8875c) {
                zzcf.zza.C0073zza zza = this.f8875c;
                byte[] g = z.g();
                zza.l(g, 0, g.length, zzefo.c());
            }
            return null;
        } catch (zzegl unused) {
            return null;
        }
    }
}
