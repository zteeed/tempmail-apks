package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class m3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final n3 f10301b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10302c;

    /* renamed from: d  reason: collision with root package name */
    private final Throwable f10303d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f10304e;

    /* renamed from: f  reason: collision with root package name */
    private final String f10305f;
    private final Map<String, List<String>> g;

    private m3(String str, n3 n3Var, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        Preconditions.k(n3Var);
        this.f10301b = n3Var;
        this.f10302c = i;
        this.f10303d = th;
        this.f10304e = bArr;
        this.f10305f = str;
        this.g = map;
    }

    public final void run() {
        this.f10301b.a(this.f10305f, this.f10302c, this.f10303d, this.f10304e, this.g);
    }
}
