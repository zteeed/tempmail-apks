package androidx.core.content.c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TypedArrayUtils */
public class g {
    public static boolean a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!j(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    public static ColorStateList c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        } else if (i2 < 28 || i2 > 31) {
            return a.c(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
        } else {
            return d(typedValue);
        }
    }

    private static ColorStateList d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static b e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return b.b(typedValue.data);
            }
            b g = b.g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return b.b(i2);
    }

    public static float f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f2) {
        if (!j(xmlPullParser, str)) {
            return f2;
        }
        return typedArray.getFloat(i, f2);
    }

    public static int g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    public static int h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    public static String i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static boolean j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}
