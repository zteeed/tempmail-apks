package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdlv implements zzaxn, zzbsq {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<zzaxg> f8186b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final Context f8187c;

    /* renamed from: d  reason: collision with root package name */
    private final zzaxs f8188d;

    public zzdlv(Context context, zzaxs zzaxs) {
        this.f8187c = context;
        this.f8188d = zzaxs;
    }

    public final synchronized void a(HashSet<zzaxg> hashSet) {
        this.f8186b.clear();
        this.f8186b.addAll(hashSet);
    }

    public final Bundle b() {
        return this.f8188d.b(this.f8187c, this);
    }

    public final synchronized void onAdFailedToLoad(int i) {
        if (i != 3) {
            this.f8188d.f(this.f8186b);
        }
    }
}
