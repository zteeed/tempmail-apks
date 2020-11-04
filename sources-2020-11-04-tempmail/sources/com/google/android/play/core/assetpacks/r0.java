package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.b0;
import com.google.android.play.core.internal.z;
import com.google.android.play.core.splitinstall.b;
import java.util.concurrent.Executor;

public final class r0 implements d {

    /* renamed from: a  reason: collision with root package name */
    private final z2 f11372a;

    /* renamed from: b  reason: collision with root package name */
    private b0<Context> f11373b;

    /* renamed from: c  reason: collision with root package name */
    private b0<e2> f11374c;

    /* renamed from: d  reason: collision with root package name */
    private b0<b0> f11375d;

    /* renamed from: e  reason: collision with root package name */
    private b0<y0> f11376e;

    /* renamed from: f  reason: collision with root package name */
    private b0<q> f11377f;
    private b0<String> g = a0.a(new f3(this.f11373b));
    private b0<j3> h = new z();
    private b0<Executor> i;
    private b0<m1> j;
    private b0<v> k;
    private b0<t0> l;
    private b0<o2> m;
    private b0<y1> n;
    private b0<c2> o;
    private b0<h2> p;
    private b0<k0> q;
    private b0<p1> r;
    private b0<w0> s;
    private b0<n0> t;
    private b0<Executor> u;
    private b0<u1> v;
    private b0<b> w;
    private b0<u2> x;

    /* synthetic */ r0(z2 z2Var) {
        this.f11372a = z2Var;
        e3 e3Var = new e3(z2Var);
        this.f11373b = e3Var;
        b0<e2> a2 = a0.a(new f2(e3Var));
        this.f11374c = a2;
        this.f11375d = a0.a(new c0(this.f11373b, a2));
        b0<y0> a3 = a0.a(z0.f11466a);
        this.f11376e = a3;
        this.f11377f = a0.a(new r(this.f11373b, a3));
        b0<Executor> a4 = a0.a(a3.f11195a);
        this.i = a4;
        this.j = a0.a(new n1(this.f11375d, this.h, this.f11376e, a4));
        z zVar = new z();
        this.k = zVar;
        this.l = a0.a(new u0(this.f11375d, this.h, zVar, this.f11376e));
        this.m = a0.a(new p2(this.f11375d));
        this.n = a0.a(new z1(this.f11375d));
        this.o = a0.a(new d2(this.f11375d, this.h, this.j, this.i, this.f11376e));
        this.p = a0.a(new i2(this.f11375d, this.h));
        b0<k0> a5 = a0.a(new l0(this.h));
        this.q = a5;
        b0<p1> a6 = a0.a(new q1(this.j, this.f11375d, a5));
        this.r = a6;
        this.s = a0.a(new x0(this.j, this.h, this.l, this.m, this.n, this.o, this.p, a6));
        this.t = a0.a(o0.f11347a);
        b0<Executor> a7 = a0.a(h3.f11276a);
        this.u = a7;
        z.a(this.k, a0.a(new w(this.f11373b, this.j, this.s, this.h, this.f11376e, this.t, this.i, a7)));
        b0<u1> a8 = a0.a(new v1(this.g, this.k, this.f11376e, this.f11373b, this.f11374c, this.i));
        this.v = a8;
        z.a(this.h, a0.a(new d3(this.f11373b, this.f11377f, a8)));
        b0<b> a9 = a0.a(new g3(this.f11373b));
        this.w = a9;
        b0<u2> a10 = a0.a(new v2(this.f11375d, this.h, this.k, a9, this.j, this.f11376e, this.t, this.i));
        this.x = a10;
        a0.a(new c3(a10, this.f11373b));
    }

    public final void a(AssetPackExtractionService assetPackExtractionService) {
        assetPackExtractionService.f11188c = e3.a(this.f11372a);
        assetPackExtractionService.f11189d = this.x.d();
        assetPackExtractionService.f11190e = this.f11375d.d();
    }
}
