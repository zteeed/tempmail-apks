package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.core.graphics.drawable.a;
import com.google.android.gms.base.R;
import com.google.android.gms.common.util.DeviceProperties;

public final class SignInButtonImpl extends Button {
    public SignInButtonImpl(Context context) {
        this(context, (AttributeSet) null);
    }

    private static int b(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown color scheme: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void a(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = R.drawable.common_google_signin_btn_icon_dark;
        int i5 = R.drawable.common_google_signin_btn_icon_light;
        int b2 = b(i2, i4, i5, i5);
        int i6 = R.drawable.common_google_signin_btn_text_dark;
        int i7 = R.drawable.common_google_signin_btn_text_light;
        int b3 = b(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            b2 = b3;
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown button size: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        Drawable r = a.r(resources.getDrawable(b2));
        a.o(r, resources.getColorStateList(R.color.common_google_signin_btn_tint));
        a.p(r, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(r);
        int i8 = R.color.common_google_signin_btn_text_dark;
        int i9 = R.color.common_google_signin_btn_text_light;
        ColorStateList colorStateList = resources.getColorStateList(b(i2, i8, i9, i9));
        Preconditions.k(colorStateList);
        setTextColor(colorStateList);
        if (i == 0) {
            setText(resources.getString(R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(R.string.common_signin_button_text_long));
        } else if (i == 2) {
            setText((CharSequence) null);
        } else {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Unknown button size: ");
            sb2.append(i);
            throw new IllegalStateException(sb2.toString());
        }
        setTransformationMethod((TransformationMethod) null);
        if (DeviceProperties.d(getContext())) {
            setGravity(19);
        }
    }

    public SignInButtonImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }
}
