package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zw {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedList<zzdmw<?>> f5684a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    private final int f5685b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5686c;

    /* renamed from: d  reason: collision with root package name */
    private final ix f5687d;

    public zw(int i, int i2) {
        this.f5685b = i;
        this.f5686c = i2;
        this.f5687d = new ix();
    }

    private final void h() {
        while (!this.f5684a.isEmpty()) {
            if (zzq.zzld().a() - this.f5684a.getFirst().f8413d >= ((long) this.f5686c)) {
                this.f5687d.g();
                this.f5684a.remove();
            } else {
                return;
            }
        }
    }

    public final long a() {
        return this.f5687d.a();
    }

    public final int b() {
        h();
        return this.f5684a.size();
    }

    public final zzdmw<?> c() {
        this.f5687d.e();
        h();
        if (this.f5684a.isEmpty()) {
            return null;
        }
        zzdmw<?> remove = this.f5684a.remove();
        if (remove != null) {
            this.f5687d.f();
        }
        return remove;
    }

    public final long d() {
        return this.f5687d.b();
    }

    public final int e() {
        return this.f5687d.c();
    }

    public final String f() {
        return this.f5687d.d();
    }

    public final zzdnm g() {
        return this.f5687d.h();
    }

    public final boolean i(zzdmw<?> zzdmw) {
        this.f5687d.e();
        h();
        if (this.f5684a.size() == this.f5685b) {
            return false;
        }
        this.f5684a.add(zzdmw);
        return true;
    }
}
