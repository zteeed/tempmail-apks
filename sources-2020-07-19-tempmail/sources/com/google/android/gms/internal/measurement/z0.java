package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class z0<T> implements zzdj<T> {

    /* renamed from: b  reason: collision with root package name */
    private volatile zzdj<T> f9532b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f9533c;
    @NullableDecl

    /* renamed from: d  reason: collision with root package name */
    private T f9534d;

    z0(zzdj<T> zzdj) {
        zzdh.a(zzdj);
        this.f9532b = zzdj;
    }

    public final T a() {
        if (!this.f9533c) {
            synchronized (this) {
                if (!this.f9533c) {
                    T a2 = this.f9532b.a();
                    this.f9534d = a2;
                    this.f9533c = true;
                    this.f9532b = null;
                    return a2;
                }
            }
        }
        return this.f9534d;
    }

    public final String toString() {
        Object obj = this.f9532b;
        if (obj == null) {
            String valueOf = String.valueOf(this.f9534d);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
