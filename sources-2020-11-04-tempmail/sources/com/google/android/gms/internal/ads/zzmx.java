package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzmx implements zzna, zznb {

    /* renamed from: b  reason: collision with root package name */
    private final Uri f9061b;

    /* renamed from: c  reason: collision with root package name */
    private final zzon f9062c;

    /* renamed from: d  reason: collision with root package name */
    private final zzjy f9063d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9064e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f9065f;
    private final zzmw g;
    private final zzic h = new zzic();
    private final int i;
    private zzna j;
    private zzia k;
    private boolean l;

    public zzmx(Uri uri, zzon zzon, zzjy zzjy, int i2, Handler handler, zzmw zzmw, String str, int i3) {
        this.f9061b = uri;
        this.f9062c = zzon;
        this.f9063d = zzjy;
        this.f9064e = i2;
        this.f9065f = handler;
        this.g = zzmw;
        this.i = i3;
    }

    public final zzmz a(int i2, zzoi zzoi) {
        zzpb.a(i2 == 0);
        return new dd0(this.f9061b, this.f9062c.a(), this.f9063d.a(), this.f9064e, this.f9065f, this.g, this, zzoi, (String) null, this.i);
    }

    public final void b(zzia zzia, Object obj) {
        boolean z = false;
        if (zzia.e(0, this.h, false).f8936c != -9223372036854775807L) {
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
