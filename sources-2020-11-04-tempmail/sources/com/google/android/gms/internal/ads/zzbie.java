package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.ads.internal.zzq;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbie {

    /* renamed from: a  reason: collision with root package name */
    private final zzbbd f6445a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f6446b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<Context> f6447c;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static class zza {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public zzbbd f6448a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public Context f6449b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<Context> f6450c;

        public final zza b(zzbbd zzbbd) {
            this.f6448a = zzbbd;
            return this;
        }

        public final zza d(Context context) {
            this.f6450c = new WeakReference<>(context);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f6449b = context;
            return this;
        }
    }

    private zzbie(zza zza2) {
        this.f6445a = zza2.f6448a;
        this.f6446b = zza2.f6449b;
        this.f6447c = zza2.f6450c;
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f6446b;
    }

    /* access modifiers changed from: package-private */
    public final WeakReference<Context> b() {
        return this.f6447c;
    }

    /* access modifiers changed from: package-private */
    public final zzbbd c() {
        return this.f6445a;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return zzq.zzkw().m0(this.f6446b, this.f6445a.f6314b);
    }

    public final zzeg e() {
        return new zzeg(new zzh(this.f6446b, this.f6445a));
    }
}
