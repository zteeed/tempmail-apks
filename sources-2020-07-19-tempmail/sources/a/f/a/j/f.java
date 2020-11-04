package a.f.a.j;

import a.f.a.c;
import a.f.a.j.e;
import java.util.ArrayList;

/* compiled from: ConstraintWidget */
public class f {
    public static float j0 = 0.5f;
    protected e[] A;
    protected ArrayList<e> B;
    protected b[] C;
    f D;
    int E;
    int F;
    protected float G;
    protected int H;
    protected int I;
    protected int J;
    int K;
    int L;
    private int M;
    private int N;
    protected int O;
    protected int P;
    int Q;
    protected int R;
    protected int S;
    private int T;
    private int U;
    float V;
    float W;
    private Object X;
    private int Y;
    private String Z;

    /* renamed from: a  reason: collision with root package name */
    public int f213a = -1;
    private String a0;

    /* renamed from: b  reason: collision with root package name */
    public int f214b = -1;
    boolean b0;

    /* renamed from: c  reason: collision with root package name */
    m f215c;
    boolean c0;

    /* renamed from: d  reason: collision with root package name */
    m f216d;
    boolean d0;

    /* renamed from: e  reason: collision with root package name */
    int f217e = 0;
    int e0;

    /* renamed from: f  reason: collision with root package name */
    int f218f = 0;
    int f0;
    int[] g = new int[2];
    float[] g0;
    int h = 0;
    protected f[] h0;
    int i = 0;
    protected f[] i0;
    float j = 1.0f;
    int k = 0;
    int l = 0;
    float m = 1.0f;
    int n = -1;
    float o = 1.0f;
    h p = null;
    private int[] q = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float r = 0.0f;
    e s = new e(this, e.d.LEFT);
    e t = new e(this, e.d.TOP);
    e u = new e(this, e.d.RIGHT);
    e v = new e(this, e.d.BOTTOM);
    e w = new e(this, e.d.BASELINE);
    e x = new e(this, e.d.CENTER_X);
    e y = new e(this, e.d.CENTER_Y);
    e z;

