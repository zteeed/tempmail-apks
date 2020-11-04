package com.google.android.gms.measurement.internal;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final /* synthetic */ class s5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final t5 f10228b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10229c;

    /* renamed from: d  reason: collision with root package name */
    private final Exception f10230d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f10231e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f10232f;

    s5(t5 t5Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f10228b = t5Var;
        this.f10229c = i;
        this.f10230d = exc;
        this.f10231e = bArr;
        this.f10232f = map;
    }

    public final void run() {
        this.f10228b.a(this.f10229c, this.f10230d, this.f10231e, this.f10232f);
    }
}
