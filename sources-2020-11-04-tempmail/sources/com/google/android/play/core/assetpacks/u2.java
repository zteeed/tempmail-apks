package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.y;
import com.google.android.play.core.splitinstall.b;
import com.google.android.play.core.tasks.c;
import java.util.List;
import java.util.concurrent.Executor;

final class u2 {

    /* renamed from: e  reason: collision with root package name */
    private static final a f11414e = new a("AssetPackManager");

    /* renamed from: a  reason: collision with root package name */
    private final b0 f11415a;

    /* renamed from: b  reason: collision with root package name */
    private final y<j3> f11416b;

    /* renamed from: c  reason: collision with root package name */
    private final v f11417c;

    /* renamed from: d  reason: collision with root package name */
    private final y<Executor> f11418d;

    u2(b0 b0Var, y<j3> yVar, v vVar, b bVar, m1 m1Var, y0 y0Var, n0 n0Var, y<Executor> yVar2) {
        new Handler(Looper.getMainLooper());
        this.f11415a = b0Var;
        this.f11416b = yVar;
        this.f11417c = vVar;
        this.f11418d = yVar2;
    }

    private final void d() {
        this.f11418d.d().execute(new r2(this));
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        boolean f2 = this.f11417c.f();
        this.f11417c.d(z);
        if (z && !f2) {
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        c<List<String>> T = this.f11416b.d().T(this.f11415a.l());
        b0 b0Var = this.f11415a;
        b0Var.getClass();
        T.d(this.f11418d.d(), s2.a(b0Var));
        T.b(this.f11418d.d(), t2.f11401a);
    }
}
