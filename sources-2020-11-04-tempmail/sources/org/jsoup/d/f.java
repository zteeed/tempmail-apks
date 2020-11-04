package org.jsoup.d;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.jsoup.d.i;
import org.jsoup.e.h;

/* compiled from: Document */
public class f extends h {
    private a i = new a();
    private b j = b.noQuirks;

    /* compiled from: Document */
    public static class a implements Cloneable {

        /* renamed from: b  reason: collision with root package name */
        private i.c f15160b = i.c.base;

        /* renamed from: c  reason: collision with root package name */
        private Charset f15161c;

        /* renamed from: d  reason: collision with root package name */
        private ThreadLocal<CharsetEncoder> f15162d = new ThreadLocal<>();

        /* renamed from: e  reason: collision with root package name */
        i.b f15163e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f15164f = true;
        private boolean g = false;
        private int h = 1;
        private C0165a i = C0165a.html;

        /* renamed from: org.jsoup.d.f$a$a  reason: collision with other inner class name */
        /* compiled from: Document */
        public enum C0165a {
            html,
            xml
        }

        public a() {
            c(Charset.forName("UTF8"));
        }

        public a b(String str) {
            c(Charset.forName(str));
            return this;
        }

        public a c(Charset charset) {
            this.f15161c = charset;
            return this;
        }

        /* renamed from: d */
        public a clone() {
            try {
                a aVar = (a) super.clone();
                aVar.b(this.f15161c.name());
                aVar.f15160b = i.c.valueOf(this.f15160b.name());
                return aVar;
            } catch (CloneNotSupportedException e2) {
                throw new RuntimeException(e2);
            }
        }

        /* access modifiers changed from: package-private */
        public CharsetEncoder e() {
            CharsetEncoder charsetEncoder = this.f15162d.get();
            return charsetEncoder != null ? charsetEncoder : j();
        }

        public i.c f() {
            return this.f15160b;
        }

        public int g() {
            return this.h;
        }

        public boolean i() {
            return this.g;
        }

        /* access modifiers changed from: package-private */
        public CharsetEncoder j() {
            CharsetEncoder newEncoder = this.f15161c.newEncoder();
            this.f15162d.set(newEncoder);
            this.f15163e = i.b.f(newEncoder.charset().name());
            return newEncoder;
        }

        public boolean k() {
            return this.f15164f;
        }

        public C0165a l() {
            return this.i;
        }
    }

    /* compiled from: Document */
    public enum b {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public f(String str) {
        super(h.k("#root", org.jsoup.e.f.f15217c), str);
    }

    public String C() {
        return "#document";
    }

    public String E() {
        return super.j0();
    }

    /* renamed from: r0 */
    public f n() {
        f fVar = (f) super.n();
        fVar.i = this.i.clone();
        return fVar;
    }

    public a s0() {
        return this.i;
    }

    public b t0() {
        return this.j;
    }

    public f u0(b bVar) {
        this.j = bVar;
        return this;
    }
}
