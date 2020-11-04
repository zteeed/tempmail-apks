package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class x0<T> implements zzdj<T>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    private final zzdj<T> f9704b;

    /* renamed from: c  reason: collision with root package name */
    private volatile transient boolean f9705c;
    @NullableDecl

    /* renamed from: d  reason: collision with root package name */
    private transient T f9706d;

    x0(zzdj<T> zzdj) {
        zzdh.a(zzdj);
        this.f9704b = zzdj;
    }

    public final T a() {
        if (!this.f9705c) {
            synchronized (this) {
                if (!this.f9705c) {
                    T a2 = this.f9704b.a();
                    this.f9706d = a2;
                    this.f9705c = true;
                    return a2;
                }
            }
        }
        return this.f9706d;
    }

    public final String toString() {
        Object obj;
        if (this.f9705c) {
            String valueOf = String.valueOf(this.f9706d);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f9704b;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
