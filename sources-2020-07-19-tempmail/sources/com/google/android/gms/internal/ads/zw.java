package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zw {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedList<zzdmw<?>> f5501a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    private final int f5502b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5503c;

    /* renamed from: d  reason: collision with root package name */
    private final ix f5504d;

    public zw(int i, int i2) {
        this.f5502b = i;
        this.f5503c = i2;
        this.f5504d = new ix();
    }

    private final void h() {
        while (!this.f5501a.isEmpty()) {
            if (zzq.zzld().a() - this.f5501a.getFirst().f8230d >= ((long) this.f5503c)) {
                this.f5504d.g();
                this.f5501a.remove();
            } else {
                return;
            }
        }
    }

    public final long a() {
        return this.f5504d.a();
    }

    public final int b() {
        h();
        return this.f5501a.size();
    }

    public final zzdmw<?> c() {
        this.f5504d.e();
        h();
        if (this.f5501a.isEmpty()) {
            return null;
        }
        zzdmw<?> remove = this.f5501a.remove();
        if (remove != null) {
            this.f5504d.f();
        }
        return remove;
    }

    public final long d() {
        return this.f5504d.b();
    }

    public final int e() {
        return this.f5504d.c();
    }

    public final String f() {
        return this.f5504d.d();
    }

    public final zzdnm g() {
        return this.f5504d.h();
    }

    public final boolean i(zzdmw<?> zzdmw) {
        this.f5504d.e();
        h();
        if (this.f5501a.size() == this.f5502b) {
            return false;
        }
        this.f5501a.add(zzdmw);
        return true;
    }
}
