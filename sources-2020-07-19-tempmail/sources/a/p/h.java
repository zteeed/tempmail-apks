package a.p;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* compiled from: PathProperty */
class h<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    private final Property<T, PointF> f534a;

    /* renamed from: b  reason: collision with root package name */
    private final PathMeasure f535b;

    /* renamed from: c  reason: collision with root package name */
    private final float f536c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f537d = new float[2];

    /* renamed from: e  reason: collision with root package name */
    private final PointF f538e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private float f539f;

    h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f534a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f535b = pathMeasure;
        this.f536c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f539f);
    }

    /* renamed from: b */
    public void set(T t, Float f2) {
        this.f539f = f2.floatValue();
        this.f535b.getPosTan(this.f536c * f2.floatValue(), this.f537d, (float[]) null);
        PointF pointF = this.f538e;
        float[] fArr = this.f537d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f534a.set(t, pointF);
    }
}
