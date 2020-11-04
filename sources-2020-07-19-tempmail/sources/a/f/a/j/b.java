package a.f.a.j;

import a.f.a.e;
import a.f.a.i;
import a.f.a.j.f;
import java.util.ArrayList;

/* compiled from: Barrier */
public class b extends j {
    private int m0 = 0;
    private ArrayList<l> n0 = new ArrayList<>(4);
    private boolean o0 = true;

    public boolean K0() {
        return this.o0;
    }

    public void L0(boolean z) {
        this.o0 = z;
    }

    public void M0(int i) {
        this.m0 = i;
    }

    public void S() {
        super.S();
        this.n0.clear();
    }

    public void U() {
        l lVar;
        float f2;
        l lVar2;
        int i = this.m0;
        float f3 = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                lVar = this.u.f();
            } else if (i == 2) {
                lVar = this.t.f();
            } else if (i == 3) {
                lVar = this.v.f();
            } else {
                return;
            }
            f3 = 0.0f;
        } else {
            lVar = this.s.f();
        }
        int size = this.n0.size();
        l lVar3 = null;
        int i2 = 0;
        while (i2 < size) {
            l lVar4 = this.n0.get(i2);
            if (lVar4.f240b == 1) {
                int i3 = this.m0;
                if (i3 == 0 || i3 == 2) {
                    f2 = lVar4.g;
                    if (f2 < f3) {
                        lVar2 = lVar4.f237f;
                    } else {
                        i2++;
                    }
                } else {
                    f2 = lVar4.g;
                    if (f2 > f3) {
                        lVar2 = lVar4.f237f;
                    } else {
                        i2++;
                    }
                }
                lVar3 = lVar2;
                f3 = f2;
                i2++;
            } else {
                return;
            }
        }
        if (e.x() != null) {
            e.x().y++;
        }
        lVar.f237f = lVar3;
        lVar.g = f3;
        lVar.b();
        int i4 = this.m0;
        if (i4 == 0) {
            this.u.f().l(lVar3, f3);
        } else if (i4 == 1) {
            this.s.f().l(lVar3, f3);
        } else if (i4 == 2) {
            this.v.f().l(lVar3, f3);
        } else if (i4 == 3) {
            this.t.f().l(lVar3, f3);
        }
    }

    public void b(e eVar) {
        e[] eVarArr;
        boolean z;
        int i;
        int i2;
        e[] eVarArr2 = this.A;
        eVarArr2[0] = this.s;
        eVarArr2[2] = this.t;
        eVarArr2[1] = this.u;
        eVarArr2[3] = this.v;
        int i3 = 0;
        while (true) {
            eVarArr = this.A;
            if (i3 >= eVarArr.length) {
                break;
            }
            eVarArr[i3].i = eVar.r(eVarArr[i3]);
            i3++;
        }
        int i4 = this.m0;
        if (i4 >= 0 && i4 < 4) {
            e eVar2 = eVarArr[i4];
            int i5 = 0;
            while (true) {
                if (i5 >= this.l0) {
                    z = false;
                    break;
                }
                f fVar = this.k0[i5];
                if ((this.o0 || fVar.c()) && ((((i = this.m0) == 0 || i == 1) && fVar.s() == f.b.MATCH_CONSTRAINT) || (((i2 = this.m0) == 2 || i2 == 3) && fVar.B() == f.b.MATCH_CONSTRAINT))) {
                    z = true;
                } else {
                    i5++;
                }
            }
            int i6 = this.m0;
            if (i6 == 0 || i6 == 1 ? u().s() == f.b.WRAP_CONTENT : u().B() == f.b.WRAP_CONTENT) {
                z = false;
            }
            for (int i7 = 0; i7 < this.l0; i7++) {
                f fVar2 = this.k0[i7];
                if (this.o0 || fVar2.c()) {
                    i r = eVar.r(fVar2.A[this.m0]);
                    e[] eVarArr3 = fVar2.A;
                    int i8 = this.m0;
                    eVarArr3[i8].i = r;
                    if (i8 == 0 || i8 == 2) {
                        eVar.j(eVar2.i, r, z);
                    } else {
                        eVar.h(eVar2.i, r, z);
                    }
                }
            }
            int i9 = this.m0;
            if (i9 == 0) {
                eVar.e(this.u.i, this.s.i, 0, 6);
                if (!z) {
                    eVar.e(this.s.i, this.D.u.i, 0, 5);
                }
            } else if (i9 == 1) {
                eVar.e(this.s.i, this.u.i, 0, 6);
                if (!z) {
                    eVar.e(this.s.i, this.D.s.i, 0, 5);
                }
            } else if (i9 == 2) {
                eVar.e(this.v.i, this.t.i, 0, 6);
                if (!z) {
                    eVar.e(this.t.i, this.D.v.i, 0, 5);
                }
            } else if (i9 == 3) {
                eVar.e(this.t.i, this.v.i, 0, 6);
                if (!z) {
                    eVar.e(this.t.i, this.D.t.i, 0, 5);
                }
            }
        }
    }

    public boolean c() {
        return true;
    }

    public void d(int i) {
        l lVar;
        l lVar2;
        f fVar = this.D;
        if (fVar != null && ((g) fVar).X0(2)) {
            int i2 = this.m0;
            if (i2 == 0) {
                lVar = this.s.f();
            } else if (i2 == 1) {
                lVar = this.u.f();
            } else if (i2 == 2) {
                lVar = this.t.f();
            } else if (i2 == 3) {
                lVar = this.v.f();
            } else {
                return;
            }
            lVar.p(5);
            int i3 = this.m0;
            if (i3 == 0 || i3 == 1) {
                this.t.f().l((l) null, 0.0f);
                this.v.f().l((l) null, 0.0f);
            } else {
                this.s.f().l((l) null, 0.0f);
                this.u.f().l((l) null, 0.0f);
            }
            this.n0.clear();
            for (int i4 = 0; i4 < this.l0; i4++) {
                f fVar2 = this.k0[i4];
                if (this.o0 || fVar2.c()) {
                    int i5 = this.m0;
                    if (i5 == 0) {
                        lVar2 = fVar2.s.f();
                    } else if (i5 == 1) {
                        lVar2 = fVar2.u.f();
                    } else if (i5 == 2) {
                        lVar2 = fVar2.t.f();
                    } else if (i5 != 3) {
                        lVar2 = null;
                    } else {
                        lVar2 = fVar2.v.f();
                    }
                    if (lVar2 != null) {
                        this.n0.add(lVar2);
                        lVar2.a(lVar);
                    }
                }
            }
        }
    }
}
