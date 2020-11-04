package a.f.a.j;

import a.f.a.i;

/* compiled from: ConstraintAnchor */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private l f195a = new l(this);

    /* renamed from: b  reason: collision with root package name */
    final f f196b;

    /* renamed from: c  reason: collision with root package name */
    final d f197c;

    /* renamed from: d  reason: collision with root package name */
    e f198d;

    /* renamed from: e  reason: collision with root package name */
    public int f199e = 0;

    /* renamed from: f  reason: collision with root package name */
    int f200f = -1;
    private c g = c.NONE;
    private int h;
    i i;

    /* compiled from: ConstraintAnchor */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f201a;

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
                f201a = r0
                a.f.a.j.e$d r1 = a.f.a.j.e.d.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f201a     // Catch:{ NoSuchFieldError -> 0x001d }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f201a     // Catch:{ NoSuchFieldError -> 0x0028 }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f201a     // Catch:{ NoSuchFieldError -> 0x0033 }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f201a     // Catch:{ NoSuchFieldError -> 0x003e }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f201a     // Catch:{ NoSuchFieldError -> 0x0049 }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f201a     // Catch:{ NoSuchFieldError -> 0x0054 }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f201a     // Catch:{ NoSuchFieldError -> 0x0060 }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f201a     // Catch:{ NoSuchFieldError -> 0x006c }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.f.a.j.e.a.<clinit>():void");
        }
    }

    /* compiled from: ConstraintAnchor */
    public enum b {
        RELAXED,
        STRICT
    }

    /* compiled from: ConstraintAnchor */
    public enum c {
        NONE,
        STRONG,
        WEAK
    }

    /* compiled from: ConstraintAnchor */
    public enum d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public e(f fVar, d dVar) {
        b bVar = b.RELAXED;
        this.h = 0;
        this.f196b = fVar;
        this.f197c = dVar;
    }

    public boolean a(e eVar, int i2, int i3, c cVar, int i4, boolean z) {
        if (eVar == null) {
            this.f198d = null;
            this.f199e = 0;
            this.f200f = -1;
            this.g = c.NONE;
            this.h = 2;
            return true;
        } else if (!z && !l(eVar)) {
            return false;
        } else {
            this.f198d = eVar;
            if (i2 > 0) {
                this.f199e = i2;
            } else {
                this.f199e = 0;
            }
            this.f200f = i3;
            this.g = cVar;
            this.h = i4;
            return true;
        }
    }

    public boolean b(e eVar, int i2, c cVar, int i3) {
        return a(eVar, i2, -1, cVar, i3, false);
    }

    public int c() {
        return this.h;
    }

    public int d() {
        e eVar;
        if (this.f196b.C() == 8) {
            return 0;
        }
        if (this.f200f <= -1 || (eVar = this.f198d) == null || eVar.f196b.C() != 8) {
            return this.f199e;
        }
        return this.f200f;
    }

    public f e() {
        return this.f196b;
    }

    public l f() {
        return this.f195a;
    }

    public i g() {
        return this.i;
    }

    public c h() {
        return this.g;
    }

    public e i() {
        return this.f198d;
    }

    public d j() {
        return this.f197c;
    }

    public boolean k() {
        return this.f198d != null;
    }

    public boolean l(e eVar) {
        boolean z = false;
        if (eVar == null) {
            return false;
        }
        d j = eVar.j();
        d dVar = this.f197c;
        if (j != dVar) {
            switch (a.f201a[dVar.ordinal()]) {
                case 1:
                    if (j == d.BASELINE || j == d.CENTER_X || j == d.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    boolean z2 = j == d.LEFT || j == d.RIGHT;
                    if (!(eVar.e() instanceof i)) {
                        return z2;
                    }
                    if (z2 || j == d.CENTER_X) {
                        z = true;
                    }
                    return z;
                case 4:
                case 5:
                    boolean z3 = j == d.TOP || j == d.BOTTOM;
                    if (!(eVar.e() instanceof i)) {
                        return z3;
                    }
                    if (z3 || j == d.CENTER_Y) {
                        z = true;
                    }
                    return z;
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f197c.name());
            }
        } else if (dVar != d.BASELINE || (eVar.e().I() && e().I())) {
            return true;
        } else {
            return false;
        }
    }

    public void m() {
        this.f198d = null;
        this.f199e = 0;
        this.f200f = -1;
        this.g = c.STRONG;
        this.h = 0;
        b bVar = b.RELAXED;
        this.f195a.e();
    }

    public void n(a.f.a.c cVar) {
        i iVar = this.i;
        if (iVar == null) {
            this.i = new i(i.a.UNRESTRICTED, (String) null);
        } else {
            iVar.d();
        }
    }

    public String toString() {
        return this.f196b.n() + ":" + this.f197c.toString();
    }
}
