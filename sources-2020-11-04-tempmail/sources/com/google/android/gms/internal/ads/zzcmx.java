package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcmx implements zzela<ApplicationInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7443a;

    private zzcmx(zzelj<Context> zzelj) {
        this.f7443a = zzelj;
    }

    public static zzcmx a(zzelj<Context> zzelj) {
        return new zzcmx(zzelj);
    }

    public static ApplicationInfo b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        zzelg.b(applicationInfo, "Cannot return null from a non-@Nullable @Provides method");
        return applicationInfo;
    }

    public final /* synthetic */ Object get() {
        return b(this.f7443a.get());
    }
}
