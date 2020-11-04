package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzrp {

    /* renamed from: a  reason: collision with root package name */
    private final float f9065a;

    /* renamed from: b  reason: collision with root package name */
    private final float f9066b;

    /* renamed from: c  reason: collision with root package name */
    private final float f9067c;

    /* renamed from: d  reason: collision with root package name */
    private final float f9068d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9069e;

    @VisibleForTesting
    public zzrp(float f2, float f3, float f4, float f5, int i) {
        this.f9065a = f2;
        this.f9066b = f3;
        this.f9067c = f2 + f4;
        this.f9068d = f3 + f5;
        this.f9069e = i;
    }

    /* access modifiers changed from: package-private */
    public final float a() {
        return this.f9065a;
    }

    /* access modifiers changed from: package-private */
    public final float b() {
        return this.f9066b;
    }

    /* access modifiers changed from: package-private */
    public final float c() {
        return this.f9067c;
    }

    /* access modifiers changed from: package-private */
    public final float d() {
        return this.f9068d;
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        return this.f9069e;
    }
}
