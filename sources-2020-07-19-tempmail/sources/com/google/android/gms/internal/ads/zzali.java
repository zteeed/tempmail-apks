package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzali {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5767a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Object f5768b = new Object();
    @GuardedBy("lockClient")

    /* renamed from: c  reason: collision with root package name */
    private zzalr f5769c;
    @GuardedBy("lockService")

    /* renamed from: d  reason: collision with root package name */
    private zzalr f5770d;

    private static Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzalr a(Context context, zzbbd zzbbd) {
        zzalr zzalr;
        synchronized (this.f5768b) {
            if (this.f5770d == null) {
                this.f5770d = new zzalr(c(context), zzbbd, zzact.f5613a.a());
            }
            zzalr = this.f5770d;
        }
        return zzalr;
    }

    public final zzalr b(Context context, zzbbd zzbbd) {
        zzalr zzalr;
        synchronized (this.f5767a) {
            if (this.f5769c == null) {
                this.f5769c = new zzalr(c(context), zzbbd, (String) zzwg.e().c(zzaav.f5530a));
            }
            zzalr = this.f5769c;
        }
        return zzalr;
    }
}
