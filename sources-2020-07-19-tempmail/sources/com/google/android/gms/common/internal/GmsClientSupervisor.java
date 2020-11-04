package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract class GmsClientSupervisor {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f3004b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static GmsClientSupervisor f3005c;

    protected static final class zza {

        /* renamed from: a  reason: collision with root package name */
        private final String f3006a;

        /* renamed from: b  reason: collision with root package name */
        private final String f3007b;

        /* renamed from: c  reason: collision with root package name */
        private final ComponentName f3008c = null;

        /* renamed from: d  reason: collision with root package name */
        private final int f3009d;

        public zza(String str, String str2, int i) {
            Preconditions.g(str);
            this.f3006a = str;
            Preconditions.g(str2);
            this.f3007b = str2;
            this.f3009d = i;
        }

        public final ComponentName a() {
            return this.f3008c;
        }

        public final String b() {
            return this.f3007b;
        }

        public final Intent c(Context context) {
            if (this.f3006a != null) {
                return new Intent(this.f3006a).setPackage(this.f3007b);
            }
            return new Intent().setComponent(this.f3008c);
        }

        public final int d() {
            return this.f3009d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            return Objects.a(this.f3006a, zza.f3006a) && Objects.a(this.f3007b, zza.f3007b) && Objects.a(this.f3008c, zza.f3008c) && this.f3009d == zza.f3009d;
        }

        public final int hashCode() {
            return Objects.b(this.f3006a, this.f3007b, this.f3008c, Integer.valueOf(this.f3009d));
        }

        public final String toString() {
            String str = this.f3006a;
            return str == null ? this.f3008c.flattenToString() : str;
        }
    }

    @KeepForSdk
    public static GmsClientSupervisor a(Context context) {
        synchronized (f3004b) {
            if (f3005c == null) {
                f3005c = new g(context.getApplicationContext());
            }
        }
        return f3005c;
    }

    public final void b(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        d(new zza(str, str2, i), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean c(zza zza2, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    public abstract void d(zza zza2, ServiceConnection serviceConnection, String str);
}
