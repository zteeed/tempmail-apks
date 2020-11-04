package a.q.a.a;

import a.h.e.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.core.content.c.g;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PathInterpolatorCompat */
public class f implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private float[] f618a;

    /* renamed from: b  reason: collision with root package name */
    private float[] f619b;

    public f(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void a(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        b(path);
    }

    private void b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f618a = new float[min];
            this.f619b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f618a[i2] = fArr[0];
                this.f619b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f618a[0])) <= 1.0E-5d && ((double) Math.abs(this.f619b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f618a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f619b[i3] - 1.0f)) <= 1.0E-5d) {
                    float f2 = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f618a;
                        int i5 = i4 + 1;
                        float f3 = fArr2[i4];
                        if (f3 >= f2) {
                            fArr2[i] = f3;
                            i++;
                            f2 = f3;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f3);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f618a[0]);
            sb.append(",");
            sb.append(this.f619b[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.f618a[i6]);
            sb.append(",");
            sb.append(this.f619b[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    private void c(float f2, float f3) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f2, f3, 1.0f, 1.0f);
        b(path);
    }

    private void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (g.j(xmlPullParser, "pathData")) {
            String i = g.i(typedArray, xmlPullParser, "pathData", 4);
            Path e2 = b.e(i);
            if (e2 != null) {
                b(e2);
                return;
            }
            throw new InflateException("The path is null, which is created from " + i);
        } else if (!g.j(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (g.j(xmlPullParser, "controlY1")) {
            float f2 = g.f(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float f3 = g.f(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean j = g.j(xmlPullParser, "controlX2");
            if (j != g.j(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!j) {
                c(f2, f3);
            } else {
                a(f2, f3, g.f(typedArray, xmlPullParser, "controlX2", 2, 0.0f), g.f(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f618a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f2 < this.f618a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f618a;
        float f3 = fArr[length] - fArr[i];
        if (f3 == 0.0f) {
            return this.f619b[i];
        }
        float[] fArr2 = this.f619b;
        float f4 = fArr2[i];
        return f4 + (((f2 - fArr[i]) / f3) * (fArr2[length] - f4));
    }

    public f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k = g.k(resources, theme, attributeSet, a.l);
        d(k, xmlPullParser);
        k.recycle();
    }
}
