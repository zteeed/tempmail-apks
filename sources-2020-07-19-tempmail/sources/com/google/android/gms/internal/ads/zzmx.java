package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzmx implements zzna, zznb {

    /* renamed from: b  reason: collision with root package name */
    private final Uri f8878b;

    /* renamed from: c  reason: collision with root package name */
    private final zzon f8879c;

    /* renamed from: d  reason: collision with root package name */
    private final zzjy f8880d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8881e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f8882f;
    private final zzmw g;
    private final zzic h = new zzic();
    private final int i;
    private zzna j;
    private zzia k;
    private boolean l;

    public zzmx(Uri uri, zzon zzon, zzjy zzjy, int i2, Handler handler, zzmw zzmw, String str, int i3) {
        this.f8878b = uri;
        this.f8879c = zzon;
        this.f8880d = zzjy;
        this.f8881e = i2;
        this.f8882f = handler;
        this.g = zzmw;
        this.i = i3;
    }

    public final zzmz a(int i2, zzoi zzoi) {
        zzpb.a(i2 == 0);
        return new dd0(this.f8878b, this.f8879c.a(), this.f8880d.a(), this.f8881e, this.f8882f, this.g, this, zzoi, (String) null, this.i);
    }

    public final void b(zzia zzia, Object obj) {
        boolean z = false;
        if (zzia.e(0, this.h, false).f8753c != -9223372036854775807L) {
            z = true;
        }
        if (!this.l || z) {
            this.k = zzia;
            this.l = z;
            this.j.b(zzia, (Object) null);
        }
    }

    public final void c(zzhe zzhe, boolean z, zzna zzna) {
        this.j = zzna;
        zznp zznp = new zznp(-9223372036854775807L, false);
        this.k = zznp;
        zzna.b(zznp, (Object) null);
    }

    public final void d() throws IOException {
    }

    public final void e(zzmz zzmz) {
        ((dd0) zzmz).r();
    }

    public final void f() {
        this.j = null;
    }
}
