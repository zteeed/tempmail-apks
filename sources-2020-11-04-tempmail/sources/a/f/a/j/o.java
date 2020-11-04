package a.f.a.j;

import a.f.a.j.e;
import java.util.ArrayList;

/* compiled from: Snapshot */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private int f242a;

    /* renamed from: b  reason: collision with root package name */
    private int f243b;

    /* renamed from: c  reason: collision with root package name */
    private int f244c;

    /* renamed from: d  reason: collision with root package name */
    private int f245d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<a> f246e = new ArrayList<>();

    /* compiled from: Snapshot */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private e f247a;

        /* renamed from: b  reason: collision with root package name */
        private e f248b;

        /* renamed from: c  reason: collision with root package name */
        private int f249c;

        /* renamed from: d  reason: collision with root package name */
        private e.c f250d;

        /* renamed from: e  reason: collision with root package name */
        private int f251e;

        public a(e eVar) {
            this.f247a = eVar;
            this.f248b = eVar.i();
            this.f249c = eVar.d();
            this.f250d = eVar.h();
            this.f251e = eVar.c();
        }

        public void a(f fVar) {
            fVar.h(this.f247a.j()).b(this.f248b, this.f249c, this.f250d, this.f251e);
        }

        public void b(f fVar) {
            e h = fVar.h(this.f247a.j());
            this.f247a = h;
            if (h != null) {
                this.f248b = h.i();
                this.f249c = this.f247a.d();
                this.f250d = this.f247a.h();
                this.f251e = this.f247a.c();
                return;
            }
            this.f248b = null;
            this.f249c = 0;
            this.f250d = e.c.STRONG;
            this.f251e = 0;
        }
    }

    public o(f fVar) {
        this.f242a = fVar.G();
        this.f243b = fVar.H();
        this.f244c = fVar.D();
        this.f245d = fVar.r();
        ArrayList<e> i = fVar.i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f246e.add(new a(i.get(i2)));
        }
    }

    public void a(f fVar) {
        fVar.C0(this.f242a);
        fVar.D0(this.f243b);
        fVar.y0(this.f244c);
        fVar.b0(this.f245d);
        int size = this.f246e.size();
        for (int i = 0; i < size; i++) {
            this.f246e.get(i).a(fVar);
        }
    }

    public void b(f fVar) {
        this.f242a = fVar.G();
        this.f243b = fVar.H();
        this.f244c = fVar.D();
        this.f245d = fVar.r();
        int size = this.f246e.size();
        for (int i = 0; i < size; i++) {
            this.f246e.get(i).b(fVar);
        }
    }
}
