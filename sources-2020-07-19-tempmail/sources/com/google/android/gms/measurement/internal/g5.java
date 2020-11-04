package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class g5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10016b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10017c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10018d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f10019e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzhc f10020f;

    g5(zzhc zzhc, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f10020f = zzhc;
        this.f10016b = atomicReference;
        this.f10017c = str;
        this.f10018d = str2;
        this.f10019e = str3;
    }

    public final void run() {
        this.f10020f.f10171a.P().U(this.f10016b, this.f10017c, this.f10018d, this.f10019e);
    }
}
