package org.jsoup.e;

import java.io.Reader;
import java.util.ArrayList;
import org.jsoup.b.c;
import org.jsoup.d.b;
import org.jsoup.d.f;
import org.jsoup.d.h;
import org.jsoup.e.i;

/* compiled from: TreeBuilder */
abstract class l {

    /* renamed from: a  reason: collision with root package name */
    a f14687a;

    /* renamed from: b  reason: collision with root package name */
    j f14688b;

    /* renamed from: c  reason: collision with root package name */
    protected f f14689c;

    /* renamed from: d  reason: collision with root package name */
    protected ArrayList<h> f14690d;

    /* renamed from: e  reason: collision with root package name */
    protected String f14691e;

    /* renamed from: f  reason: collision with root package name */
    protected i f14692f;
    protected e g;
    protected f h;
    private i.h i = new i.h();
    private i.g j = new i.g();

    l() {
    }

    /* access modifiers changed from: protected */
    public h a() {
        int size = this.f14690d.size();
        if (size > 0) {
            return this.f14690d.get(size - 1);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void b(Reader reader, String str, e eVar, f fVar) {
        c.j(reader, "String input must not be null");
        c.j(str, "BaseURI must not be null");
        this.f14689c = new f(str);
        this.h = fVar;
        this.f14687a = new a(reader);
        this.g = eVar;
        this.f14692f = null;
        this.f14688b = new j(this.f14687a, eVar);
        this.f14690d = new ArrayList<>(32);
        this.f14691e = str;
    }

    /* access modifiers changed from: package-private */
    public f c(Reader reader, String str, e eVar, f fVar) {
        b(reader, str, eVar, fVar);
        h();
        return this.f14689c;
    }

    /* access modifiers changed from: protected */
    public abstract boolean d(i iVar);

    /* access modifiers changed from: protected */
    public boolean e(String str) {
        i iVar = this.f14692f;
        i.g gVar = this.j;
        if (iVar == gVar) {
            i.g gVar2 = new i.g();
            gVar2.B(str);
            return d(gVar2);
        }
        gVar.m();
        gVar.B(str);
        return d(gVar);
    }

    /* access modifiers changed from: protected */
    public boolean f(String str) {
        i iVar = this.f14692f;
        i.h hVar = this.i;
        if (iVar == hVar) {
            i.h hVar2 = new i.h();
            hVar2.B(str);
            return d(hVar2);
        }
        hVar.E();
        hVar.B(str);
        return d(hVar);
    }

    public boolean g(String str, b bVar) {
        i iVar = this.f14692f;
        i.h hVar = this.i;
        if (iVar == hVar) {
            i.h hVar2 = new i.h();
            hVar2.G(str, bVar);
            return d(hVar2);
        }
        hVar.E();
        this.i.G(str, bVar);
        return d(this.i);
    }

    /* access modifiers changed from: protected */
    public void h() {
        i t;
        do {
            t = this.f14688b.t();
            d(t);
            t.m();
        } while (t.f14658a != i.j.EOF);
    }
}
