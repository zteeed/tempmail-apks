package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class g5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10202b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10203c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10204d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f10205e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzhc f10206f;

    g5(zzhc zzhc, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f10206f = zzhc;
        this.f10202b = atomicReference;
        this.f10203c = str;
        this.f10204d = str2;
        this.f10205e = str3;
    }

    public final void run() {
        this.f10206f.f10357a.P().U(this.f10202b, this.f10203c, this.f10204d, this.f10205e);
    }
}
