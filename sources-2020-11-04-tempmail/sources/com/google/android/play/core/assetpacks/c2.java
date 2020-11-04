package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.y;
import java.io.File;
import java.util.concurrent.Executor;

final class c2 {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f11206a;

    /* renamed from: b  reason: collision with root package name */
    private final y<j3> f11207b;

    /* renamed from: c  reason: collision with root package name */
    private final m1 f11208c;

    /* renamed from: d  reason: collision with root package name */
    private final y<Executor> f11209d;

    /* renamed from: e  reason: collision with root package name */
    private final y0 f11210e;

    c2(b0 b0Var, y<j3> yVar, m1 m1Var, y<Executor> yVar2, y0 y0Var) {
        this.f11206a = b0Var;
        this.f11207b = yVar;
        this.f11208c = m1Var;
        this.f11209d = yVar2;
        this.f11210e = y0Var;
    }

    public final void a(a2 a2Var) {
        File m = this.f11206a.m(a2Var.f11349b, a2Var.f11193c, a2Var.f11194d);
        File v = this.f11206a.v(a2Var.f11349b, a2Var.f11193c, a2Var.f11194d);
        if (!m.exists() || !v.exists()) {
            throw new v0(String.format("Cannot find pack files to move for pack %s.", new Object[]{a2Var.f11349b}), a2Var.f11348a);
        }
        File b2 = this.f11206a.b(a2Var.f11349b, a2Var.f11193c, a2Var.f11194d);
        b2.mkdirs();
        if (m.renameTo(b2)) {
            new File(this.f11206a.b(a2Var.f11349b, a2Var.f11193c, a2Var.f11194d), "merge.tmp").delete();
            File j = this.f11206a.j(a2Var.f11349b, a2Var.f11193c, a2Var.f11194d);
            j.mkdirs();
            if (v.renameTo(j)) {
                b0 b0Var = this.f11206a;
                b0Var.getClass();
                this.f11209d.d().execute(b2.a(b0Var));
                this.f11208c.d(a2Var.f11349b, a2Var.f11193c, a2Var.f11194d);
                this.f11210e.b(a2Var.f11349b);
                this.f11207b.d().a(a2Var.f11348a, a2Var.f11349b);
                return;
            }
            throw new v0("Cannot move metadata files to final location.", a2Var.f11348a);
        }
        throw new v0("Cannot move merged pack files to final location.", a2Var.f11348a);
    }
}
