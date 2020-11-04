package androidx.appcompat.widget;

import a.a.k.a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.c.f;

/* compiled from: TintTypedArray */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1068a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f1069b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1070c;

    private b0(Context context, TypedArray typedArray) {
        this.f1068a = context;
        this.f1069b = typedArray;
    }

    public static b0 s(Context context, int i, int[] iArr) {
        return new b0(context, context.obtainStyledAttributes(i, iArr));
    }

    public static b0 t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new b0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static b0 u(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new b0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public boolean a(int i, boolean z) {
        return this.f1069b.getBoolean(i, z);
    }

    public int b(int i, int i2) {
        return this.f1069b.getColor(i, i2);
    }

    public ColorStateList c(int i) {
        int resourceId;
        ColorStateList c2;
        if (!this.f1069b.hasValue(i) || (resourceId = this.f1069b.getResourceId(i, 0)) == 0 || (c2 = a.c(this.f1068a, resourceId)) == null) {
            return this.f1069b.getColorStateList(i);
        }
        return c2;
    }

    public float d(int i, float f2) {
        return this.f1069b.getDimension(i, f2);
    }

    public int e(int i, int i2) {
        return this.f1069b.getDimensionPixelOffset(i, i2);
    }

    public int f(int i, int i2) {
        return this.f1069b.getDimensionPixelSize(i, i2);
    }

    public Drawable g(int i) {
        int resourceId;
        if (!this.f1069b.hasValue(i) || (resourceId = this.f1069b.getResourceId(i, 0)) == 0) {
            return this.f1069b.getDrawable(i);
        }
        return a.d(this.f1068a, resourceId);
    }

    public Drawable h(int i) {
        int resourceId;
        if (!this.f1069b.hasValue(i) || (resourceId = this.f1069b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return f.n().q(this.f1068a, resourceId, true);
    }

    public float i(int i, float f2) {
        return this.f1069b.getFloat(i, f2);
    }

    public Typeface j(int i, int i2, f.a aVar) {
        int resourceId = this.f1069b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1070c == null) {
            this.f1070c = new TypedValue();
        }
        return f.c(this.f1068a, resourceId, this.f1070c, i2, aVar);
    }

    public int k(int i, int i2) {
        return this.f1069b.getInt(i, i2);
    }

    public int l(int i, int i2) {
        return this.f1069b.getInteger(i, i2);
    }

    public int m(int i, int i2) {
        return this.f1069b.getLayoutDimension(i, i2);
    }

    public int n(int i, int i2) {
        return this.f1069b.getResourceId(i, i2);
    }

    public String o(int i) {
        return this.f1069b.getString(i);
    }

    public CharSequence p(int i) {
        return this.f1069b.getText(i);
    }

    public CharSequence[] q(int i) {
        return this.f1069b.getTextArray(i);
    }

    public boolean r(int i) {
        return this.f1069b.hasValue(i);
    }

    public void v() {
        this.f1069b.recycle();
    }
}