    /* compiled from: ConstraintWidget */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f219a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f220b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                a.f.a.j.f$b[] r0 = a.f.a.j.f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f220b = r0
                r1 = 1
                a.f.a.j.f$b r2 = a.f.a.j.f.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f220b     // Catch:{ NoSuchFieldError -> 0x001d }
                a.f.a.j.f$b r3 = a.f.a.j.f.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f220b     // Catch:{ NoSuchFieldError -> 0x0028 }
                a.f.a.j.f$b r4 = a.f.a.j.f.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f220b     // Catch:{ NoSuchFieldError -> 0x0033 }
                a.f.a.j.f$b r5 = a.f.a.j.f.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                a.f.a.j.e$d[] r4 = a.f.a.j.e.d.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f219a = r4
                a.f.a.j.e$d r5 = a.f.a.j.e.d.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f219a     // Catch:{ NoSuchFieldError -> 0x004e }
                a.f.a.j.e$d r4 = a.f.a.j.e.d.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f219a     // Catch:{ NoSuchFieldError -> 0x0058 }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f219a     // Catch:{ NoSuchFieldError -> 0x0062 }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f219a     // Catch:{ NoSuchFieldError -> 0x006d }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f219a     // Catch:{ NoSuchFieldError -> 0x0078 }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f219a     // Catch:{ NoSuchFieldError -> 0x0083 }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f219a     // Catch:{ NoSuchFieldError -> 0x008f }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f219a     // Catch:{ NoSuchFieldError -> 0x009b }
                a.f.a.j.e$d r1 = a.f.a.j.e.d.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.f.a.j.f.a.<clinit>():void");
        }
    }

    /* compiled from: ConstraintWidget */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public f() {
        e eVar = new e(this, e.d.CENTER);
        this.z = eVar;
        this.A = new e[]{this.s, this.u, this.t, this.v, this.w, eVar};
        this.B = new ArrayList<>();
        b bVar = b.FIXED;
        this.C = new b[]{bVar, bVar};
        this.D = null;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        float f2 = j0;
        this.V = f2;
        this.W = f2;
        this.Y = 0;
        this.Z = null;
        this.a0 = null;
        this.b0 = false;
        this.c0 = false;
        this.d0 = false;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = new float[]{-1.0f, -1.0f};
        this.h0 = new f[]{null, null};
        this.i0 = new f[]{null, null};
        a();
    }

    private boolean K(int i2) {
        int i3 = i2 * 2;
        e[] eVarArr = this.A;
        if (!(eVarArr[i3].f197d == null || eVarArr[i3].f197d.f197d == eVarArr[i3])) {
            int i4 = i3 + 1;
            return eVarArr[i4].f197d != null && eVarArr[i4].f197d.f197d == eVarArr[i4];
        }
    }

    private void a() {
        this.B.add(this.s);
        this.B.add(this.t);
        this.B.add(this.u);
        this.B.add(this.v);
        this.B.add(this.x);
        this.B.add(this.y);
        this.B.add(this.z);
        this.B.add(this.w);
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cd A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(a.f.a.e r24, boolean r25, a.f.a.i r26, a.f.a.i r27, a.f.a.j.f.b r28, boolean r29, a.f.a.j.e r30, a.f.a.j.e r31, int r32, int r33, int r34, int r35, float r36, boolean r37, boolean r38, int r39, int r40, int r41, float r42, boolean r43) {
        /*
            r23 = this;
            r0 = r23
            r10 = r24
            r11 = r26
            r12 = r27
            r13 = r30
            r14 = r31
            r1 = r34
            r2 = r35
            a.f.a.i r15 = r10.r(r13)
            a.f.a.i r9 = r10.r(r14)
            a.f.a.j.e r3 = r30.i()
            a.f.a.i r8 = r10.r(r3)
            a.f.a.j.e r3 = r31.i()
            a.f.a.i r7 = r10.r(r3)
            boolean r3 = r10.g
            r6 = 1
            r4 = 6
            r5 = 0
            if (r3 == 0) goto L_0x0066
            a.f.a.j.l r3 = r30.f()
            int r3 = r3.f240b
            if (r3 != r6) goto L_0x0066
            a.f.a.j.l r3 = r31.f()
            int r3 = r3.f240b
            if (r3 != r6) goto L_0x0066
            a.f.a.f r1 = a.f.a.e.x()
            if (r1 == 0) goto L_0x0050
            a.f.a.f r1 = a.f.a.e.x()
            long r2 = r1.r
            r6 = 1
            long r2 = r2 + r6
            r1.r = r2
        L_0x0050:
            a.f.a.j.l r1 = r30.f()
            r1.g(r10)
            a.f.a.j.l r1 = r31.f()
            r1.g(r10)
            if (r38 != 0) goto L_0x0065
            if (r25 == 0) goto L_0x0065
            r10.i(r12, r9, r5, r4)
        L_0x0065:
            return
        L_0x0066:
            a.f.a.f r3 = a.f.a.e.x()
            if (r3 == 0) goto L_0x0078
            a.f.a.f r3 = a.f.a.e.x()
            long r4 = r3.z
            r16 = 1
            long r4 = r4 + r16
            r3.z = r4
        L_0x0078:
            boolean r16 = r30.k()
            boolean r17 = r31.k()
            a.f.a.j.e r3 = r0.z
            boolean r19 = r3.k()
            if (r16 == 0) goto L_0x008a
            r3 = 1
            goto L_0x008b
        L_0x008a:
            r3 = 0
        L_0x008b:
            if (r17 == 0) goto L_0x008f
            int r3 = r3 + 1
        L_0x008f:
            if (r19 == 0) goto L_0x0093
            int r3 = r3 + 1
        L_0x0093:
            r5 = r3
            if (r37 == 0) goto L_0x0098
            r3 = 3
            goto L_0x009a
        L_0x0098:
            r3 = r39
        L_0x009a:
            int[] r20 = a.f.a.j.f.a.f220b
            int r21 = r28.ordinal()
            r4 = r20[r21]
            r14 = 2
            r13 = 4
            if (r4 == r6) goto L_0x00ad
            if (r4 == r14) goto L_0x00ad
            r14 = 3
            if (r4 == r14) goto L_0x00ad
            if (r4 == r13) goto L_0x00af
        L_0x00ad:
            r4 = 0
            goto L_0x00b3
        L_0x00af:
            if (r3 != r13) goto L_0x00b2
            goto L_0x00ad
        L_0x00b2:
            r4 = 1
        L_0x00b3:
            int r14 = r0.Y
            r13 = 8
            if (r14 != r13) goto L_0x00bc
            r4 = 0
            r13 = 0
            goto L_0x00bf
        L_0x00bc:
            r13 = r4
            r4 = r33
        L_0x00bf:
            if (r43 == 0) goto L_0x00da
            if (r16 != 0) goto L_0x00cd
            if (r17 != 0) goto L_0x00cd
            if (r19 != 0) goto L_0x00cd
            r14 = r32
            r10.f(r15, r14)
            goto L_0x00da
        L_0x00cd:
            if (r16 == 0) goto L_0x00da
            if (r17 != 0) goto L_0x00da
            int r14 = r30.d()
            r6 = 6
            r10.e(r15, r8, r14, r6)
            goto L_0x00db
        L_0x00da:
            r6 = 6
        L_0x00db:
            if (r13 != 0) goto L_0x0107
            if (r29 == 0) goto L_0x00f4
            r6 = 0
            r14 = 3
            r10.e(r9, r15, r6, r14)
            r4 = 6
            if (r1 <= 0) goto L_0x00ea
            r10.i(r9, r15, r1, r4)
        L_0x00ea:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r6) goto L_0x00f2
            r10.k(r9, r15, r2, r4)
        L_0x00f2:
            r6 = 6
            goto L_0x00f8
        L_0x00f4:
            r14 = 3
            r10.e(r9, r15, r4, r6)
        L_0x00f8:
            r14 = r40
            r32 = r3
            r0 = r5
            r1 = r7
            r22 = r8
            r21 = r13
            r2 = 2
            r13 = r41
            goto L_0x01e4
        L_0x0107:
            r14 = 3
            r2 = -2
            r14 = r40
            r6 = r41
            if (r14 != r2) goto L_0x0110
            r14 = r4
        L_0x0110:
            if (r6 != r2) goto L_0x0113
            r6 = r4
        L_0x0113:
            r2 = 6
            if (r14 <= 0) goto L_0x011d
            r10.i(r9, r15, r14, r2)
            int r4 = java.lang.Math.max(r4, r14)
        L_0x011d:
            if (r6 <= 0) goto L_0x0126
            r10.k(r9, r15, r6, r2)
            int r4 = java.lang.Math.min(r4, r6)
        L_0x0126:
            r2 = 1
            if (r3 != r2) goto L_0x014f
            if (r25 == 0) goto L_0x013b
            r2 = 6
            r10.e(r9, r15, r4, r2)
            r32 = r3
            r0 = r5
            r1 = r7
            r22 = r8
            r33 = r13
            r8 = r4
            r13 = r6
            goto L_0x01c8
        L_0x013b:
            r2 = 6
            if (r38 == 0) goto L_0x0146
            r33 = r13
            r13 = 4
            r10.e(r9, r15, r4, r13)
            goto L_0x01c0
        L_0x0146:
            r33 = r13
            r2 = 1
            r13 = 4
            r10.e(r9, r15, r4, r2)
            goto L_0x01c0
        L_0x014f:
            r33 = r13
            r2 = 2
            r13 = 4
            if (r3 != r2) goto L_0x01c0
            a.f.a.j.e$d r2 = r30.j()
            a.f.a.j.e$d r13 = a.f.a.j.e.d.TOP
            if (r2 == r13) goto L_0x0181
            a.f.a.j.e$d r2 = r30.j()
            a.f.a.j.e$d r13 = a.f.a.j.e.d.BOTTOM
            if (r2 != r13) goto L_0x0166
            goto L_0x0181
        L_0x0166:
            a.f.a.j.f r2 = r0.D
            a.f.a.j.e$d r13 = a.f.a.j.e.d.LEFT
            a.f.a.j.e r2 = r2.h(r13)
            a.f.a.i r2 = r10.r(r2)
            a.f.a.j.f r13 = r0.D
            r29 = r2
            a.f.a.j.e$d r2 = a.f.a.j.e.d.RIGHT
            a.f.a.j.e r2 = r13.h(r2)
            a.f.a.i r2 = r10.r(r2)
            goto L_0x019b
        L_0x0181:
            a.f.a.j.f r2 = r0.D
            a.f.a.j.e$d r13 = a.f.a.j.e.d.TOP
            a.f.a.j.e r2 = r2.h(r13)
            a.f.a.i r2 = r10.r(r2)
            a.f.a.j.f r13 = r0.D
            r29 = r2
            a.f.a.j.e$d r2 = a.f.a.j.e.d.BOTTOM
            a.f.a.j.e r2 = r13.h(r2)
            a.f.a.i r2 = r10.r(r2)
        L_0x019b:
            r21 = r29
            r13 = r2
            a.f.a.b r2 = r24.s()
            r29 = r2
            r18 = 1
            r20 = 6
            r0 = r3
            r3 = r9
            r22 = r8
            r8 = r4
            r4 = r15
            r32 = r0
            r0 = r5
            r5 = r13
            r13 = r6
            r6 = r21
            r1 = r7
            r7 = r42
            r2.j(r3, r4, r5, r6, r7)
            r10.d(r2)
            r5 = 0
            goto L_0x01ca
        L_0x01c0:
            r32 = r3
            r0 = r5
            r13 = r6
            r1 = r7
            r22 = r8
            r8 = r4
        L_0x01c8:
            r5 = r33
        L_0x01ca:
            r2 = 2
            if (r5 == 0) goto L_0x01e2
            if (r0 == r2) goto L_0x01e2
            if (r37 != 0) goto L_0x01e2
            int r3 = java.lang.Math.max(r14, r8)
            if (r13 <= 0) goto L_0x01db
            int r3 = java.lang.Math.min(r13, r3)
        L_0x01db:
            r4 = 6
            r10.e(r9, r15, r3, r4)
            r21 = 0
            goto L_0x01e4
        L_0x01e2:
            r21 = r5
        L_0x01e4:
            if (r43 == 0) goto L_0x0317
            if (r38 == 0) goto L_0x01ea
            goto L_0x0317
        L_0x01ea:
            r0 = 5
            if (r16 != 0) goto L_0x01f9
            if (r17 != 0) goto L_0x01f9
            if (r19 != 0) goto L_0x01f9
            if (r25 == 0) goto L_0x030b
            r2 = 0
            r10.i(r12, r9, r2, r0)
            goto L_0x030b
        L_0x01f9:
            r2 = 0
            if (r16 == 0) goto L_0x0205
            if (r17 != 0) goto L_0x0205
            if (r25 == 0) goto L_0x030b
            r10.i(r12, r9, r2, r0)
            goto L_0x030b
        L_0x0205:
            if (r16 != 0) goto L_0x0219
            if (r17 == 0) goto L_0x0219
            int r3 = r31.d()
            int r3 = -r3
            r4 = 6
            r10.e(r9, r1, r3, r4)
            if (r25 == 0) goto L_0x030b
            r10.i(r15, r11, r2, r0)
            goto L_0x030b
        L_0x0219:
            if (r16 == 0) goto L_0x030b
            if (r17 == 0) goto L_0x030b
            if (r21 == 0) goto L_0x0285
            r8 = r1
            r7 = 6
            if (r25 == 0) goto L_0x0228
            if (r34 != 0) goto L_0x0228
            r10.i(r9, r15, r2, r7)
        L_0x0228:
            if (r32 != 0) goto L_0x0252
            if (r13 > 0) goto L_0x0232
            if (r14 <= 0) goto L_0x022f
            goto L_0x0232
        L_0x022f:
            r4 = 6
            r6 = 0
            goto L_0x0234
        L_0x0232:
            r4 = 4
            r6 = 1
        L_0x0234:
            int r1 = r30.d()
            r5 = r22
            r10.e(r15, r5, r1, r4)
            int r1 = r31.d()
            int r1 = -r1
            r10.e(r9, r8, r1, r4)
            if (r13 > 0) goto L_0x024c
            if (r14 <= 0) goto L_0x024a
            goto L_0x024c
        L_0x024a:
            r1 = 0
            goto L_0x024d
        L_0x024c:
            r1 = 1
        L_0x024d:
            r13 = r6
            r14 = 1
            r16 = 5
            goto L_0x025d
        L_0x0252:
            r4 = r32
            r5 = r22
            r14 = 1
            if (r4 != r14) goto L_0x0260
            r1 = 1
            r13 = 1
            r16 = 6
        L_0x025d:
            r6 = r23
            goto L_0x0290
        L_0x0260:
            r1 = 3
            r6 = r23
            if (r4 != r1) goto L_0x0283
            if (r37 != 0) goto L_0x0270
            int r1 = r6.n
            r2 = -1
            if (r1 == r2) goto L_0x0270
            if (r13 > 0) goto L_0x0270
            r4 = 6
            goto L_0x0271
        L_0x0270:
            r4 = 4
        L_0x0271:
            int r1 = r30.d()
            r10.e(r15, r5, r1, r4)
            int r1 = r31.d()
            int r1 = -r1
            r10.e(r9, r8, r1, r4)
            r1 = 1
            r13 = 1
            goto L_0x028e
        L_0x0283:
            r1 = 0
            goto L_0x028d
        L_0x0285:
            r6 = r23
            r8 = r1
            r5 = r22
            r7 = 6
            r14 = 1
            r1 = 1
        L_0x028d:
            r13 = 0
        L_0x028e:
            r16 = 5
        L_0x0290:
            if (r1 == 0) goto L_0x02d7
            int r4 = r30.d()
            int r17 = r31.d()
            r1 = r24
            r2 = r15
            r3 = r5
            r18 = r5
            r5 = r36
            r6 = r8
            r19 = 6
            r7 = r9
            r14 = r8
            r0 = r18
            r12 = 6
            r8 = r17
            r12 = r9
            r9 = r16
            r1.c(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r30
            a.f.a.j.e r2 = r1.f197d
            a.f.a.j.f r2 = r2.f195b
            boolean r2 = r2 instanceof a.f.a.j.b
            r3 = r31
            a.f.a.j.e r4 = r3.f197d
            a.f.a.j.f r4 = r4.f195b
            boolean r4 = r4 instanceof a.f.a.j.b
            if (r2 == 0) goto L_0x02cd
            if (r4 != 0) goto L_0x02cd
            r6 = r25
            r2 = 6
            r4 = 5
            r18 = 1
            goto L_0x02e4
        L_0x02cd:
            if (r2 != 0) goto L_0x02de
            if (r4 == 0) goto L_0x02de
            r18 = r25
            r2 = 5
            r4 = 6
            r6 = 1
            goto L_0x02e4
        L_0x02d7:
            r1 = r30
            r3 = r31
            r0 = r5
            r14 = r8
            r12 = r9
        L_0x02de:
            r6 = r25
            r18 = r6
            r2 = 5
            r4 = 5
        L_0x02e4:
            if (r13 == 0) goto L_0x02e8
            r2 = 6
            r4 = 6
        L_0x02e8:
            if (r21 != 0) goto L_0x02ec
            if (r6 != 0) goto L_0x02ee
        L_0x02ec:
            if (r13 == 0) goto L_0x02f5
        L_0x02ee:
            int r1 = r30.d()
            r10.i(r15, r0, r1, r4)
        L_0x02f5:
            if (r21 != 0) goto L_0x02f9
            if (r18 != 0) goto L_0x02fb
        L_0x02f9:
            if (r13 == 0) goto L_0x0303
        L_0x02fb:
            int r0 = r31.d()
            int r0 = -r0
            r10.k(r12, r14, r0, r2)
        L_0x0303:
            r0 = 6
            r1 = 0
            if (r25 == 0) goto L_0x030e
            r10.i(r15, r11, r1, r0)
            goto L_0x030e
        L_0x030b:
            r12 = r9
            r0 = 6
            r1 = 0
        L_0x030e:
            if (r25 == 0) goto L_0x0316
            r2 = r27
            r3 = 6
            r10.i(r2, r12, r1, r3)
        L_0x0316:
            return
        L_0x0317:
            r2 = r12
            r1 = 0
            r3 = 6
            r4 = 2
            r12 = r9
            if (r0 >= r4) goto L_0x0326
            if (r25 == 0) goto L_0x0326
            r10.i(r15, r11, r1, r3)
            r10.i(r2, r12, r1, r3)
        L_0x0326:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.j.f.e(a.f.a.e, boolean, a.f.a.i, a.f.a.i, a.f.a.j.f$b, boolean, a.f.a.j.e, a.f.a.j.e, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* access modifiers changed from: protected */
    public int A() {
        return this.J + this.P;
    }

    public void A0(int i2) {
        this.U = i2;
    }

    public b B() {
        return this.C[1];
    }

    public void B0(int i2) {
        this.T = i2;
    }

    public int C() {
        return this.Y;
    }

    public void C0(int i2) {
        this.I = i2;
    }

    public int D() {
        if (this.Y == 8) {
            return 0;
        }
        return this.E;
    }

    public void D0(int i2) {
        this.J = i2;
    }

    public int E() {
        return this.U;
    }

    public void E0(boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this.n == -1) {
            if (z4 && !z5) {
                this.n = 0;
            } else if (!z4 && z5) {
                this.n = 1;
                if (this.H == -1) {
                    this.o = 1.0f / this.o;
                }
            }
        }
        if (this.n == 0 && (!this.t.k() || !this.v.k())) {
            this.n = 1;
        } else if (this.n == 1 && (!this.s.k() || !this.u.k())) {
            this.n = 0;
        }
        if (this.n == -1 && (!this.t.k() || !this.v.k() || !this.s.k() || !this.u.k())) {
            if (this.t.k() && this.v.k()) {
                this.n = 0;
            } else if (this.s.k() && this.u.k()) {
                this.o = 1.0f / this.o;
                this.n = 1;
            }
        }
        if (this.n == -1) {
            if (z2 && !z3) {
                this.n = 0;
            } else if (!z2 && z3) {
                this.o = 1.0f / this.o;
                this.n = 1;
            }
        }
        if (this.n == -1) {
            if (this.h > 0 && this.k == 0) {
                this.n = 0;
            } else if (this.h == 0 && this.k > 0) {
                this.o = 1.0f / this.o;
                this.n = 1;
            }
        }
        if (this.n == -1 && z2 && z3) {
            this.o = 1.0f / this.o;
            this.n = 1;
        }
    }

    public int F() {
        return this.T;
    }

    public void F0() {
        int i2 = this.I;
        int i3 = this.J;
        this.M = i2;
        this.N = i3;
    }

    public int G() {
        return this.I;
    }

    public void G0(a.f.a.e eVar) {
        int y2 = eVar.y(this.s);
        int y3 = eVar.y(this.t);
        int y4 = eVar.y(this.u);
        int y5 = eVar.y(this.v);
        int i2 = y5 - y3;
        if (y4 - y2 < 0 || i2 < 0 || y2 == Integer.MIN_VALUE || y2 == Integer.MAX_VALUE || y3 == Integer.MIN_VALUE || y3 == Integer.MAX_VALUE || y4 == Integer.MIN_VALUE || y4 == Integer.MAX_VALUE || y5 == Integer.MIN_VALUE || y5 == Integer.MAX_VALUE) {
            y5 = 0;
            y2 = 0;
            y3 = 0;
            y4 = 0;
        }
        a0(y2, y3, y4, y5);
    }

    public int H() {
        return this.J;
    }

    public void H0() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.A[i2].f().q();
        }
    }

    public boolean I() {
        return this.Q > 0;
    }

    public void J(e.d dVar, f fVar, e.d dVar2, int i2, int i3) {
        h(dVar).a(fVar.h(dVar2), i2, i3, e.c.STRONG, 0, true);
    }

    public boolean L() {
        if (this.s.f().f240b == 1 && this.u.f().f240b == 1 && this.t.f().f240b == 1 && this.v.f().f240b == 1) {
            return true;
        }
        return false;
    }

    public boolean M() {
        e eVar = this.s;
        e eVar2 = eVar.f197d;
        if (eVar2 != null && eVar2.f197d == eVar) {
            return true;
        }
        e eVar3 = this.u;
        e eVar4 = eVar3.f197d;
        return eVar4 != null && eVar4.f197d == eVar3;
    }

    public boolean N() {
        e eVar = this.t;
        e eVar2 = eVar.f197d;
        if (eVar2 != null && eVar2.f197d == eVar) {
            return true;
        }
        e eVar3 = this.v;
        e eVar4 = eVar3.f197d;
        return eVar4 != null && eVar4.f197d == eVar3;
    }

    public boolean O() {
        return this.f218f == 0 && this.G == 0.0f && this.k == 0 && this.l == 0 && this.C[1] == b.MATCH_CONSTRAINT;
    }

    public boolean P() {
        return this.f217e == 0 && this.G == 0.0f && this.h == 0 && this.i == 0 && this.C[0] == b.MATCH_CONSTRAINT;
    }

    public void Q() {
        this.s.m();
        this.t.m();
        this.u.m();
        this.v.m();
        this.w.m();
        this.x.m();
        this.y.m();
        this.z.m();
        this.D = null;
        this.r = 0.0f;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.J = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        float f2 = j0;
        this.V = f2;
        this.W = f2;
        b[] bVarArr = this.C;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.X = null;
        this.Y = 0;
        this.a0 = null;
        this.e0 = 0;
        this.f0 = 0;
        float[] fArr = this.g0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f213a = -1;
        this.f214b = -1;
        int[] iArr = this.q;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f217e = 0;
        this.f218f = 0;
        this.j = 1.0f;
        this.m = 1.0f;
        this.i = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.h = 0;
        this.k = 0;
        this.n = -1;
        this.o = 1.0f;
        m mVar = this.f215c;
        if (mVar != null) {
            mVar.e();
        }
        m mVar2 = this.f216d;
        if (mVar2 != null) {
            mVar2.e();
        }
        this.p = null;
        this.b0 = false;
        this.c0 = false;
        this.d0 = false;
    }

    public void R() {
        f u2 = u();
        if (u2 == null || !(u2 instanceof g) || !((g) u()).S0()) {
            int size = this.B.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.B.get(i2).m();
            }
        }
    }

    public void S() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.A[i2].f().e();
        }
    }

    public void T(c cVar) {
        this.s.n(cVar);
        this.t.n(cVar);
        this.u.n(cVar);
        this.v.n(cVar);
        this.w.n(cVar);
        this.z.n(cVar);
        this.x.n(cVar);
        this.y.n(cVar);
    }

    public void U() {
    }

    public void V(int i2) {
        this.Q = i2;
    }

    public void W(Object obj) {
        this.X = obj;
    }

    public void X(String str) {
        this.Z = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Y(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.G = r9
            r8.H = r1
        L_0x008d:
            return
        L_0x008e:
            r8.G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.j.f.Y(java.lang.String):void");
    }

    public void Z(int i2, int i3, int i4) {
        if (i4 == 0) {
            f0(i2, i3);
        } else if (i4 == 1) {
            t0(i2, i3);
        }
        this.c0 = true;
    }

    public void a0(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        this.I = i2;
        this.J = i3;
        if (this.Y == 8) {
            this.E = 0;
            this.F = 0;
            return;
        }
        if (this.C[0] == b.FIXED && i8 < (i7 = this.E)) {
            i8 = i7;
        }
        if (this.C[1] == b.FIXED && i9 < (i6 = this.F)) {
            i9 = i6;
        }
        this.E = i8;
        this.F = i9;
        int i10 = this.S;
        if (i9 < i10) {
            this.F = i10;
        }
        int i11 = this.E;
        int i12 = this.R;
        if (i11 < i12) {
            this.E = i12;
        }
        this.c0 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x024c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(a.f.a.e r39) {
        /*
            r38 = this;
            r15 = r38
            r14 = r39
            a.f.a.j.e r0 = r15.s
            a.f.a.i r21 = r14.r(r0)
            a.f.a.j.e r0 = r15.u
            a.f.a.i r10 = r14.r(r0)
            a.f.a.j.e r0 = r15.t
            a.f.a.i r6 = r14.r(r0)
            a.f.a.j.e r0 = r15.v
            a.f.a.i r4 = r14.r(r0)
            a.f.a.j.e r0 = r15.w
            a.f.a.i r3 = r14.r(r0)
            a.f.a.j.f r0 = r15.D
            r1 = 8
            r2 = 1
            r13 = 0
            if (r0 == 0) goto L_0x00b0
            if (r0 == 0) goto L_0x0036
            a.f.a.j.f$b[] r0 = r0.C
            r0 = r0[r13]
            a.f.a.j.f$b r5 = a.f.a.j.f.b.WRAP_CONTENT
            if (r0 != r5) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            a.f.a.j.f r5 = r15.D
            if (r5 == 0) goto L_0x0045
            a.f.a.j.f$b[] r5 = r5.C
            r5 = r5[r2]
            a.f.a.j.f$b r7 = a.f.a.j.f.b.WRAP_CONTENT
            if (r5 != r7) goto L_0x0045
            r5 = 1
            goto L_0x0046
        L_0x0045:
            r5 = 0
        L_0x0046:
            boolean r7 = r15.K(r13)
            if (r7 == 0) goto L_0x0055
            a.f.a.j.f r7 = r15.D
            a.f.a.j.g r7 = (a.f.a.j.g) r7
            r7.N0(r15, r13)
            r7 = 1
            goto L_0x0059
        L_0x0055:
            boolean r7 = r38.M()
        L_0x0059:
            boolean r8 = r15.K(r2)
            if (r8 == 0) goto L_0x0068
            a.f.a.j.f r8 = r15.D
            a.f.a.j.g r8 = (a.f.a.j.g) r8
            r8.N0(r15, r2)
            r8 = 1
            goto L_0x006c
        L_0x0068:
            boolean r8 = r38.N()
        L_0x006c:
            if (r0 == 0) goto L_0x0089
            int r9 = r15.Y
            if (r9 == r1) goto L_0x0089
            a.f.a.j.e r9 = r15.s
            a.f.a.j.e r9 = r9.f197d
            if (r9 != 0) goto L_0x0089
            a.f.a.j.e r9 = r15.u
            a.f.a.j.e r9 = r9.f197d
            if (r9 != 0) goto L_0x0089
            a.f.a.j.f r9 = r15.D
            a.f.a.j.e r9 = r9.u
            a.f.a.i r9 = r14.r(r9)
            r14.i(r9, r10, r13, r2)
        L_0x0089:
            if (r5 == 0) goto L_0x00aa
            int r9 = r15.Y
            if (r9 == r1) goto L_0x00aa
            a.f.a.j.e r9 = r15.t
            a.f.a.j.e r9 = r9.f197d
            if (r9 != 0) goto L_0x00aa
            a.f.a.j.e r9 = r15.v
            a.f.a.j.e r9 = r9.f197d
            if (r9 != 0) goto L_0x00aa
            a.f.a.j.e r9 = r15.w
            if (r9 != 0) goto L_0x00aa
            a.f.a.j.f r9 = r15.D
            a.f.a.j.e r9 = r9.v
            a.f.a.i r9 = r14.r(r9)
            r14.i(r9, r4, r13, r2)
        L_0x00aa:
            r12 = r5
            r16 = r7
            r22 = r8
            goto L_0x00b6
        L_0x00b0:
            r0 = 0
            r12 = 0
            r16 = 0
            r22 = 0
        L_0x00b6:
            int r5 = r15.E
            int r7 = r15.R
            if (r5 >= r7) goto L_0x00bd
            r5 = r7
        L_0x00bd:
            int r7 = r15.F
            int r8 = r15.S
            if (r7 >= r8) goto L_0x00c4
            r7 = r8
        L_0x00c4:
            a.f.a.j.f$b[] r8 = r15.C
            r8 = r8[r13]
            a.f.a.j.f$b r9 = a.f.a.j.f.b.MATCH_CONSTRAINT
            if (r8 == r9) goto L_0x00ce
            r8 = 1
            goto L_0x00cf
        L_0x00ce:
            r8 = 0
        L_0x00cf:
            a.f.a.j.f$b[] r9 = r15.C
            r9 = r9[r2]
            a.f.a.j.f$b r11 = a.f.a.j.f.b.MATCH_CONSTRAINT
            if (r9 == r11) goto L_0x00d9
            r9 = 1
            goto L_0x00da
        L_0x00d9:
            r9 = 0
        L_0x00da:
            int r11 = r15.H
            r15.n = r11
            float r11 = r15.G
            r15.o = r11
            int r2 = r15.f217e
            int r13 = r15.f218f
            r18 = 0
            r19 = 4
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 <= 0) goto L_0x018f
            int r11 = r15.Y
            r1 = 8
            if (r11 == r1) goto L_0x018f
            a.f.a.j.f$b[] r1 = r15.C
            r11 = 0
            r1 = r1[r11]
            a.f.a.j.f$b r11 = a.f.a.j.f.b.MATCH_CONSTRAINT
            r23 = r3
            if (r1 != r11) goto L_0x0102
            if (r2 != 0) goto L_0x0102
            r2 = 3
        L_0x0102:
            a.f.a.j.f$b[] r1 = r15.C
            r11 = 1
            r1 = r1[r11]
            a.f.a.j.f$b r11 = a.f.a.j.f.b.MATCH_CONSTRAINT
            if (r1 != r11) goto L_0x010e
            if (r13 != 0) goto L_0x010e
            r13 = 3
        L_0x010e:
            a.f.a.j.f$b[] r1 = r15.C
            r11 = 0
            r3 = r1[r11]
            a.f.a.j.f$b r11 = a.f.a.j.f.b.MATCH_CONSTRAINT
            if (r3 != r11) goto L_0x0125
            r3 = 1
            r1 = r1[r3]
            if (r1 != r11) goto L_0x0125
            r1 = 3
            if (r2 != r1) goto L_0x0126
            if (r13 != r1) goto L_0x0126
            r15.E0(r0, r12, r8, r9)
            goto L_0x0184
        L_0x0125:
            r1 = 3
        L_0x0126:
            a.f.a.j.f$b[] r3 = r15.C
            r8 = 0
            r9 = r3[r8]
            a.f.a.j.f$b r11 = a.f.a.j.f.b.MATCH_CONSTRAINT
            if (r9 != r11) goto L_0x014e
            if (r2 != r1) goto L_0x014e
            r15.n = r8
            float r1 = r15.o
            int r5 = r15.F
            float r5 = (float) r5
            float r1 = r1 * r5
            int r1 = (int) r1
            r8 = 1
            r3 = r3[r8]
            r25 = r1
            if (r3 == r11) goto L_0x014b
            r26 = r7
            r29 = r13
            r27 = 0
            r28 = 4
            goto L_0x019b
        L_0x014b:
            r28 = r2
            goto L_0x0188
        L_0x014e:
            r8 = 1
            a.f.a.j.f$b[] r1 = r15.C
            r1 = r1[r8]
            a.f.a.j.f$b r3 = a.f.a.j.f.b.MATCH_CONSTRAINT
            if (r1 != r3) goto L_0x0184
            r1 = 3
            if (r13 != r1) goto L_0x0184
            r15.n = r8
            int r1 = r15.H
            r3 = -1
            if (r1 != r3) goto L_0x0168
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r15.o
            float r1 = r1 / r3
            r15.o = r1
        L_0x0168:
            float r1 = r15.o
            int r3 = r15.E
            float r3 = (float) r3
            float r1 = r1 * r3
            int r1 = (int) r1
            a.f.a.j.f$b[] r3 = r15.C
            r7 = 0
            r3 = r3[r7]
            a.f.a.j.f$b r7 = a.f.a.j.f.b.MATCH_CONSTRAINT
            r26 = r1
            r28 = r2
            r25 = r5
            if (r3 == r7) goto L_0x018a
            r27 = 0
            r29 = 4
            goto L_0x019b
        L_0x0184:
            r28 = r2
            r25 = r5
        L_0x0188:
            r26 = r7
        L_0x018a:
            r29 = r13
            r27 = 1
            goto L_0x019b
        L_0x018f:
            r23 = r3
            r28 = r2
            r25 = r5
            r26 = r7
            r29 = r13
            r27 = 0
        L_0x019b:
            int[] r1 = r15.g
            r2 = 0
            r1[r2] = r28
            r2 = 1
            r1[r2] = r29
            if (r27 == 0) goto L_0x01af
            int r1 = r15.n
            r2 = -1
            if (r1 == 0) goto L_0x01ac
            if (r1 != r2) goto L_0x01b0
        L_0x01ac:
            r24 = 1
            goto L_0x01b2
        L_0x01af:
            r2 = -1
        L_0x01b0:
            r24 = 0
        L_0x01b2:
            a.f.a.j.f$b[] r1 = r15.C
            r3 = 0
            r1 = r1[r3]
            a.f.a.j.f$b r3 = a.f.a.j.f.b.WRAP_CONTENT
            if (r1 != r3) goto L_0x01c2
            boolean r1 = r15 instanceof a.f.a.j.g
            if (r1 == 0) goto L_0x01c2
            r30 = 1
            goto L_0x01c4
        L_0x01c2:
            r30 = 0
        L_0x01c4:
            a.f.a.j.e r1 = r15.z
            boolean r1 = r1.k()
            r3 = 1
            r31 = r1 ^ 1
            int r1 = r15.f213a
            r13 = 2
            r32 = 0
            if (r1 == r13) goto L_0x023b
            a.f.a.j.f r1 = r15.D
            if (r1 == 0) goto L_0x01e1
            a.f.a.j.e r1 = r1.u
            a.f.a.i r1 = r14.r(r1)
            r20 = r1
            goto L_0x01e3
        L_0x01e1:
            r20 = r32
        L_0x01e3:
            a.f.a.j.f r1 = r15.D
            if (r1 == 0) goto L_0x01f0
            a.f.a.j.e r1 = r1.s
            a.f.a.i r1 = r14.r(r1)
            r33 = r1
            goto L_0x01f2
        L_0x01f0:
            r33 = r32
        L_0x01f2:
            a.f.a.j.f$b[] r1 = r15.C
            r17 = 0
            r5 = r1[r17]
            a.f.a.j.e r7 = r15.s
            a.f.a.j.e r8 = r15.u
            int r9 = r15.I
            int r11 = r15.R
            int[] r1 = r15.q
            r1 = r1[r17]
            r34 = r12
            r12 = r1
            float r1 = r15.V
            r13 = r1
            int r1 = r15.h
            r17 = r1
            int r1 = r15.i
            r18 = r1
            float r1 = r15.j
            r19 = r1
            r35 = r0
            r0 = r38
            r1 = r39
            r3 = -1
            r2 = r35
            r36 = r23
            r3 = r33
            r23 = r4
            r4 = r20
            r37 = r6
            r6 = r30
            r30 = r10
            r10 = r25
            r14 = r24
            r15 = r16
            r16 = r28
            r20 = r31
            r0.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0245
        L_0x023b:
            r37 = r6
            r30 = r10
            r34 = r12
            r36 = r23
            r23 = r4
        L_0x0245:
            r15 = r38
            int r0 = r15.f214b
            r1 = 2
            if (r0 != r1) goto L_0x024d
            return
        L_0x024d:
            a.f.a.j.f$b[] r0 = r15.C
            r14 = 1
            r0 = r0[r14]
            a.f.a.j.f$b r1 = a.f.a.j.f.b.WRAP_CONTENT
            if (r0 != r1) goto L_0x025c
            boolean r0 = r15 instanceof a.f.a.j.g
            if (r0 == 0) goto L_0x025c
            r6 = 1
            goto L_0x025d
        L_0x025c:
            r6 = 0
        L_0x025d:
            if (r27 == 0) goto L_0x0269
            int r0 = r15.n
            if (r0 == r14) goto L_0x0266
            r1 = -1
            if (r0 != r1) goto L_0x0269
        L_0x0266:
            r16 = 1
            goto L_0x026b
        L_0x0269:
            r16 = 0
        L_0x026b:
            int r0 = r15.Q
            if (r0 <= 0) goto L_0x02a4
            a.f.a.j.e r0 = r15.w
            a.f.a.j.l r0 = r0.f()
            int r0 = r0.f240b
            if (r0 != r14) goto L_0x0285
            a.f.a.j.e r0 = r15.w
            a.f.a.j.l r0 = r0.f()
            r10 = r39
            r0.g(r10)
            goto L_0x02a6
        L_0x0285:
            r10 = r39
            int r0 = r38.j()
            r1 = 6
            r2 = r36
            r4 = r37
            r10.e(r2, r4, r0, r1)
            a.f.a.j.e r0 = r15.w
            a.f.a.j.e r0 = r0.f197d
            if (r0 == 0) goto L_0x02a8
            a.f.a.i r0 = r10.r(r0)
            r3 = 0
            r10.e(r2, r0, r3, r1)
            r20 = 0
            goto L_0x02aa
        L_0x02a4:
            r10 = r39
        L_0x02a6:
            r4 = r37
        L_0x02a8:
            r20 = r31
        L_0x02aa:
            a.f.a.j.f r0 = r15.D
            if (r0 == 0) goto L_0x02b7
            a.f.a.j.e r0 = r0.v
            a.f.a.i r0 = r10.r(r0)
            r24 = r0
            goto L_0x02b9
        L_0x02b7:
            r24 = r32
        L_0x02b9:
            a.f.a.j.f r0 = r15.D
            if (r0 == 0) goto L_0x02c5
            a.f.a.j.e r0 = r0.t
            a.f.a.i r0 = r10.r(r0)
            r3 = r0
            goto L_0x02c7
        L_0x02c5:
            r3 = r32
        L_0x02c7:
            a.f.a.j.f$b[] r0 = r15.C
            r5 = r0[r14]
            a.f.a.j.e r7 = r15.t
            a.f.a.j.e r8 = r15.v
            int r9 = r15.J
            int r11 = r15.S
            int[] r0 = r15.q
            r12 = r0[r14]
            float r13 = r15.W
            int r0 = r15.k
            r17 = r0
            int r0 = r15.l
            r18 = r0
            float r0 = r15.m
            r19 = r0
            r0 = r38
            r1 = r39
            r2 = r34
            r25 = r4
            r4 = r24
            r10 = r26
            r14 = r16
            r15 = r22
            r16 = r29
            r0.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r27 == 0) goto L_0x0325
            r6 = 6
            r7 = r38
            int r0 = r7.n
            r1 = 1
            if (r0 != r1) goto L_0x0314
            float r5 = r7.o
            r0 = r39
            r1 = r23
            r2 = r25
            r3 = r30
            r4 = r21
            r0.l(r1, r2, r3, r4, r5, r6)
            goto L_0x0327
        L_0x0314:
            float r5 = r7.o
            r6 = 6
            r0 = r39
            r1 = r30
            r2 = r21
            r3 = r23
            r4 = r25
            r0.l(r1, r2, r3, r4, r5, r6)
            goto L_0x0327
        L_0x0325:
            r7 = r38
        L_0x0327:
            a.f.a.j.e r0 = r7.z
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x034f
            a.f.a.j.e r0 = r7.z
            a.f.a.j.e r0 = r0.i()
            a.f.a.j.f r0 = r0.e()
            float r1 = r7.r
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            a.f.a.j.e r2 = r7.z
            int r2 = r2.d()
            r3 = r39
            r3.b(r7, r0, r1, r2)
        L_0x034f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.j.f.b(a.f.a.e):void");
    }

    public void b0(int i2) {
        this.F = i2;
        int i3 = this.S;
        if (i2 < i3) {
            this.F = i3;
        }
    }

    public boolean c() {
        return this.Y != 8;
    }

    public void c0(boolean z2) {
    }

    public void d(int i2) {
        k.a(i2, this);
    }

    public void d0(float f2) {
        this.V = f2;
    }

    public void e0(int i2) {
        this.e0 = i2;
    }

    public void f(f fVar, float f2, int i2) {
        e.d dVar = e.d.CENTER;
        J(dVar, fVar, dVar, i2, 0);
        this.r = f2;
    }

    public void f0(int i2, int i3) {
        this.I = i2;
        int i4 = i3 - i2;
        this.E = i4;
        int i5 = this.R;
        if (i4 < i5) {
            this.E = i5;
        }
    }

    public void g(a.f.a.e eVar) {
        eVar.r(this.s);
        eVar.r(this.t);
        eVar.r(this.u);
        eVar.r(this.v);
        if (this.Q > 0) {
            eVar.r(this.w);
        }
    }

    public void g0(b bVar) {
        this.C[0] = bVar;
        if (bVar == b.WRAP_CONTENT) {
            y0(this.T);
        }
    }

    public e h(e.d dVar) {
        switch (a.f219a[dVar.ordinal()]) {
            case 1:
                return this.s;
            case 2:
                return this.t;
            case 3:
                return this.u;
            case 4:
                return this.v;
            case 5:
                return this.w;
            case 6:
                return this.z;
            case 7:
                return this.x;
            case 8:
                return this.y;
            case 9:
                return null;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    public void h0(int i2, int i3, int i4, float f2) {
        this.f217e = i2;
        this.h = i3;
        this.i = i4;
        this.j = f2;
        if (f2 < 1.0f && i2 == 0) {
            this.f217e = 2;
        }
    }

    public ArrayList<e> i() {
        return this.B;
    }

    public void i0(float f2) {
        this.g0[0] = f2;
    }

    public int j() {
        return this.Q;
    }

    public void j0(int i2) {
        this.q[1] = i2;
    }

    public float k(int i2) {
        if (i2 == 0) {
            return this.V;
        }
        if (i2 == 1) {
            return this.W;
        }
        return -1.0f;
    }

    public void k0(int i2) {
        this.q[0] = i2;
    }

    public int l() {
        return H() + this.F;
    }

    public void l0(int i2) {
        if (i2 < 0) {
            this.S = 0;
        } else {
            this.S = i2;
        }
    }

    public Object m() {
        return this.X;
    }

    public void m0(int i2) {
        if (i2 < 0) {
            this.R = 0;
        } else {
            this.R = i2;
        }
    }

    public String n() {
        return this.Z;
    }

    public void n0(int i2, int i3) {
        this.O = i2;
        this.P = i3;
    }

    public b o(int i2) {
        if (i2 == 0) {
            return s();
        }
        if (i2 == 1) {
            return B();
        }
        return null;
    }

    public void o0(int i2, int i3) {
        this.I = i2;
        this.J = i3;
    }

    public int p() {
        return this.M + this.O;
    }

    public void p0(f fVar) {
        this.D = fVar;
    }

    public int q() {
        return this.N + this.P;
    }

    /* access modifiers changed from: package-private */
    public void q0(int i2, int i3) {
        if (i3 == 0) {
            this.K = i2;
        } else if (i3 == 1) {
            this.L = i2;
        }
    }

    public int r() {
        if (this.Y == 8) {
            return 0;
        }
        return this.F;
    }

    public void r0(float f2) {
        this.W = f2;
    }

    public b s() {
        return this.C[0];
    }

    public void s0(int i2) {
        this.f0 = i2;
    }

    public int t(int i2) {
        if (i2 == 0) {
            return D();
        }
        if (i2 == 1) {
            return r();
        }
        return 0;
    }

    public void t0(int i2, int i3) {
        this.J = i2;
        int i4 = i3 - i2;
        this.F = i4;
        int i5 = this.S;
        if (i4 < i5) {
            this.F = i5;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.a0 != null) {
            str = "type: " + this.a0 + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.Z != null) {
            str2 = "id: " + this.Z + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.I);
        sb.append(", ");
        sb.append(this.J);
        sb.append(") - (");
        sb.append(this.E);
        sb.append(" x ");
        sb.append(this.F);
        sb.append(") wrap: (");
        sb.append(this.T);
        sb.append(" x ");
        sb.append(this.U);
        sb.append(")");
        return sb.toString();
    }

    public f u() {
        return this.D;
    }

    public void u0(b bVar) {
        this.C[1] = bVar;
        if (bVar == b.WRAP_CONTENT) {
            b0(this.U);
        }
    }

    /* access modifiers changed from: package-private */
    public int v(int i2) {
        if (i2 == 0) {
            return this.K;
        }
        if (i2 == 1) {
            return this.L;
        }
        return 0;
    }

    public void v0(int i2, int i3, int i4, float f2) {
        this.f218f = i2;
        this.k = i3;
        this.l = i4;
        this.m = f2;
        if (f2 < 1.0f && i2 == 0) {
            this.f218f = 2;
        }
    }

    public m w() {
        if (this.f216d == null) {
            this.f216d = new m();
        }
        return this.f216d;
    }

    public void w0(float f2) {
        this.g0[1] = f2;
    }

    public m x() {
        if (this.f215c == null) {
            this.f215c = new m();
        }
        return this.f215c;
    }

    public void x0(int i2) {
        this.Y = i2;
    }

    public int y() {
        return G() + this.E;
    }

    public void y0(int i2) {
        this.E = i2;
        int i3 = this.R;
        if (i2 < i3) {
            this.E = i3;
        }
    }

    /* access modifiers changed from: protected */
    public int z() {
        return this.I + this.O;
    }

    public void z0(boolean z2) {
    }
}
