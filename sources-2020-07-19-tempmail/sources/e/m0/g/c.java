package e.m0.g;

import e.g0;
import e.i;
import e.i0;
import e.m0.h.d;
import e.m0.h.e;
import e.y;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* compiled from: CacheStrategy */
public final class c {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final g0 f14115a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final i0 f14116b;

    /* compiled from: CacheStrategy */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final long f14117a;

        /* renamed from: b  reason: collision with root package name */
        final g0 f14118b;

        /* renamed from: c  reason: collision with root package name */
        final i0 f14119c;

        /* renamed from: d  reason: collision with root package name */
        private Date f14120d;

        /* renamed from: e  reason: collision with root package name */
        private String f14121e;

        /* renamed from: f  reason: collision with root package name */
        private Date f14122f;
        private String g;
        private Date h;
        private long i;
        private long j;
        private String k;
        private int l = -1;

        public a(long j2, g0 g0Var, i0 i0Var) {
            this.f14117a = j2;
            this.f14118b = g0Var;
            this.f14119c = i0Var;
            if (i0Var != null) {
                this.i = i0Var.r();
                this.j = i0Var.p();
                y h2 = i0Var.h();
                int h3 = h2.h();
                for (int i2 = 0; i2 < h3; i2++) {
                    String e2 = h2.e(i2);
                    String i3 = h2.i(i2);
                    if ("Date".equalsIgnoreCase(e2)) {
                        this.f14120d = d.b(i3);
                        this.f14121e = i3;
                    } else if ("Expires".equalsIgnoreCase(e2)) {
                        this.h = d.b(i3);
                    } else if ("Last-Modified".equalsIgnoreCase(e2)) {
                        this.f14122f = d.b(i3);
                        this.g = i3;
                    } else if ("ETag".equalsIgnoreCase(e2)) {
                        this.k = i3;
                    } else if ("Age".equalsIgnoreCase(e2)) {
                        this.l = e.d(i3, -1);
                    }
                }
            }
        }

        private long a() {
            Date date = this.f14120d;
            long j2 = 0;
            if (date != null) {
                j2 = Math.max(0, this.j - date.getTime());
            }
            int i2 = this.l;
            if (i2 != -1) {
                j2 = Math.max(j2, TimeUnit.SECONDS.toMillis((long) i2));
            }
            long j3 = this.j;
            return j2 + (j3 - this.i) + (this.f14117a - j3);
        }

        private long b() {
            long j2;
            long j3;
            i b2 = this.f14119c.b();
            if (b2.d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) b2.d());
            }
            if (this.h != null) {
                Date date = this.f14120d;
                if (date != null) {
                    j3 = date.getTime();
                } else {
                    j3 = this.j;
                }
                long time = this.h.getTime() - j3;
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f14122f == null || this.f14119c.q().i().A() != null) {
                return 0;
            } else {
                Date date2 = this.f14120d;
                if (date2 != null) {
                    j2 = date2.getTime();
                } else {
                    j2 = this.i;
                }
                long time2 = j2 - this.f14122f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        private c d() {
            if (this.f14119c == null) {
                return new c(this.f14118b, (i0) null);
            }
            if (this.f14118b.e() && this.f14119c.e() == null) {
                return new c(this.f14118b, (i0) null);
            }
            if (!c.a(this.f14119c, this.f14118b)) {
                return new c(this.f14118b, (i0) null);
            }
            i b2 = this.f14118b.b();
            if (b2.h() || e(this.f14118b)) {
                return new c(this.f14118b, (i0) null);
            }
            i b3 = this.f14119c.b();
            long a2 = a();
            long b4 = b();
            if (b2.d() != -1) {
                b4 = Math.min(b4, TimeUnit.SECONDS.toMillis((long) b2.d()));
            }
            long j2 = 0;
            long millis = b2.f() != -1 ? TimeUnit.SECONDS.toMillis((long) b2.f()) : 0;
            if (!b3.g() && b2.e() != -1) {
                j2 = TimeUnit.SECONDS.toMillis((long) b2.e());
            }
            if (!b3.h()) {
                long j3 = millis + a2;
                if (j3 < j2 + b4) {
                    i0.a n = this.f14119c.n();
                    if (j3 >= b4) {
                        n.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a2 > 86400000 && f()) {
                        n.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new c((g0) null, n.c());
                }
            }
            String str = this.k;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f14122f != null) {
                str = this.g;
            } else if (this.f14120d == null) {
                return new c(this.f14118b, (i0) null);
            } else {
                str = this.f14121e;
            }
            y.a f2 = this.f14118b.d().f();
            e.m0.c.f14102a.b(f2, str2, str);
            g0.a g2 = this.f14118b.g();
            g2.d(f2.f());
            return new c(g2.a(), this.f14119c);
        }

        private static boolean e(g0 g0Var) {
            return (g0Var.c("If-Modified-Since") == null && g0Var.c("If-None-Match") == null) ? false : true;
        }

        private boolean f() {
            return this.f14119c.b().d() == -1 && this.h == null;
        }

        public c c() {
            c d2 = d();
            return (d2.f14115a == null || !this.f14118b.b().j()) ? d2 : new c((g0) null, (i0) null);
        }
    }

    c(g0 g0Var, i0 i0Var) {
        this.f14115a = g0Var;
        this.f14116b = i0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.b().b() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(e.i0 r3, e.g0 r4) {
        /*
            int r0 = r3.d()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.f(r0)
            if (r0 != 0) goto L_0x005a
            e.i r0 = r3.b()
            int r0 = r0.d()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            e.i r0 = r3.b()
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x005a
            e.i r0 = r3.b()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            e.i r3 = r3.b()
            boolean r3 = r3.i()
            if (r3 != 0) goto L_0x006f
            e.i r3 = r4.b()
            boolean r3 = r3.i()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.m0.g.c.a(e.i0, e.g0):boolean");
    }
}
