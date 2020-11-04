package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract class GmsClientSupervisor {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f3192b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static GmsClientSupervisor f3193c;

    protected static final class zza {

        /* renamed from: a  reason: collision with root package name */
        private final String f3194a;

        /* renamed from: b  reason: collision with root package name */
        private final String f3195b;

        /* renamed from: c  reason: collision with root package name */
        private final ComponentName f3196c = null;

        /* renamed from: d  reason: collision with root package name */
        private final int f3197d;

        public zza(String str, String str2, int i) {
            Preconditions.g(str);
            this.f3194a = str;
            Preconditions.g(str2);
            this.f3195b = str2;
            this.f3197d = i;
        }

        public final ComponentName a() {
            return this.f3196c;
        }

        public final String b() {
            return this.f3195b;
        }

        public final Intent c(Context context) {
            if (this.f3194a != null) {
                return new Intent(this.f3194a).setPackage(this.f3195b);
            }
            return new Intent().setComponent(this.f3196c);
        }

        public final int d() {
            return this.f3197d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            return Objects.a(this.f3194a, zza.f3194a) && Objects.a(this.f3195b, zza.f3195b) && Objects.a(this.f3196c, zza.f3196c) && this.f3197d == zza.f3197d;
        }

        public final int hashCode() {
            return Objects.b(this.f3194a, this.f3195b, this.f3196c, Integer.valueOf(this.f3197d));
        }

        public final String toString() {
            String str = this.f3194a;
            return str == null ? this.f3196c.flattenToString() : str;
        }
    }

    @KeepForSdk
    public static GmsClientSupervisor a(Context context) {
        synchronized (f3192b) {
            if (f3193c == null) {
                f3193c = new g(context.getApplicationContext());
            }
        }
        return f3193c;
    }

    public final void b(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        d(new zza(str, str2, i), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean c(zza zza2, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    public abstract void d(zza zza2, ServiceConnection serviceConnection, String str);
}
