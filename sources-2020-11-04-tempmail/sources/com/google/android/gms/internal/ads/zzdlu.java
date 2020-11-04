package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdlu implements zzela<Clock> {
    public zzdlu(zzdlr zzdlr) {
    }

    public final /* synthetic */ Object get() {
        Clock d2 = DefaultClock.d();
        zzelg.b(d2, "Cannot return null from a non-@Nullable @Provides method");
        return d2;
    }
}
