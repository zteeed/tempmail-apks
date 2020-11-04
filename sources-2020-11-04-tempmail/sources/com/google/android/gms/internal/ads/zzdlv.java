package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdlv implements zzaxn, zzbsq {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<zzaxg> f8369b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final Context f8370c;

    /* renamed from: d  reason: collision with root package name */
    private final zzaxs f8371d;

    public zzdlv(Context context, zzaxs zzaxs) {
        this.f8370c = context;
        this.f8371d = zzaxs;
    }

    public final synchronized void a(HashSet<zzaxg> hashSet) {
        this.f8369b.clear();
        this.f8369b.addAll(hashSet);
    }

    public final Bundle b() {
        return this.f8371d.b(this.f8370c, this);
    }

    public final synchronized void onAdFailedToLoad(int i) {
        if (i != 3) {
            this.f8371d.f(this.f8369b);
        }
    }
}
