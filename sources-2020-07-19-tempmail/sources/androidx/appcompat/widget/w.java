package androidx.appcompat.widget;

import a.h.e.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* compiled from: ThemeUtils */
class w {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1168a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    static final int[] f1169b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f1170c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f1171d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f1172e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f1173f = new int[0];
    private static final int[] g = new int[1];

    public static int a(Context context, int i) {
        ColorStateList d2 = d(context, i);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(f1169b, d2.getDefaultColor());
        }
        TypedValue e2 = e();
        context.getTheme().resolveAttribute(16842803, e2, true);
        return c(context, i, e2.getFloat());
    }

    public static int b(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        b0 t = b0.t(context, (AttributeSet) null, iArr);
        try {
            return t.b(0, 0);
        } finally {
            t.v();
        }
    }

    static int c(Context context, int i, float f2) {
        int b2 = b(context, i);
        return a.d(b2, Math.round(((float) Color.alpha(b2)) * f2));
    }

    public static ColorStateList d(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        b0 t = b0.t(context, (AttributeSet) null, iArr);
        try {
            return t.c(0);
        } finally {
            t.v();
        }
    }

    private static TypedValue e() {
        TypedValue typedValue = f1168a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f1168a.set(typedValue2);
        return typedValue2;
    }
}
