package b.c.a.d.t;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapePath */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public float f2315a;

    /* renamed from: b  reason: collision with root package name */
    public float f2316b;

    /* renamed from: c  reason: collision with root package name */
    public float f2317c;

    /* renamed from: d  reason: collision with root package name */
    public float f2318d;

    /* renamed from: e  reason: collision with root package name */
    private final List<c> f2319e = new ArrayList();

    /* compiled from: ShapePath */
    public static class a extends c {
        private static final RectF h = new RectF();

        /* renamed from: b  reason: collision with root package name */
        public float f2320b;

        /* renamed from: c  reason: collision with root package name */
        public float f2321c;

        /* renamed from: d  reason: collision with root package name */
        public float f2322d;

        /* renamed from: e  reason: collision with root package name */
        public float f2323e;

        /* renamed from: f  reason: collision with root package name */
        public float f2324f;
        public float g;

        public a(float f2, float f3, float f4, float f5) {
            this.f2320b = f2;
            this.f2321c = f3;
            this.f2322d = f4;
            this.f2323e = f5;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f2327a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            h.set(this.f2320b, this.f2321c, this.f2322d, this.f2323e);
            path.arcTo(h, this.f2324f, this.g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath */
    public static class b extends c {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public float f2325b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public float f2326c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f2327a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f2325b, this.f2326c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        protected final Matrix f2327a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public d() {
        d(0.0f, 0.0f);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        a aVar = new a(f2, f3, f4, f5);
        aVar.f2324f = f6;
        aVar.g = f7;
        this.f2319e.add(aVar);
        double d2 = (double) (f6 + f7);
        this.f2317c = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2))));
        this.f2318d = ((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2))));
    }

    public void b(Matrix matrix, Path path) {
        int size = this.f2319e.size();
        for (int i = 0; i < size; i++) {
            this.f2319e.get(i).a(matrix, path);
        }
    }

    public void c(float f2, float f3) {
        b bVar = new b();
        float unused = bVar.f2325b = f2;
        float unused2 = bVar.f2326c = f3;
        this.f2319e.add(bVar);
        this.f2317c = f2;
        this.f2318d = f3;
    }

    public void d(float f2, float f3) {
        this.f2315a = f2;
        this.f2316b = f3;
        this.f2317c = f2;
        this.f2318d = f3;
        this.f2319e.clear();
    }
}
