package b.c.a.d.r;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;

/* compiled from: RippleUtils */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f2398a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f2399b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f2400c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f2401d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f2402e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f2403f = {16842913, 16842919};
    private static final int[] g = {16842913, 16843623, 16842908};
    private static final int[] h = {16842913, 16842908};
    private static final int[] i = {16842913, 16843623};
    private static final int[] j = {16842913};

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f2398a) {
            return new ColorStateList(new int[][]{j, StateSet.NOTHING}, new int[]{c(colorStateList, f2403f), c(colorStateList, f2399b)});
        }
        int[] iArr = f2403f;
        int[] iArr2 = g;
        int[] iArr3 = h;
        int[] iArr4 = i;
        int[] iArr5 = f2399b;
        int[] iArr6 = f2400c;
        int[] iArr7 = f2401d;
        int[] iArr8 = f2402e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    private static int b(int i2) {
        return a.h.e.a.d(i2, Math.min(Color.alpha(i2) * 2, 255));
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f2398a ? b(colorForState) : colorForState;
    }
}
