package b.c.a.d.l;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: MatrixEvaluator */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f2275a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f2276b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f2277c = new Matrix();

    /* renamed from: a */
    public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f2275a);
        matrix2.getValues(this.f2276b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f2276b;
            float f3 = fArr[i];
            float[] fArr2 = this.f2275a;
            fArr[i] = fArr2[i] + ((f3 - fArr2[i]) * f2);
        }
        this.f2277c.setValues(this.f2276b);
        return this.f2277c;
    }
}
