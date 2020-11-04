package com.google.android.gms.measurement.internal;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final /* synthetic */ class s5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final t5 f10414b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10415c;

    /* renamed from: d  reason: collision with root package name */
    private final Exception f10416d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f10417e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f10418f;

    s5(t5 t5Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f10414b = t5Var;
        this.f10415c = i;
        this.f10416d = exc;
        this.f10417e = bArr;
        this.f10418f = map;
    }

    public final void run() {
        this.f10414b.a(this.f10415c, this.f10416d, this.f10417e, this.f10418f);
    }
}
