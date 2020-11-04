package b.c.a.d.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* compiled from: MaterialResources */
public class a {
    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList c2;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c2 = a.a.k.a.a.c(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return c2;
    }

    public static Drawable b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable d2;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (d2 = a.a.k.a.a.d(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return d2;
    }

    static int c(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    public static b d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new b(context, resourceId);
    }
}
