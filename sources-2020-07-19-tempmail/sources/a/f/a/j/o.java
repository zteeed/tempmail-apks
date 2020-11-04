package a.f.a.j;

import a.f.a.j.e;
import java.util.ArrayList;

/* compiled from: Snapshot */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private int f241a;

    /* renamed from: b  reason: collision with root package name */
    private int f242b;

    /* renamed from: c  reason: collision with root package name */
    private int f243c;

    /* renamed from: d  reason: collision with root package name */
    private int f244d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<a> f245e = new ArrayList<>();

    /* compiled from: Snapshot */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private e f246a;

        /* renamed from: b  reason: collision with root package name */
        private e f247b;

        /* renamed from: c  reason: collision with root package name */
        private int f248c;

        /* renamed from: d  reason: collision with root package name */
        private e.c f249d;

        /* renamed from: e  reason: collision with root package name */
        private int f250e;

        public a(e eVar) {
            this.f246a = eVar;
            this.f247b = eVar.i();
            this.f248c = eVar.d();
            this.f249d = eVar.h();
            this.f250e = eVar.c();
        }

        public void a(f fVar) {
            fVar.h(this.f246a.j()).b(this.f247b, this.f248c, this.f249d, this.f250e);
        }

        public void b(f fVar) {
            e h = fVar.h(this.f246a.j());
            this.f246a = h;
            if (h != null) {
                this.f247b = h.i();
                this.f248c = this.f246a.d();
                this.f249d = this.f246a.h();
                this.f250e = this.f246a.c();
                return;
            }
            this.f247b = null;
            this.f248c = 0;
            this.f249d = e.c.STRONG;
            this.f250e = 0;
        }
    }

    public o(f fVar) {
        this.f241a = fVar.G();
        this.f242b = fVar.H();
        this.f243c = fVar.D();
        this.f244d = fVar.r();
        ArrayList<e> i = fVar.i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f245e.add(new a(i.get(i2)));
        }
    }

    public void a(f fVar) {
        fVar.C0(this.f241a);
        fVar.D0(this.f242b);
        fVar.y0(this.f243c);
        fVar.b0(this.f244d);
        int size = this.f245e.size();
        for (int i = 0; i < size; i++) {
            this.f245e.get(i).a(fVar);
        }
    }

    public void b(f fVar) {
        this.f241a = fVar.G();
        this.f242b = fVar.H();
        this.f243c = fVar.D();
        this.f244d = fVar.r();
        int size = this.f245e.size();
        for (int i = 0; i < size; i++) {
            this.f245e.get(i).b(fVar);
        }
    }
}
