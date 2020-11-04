package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbrx {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6784a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdla f6785b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f6786c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6787d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdkv f6788e;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static class zza {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Context f6789a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public zzdla f6790b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Bundle f6791c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f6792d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public zzdkv f6793e;

        public final zza b(zzdkv zzdkv) {
            this.f6793e = zzdkv;
            return this;
        }

        public final zza c(zzdla zzdla) {
            this.f6790b = zzdla;
            return this;
        }

        public final zzbrx d() {
            return new zzbrx(this);
        }

        public final zza g(Context context) {
            this.f6789a = context;
            return this;
        }

        public final zza j(Bundle bundle) {
            this.f6791c = bundle;
            return this;
        }

        public final zza k(String str) {
            this.f6792d = str;
            return this;
        }
    }

    private zzbrx(zza zza2) {
        this.f6784a = zza2.f6789a;
        this.f6785b = zza2.f6790b;
        this.f6786c = zza2.f6791c;
        this.f6787d = zza2.f6792d;
        this.f6788e = zza2.f6793e;
    }

    /* access modifiers changed from: package-private */
    public final zza a() {
        zza zza2 = new zza();
        zza2.g(this.f6784a);
        zza2.c(this.f6785b);
        zza2.k(this.f6787d);
        zza2.j(this.f6786c);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final zzdla b() {
        return this.f6785b;
    }

    /* access modifiers changed from: package-private */
    public final zzdkv c() {
        return this.f6788e;
    }

    /* access modifiers changed from: package-private */
    public final Bundle d() {
        return this.f6786c;
    }

    /* access modifiers changed from: package-private */
    public final String e() {
        return this.f6787d;
    }

    /* access modifiers changed from: package-private */
    public final Context f(Context context) {
        if (this.f6787d != null) {
            return context;
        }
        return this.f6784a;
    }
}
