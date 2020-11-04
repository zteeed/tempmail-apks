package a.f.a.j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintWidgetGroup */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public List<f> f227a;

    /* renamed from: b  reason: collision with root package name */
    int f228b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f229c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f230d = false;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f231e = {-1, -1};

    /* renamed from: f  reason: collision with root package name */
    List<f> f232f = new ArrayList();
    List<f> g = new ArrayList();
    HashSet<f> h = new HashSet<>();
    HashSet<f> i = new HashSet<>();
    List<f> j = new ArrayList();
    List<f> k = new ArrayList();

    h(List<f> list) {
        this.f227a = list;
    }

    private void e(ArrayList<f> arrayList, f fVar) {
        if (!fVar.d0) {
            arrayList.add(fVar);
            fVar.d0 = true;
            if (!fVar.L()) {
                if (fVar instanceof j) {
                    j jVar = (j) fVar;
                    int i2 = jVar.l0;
                    for (int i3 = 0; i3 < i2; i3++) {
                        e(arrayList, jVar.k0[i3]);
                    }
                }
                for (e eVar : fVar.A) {
                    e eVar2 = eVar.f198d;
                    if (eVar2 != null) {
                        f fVar2 = eVar2.f196b;
                        if (!(eVar2 == null || fVar2 == fVar.u())) {
                            e(arrayList, fVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(a.f.a.j.f r7) {
        /*
            r6 = this;
            boolean r0 = r7.b0
            if (r0 == 0) goto L_0x00de
            boolean r0 = r7.L()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            a.f.a.j.e r0 = r7.u
            a.f.a.j.e r0 = r0.f198d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x001d
            a.f.a.j.e r3 = r7.u
            a.f.a.j.e r3 = r3.f198d
            goto L_0x0021
        L_0x001d:
            a.f.a.j.e r3 = r7.s
            a.f.a.j.e r3 = r3.f198d
        L_0x0021:
            if (r3 == 0) goto L_0x0045
            a.f.a.j.f r4 = r3.f196b
            boolean r5 = r4.c0
            if (r5 != 0) goto L_0x002c
            r6.f(r4)
        L_0x002c:
            a.f.a.j.e$d r4 = r3.f197c
            a.f.a.j.e$d r5 = a.f.a.j.e.d.RIGHT
            if (r4 != r5) goto L_0x003c
            a.f.a.j.f r3 = r3.f196b
            int r4 = r3.I
            int r3 = r3.D()
            int r4 = r4 + r3
            goto L_0x0046
        L_0x003c:
            a.f.a.j.e$d r5 = a.f.a.j.e.d.LEFT
            if (r4 != r5) goto L_0x0045
            a.f.a.j.f r3 = r3.f196b
            int r4 = r3.I
            goto L_0x0046
        L_0x0045:
            r4 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x0050
            a.f.a.j.e r0 = r7.u
            int r0 = r0.d()
            int r4 = r4 - r0
            goto L_0x005c
        L_0x0050:
            a.f.a.j.e r0 = r7.s
            int r0 = r0.d()
            int r3 = r7.D()
            int r0 = r0 + r3
            int r4 = r4 + r0
        L_0x005c:
            int r0 = r7.D()
            int r0 = r4 - r0
            r7.f0(r0, r4)
            a.f.a.j.e r0 = r7.w
            a.f.a.j.e r0 = r0.f198d
            if (r0 == 0) goto L_0x0087
            a.f.a.j.f r1 = r0.f196b
            boolean r3 = r1.c0
            if (r3 != 0) goto L_0x0074
            r6.f(r1)
        L_0x0074:
            a.f.a.j.f r0 = r0.f196b
            int r1 = r0.J
            int r0 = r0.Q
            int r1 = r1 + r0
            int r0 = r7.Q
            int r1 = r1 - r0
            int r0 = r7.F
            int r0 = r0 + r1
            r7.t0(r1, r0)
            r7.c0 = r2
            return
        L_0x0087:
            a.f.a.j.e r0 = r7.v
            a.f.a.j.e r0 = r0.f198d
            if (r0 == 0) goto L_0x008e
            r1 = 1
        L_0x008e:
            if (r1 == 0) goto L_0x0095
            a.f.a.j.e r0 = r7.v
            a.f.a.j.e r0 = r0.f198d
            goto L_0x0099
        L_0x0095:
            a.f.a.j.e r0 = r7.t
            a.f.a.j.e r0 = r0.f198d
        L_0x0099:
            if (r0 == 0) goto L_0x00bd
            a.f.a.j.f r3 = r0.f196b
            boolean r5 = r3.c0
            if (r5 != 0) goto L_0x00a4
            r6.f(r3)
        L_0x00a4:
            a.f.a.j.e$d r3 = r0.f197c
            a.f.a.j.e$d r5 = a.f.a.j.e.d.BOTTOM
            if (r3 != r5) goto L_0x00b5
            a.f.a.j.f r0 = r0.f196b
            int r3 = r0.J
            int r0 = r0.r()
            int r4 = r3 + r0
            goto L_0x00bd
        L_0x00b5:
            a.f.a.j.e$d r5 = a.f.a.j.e.d.TOP
            if (r3 != r5) goto L_0x00bd
            a.f.a.j.f r0 = r0.f196b
            int r4 = r0.J
        L_0x00bd:
            if (r1 == 0) goto L_0x00c7
            a.f.a.j.e r0 = r7.v
            int r0 = r0.d()
            int r4 = r4 - r0
            goto L_0x00d3
        L_0x00c7:
            a.f.a.j.e r0 = r7.t
            int r0 = r0.d()
            int r1 = r7.r()
            int r0 = r0 + r1
            int r4 = r4 + r0
        L_0x00d3:
            int r0 = r7.r()
            int r0 = r4 - r0
            r7.t0(r0, r4)
            r7.c0 = r2
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.j.h.f(a.f.a.j.f):void");
    }

    /* access modifiers changed from: package-private */
    public void a(f fVar, int i2) {
        if (i2 == 0) {
            this.h.add(fVar);
        } else if (i2 == 1) {
            this.i.add(fVar);
        }
    }

    public List<f> b(int i2) {
        if (i2 == 0) {
            return this.f232f;
        }
        if (i2 == 1) {
            return this.g;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Set<f> c(int i2) {
        if (i2 == 0) {
            return this.h;
        }
        if (i2 == 1) {
            return this.i;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public List<f> d() {
        if (!this.j.isEmpty()) {
            return this.j;
        }
        int size = this.f227a.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.f227a.get(i2);
            if (!fVar.b0) {
                e((ArrayList) this.j, fVar);
            }
        }
        this.k.clear();
        this.k.addAll(this.f227a);
        this.k.removeAll(this.j);
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        int size = this.k.size();
        for (int i2 = 0; i2 < size; i2++) {
            f(this.k.get(i2));
        }
    }

    h(List<f> list, boolean z) {
        this.f227a = list;
        this.f230d = z;
    }
}
