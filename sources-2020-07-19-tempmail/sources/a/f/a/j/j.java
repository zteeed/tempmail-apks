package a.f.a.j;

import java.util.Arrays;

/* compiled from: Helper */
public class j extends f {
    protected f[] k0 = new f[4];
    protected int l0 = 0;

    public void I0(f fVar) {
        int i = this.l0 + 1;
        f[] fVarArr = this.k0;
        if (i > fVarArr.length) {
            this.k0 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
        }
        f[] fVarArr2 = this.k0;
        int i2 = this.l0;
        fVarArr2[i2] = fVar;
        this.l0 = i2 + 1;
    }

    public void J0() {
        this.l0 = 0;
    }
}
