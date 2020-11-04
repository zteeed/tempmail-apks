package a.h.k.e0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* compiled from: PathInterpolatorApi14 */
class a implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f397a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f398b;

    a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f397a = new float[i];
        this.f398b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, (float[]) null);
            this.f397a[i2] = fArr[0];
            this.f398b[i2] = fArr[1];
        }
    }

    private static Path a(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        return path;
    }

    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f397a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f2 < this.f397a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f397a;
        float f3 = fArr[length] - fArr[i];
        if (f3 == 0.0f) {
            return this.f398b[i];
        }
        float[] fArr2 = this.f398b;
        float f4 = fArr2[i];
        return f4 + (((f2 - fArr[i]) / f3) * (fArr2[length] - f4));
    }

    a(float f2, float f3, float f4, float f5) {
        this(a(f2, f3, f4, f5));
    }
}
