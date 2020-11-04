package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzqe {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f9027a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zzqf f9028b;

    public zzqe(Handler handler, zzqf zzqf) {
        Handler handler2;
        if (zzqf != null) {
            zzpb.d(handler);
            handler2 = handler;
        } else {
            handler2 = null;
        }
        this.f9027a = handler2;
        this.f9028b = zzqf;
    }

    public final void b(int i, int i2, int i3, float f2) {
        if (this.f9028b != null) {
            this.f9027a.post(new fe0(this, i, i2, i3, f2));
        }
    }

    public final void c(Surface surface) {
        if (this.f9028b != null) {
            this.f9027a.post(new ee0(this, surface));
        }
    }

    public final void d(zzjj zzjj) {
        if (this.f9028b != null) {
            this.f9027a.post(new be0(this, zzjj));
        }
    }

    public final void e(String str, long j, long j2) {
        if (this.f9028b != null) {
            this.f9027a.post(new ae0(this, str, j, j2));
        }
    }

    public final void f(zzhq zzhq) {
        if (this.f9028b != null) {
            this.f9027a.post(new de0(this, zzhq));
        }
    }

    public final void g(zzjj zzjj) {
        if (this.f9028b != null) {
            this.f9027a.post(new ge0(this, zzjj));
        }
    }

    public final void h(int i, long j) {
        if (this.f9028b != null) {
            this.f9027a.post(new ce0(this, i, j));
        }
    }
}
