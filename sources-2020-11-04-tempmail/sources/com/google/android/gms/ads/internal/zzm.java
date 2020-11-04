package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzeg;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zzm implements Callable<zzeg> {
    private final /* synthetic */ zzl zzbox;

    zzm(zzl zzl) {
        this.zzbox = zzl;
    }

    public final /* synthetic */ Object call() throws Exception {
        return new zzeg(zzed.r(this.zzbox.zzboy.f6314b, this.zzbox.zzvr, false));
    }
}
