package a.l.a.a;

import android.view.animation.Interpolator;

/* compiled from: LookupTableInterpolator */
abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f464a;

    /* renamed from: b  reason: collision with root package name */
    private final float f465b;

    protected d(float[] fArr) {
        this.f464a = fArr;
        this.f465b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f464a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f2), fArr.length - 2);
        float f3 = this.f465b;
        float f4 = (f2 - (((float) min) * f3)) / f3;
        float[] fArr2 = this.f464a;
        return fArr2[min] + (f4 * (fArr2[min + 1] - fArr2[min]));
    }
}
