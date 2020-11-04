package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbrx {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6601a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdla f6602b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f6603c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6604d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdkv f6605e;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static class zza {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Context f6606a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public zzdla f6607b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Bundle f6608c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f6609d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public zzdkv f6610e;

        public final zza b(zzdkv zzdkv) {
            this.f6610e = zzdkv;
            return this;
        }

        public final zza c(zzdla zzdla) {
            this.f6607b = zzdla;
            return this;
        }

        public final zzbrx d() {
            return new zzbrx(this);
        }

        public final zza g(Context context) {
            this.f6606a = context;
            return this;
        }

        public final zza j(Bundle bundle) {
            this.f6608c = bundle;
            return this;
        }

        public final zza k(String str) {
            this.f6609d = str;
            return this;
        }
    }

    private zzbrx(zza zza2) {
        this.f6601a = zza2.f6606a;
        this.f6602b = zza2.f6607b;
        this.f6603c = zza2.f6608c;
        this.f6604d = zza2.f6609d;
        this.f6605e = zza2.f6610e;
    }

    /* access modifiers changed from: package-private */
    public final zza a() {
        zza zza2 = new zza();
        zza2.g(this.f6601a);
        zza2.c(this.f6602b);
        zza2.k(this.f6604d);
        zza2.j(this.f6603c);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final zzdla b() {
        return this.f6602b;
    }

    /* access modifiers changed from: package-private */
    public final zzdkv c() {
        return this.f6605e;
    }

    /* access modifiers changed from: package-private */
    public final Bundle d() {
        return this.f6603c;
    }

    /* access modifiers changed from: package-private */
    public final String e() {
        return this.f6604d;
    }

    /* access modifiers changed from: package-private */
    public final Context f(Context context) {
        if (this.f6604d != null) {
            return context;
        }
        return this.f6601a;
    }
}
