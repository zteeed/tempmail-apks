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
    private final Context f1095a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f1096b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1097c;

    private b0(Context context, TypedArray typedArray) {
        this.f1095a = context;
        this.f1096b = typedArray;
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
        return this.f1096b.getBoolean(i, z);
    }

    public int b(int i, int i2) {
        return this.f1096b.getColor(i, i2);
    }

    public ColorStateList c(int i) {
        int resourceId;
        ColorStateList c2;
        if (!this.f1096b.hasValue(i) || (resourceId = this.f1096b.getResourceId(i, 0)) == 0 || (c2 = a.c(this.f1095a, resourceId)) == null) {
            return this.f1096b.getColorStateList(i);
        }
        return c2;
    }

    public float d(int i, float f2) {
        return this.f1096b.getDimension(i, f2);
    }

    public int e(int i, int i2) {
        return this.f1096b.getDimensionPixelOffset(i, i2);
    }

    public int f(int i, int i2) {
        return this.f1096b.getDimensionPixelSize(i, i2);
    }

    public Drawable g(int i) {
        int resourceId;
        if (!this.f1096b.hasValue(i) || (resourceId = this.f1096b.getResourceId(i, 0)) == 0) {
            return this.f1096b.getDrawable(i);
        }
        return a.d(this.f1095a, resourceId);
    }

    public Drawable h(int i) {
        int resourceId;
        if (!this.f1096b.hasValue(i) || (resourceId = this.f1096b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return f.n().q(this.f1095a, resourceId, true);
    }

    public float i(int i, float f2) {
        return this.f1096b.getFloat(i, f2);
    }

    public Typeface j(int i, int i2, f.a aVar) {
        int resourceId = this.f1096b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1097c == null) {
            this.f1097c = new TypedValue();
        }
        return f.c(this.f1095a, resourceId, this.f1097c, i2, aVar);
    }

    public int k(int i, int i2) {
        return this.f1096b.getInt(i, i2);
    }

    public int l(int i, int i2) {
        return this.f1096b.getInteger(i, i2);
    }

    public int m(int i, int i2) {
        return this.f1096b.getLayoutDimension(i, i2);
    }

    public int n(int i, int i2) {
        return this.f1096b.getResourceId(i, i2);
    }

    public String o(int i) {
        return this.f1096b.getString(i);
    }

    public CharSequence p(int i) {
        return this.f1096b.getText(i);
    }

    public CharSequence[] q(int i) {
        return this.f1096b.getTextArray(i);
    }

    public boolean r(int i) {
        return this.f1096b.hasValue(i);
    }

    public void v() {
        this.f1096b.recycle();
    }
}
