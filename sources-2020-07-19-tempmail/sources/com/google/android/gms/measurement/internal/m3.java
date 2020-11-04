package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class m3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final n3 f10115b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10116c;

    /* renamed from: d  reason: collision with root package name */
    private final Throwable f10117d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f10118e;

    /* renamed from: f  reason: collision with root package name */
    private final String f10119f;
    private final Map<String, List<String>> g;

    private m3(String str, n3 n3Var, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        Preconditions.k(n3Var);
        this.f10115b = n3Var;
        this.f10116c = i;
        this.f10117d = th;
        this.f10118e = bArr;
        this.f10119f = str;
        this.g = map;
    }

    public final void run() {
        this.f10115b.a(this.f10119f, this.f10116c, this.f10117d, this.f10118e, this.g);
    }
}
