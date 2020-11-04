package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzali {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5950a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Object f5951b = new Object();
    @GuardedBy("lockClient")

    /* renamed from: c  reason: collision with root package name */
    private zzalr f5952c;
    @GuardedBy("lockService")

    /* renamed from: d  reason: collision with root package name */
    private zzalr f5953d;

    private static Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzalr a(Context context, zzbbd zzbbd) {
        zzalr zzalr;
        synchronized (this.f5951b) {
            if (this.f5953d == null) {
                this.f5953d = new zzalr(c(context), zzbbd, zzact.f5796a.a());
            }
            zzalr = this.f5953d;
        }
        return zzalr;
    }

    public final zzalr b(Context context, zzbbd zzbbd) {
        zzalr zzalr;
        synchronized (this.f5950a) {
            if (this.f5952c == null) {
                this.f5952c = new zzalr(c(context), zzbbd, (String) zzwg.e().c(zzaav.f5713a));
            }
            zzalr = this.f5952c;
        }
        return zzalr;
    }
}
