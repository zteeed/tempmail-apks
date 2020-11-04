package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdal implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final int f7784a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7785b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7786c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7787d;

    /* renamed from: e  reason: collision with root package name */
    private final int f7788e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7789f;
    private final float g;
    private final boolean h;

    public zzdal(int i, boolean z, boolean z2, int i2, int i3, int i4, float f2, boolean z3) {
        this.f7784a = i;
        this.f7785b = z;
        this.f7786c = z2;
        this.f7787d = i2;
        this.f7788e = i3;
        this.f7789f = i4;
        this.g = f2;
        this.h = z3;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f7784a);
        bundle.putBoolean("ma", this.f7785b);
        bundle.putBoolean("sp", this.f7786c);
        bundle.putInt("muv", this.f7787d);
        bundle.putInt("rm", this.f7788e);
        bundle.putInt("riv", this.f7789f);
        bundle.putFloat("android_app_volume", this.g);
        bundle.putBoolean("android_app_muted", this.h);
    }
}
