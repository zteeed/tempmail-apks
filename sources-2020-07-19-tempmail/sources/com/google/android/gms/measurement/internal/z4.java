package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class z4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10348b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10349c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f10350d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Bundle f10351e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f10352f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ String i;
    private final /* synthetic */ zzhc j;

    z4(zzhc zzhc, String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.j = zzhc;
        this.f10348b = str;
        this.f10349c = str2;
        this.f10350d = j2;
        this.f10351e = bundle;
        this.f10352f = z;
        this.g = z2;
        this.h = z3;
        this.i = str3;
    }

    public final void run() {
        this.j.P(this.f10348b, this.f10349c, this.f10350d, this.f10351e, this.f10352f, this.g, this.h, this.i);
    }
}
