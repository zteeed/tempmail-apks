package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzih {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f8761a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zzii f8762b;

    public zzih(Handler handler, zzii zzii) {
        Handler handler2;
        if (zzii != null) {
            zzpb.d(handler);
            handler2 = handler;
        } else {
            handler2 = null;
        }
        this.f8761a = handler2;
        this.f8762b = zzii;
    }

    public final void b(int i, long j, long j2) {
        if (this.f8762b != null) {
            this.f8761a.post(new ya0(this, i, j, j2));
        }
    }

    public final void c(zzjj zzjj) {
        if (this.f8762b != null) {
            this.f8761a.post(new xa0(this, zzjj));
        }
    }

    public final void d(String str, long j, long j2) {
        if (this.f8762b != null) {
            this.f8761a.post(new wa0(this, str, j, j2));
        }
    }

    public final void e(zzhq zzhq) {
        if (this.f8762b != null) {
            this.f8761a.post(new za0(this, zzhq));
        }
    }

    public final void f(zzjj zzjj) {
        if (this.f8762b != null) {
            this.f8761a.post(new bb0(this, zzjj));
        }
    }

    public final void g(int i) {
        if (this.f8762b != null) {
            this.f8761a.post(new ab0(this, i));
        }
    }
}
