package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class z4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10534b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10535c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f10536d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Bundle f10537e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f10538f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ String i;
    private final /* synthetic */ zzhc j;

    z4(zzhc zzhc, String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.j = zzhc;
        this.f10534b = str;
        this.f10535c = str2;
        this.f10536d = j2;
        this.f10537e = bundle;
        this.f10538f = z;
        this.g = z2;
        this.h = z3;
        this.i = str3;
    }

    public final void run() {
        this.j.P(this.f10534b, this.f10535c, this.f10536d, this.f10537e, this.f10538f, this.g, this.h, this.i);
    }
}
