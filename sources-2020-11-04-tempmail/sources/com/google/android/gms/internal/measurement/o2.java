package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
abstract class o2 {

    /* renamed from: a  reason: collision with root package name */
    private static final o2 f9652a = new p2();

    /* renamed from: b  reason: collision with root package name */
    private static final o2 f9653b = new s2();

    private o2() {
    }

    static o2 a() {
        return f9652a;
    }

    static o2 d() {
        return f9653b;
    }

    /* access modifiers changed from: package-private */
    public abstract <L> List<L> b(Object obj, long j);

    /* access modifiers changed from: package-private */
    public abstract <L> void c(Object obj, Object obj2, long j);

    /* access modifiers changed from: package-private */
    public abstract void e(Object obj, long j);
}
