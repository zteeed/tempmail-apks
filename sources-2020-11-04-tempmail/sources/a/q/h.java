package a.q;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* compiled from: PathProperty */
class h<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    private final Property<T, PointF> f538a;

    /* renamed from: b  reason: collision with root package name */
    private final PathMeasure f539b;

    /* renamed from: c  reason: collision with root package name */
    private final float f540c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f541d = new float[2];

    /* renamed from: e  reason: collision with root package name */
    private final PointF f542e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private float f543f;

    h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f538a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f539b = pathMeasure;
        this.f540c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f543f);
    }

    /* renamed from: b */
    public void set(T t, Float f2) {
        this.f543f = f2.floatValue();
        this.f539b.getPosTan(this.f540c * f2.floatValue(), this.f541d, (float[]) null);
        PointF pointF = this.f542e;
        float[] fArr = this.f541d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f538a.set(t, pointF);
    }
}
