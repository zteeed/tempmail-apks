package b.c.a.d.t;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapePath */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public float f2413a;

    /* renamed from: b  reason: collision with root package name */
    public float f2414b;

    /* renamed from: c  reason: collision with root package name */
    public float f2415c;

    /* renamed from: d  reason: collision with root package name */
    public float f2416d;

    /* renamed from: e  reason: collision with root package name */
    private final List<c> f2417e = new ArrayList();

    /* compiled from: ShapePath */
    public static class a extends c {
        private static final RectF h = new RectF();

        /* renamed from: b  reason: collision with root package name */
        public float f2418b;

        /* renamed from: c  reason: collision with root package name */
        public float f2419c;

        /* renamed from: d  reason: collision with root package name */
        public float f2420d;

        /* renamed from: e  reason: collision with root package name */
        public float f2421e;

        /* renamed from: f  reason: collision with root package name */
        public float f2422f;
        public float g;

        public a(float f2, float f3, float f4, float f5) {
            this.f2418b = f2;
            this.f2419c = f3;
            this.f2420d = f4;
            this.f2421e = f5;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f2425a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            h.set(this.f2418b, this.f2419c, this.f2420d, this.f2421e);
            path.arcTo(h, this.f2422f, this.g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath */
    public static class b extends c {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public float f2423b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public float f2424c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f2425a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f2423b, this.f2424c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        protected final Matrix f2425a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public d() {
        d(0.0f, 0.0f);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        a aVar = new a(f2, f3, f4, f5);
        aVar.f2422f = f6;
        aVar.g = f7;
        this.f2417e.add(aVar);
        double d2 = (double) (f6 + f7);
        this.f2415c = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2))));
        this.f2416d = ((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2))));
    }

    public void b(Matrix matrix, Path path) {
        int size = this.f2417e.size();
        for (int i = 0; i < size; i++) {
            this.f2417e.get(i).a(matrix, path);
        }
    }

    public void c(float f2, float f3) {
        b bVar = new b();
        float unused = bVar.f2423b = f2;
        float unused2 = bVar.f2424c = f3;
        this.f2417e.add(bVar);
        this.f2415c = f2;
        this.f2416d = f3;
    }

    public void d(float f2, float f3) {
        this.f2413a = f2;
        this.f2414b = f3;
        this.f2415c = f2;
        this.f2416d = f3;
        this.f2417e.clear();
    }
}
