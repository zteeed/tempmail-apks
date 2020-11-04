package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcis {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, zzcit> f7104a = new HashMap();

    zzcis() {
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, zzaox zzaox) {
        if (!this.f7104a.containsKey(str)) {
            try {
                this.f7104a.put(str, new zzcit(str, zzaox.a0(), zzaox.Y()));
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(String str, zzdlm zzdlm) {
        if (!this.f7104a.containsKey(str)) {
            try {
                this.f7104a.put(str, new zzcit(str, zzdlm.A(), zzdlm.B()));
            } catch (zzdlg unused) {
            }
        }
    }

    @Nullable
    public final synchronized zzcit c(String str) {
        return this.f7104a.get(str);
    }
}
