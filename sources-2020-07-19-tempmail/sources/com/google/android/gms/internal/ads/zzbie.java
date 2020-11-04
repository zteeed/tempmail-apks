package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.ads.internal.zzq;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbie {

    /* renamed from: a  reason: collision with root package name */
    private final zzbbd f6262a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f6263b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<Context> f6264c;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static class zza {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public zzbbd f6265a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public Context f6266b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<Context> f6267c;

        public final zza b(zzbbd zzbbd) {
            this.f6265a = zzbbd;
            return this;
        }

        public final zza d(Context context) {
            this.f6267c = new WeakReference<>(context);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f6266b = context;
            return this;
        }
    }

    private zzbie(zza zza2) {
        this.f6262a = zza2.f6265a;
        this.f6263b = zza2.f6266b;
        this.f6264c = zza2.f6267c;
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f6263b;
    }

    /* access modifiers changed from: package-private */
    public final WeakReference<Context> b() {
        return this.f6264c;
    }

    /* access modifiers changed from: package-private */
    public final zzbbd c() {
        return this.f6262a;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return zzq.zzkw().m0(this.f6263b, this.f6262a.f6131b);
    }

    public final zzeg e() {
        return new zzeg(new zzh(this.f6263b, this.f6262a));
    }
}
