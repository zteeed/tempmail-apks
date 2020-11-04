package a.f.a.j;

import a.f.a.e;
import a.f.a.j.e;
import a.f.a.j.f;
import java.util.ArrayList;

/* compiled from: Guideline */
public class i extends f {
    protected float k0 = -1.0f;
    protected int l0 = -1;
    protected int m0 = -1;
    private e n0 = this.t;
    private int o0;
    private boolean p0;

    /* compiled from: Guideline */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f233a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                a.f.a.j.e$d[] r0 = a.f.a.j.e.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f233a = r0
                a.f.a.j.e$d r1 = a.f.a.j.e.d.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f233a     // Catch:{ NoSuchFieldError -> 0x001d }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f233a     // Catch:{ NoSuchFieldError -> 0x0028 }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f233a     // Catch:{ NoSuchFieldError -> 0x0033 }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f233a     // Catch:{ NoSuchFieldError -> 0x003e }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f233a     // Catch:{ NoSuchFieldError -> 0x0049 }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f233a     // Catch:{ NoSuchFieldError -> 0x0054 }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f233a     // Catch:{ NoSuchFieldError -> 0x0060 }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f233a     // Catch:{ NoSuchFieldError -> 0x006c }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.f.a.j.i.a.<clinit>():void");
        }
    }

    public i() {
        this.o0 = 0;
        this.p0 = false;
        this.B.clear();
        this.B.add(this.n0);
        int length = this.A.length;
        for (int i = 0; i < length; i++) {
            this.A[i] = this.n0;
        }
    }

    public void G0(e eVar) {
        if (u() != null) {
            int y = eVar.y(this.n0);
            if (this.o0 == 1) {
                C0(y);
                D0(0);
                b0(u().r());
                y0(0);
                return;
            }
            C0(0);
            D0(y);
            y0(u().D());
            b0(0);
        }
    }

    public int I0() {
        return this.o0;
    }

    public void J0(int i) {
        if (i > -1) {
            this.k0 = -1.0f;
            this.l0 = i;
            this.m0 = -1;
        }
    }

    public void K0(int i) {
        if (i > -1) {
            this.k0 = -1.0f;
            this.l0 = -1;
            this.m0 = i;
        }
    }

    public void L0(float f2) {
        if (f2 > -1.0f) {
            this.k0 = f2;
            this.l0 = -1;
            this.m0 = -1;
        }
    }

    public void M0(int i) {
        if (this.o0 != i) {
            this.o0 = i;
            this.B.clear();
            if (this.o0 == 1) {
                this.n0 = this.s;
            } else {
                this.n0 = this.t;
            }
            this.B.add(this.n0);
            int length = this.A.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.A[i2] = this.n0;
            }
        }
    }

    public void b(e eVar) {
        g gVar = (g) u();
        if (gVar != null) {
            e h = gVar.h(e.d.LEFT);
            e h2 = gVar.h(e.d.RIGHT);
            f fVar = this.D;
            boolean z = true;
            boolean z2 = fVar != null && fVar.C[0] == f.b.WRAP_CONTENT;
            if (this.o0 == 0) {
                h = gVar.h(e.d.TOP);
                h2 = gVar.h(e.d.BOTTOM);
                f fVar2 = this.D;
                if (fVar2 == null || fVar2.C[1] != f.b.WRAP_CONTENT) {
                    z = false;
                }
                z2 = z;
            }
            if (this.l0 != -1) {
                a.f.a.i r = eVar.r(this.n0);
                eVar.e(r, eVar.r(h), this.l0, 6);
                if (z2) {
                    eVar.i(eVar.r(h2), r, 0, 5);
                }
            } else if (this.m0 != -1) {
                a.f.a.i r2 = eVar.r(this.n0);
                a.f.a.i r3 = eVar.r(h2);
                eVar.e(r2, r3, -this.m0, 6);
                if (z2) {
                    eVar.i(r2, eVar.r(h), 0, 5);
                    eVar.i(r3, r2, 0, 5);
                }
            } else if (this.k0 != -1.0f) {
                eVar.d(a.f.a.e.t(eVar, eVar.r(this.n0), eVar.r(h), eVar.r(h2), this.k0, this.p0));
            }
        }
    }

    public boolean c() {
        return true;
    }

    public void d(int i) {
        f u = u();
        if (u != null) {
            if (I0() == 1) {
                this.t.f().h(1, u.t.f(), 0);
                this.v.f().h(1, u.t.f(), 0);
                if (this.l0 != -1) {
                    this.s.f().h(1, u.s.f(), this.l0);
                    this.u.f().h(1, u.s.f(), this.l0);
                } else if (this.m0 != -1) {
                    this.s.f().h(1, u.u.f(), -this.m0);
                    this.u.f().h(1, u.u.f(), -this.m0);
                } else if (this.k0 != -1.0f && u.s() == f.b.FIXED) {
                    int i2 = (int) (((float) u.E) * this.k0);
                    this.s.f().h(1, u.s.f(), i2);
                    this.u.f().h(1, u.s.f(), i2);
                }
            } else {
                this.s.f().h(1, u.s.f(), 0);
                this.u.f().h(1, u.s.f(), 0);
                if (this.l0 != -1) {
                    this.t.f().h(1, u.t.f(), this.l0);
                    this.v.f().h(1, u.t.f(), this.l0);
                } else if (this.m0 != -1) {
                    this.t.f().h(1, u.v.f(), -this.m0);
                    this.v.f().h(1, u.v.f(), -this.m0);
                } else if (this.k0 != -1.0f && u.B() == f.b.FIXED) {
                    int i3 = (int) (((float) u.F) * this.k0);
                    this.t.f().h(1, u.t.f(), i3);
                    this.v.f().h(1, u.t.f(), i3);
                }
            }
        }
    }

    public e h(e.d dVar) {
        switch (a.f233a[dVar.ordinal()]) {
            case 1:
            case 2:
                if (this.o0 == 1) {
                    return this.n0;
                }
                break;
            case 3:
            case 4:
                if (this.o0 == 0) {
                    return this.n0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(dVar.name());
    }

    public ArrayList<e> i() {
        return this.B;
    }
}
