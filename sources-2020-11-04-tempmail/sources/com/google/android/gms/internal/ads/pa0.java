package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class pa0 implements zzhe {

    /* renamed from: a  reason: collision with root package name */
    private final zzhv[] f4808a;

    /* renamed from: b  reason: collision with root package name */
    private final zzoe f4809b;

    /* renamed from: c  reason: collision with root package name */
    private final zzof f4810c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f4811d;

    /* renamed from: e  reason: collision with root package name */
    private final qa0 f4812e;

    /* renamed from: f  reason: collision with root package name */
    private final CopyOnWriteArraySet<zzhd> f4813f;
    private final zzib g;
    private final zzic h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private zzia o;
    private Object p;
    private zznr q;
    private zzof r;
    private zzhw s;
    private zzhl t;
    private int u;
    private long v;

    @SuppressLint({"HandlerLeak"})
    public pa0(zzhv[] zzhvArr, zzoe zzoe, zzhu zzhu) {
        String str = zzpo.f9182e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        zzpb.e(zzhvArr.length > 0);
        zzpb.d(zzhvArr);
        this.f4808a = zzhvArr;
        zzpb.d(zzoe);
        this.f4809b = zzoe;
        this.j = false;
        this.k = 1;
        this.f4813f = new CopyOnWriteArraySet<>();
        this.f4810c = new zzof(new zzod[zzhvArr.length]);
        this.o = zzia.f8927a;
        this.g = new zzib();
        this.h = new zzic();
        this.q = zznr.f9095d;
        this.r = this.f4810c;
        this.s = zzhw.f8921d;
        this.f4811d = new ra0(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        zzhl zzhl = new zzhl(0, 0);
        this.t = zzhl;
        this.f4812e = new qa0(zzhvArr, zzoe, zzhu, this.j, 0, this.f4811d, zzhl, this);
    }

    private final int l() {
        if (this.o.a() || this.l > 0) {
            return this.u;
        }
        this.o.e(this.t.f8907a, this.h, false);
        return 0;
    }

    public final void a(zznb zznb) {
        if (!this.o.a() || this.p != null) {
            this.o = zzia.f8927a;
            this.p = null;
            Iterator<zzhd> it = this.f4813f.iterator();
            while (it.hasNext()) {
                it.next().h(this.o, this.p);
            }
        }
        if (this.i) {
            this.i = false;
            this.q = zznr.f9095d;
            this.r = this.f4810c;
            this.f4809b.d((Object) null);
            Iterator<zzhd> it2 = this.f4813f.iterator();
            while (it2.hasNext()) {
                it2.next().r(this.q, this.r);
            }
        }
        this.m++;
        this.f4812e.p(zznb, true);
    }

    public final boolean b() {
        return this.j;
    }

    public final int c() {
        return this.f4808a.length;
    }

    public final void d(zzhf... zzhfArr) {
        this.f4812e.x(zzhfArr);
    }

    public final void e(zzhf... zzhfArr) {
        this.f4812e.r(zzhfArr);
    }

    public final void f(zzhd zzhd) {
        this.f4813f.add(zzhd);
    }

    public final long g() {
        if (this.o.a() || this.l > 0) {
            return this.v;
        }
        this.o.e(this.t.f8907a, this.h, false);
        return this.h.b() + zzhc.a(this.t.f8910d);
    }

    public final long getDuration() {
        if (this.o.a()) {
            return -9223372036854775807L;
        }
        return zzhc.a(this.o.c(l(), this.g, false).i);
    }

    public final int getPlaybackState() {
        return this.k;
    }

    public final long h() {
        if (this.o.a() || this.l > 0) {
            return this.v;
        }
        this.o.e(this.t.f8907a, this.h, false);
        return this.h.b() + zzhc.a(this.t.f8909c);
    }

    public final void i(zzhd zzhd) {
        this.f4813f.remove(zzhd);
    }

    public final void j(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.f4812e.G(z);
            Iterator<zzhd> it = this.f4813f.iterator();
            while (it.hasNext()) {
                it.next().j(z, this.k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void k(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.m--;
                return;
            case 1:
                this.k = message.arg1;
                Iterator<zzhd> it = this.f4813f.iterator();
                while (it.hasNext()) {
                    it.next().j(this.j, this.k);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.n = z;
                Iterator<zzhd> it2 = this.f4813f.iterator();
                while (it2.hasNext()) {
                    it2.next().p(this.n);
                }
                return;
            case 3:
                if (this.m == 0) {
                    zzog zzog = (zzog) message.obj;
                    this.i = true;
                    this.q = zzog.f9117a;
                    this.r = zzog.f9118b;
                    this.f4809b.d(zzog.f9119c);
                    Iterator<zzhd> it3 = this.f4813f.iterator();
                    while (it3.hasNext()) {
                        it3.next().r(this.q, this.r);
                    }
                    return;
                }
                return;
            case 4:
                int i2 = this.l - 1;
                this.l = i2;
                if (i2 == 0) {
                    this.t = (zzhl) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<zzhd> it4 = this.f4813f.iterator();
                        while (it4.hasNext()) {
                            it4.next().a();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.l == 0) {
                    this.t = (zzhl) message.obj;
                    Iterator<zzhd> it5 = this.f4813f.iterator();
                    while (it5.hasNext()) {
                        it5.next().a();
                    }
                    return;
                }
                return;
            case 6:
                zzhn zzhn = (zzhn) message.obj;
                this.l -= zzhn.f8914d;
                if (this.m == 0) {
                    this.o = zzhn.f8911a;
                    this.p = zzhn.f8912b;
                    this.t = zzhn.f8913c;
                    Iterator<zzhd> it6 = this.f4813f.iterator();
                    while (it6.hasNext()) {
                        it6.next().h(this.o, this.p);
                    }
                    return;
                }
                return;
            case 7:
                zzhw zzhw = (zzhw) message.obj;
                if (!this.s.equals(zzhw)) {
                    this.s = zzhw;
                    Iterator<zzhd> it7 = this.f4813f.iterator();
                    while (it7.hasNext()) {
                        it7.next().o(zzhw);
                    }
                    return;
                }
                return;
            case 8:
                zzhb zzhb = (zzhb) message.obj;
                Iterator<zzhd> it8 = this.f4813f.iterator();
                while (it8.hasNext()) {
                    it8.next().g(zzhb);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public final void release() {
        this.f4812e.d();
        this.f4811d.removeCallbacksAndMessages((Object) null);
    }

    public final void seekTo(long j2) {
        long j3;
        int l2 = l();
        if (l2 < 0 || (!this.o.a() && l2 >= this.o.g())) {
            throw new zzhr(this.o, l2, j2);
        }
        this.l++;
        this.u = l2;
        if (!this.o.a()) {
            this.o.c(l2, this.g, false);
            if (j2 == -9223372036854775807L) {
                j3 = this.g.h;
            } else {
                j3 = zzhc.b(j2);
            }
            long j4 = this.g.j + j3;
            long j5 = this.o.e(0, this.h, false).f8936c;
            if (j5 != -9223372036854775807L) {
                int i2 = (j4 > j5 ? 1 : (j4 == j5 ? 0 : -1));
            }
        }
        if (j2 == -9223372036854775807L) {
            this.v = 0;
            this.f4812e.o(this.o, l2, -9223372036854775807L);
            return;
        }
        this.v = j2;
        this.f4812e.o(this.o, l2, zzhc.b(j2));
        Iterator<zzhd> it = this.f4813f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void stop() {
        this.f4812e.g();
    }
}
