package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class gd0 implements zzow {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f4065a;

    /* renamed from: b  reason: collision with root package name */
    private final zzok f4066b;

    /* renamed from: c  reason: collision with root package name */
    private final jd0 f4067c;

    /* renamed from: d  reason: collision with root package name */
    private final zzpd f4068d;

    /* renamed from: e  reason: collision with root package name */
    private final zzkd f4069e = new zzkd();

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f4070f;
    private boolean g = true;
    private long h;
    /* access modifiers changed from: private */
    public long i = -1;
    private final /* synthetic */ dd0 j;

    public gd0(dd0 dd0, Uri uri, zzok zzok, jd0 jd0, zzpd zzpd) {
        this.j = dd0;
        zzpb.d(uri);
        this.f4065a = uri;
        zzpb.d(zzok);
        this.f4066b = zzok;
        zzpb.d(jd0);
        this.f4067c = jd0;
        this.f4068d = zzpd;
    }

    public final boolean a() {
        return this.f4070f;
    }

    public final void b() {
        this.f4070f = true;
    }

    public final void c() throws IOException, InterruptedException {
        int i2 = 0;
        while (i2 == 0 && !this.f4070f) {
            zzju zzju = null;
            try {
                long j2 = this.f4069e.f8994a;
                long a2 = this.f4066b.a(new zzop(this.f4065a, j2, -1, this.j.i));
                this.i = a2;
                if (a2 != -1) {
                    this.i = a2 + j2;
                }
                zzju zzju2 = new zzju(this.f4066b, j2, this.i);
                try {
                    zzjx b2 = this.f4067c.b(zzju2, this.f4066b.k0());
                    if (this.g) {
                        b2.f(j2, this.h);
                        this.g = false;
                    }
                    while (i2 == 0 && !this.f4070f) {
                        this.f4068d.a();
                        i2 = b2.c(zzju2, this.f4069e);
                        if (zzju2.getPosition() > this.j.j + j2) {
                            j2 = zzju2.getPosition();
                            this.f4068d.c();
                            this.j.p.post(this.j.o);
                        }
                    }
                    if (i2 == 1) {
                        i2 = 0;
                    } else {
                        this.f4069e.f8994a = zzju2.getPosition();
                    }
                    zzpo.e(this.f4066b);
                } catch (Throwable th) {
                    th = th;
                    zzju = zzju2;
                    this.f4069e.f8994a = zzju.getPosition();
                    zzpo.e(this.f4066b);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (!(i2 == 1 || zzju == null)) {
                    this.f4069e.f8994a = zzju.getPosition();
                }
                zzpo.e(this.f4066b);
                throw th;
            }
        }
    }

    public final void e(long j2, long j3) {
        this.f4069e.f8994a = j2;
        this.h = j3;
        this.g = true;
    }
}
