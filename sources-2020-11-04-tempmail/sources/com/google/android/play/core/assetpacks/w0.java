package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.y;
import java.util.concurrent.atomic.AtomicBoolean;

final class w0 {
    private static final a j = new a("ExtractorLooper");

    /* renamed from: a  reason: collision with root package name */
    private final m1 f11438a;

    /* renamed from: b  reason: collision with root package name */
    private final t0 f11439b;

    /* renamed from: c  reason: collision with root package name */
    private final o2 f11440c;

    /* renamed from: d  reason: collision with root package name */
    private final y1 f11441d;

    /* renamed from: e  reason: collision with root package name */
    private final c2 f11442e;

    /* renamed from: f  reason: collision with root package name */
    private final h2 f11443f;
    private final y<j3> g;
    private final p1 h;
    private final AtomicBoolean i = new AtomicBoolean(false);

    w0(m1 m1Var, y<j3> yVar, t0 t0Var, o2 o2Var, y1 y1Var, c2 c2Var, h2 h2Var, p1 p1Var) {
        this.f11438a = m1Var;
        this.g = yVar;
        this.f11439b = t0Var;
        this.f11440c = o2Var;
        this.f11441d = y1Var;
        this.f11442e = c2Var;
        this.f11443f = h2Var;
        this.h = p1Var;
    }

    private final void b(int i2, Exception exc) {
        try {
            this.f11438a.p(i2);
            this.f11438a.c(i2);
        } catch (v0 unused) {
            j.e("Error during error handling: %s", exc.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        j.c("Run extractor loop", new Object[0]);
        if (this.i.compareAndSet(false, true)) {
            while (true) {
                o1 o1Var = null;
                try {
                    o1Var = this.h.a();
                } catch (v0 e2) {
                    j.e("Error while getting next extraction task: %s", e2.getMessage());
                    if (e2.f11419b >= 0) {
                        this.g.d().S(e2.f11419b);
                        b(e2.f11419b, e2);
                    }
                }
                if (o1Var != null) {
                    try {
                        if (o1Var instanceof s0) {
                            this.f11439b.a((s0) o1Var);
                        } else if (o1Var instanceof n2) {
                            this.f11440c.a((n2) o1Var);
                        } else if (o1Var instanceof x1) {
                            this.f11441d.a((x1) o1Var);
                        } else if (o1Var instanceof a2) {
                            this.f11442e.a((a2) o1Var);
                        } else if (!(o1Var instanceof g2)) {
                            j.e("Unknown task type: %s", o1Var.getClass().getName());
                        } else {
                            this.f11443f.a((g2) o1Var);
                        }
                    } catch (Exception e3) {
                        j.e("Error during extraction task: %s", e3.getMessage());
                        this.g.d().S(o1Var.f11348a);
                        b(o1Var.f11348a, e3);
                    }
                } else {
                    this.i.set(false);
                    return;
                }
            }
        } else {
            j.g("runLoop already looping; return", new Object[0]);
        }
    }
}
