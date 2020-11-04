package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.base.R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.SignInButtonCreator;
import com.google.android.gms.common.internal.SignInButtonImpl;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private int f2672b;

    /* renamed from: c  reason: collision with root package name */
    private int f2673c;

    /* renamed from: d  reason: collision with root package name */
    private View f2674d;

    /* renamed from: e  reason: collision with root package name */
    private View.OnClickListener f2675e;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public SignInButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f2675e;
        if (onClickListener != null && view == this.f2674d) {
            onClickListener.onClick(this);
        }
    }

    public final void setColorScheme(int i) {
        setStyle(this.f2672b, i);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f2674d.setEnabled(z);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f2675e = onClickListener;
        View view = this.f2674d;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public final void setScopes(Scope[] scopeArr) {
        setStyle(this.f2672b, this.f2673c);
    }

    public final void setSize(int i) {
        setStyle(i, this.f2673c);
    }

    public final void setStyle(int i, int i2) {
        this.f2672b = i;
        this.f2673c = i2;
        Context context = getContext();
        View view = this.f2674d;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f2674d = SignInButtonCreator.c(context, this.f2672b, this.f2673c);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i3 = this.f2672b;
            int i4 = this.f2673c;
            SignInButtonImpl signInButtonImpl = new SignInButtonImpl(context);
            signInButtonImpl.a(context.getResources(), i3, i4);
            this.f2674d = signInButtonImpl;
        }
        addView(this.f2674d);
        this.f2674d.setEnabled(isEnabled());
        this.f2674d.setOnClickListener(this);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2675e = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SignInButton, 0, 0);
        try {
            this.f2672b = obtainStyledAttributes.getInt(R.styleable.SignInButton_buttonSize, 0);
            this.f2673c = obtainStyledAttributes.getInt(R.styleable.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            setStyle(this.f2672b, this.f2673c);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Deprecated
    public final void setStyle(int i, int i2, Scope[] scopeArr) {
        setStyle(i, i2);
    }
}