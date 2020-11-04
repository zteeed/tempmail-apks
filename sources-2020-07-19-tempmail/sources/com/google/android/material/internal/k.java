package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.b0;
import b.c.a.d.b;

/* compiled from: ThemeEnforcement */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f10865a = {b.colorPrimary};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f10866b = {b.colorSecondary};

    public static void a(Context context) {
        e(context, f10865a, "Theme.AppCompat");
    }

    private static void b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.c.a.d.k.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(b.c.a.d.k.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            c(context);
        }
        a(context);
    }

    public static void c(Context context) {
        e(context, f10866b, "Theme.MaterialComponents");
    }

    private static void d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.c.a.d.k.ThemeEnforcement, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(b.c.a.d.k.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(b.c.a.d.k.ThemeEnforcement_android_textAppearance, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = f(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(Context context, int[] iArr, String str) {
        if (!g(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    private static boolean f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    private static boolean g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        return hasValue;
    }

    public static TypedArray h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        b(context, attributeSet, i, i2);
        d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static b0 i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        b(context, attributeSet, i, i2);
        d(context, attributeSet, iArr, i, i2, iArr2);
        return b0.u(context, attributeSet, iArr, i, i2);
    }
}
