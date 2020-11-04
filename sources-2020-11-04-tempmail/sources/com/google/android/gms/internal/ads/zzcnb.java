package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcnb implements zzela<String> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7452a;

    private zzcnb(zzelj<Context> zzelj) {
        this.f7452a = zzelj;
    }

    public static zzcnb a(zzelj<Context> zzelj) {
        return new zzcnb(zzelj);
    }

    public static String b(Context context) {
        String packageName = context.getPackageName();
        zzelg.b(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }

    public final /* synthetic */ Object get() {
        return b(this.f7452a.get());
    }
}
