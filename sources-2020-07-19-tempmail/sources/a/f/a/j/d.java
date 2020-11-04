package a.f.a.j;

import a.f.a.j.f;
import java.util.ArrayList;

/* compiled from: ChainHead */
public class d {

    /* renamed from: a  reason: collision with root package name */
    protected f f188a;

    /* renamed from: b  reason: collision with root package name */
    protected f f189b;

    /* renamed from: c  reason: collision with root package name */
    protected f f190c;

    /* renamed from: d  reason: collision with root package name */
    protected f f191d;

    /* renamed from: e  reason: collision with root package name */
    protected f f192e;

    /* renamed from: f  reason: collision with root package name */
    protected f f193f;
    protected f g;
    protected ArrayList<f> h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    private int l;
    private boolean m = false;
    protected boolean n;
    protected boolean o;
    protected boolean p;
    private boolean q;

    public d(f fVar, int i2, boolean z) {
        this.f188a = fVar;
        this.l = i2;
        this.m = z;
    }

    private void b() {
        int i2 = this.l * 2;
        f fVar = this.f188a;
        boolean z = false;
        f fVar2 = fVar;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            f[] fVarArr = fVar.i0;
            int i3 = this.l;
            f fVar3 = null;
            fVarArr[i3] = null;
            fVar.h0[i3] = null;
            if (fVar.C() != 8) {
                if (this.f189b == null) {
                    this.f189b = fVar;
                }
                this.f191d = fVar;
                f.b[] bVarArr = fVar.C;
                int i4 = this.l;
                if (bVarArr[i4] == f.b.MATCH_CONSTRAINT) {
                    int[] iArr = fVar.g;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.j++;
                        float[] fArr = fVar.g0;
                        int i5 = this.l;
                        float f2 = fArr[i5];
                        if (f2 > 0.0f) {
                            this.k += fArr[i5];
                        }
                        if (c(fVar, this.l)) {
                            if (f2 < 0.0f) {
                                this.n = true;
                            } else {
                                this.o = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(fVar);
                        }
                        if (this.f193f == null) {
                            this.f193f = fVar;
                        }
                        f fVar4 = this.g;
                        if (fVar4 != null) {
                            fVar4.h0[this.l] = fVar;
                        }
                        this.g = fVar;
                    }
                }
            }
            if (fVar2 != fVar) {
                fVar2.i0[this.l] = fVar;
            }
            e eVar = fVar.A[i2 + 1].f197d;
            if (eVar != null) {
                f fVar5 = eVar.f195b;
                e[] eVarArr = fVar5.A;
                if (eVarArr[i2].f197d != null && eVarArr[i2].f197d.f195b == fVar) {
                    fVar3 = fVar5;
                }
            }
            if (fVar3 == null) {
                fVar3 = fVar;
                z2 = true;
            }
            fVar2 = fVar;
            fVar = fVar3;
        }
        this.f190c = fVar;
        if (this.l != 0 || !this.m) {
            this.f192e = this.f188a;
        } else {
            this.f192e = fVar;
        }
        if (this.o && this.n) {
            z = true;
        }
        this.p = z;
    }

    private static boolean c(f fVar, int i2) {
        if (fVar.C() != 8 && fVar.C[i2] == f.b.MATCH_CONSTRAINT) {
            int[] iArr = fVar.g;
            if (iArr[i2] == 0 || iArr[i2] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.q) {
            b();
        }
        this.q = true;
    }
}
