package a.f.a;

import java.util.Arrays;

/* compiled from: SolverVariable */
public class i {
    private static int k = 1;

    /* renamed from: a  reason: collision with root package name */
    private String f178a;

    /* renamed from: b  reason: collision with root package name */
    public int f179b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f180c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f181d = 0;

    /* renamed from: e  reason: collision with root package name */
    public float f182e;

    /* renamed from: f  reason: collision with root package name */
    float[] f183f = new float[7];
    a g;
    b[] h = new b[8];
    int i = 0;
    public int j = 0;

    /* compiled from: SolverVariable */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.g = aVar;
    }

    static void b() {
        k++;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.i;
            if (i2 >= i3) {
                b[] bVarArr = this.h;
                if (i3 >= bVarArr.length) {
                    this.h = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.h;
                int i4 = this.i;
                bVarArr2[i4] = bVar;
                this.i = i4 + 1;
                return;
            } else if (this.h[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void c(b bVar) {
        int i2 = this.i;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.h[i3] == bVar) {
                for (int i4 = 0; i4 < (i2 - i3) - 1; i4++) {
                    b[] bVarArr = this.h;
                    int i5 = i3 + i4;
                    bVarArr[i5] = bVarArr[i5 + 1];
                }
                this.i--;
                return;
            }
        }
    }

    public void d() {
        this.f178a = null;
        this.g = a.UNKNOWN;
        this.f181d = 0;
        this.f179b = -1;
        this.f180c = -1;
        this.f182e = 0.0f;
        this.i = 0;
        this.j = 0;
    }

    public void e(a aVar, String str) {
        this.g = aVar;
    }

    public final void f(b bVar) {
        int i2 = this.i;
        for (int i3 = 0; i3 < i2; i3++) {
            b[] bVarArr = this.h;
            bVarArr[i3].f159d.n(bVarArr[i3], bVar, false);
        }
        this.i = 0;
    }

    public String toString() {
        return "" + this.f178a;
    }
}
