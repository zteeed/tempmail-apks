package a.a.n;

import a.h.k.a0;
import a.h.k.y;
import a.h.k.z;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet */
public class h {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<y> f66a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private long f67b = -1;

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f68c;

    /* renamed from: d  reason: collision with root package name */
    z f69d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f70e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f71f = new a();

    /* compiled from: ViewPropertyAnimatorCompatSet */
    class a extends a0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f72a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f73b = 0;

        a() {
        }

        public void b(View view) {
            int i = this.f73b + 1;
            this.f73b = i;
            if (i == h.this.f66a.size()) {
                z zVar = h.this.f69d;
                if (zVar != null) {
                    zVar.b((View) null);
                }
                d();
            }
        }

        public void c(View view) {
            if (!this.f72a) {
                this.f72a = true;
                z zVar = h.this.f69d;
                if (zVar != null) {
                    zVar.c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f73b = 0;
            this.f72a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f70e) {
            Iterator<y> it = this.f66a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f70e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f70e = false;
    }

    public h c(y yVar) {
        if (!this.f70e) {
            this.f66a.add(yVar);
        }
        return this;
    }

    public h d(y yVar, y yVar2) {
        this.f66a.add(yVar);
        yVar2.h(yVar.c());
        this.f66a.add(yVar2);
        return this;
    }

    public h e(long j) {
        if (!this.f70e) {
            this.f67b = j;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f70e) {
            this.f68c = interpolator;
        }
        return this;
    }

    public h g(z zVar) {
        if (!this.f70e) {
            this.f69d = zVar;
        }
        return this;
    }

    public void h() {
        if (!this.f70e) {
            Iterator<y> it = this.f66a.iterator();
            while (it.hasNext()) {
                y next = it.next();
                long j = this.f67b;
                if (j >= 0) {
                    next.d(j);
                }
                Interpolator interpolator = this.f68c;
                if (interpolator != null) {
                    next.e(interpolator);
                }
                if (this.f69d != null) {
                    next.f(this.f71f);
                }
                next.j();
            }
            this.f70e = true;
        }
    }
}
