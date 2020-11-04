package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcis {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, zzcit> f7287a = new HashMap();

    zzcis() {
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, zzaox zzaox) {
        if (!this.f7287a.containsKey(str)) {
            try {
                this.f7287a.put(str, new zzcit(str, zzaox.g0(), zzaox.e0()));
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(String str, zzdlm zzdlm) {
        if (!this.f7287a.containsKey(str)) {
            try {
                this.f7287a.put(str, new zzcit(str, zzdlm.A(), zzdlm.B()));
            } catch (zzdlg unused) {
            }
        }
    }

    @Nullable
    public final synchronized zzcit c(String str) {
        return this.f7287a.get(str);
    }
}
