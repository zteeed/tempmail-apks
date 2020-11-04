package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcww implements zzbup {

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<zzyc> f7666b = new AtomicReference<>();

    public final void a(zzvj zzvj) {
        zzdib.a(this.f7666b, new aq(zzvj));
    }

    public final void b(zzyc zzyc) {
        this.f7666b.set(zzyc);
    }
}
