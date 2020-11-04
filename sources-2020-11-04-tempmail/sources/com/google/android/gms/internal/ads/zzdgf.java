package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdgf implements zzela<ApplicationInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdgd f8206a;

    public zzdgf(zzdgd zzdgd) {
        this.f8206a = zzdgd;
    }

    public static ApplicationInfo a(zzdgd zzdgd) {
        ApplicationInfo f2 = zzdgd.f();
        zzelg.b(f2, "Cannot return null from a non-@Nullable @Provides method");
        return f2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f8206a);
    }
}
