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
    a f15256a;

    /* renamed from: b  reason: collision with root package name */
    j f15257b;

    /* renamed from: c  reason: collision with root package name */
    protected f f15258c;

    /* renamed from: d  reason: collision with root package name */
    protected ArrayList<h> f15259d;

    /* renamed from: e  reason: collision with root package name */
    protected String f15260e;

    /* renamed from: f  reason: collision with root package name */
    protected i f15261f;
    protected e g;
    protected f h;
    private i.h i = new i.h();
    private i.g j = new i.g();

    l() {
    }

    /* access modifiers changed from: protected */
    public h a() {
        int size = this.f15259d.size();
        if (size > 0) {
            return this.f15259d.get(size - 1);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void b(Reader reader, String str, e eVar, f fVar) {
        c.j(reader, "String input must not be null");
        c.j(str, "BaseURI must not be null");
        this.f15258c = new f(str);
        this.h = fVar;
        this.f15256a = new a(reader);
        this.g = eVar;
        this.f15261f = null;
        this.f15257b = new j(this.f15256a, eVar);
        this.f15259d = new ArrayList<>(32);
        this.f15260e = str;
    }

    /* access modifiers changed from: package-private */
    public f c(Reader reader, String str, e eVar, f fVar) {
        b(reader, str, eVar, fVar);
        h();
        return this.f15258c;
    }

    /* access modifiers changed from: protected */
    public abstract boolean d(i iVar);

    /* access modifiers changed from: protected */
    public boolean e(String str) {
        i iVar = this.f15261f;
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
        i iVar = this.f15261f;
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
        i iVar = this.f15261f;
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
            t = this.f15257b.t();
            d(t);
            t.m();
        } while (t.f15227a != i.j.EOF);
    }
}
