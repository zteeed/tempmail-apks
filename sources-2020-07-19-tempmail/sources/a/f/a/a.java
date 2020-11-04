package a.f.a;

import a.f.a.i;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables */
public class a {

    /* renamed from: a  reason: collision with root package name */
    int f149a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final b f150b;

    /* renamed from: c  reason: collision with root package name */
    private final c f151c;

    /* renamed from: d  reason: collision with root package name */
    private int f152d = 8;

    /* renamed from: e  reason: collision with root package name */
    private i f153e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f154f = new int[8];
    private int[] g = new int[8];
    private float[] h = new float[8];
    private int i = -1;
    private int j = -1;
    private boolean k = false;

    a(b bVar, c cVar) {
        this.f150b = bVar;
        this.f151c = cVar;
    }

    private boolean k(i iVar, e eVar) {
        return iVar.j <= 1;
    }

    /* access modifiers changed from: package-private */
    public final void a(i iVar, float f2, boolean z) {
        if (f2 != 0.0f) {
            int i2 = this.i;
            if (i2 == -1) {
                this.i = 0;
                this.h[0] = f2;
                this.f154f[0] = iVar.f178b;
                this.g[0] = -1;
                iVar.j++;
                iVar.a(this.f150b);
                this.f149a++;
                if (!this.k) {
                    int i3 = this.j + 1;
                    this.j = i3;
                    int[] iArr = this.f154f;
                    if (i3 >= iArr.length) {
                        this.k = true;
                        this.j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.f149a) {
                int[] iArr2 = this.f154f;
                int i6 = iArr2[i2];
                int i7 = iVar.f178b;
                if (i6 == i7) {
                    float[] fArr = this.h;
                    fArr[i2] = fArr[i2] + f2;
                    if (fArr[i2] == 0.0f) {
                        if (i2 == this.i) {
                            this.i = this.g[i2];
                        } else {
                            int[] iArr3 = this.g;
                            iArr3[i5] = iArr3[i2];
                        }
                        if (z) {
                            iVar.c(this.f150b);
                        }
                        if (this.k) {
                            this.j = i2;
                        }
                        iVar.j--;
                        this.f149a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i5 = i2;
                }
                i2 = this.g[i2];
                i4++;
            }
            int i8 = this.j;
            int i9 = i8 + 1;
            if (this.k) {
                int[] iArr4 = this.f154f;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f154f;
            if (i8 >= iArr5.length && this.f149a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f154f;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.f154f;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.f152d * 2;
                this.f152d = i11;
                this.k = false;
                this.j = i8 - 1;
                this.h = Arrays.copyOf(this.h, i11);
                this.f154f = Arrays.copyOf(this.f154f, this.f152d);
                this.g = Arrays.copyOf(this.g, this.f152d);
            }
            this.f154f[i8] = iVar.f178b;
            this.h[i8] = f2;
            if (i5 != -1) {
                int[] iArr8 = this.g;
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                this.g[i8] = this.i;
                this.i = i8;
            }
            iVar.j++;
            iVar.a(this.f150b);
            this.f149a++;
            if (!this.k) {
                this.j++;
            }
            int i12 = this.j;
            int[] iArr9 = this.f154f;
            if (i12 >= iArr9.length) {
                this.k = true;
                this.j = iArr9.length - 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a.f.a.i b(a.f.a.e r15) {
        /*
            r14 = this;
            int r0 = r14.i
            r1 = 0
            r2 = 0
            r3 = 0
            r2 = r1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000b:
            r9 = -1
            if (r0 == r9) goto L_0x0098
            int r9 = r14.f149a
            if (r4 >= r9) goto L_0x0098
            float[] r9 = r14.h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            a.f.a.c r12 = r14.f151c
            a.f.a.i[] r12 = r12.f162c
            int[] r13 = r14.f154f
            r13 = r13[r0]
            r12 = r12[r13]
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0036
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0042
            r9[r0] = r3
            a.f.a.b r9 = r14.f150b
            r12.c(r9)
            goto L_0x0041
        L_0x0036:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0042
            r9[r0] = r3
            a.f.a.b r9 = r14.f150b
            r12.c(r9)
        L_0x0041:
            r10 = 0
        L_0x0042:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x0090
            a.f.a.i$a r11 = r12.g
            a.f.a.i$a r13 = a.f.a.i.a.UNRESTRICTED
            if (r11 != r13) goto L_0x006c
            if (r2 != 0) goto L_0x0057
            boolean r2 = r14.k(r12, r15)
        L_0x0053:
            r5 = r2
            r7 = r10
            r2 = r12
            goto L_0x0090
        L_0x0057:
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0060
            boolean r2 = r14.k(r12, r15)
            goto L_0x0053
        L_0x0060:
            if (r5 != 0) goto L_0x0090
            boolean r11 = r14.k(r12, r15)
            if (r11 == 0) goto L_0x0090
            r7 = r10
            r2 = r12
            r5 = 1
            goto L_0x0090
        L_0x006c:
            if (r2 != 0) goto L_0x0090
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x0090
            if (r1 != 0) goto L_0x007c
            boolean r1 = r14.k(r12, r15)
        L_0x0078:
            r6 = r1
            r8 = r10
            r1 = r12
            goto L_0x0090
        L_0x007c:
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0085
            boolean r1 = r14.k(r12, r15)
            goto L_0x0078
        L_0x0085:
            if (r6 != 0) goto L_0x0090
            boolean r11 = r14.k(r12, r15)
            if (r11 == 0) goto L_0x0090
            r8 = r10
            r1 = r12
            r6 = 1
        L_0x0090:
            int[] r9 = r14.g
            r0 = r9[r0]
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0098:
            if (r2 == 0) goto L_0x009b
            return r2
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.a.b(a.f.a.e):a.f.a.i");
    }

    public final void c() {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f149a) {
            i iVar = this.f151c.f162c[this.f154f[i2]];
            if (iVar != null) {
                iVar.c(this.f150b);
            }
            i2 = this.g[i2];
            i3++;
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f149a = 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean d(i iVar) {
        int i2 = this.i;
        if (i2 == -1) {
            return false;
        }
        int i3 = 0;
        while (i2 != -1 && i3 < this.f149a) {
            if (this.f154f[i2] == iVar.f178b) {
                return true;
            }
            i2 = this.g[i2];
            i3++;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void e(float f2) {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f149a) {
            float[] fArr = this.h;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.g[i2];
            i3++;
        }
    }

    public final float f(i iVar) {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f149a) {
            if (this.f154f[i2] == iVar.f178b) {
                return this.h[i2];
            }
            i2 = this.g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public i g(boolean[] zArr, i iVar) {
        i.a aVar;
        int i2 = this.i;
        int i3 = 0;
        i iVar2 = null;
        float f2 = 0.0f;
        while (i2 != -1 && i3 < this.f149a) {
            if (this.h[i2] < 0.0f) {
                i iVar3 = this.f151c.f162c[this.f154f[i2]];
                if ((zArr == null || !zArr[iVar3.f178b]) && iVar3 != iVar && ((aVar = iVar3.g) == i.a.SLACK || aVar == i.a.ERROR)) {
                    float f3 = this.h[i2];
                    if (f3 < f2) {
                        iVar2 = iVar3;
                        f2 = f3;
                    }
                }
            }
            i2 = this.g[i2];
            i3++;
        }
        return iVar2;
    }

    /* access modifiers changed from: package-private */
    public final i h(int i2) {
        int i3 = this.i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f149a) {
            if (i4 == i2) {
                return this.f151c.f162c[this.f154f[i3]];
            }
            i3 = this.g[i3];
            i4++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float i(int i2) {
        int i3 = this.i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f149a) {
            if (i4 == i2) {
                return this.h[i3];
            }
            i3 = this.g[i3];
            i4++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f149a) {
            float[] fArr = this.h;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.g[i2];
            i3++;
        }
    }

    public final void l(i iVar, float f2) {
        if (f2 == 0.0f) {
            m(iVar, true);
            return;
        }
        int i2 = this.i;
        if (i2 == -1) {
            this.i = 0;
            this.h[0] = f2;
            this.f154f[0] = iVar.f178b;
            this.g[0] = -1;
            iVar.j++;
            iVar.a(this.f150b);
            this.f149a++;
            if (!this.k) {
                int i3 = this.j + 1;
                this.j = i3;
                int[] iArr = this.f154f;
                if (i3 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.f149a) {
            int[] iArr2 = this.f154f;
            int i6 = iArr2[i2];
            int i7 = iVar.f178b;
            if (i6 == i7) {
                this.h[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i5 = i2;
            }
            i2 = this.g[i2];
            i4++;
        }
        int i8 = this.j;
        int i9 = i8 + 1;
        if (this.k) {
            int[] iArr3 = this.f154f;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f154f;
        if (i8 >= iArr4.length && this.f149a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f154f;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f154f;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.f152d * 2;
            this.f152d = i11;
            this.k = false;
            this.j = i8 - 1;
            this.h = Arrays.copyOf(this.h, i11);
            this.f154f = Arrays.copyOf(this.f154f, this.f152d);
            this.g = Arrays.copyOf(this.g, this.f152d);
        }
        this.f154f[i8] = iVar.f178b;
        this.h[i8] = f2;
        if (i5 != -1) {
            int[] iArr7 = this.g;
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            this.g[i8] = this.i;
            this.i = i8;
        }
        iVar.j++;
        iVar.a(this.f150b);
        this.f149a++;
        if (!this.k) {
            this.j++;
        }
        if (this.f149a >= this.f154f.length) {
            this.k = true;
        }
        int i12 = this.j;
        int[] iArr8 = this.f154f;
        if (i12 >= iArr8.length) {
            this.k = true;
            this.j = iArr8.length - 1;
        }
    }

    public final float m(i iVar, boolean z) {
        if (this.f153e == iVar) {
            this.f153e = null;
        }
        int i2 = this.i;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f149a) {
            if (this.f154f[i2] == iVar.f178b) {
                if (i2 == this.i) {
                    this.i = this.g[i2];
                } else {
                    int[] iArr = this.g;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    iVar.c(this.f150b);
                }
                iVar.j--;
                this.f149a--;
                this.f154f[i2] = -1;
                if (this.k) {
                    this.j = i2;
                }
                return this.h[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final void n(b bVar, b bVar2, boolean z) {
        int i2 = this.i;
        while (true) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.f149a) {
                int i4 = this.f154f[i2];
                i iVar = bVar2.f155a;
                if (i4 == iVar.f178b) {
                    float f2 = this.h[i2];
                    m(iVar, z);
                    a aVar = bVar2.f158d;
                    int i5 = aVar.i;
                    int i6 = 0;
                    while (i5 != -1 && i6 < aVar.f149a) {
                        a(this.f151c.f162c[aVar.f154f[i5]], aVar.h[i5] * f2, z);
                        i5 = aVar.g[i5];
                        i6++;
                    }
                    bVar.f156b += bVar2.f156b * f2;
                    if (z) {
                        bVar2.f155a.c(bVar);
                    }
                    i2 = this.i;
                } else {
                    i2 = this.g[i2];
                    i3++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: package-private */
    public void o(b bVar, b[] bVarArr) {
        int i2 = this.i;
        while (true) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.f149a) {
                i iVar = this.f151c.f162c[this.f154f[i2]];
                if (iVar.f179c != -1) {
                    float f2 = this.h[i2];
                    m(iVar, true);
                    b bVar2 = bVarArr[iVar.f179c];
                    if (!bVar2.f159e) {
                        a aVar = bVar2.f158d;
                        int i4 = aVar.i;
                        int i5 = 0;
                        while (i4 != -1 && i5 < aVar.f149a) {
                            a(this.f151c.f162c[aVar.f154f[i4]], aVar.h[i4] * f2, true);
                            i4 = aVar.g[i4];
                            i5++;
                        }
                    }
                    bVar.f156b += bVar2.f156b * f2;
                    bVar2.f155a.c(bVar);
                    i2 = this.i;
                } else {
                    i2 = this.g[i2];
                    i3++;
                }
            }
            return;
        }
    }

    public String toString() {
        int i2 = this.i;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.f149a) {
            str = ((str + " -> ") + this.h[i2] + " : ") + this.f151c.f162c[this.f154f[i2]];
            i2 = this.g[i2];
            i3++;
        }
        return str;
    }
}
