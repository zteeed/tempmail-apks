package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaky extends zzbbu<zzaju> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f5944c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public zzazj<zzaju> f5945d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5946e;

    /* renamed from: f  reason: collision with root package name */
    private int f5947f;

    public zzaky(zzazj<zzaju> zzazj) {
        this.f5945d = zzazj;
        this.f5946e = false;
        this.f5947f = 0;
    }

    private final void j() {
        synchronized (this.f5944c) {
            Preconditions.n(this.f5947f >= 0);
            if (!this.f5946e || this.f5947f != 0) {
                zzaxv.m("There are still references to the engine. Not destroying.");
            } else {
                zzaxv.m("No reference is left (including root). Cleaning up engine.");
                d(new b2(this), new zzbbs());
            }
        }
    }

    public final zzaku g() {
        zzaku zzaku = new zzaku(this);
        synchronized (this.f5944c) {
            d(new z1(this, zzaku), new y1(this, zzaku));
            Preconditions.n(this.f5947f >= 0);
            this.f5947f++;
        }
        return zzaku;
    }

    /* access modifiers changed from: protected */
    public final void h() {
        synchronized (this.f5944c) {
            Preconditions.n(this.f5947f > 0);
            zzaxv.m("Releasing 1 reference for JS Engine");
            this.f5947f--;
            j();
        }
    }

    public final void i() {
        synchronized (this.f5944c) {
            Preconditions.n(this.f5947f >= 0);
            zzaxv.m("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f5946e = true;
            j();
        }
    }
}
