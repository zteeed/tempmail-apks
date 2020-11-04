package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbyz extends zzbwv<VideoController.VideoLifecycleCallbacks> {
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private boolean f6712c;

    protected zzbyz(Set<zzbyg<VideoController.VideoLifecycleCallbacks>> set) {
        super(set);
    }

    public final void C0() {
        k0(gg.f3892a);
    }

    public final void D0() {
        k0(dg.f3645a);
    }

    public final synchronized void E0() {
        if (!this.f6712c) {
            k0(ig.f4053a);
            this.f6712c = true;
        }
        k0(hg.f3968a);
    }

    public final synchronized void F0() {
        k0(fg.f3802a);
        this.f6712c = true;
    }
}
