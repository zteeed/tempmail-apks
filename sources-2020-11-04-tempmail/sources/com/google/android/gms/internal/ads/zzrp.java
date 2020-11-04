package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzrp {

    /* renamed from: a  reason: collision with root package name */
    private final float f9248a;

    /* renamed from: b  reason: collision with root package name */
    private final float f9249b;

    /* renamed from: c  reason: collision with root package name */
    private final float f9250c;

    /* renamed from: d  reason: collision with root package name */
    private final float f9251d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9252e;

    @VisibleForTesting
    public zzrp(float f2, float f3, float f4, float f5, int i) {
        this.f9248a = f2;
        this.f9249b = f3;
        this.f9250c = f2 + f4;
        this.f9251d = f3 + f5;
        this.f9252e = i;
    }

    /* access modifiers changed from: package-private */
    public final float a() {
        return this.f9248a;
    }

    /* access modifiers changed from: package-private */
    public final float b() {
        return this.f9249b;
    }

    /* access modifiers changed from: package-private */
    public final float c() {
        return this.f9250c;
    }

    /* access modifiers changed from: package-private */
    public final float d() {
        return this.f9251d;
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        return this.f9252e;
    }
}
