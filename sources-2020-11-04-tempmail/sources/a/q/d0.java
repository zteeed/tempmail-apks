package a.q;

import a.h.k.u;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: ViewUtils */
class d0 {

    /* renamed from: a  reason: collision with root package name */
    private static final h0 f518a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f519b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f520c;

    /* renamed from: d  reason: collision with root package name */
    static final Property<View, Float> f521d = new a(Float.class, "translationAlpha");

    /* compiled from: ViewUtils */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(d0.d(view));
        }

        /* renamed from: b */
        public void set(View view, Float f2) {
            d0.h(view, f2.floatValue());
        }
    }

    /* compiled from: ViewUtils */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return u.m(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            u.e0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 22) {
            f518a = new g0();
        } else if (i >= 21) {
            f518a = new f0();
        } else if (i >= 19) {
            f518a = new e0();
        } else {
            f518a = new h0();
        }
        new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f518a.a(view);
    }

    private static void b() {
        if (!f520c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f519b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f520c = true;
        }
    }

    static c0 c(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new b0(view);
        }
        return a0.e(view);
    }

    static float d(View view) {
        return f518a.b(view);
    }

    static l0 e(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new k0(view);
        }
        return new j0(view.getWindowToken());
    }

    static void f(View view) {
        f518a.c(view);
    }

    static void g(View view, int i, int i2, int i3, int i4) {
        f518a.d(view, i, i2, i3, i4);
    }

    static void h(View view, float f2) {
        f518a.e(view, f2);
    }

    static void i(View view, int i) {
        b();
        Field field = f519b;
        if (field != null) {
            try {
                f519b.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    static void j(View view, Matrix matrix) {
        f518a.f(view, matrix);
    }

    static void k(View view, Matrix matrix) {
        f518a.g(view, matrix);
    }
}
