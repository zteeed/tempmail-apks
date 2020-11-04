package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class gd0 implements zzow {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f3882a;

    /* renamed from: b  reason: collision with root package name */
    private final zzok f3883b;

    /* renamed from: c  reason: collision with root package name */
    private final jd0 f3884c;

    /* renamed from: d  reason: collision with root package name */
    private final zzpd f3885d;

    /* renamed from: e  reason: collision with root package name */
    private final zzkd f3886e = new zzkd();

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f3887f;
    private boolean g = true;
    private long h;
    /* access modifiers changed from: private */
    public long i = -1;
    private final /* synthetic */ dd0 j;

    public gd0(dd0 dd0, Uri uri, zzok zzok, jd0 jd0, zzpd zzpd) {
        this.j = dd0;
        zzpb.d(uri);
        this.f3882a = uri;
        zzpb.d(zzok);
        this.f3883b = zzok;
        zzpb.d(jd0);
        this.f3884c = jd0;
        this.f3885d = zzpd;
    }

    public final boolean a() {
        return this.f3887f;
    }

    public final void b() {
        this.f3887f = true;
    }

    public final void c() throws IOException, InterruptedException {
        int i2 = 0;
        while (i2 == 0 && !this.f3887f) {
            zzju zzju = null;
            try {
                long j2 = this.f3886e.f8811a;
                long a2 = this.f3883b.a(new zzop(this.f3882a, j2, -1, this.j.i));
                this.i = a2;
                if (a2 != -1) {
                    this.i = a2 + j2;
                }
                zzju zzju2 = new zzju(this.f3883b, j2, this.i);
                try {
                    zzjx b2 = this.f3884c.b(zzju2, this.f3883b.e0());
                    if (this.g) {
                        b2.f(j2, this.h);
                        this.g = false;
                    }
                    while (i2 == 0 && !this.f3887f) {
                        this.f3885d.a();
                        i2 = b2.c(zzju2, this.f3886e);
                        if (zzju2.getPosition() > this.j.j + j2) {
                            j2 = zzju2.getPosition();
                            this.f3885d.c();
                            this.j.p.post(this.j.o);
                        }
                    }
                    if (i2 == 1) {
                        i2 = 0;
                    } else {
                        this.f3886e.f8811a = zzju2.getPosition();
                    }
                    zzpo.e(this.f3883b);
                } catch (Throwable th) {
                    th = th;
                    zzju = zzju2;
                    this.f3886e.f8811a = zzju.getPosition();
                    zzpo.e(this.f3883b);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (!(i2 == 1 || zzju == null)) {
                    this.f3886e.f8811a = zzju.getPosition();
                }
                zzpo.e(this.f3883b);
                throw th;
            }
        }
    }

    public final void e(long j2, long j3) {
        this.f3886e.f8811a = j2;
        this.h = j3;
        this.g = true;
    }
}
