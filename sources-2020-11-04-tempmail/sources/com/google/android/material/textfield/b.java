package com.google.android.material.textfield;

import a.h.k.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.i;
import androidx.legacy.widget.Space;
import b.c.a.d.d;
import b.c.a.d.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: IndicatorViewController */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11152a;

    /* renamed from: b  reason: collision with root package name */
    private final TextInputLayout f11153b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f11154c;

    /* renamed from: d  reason: collision with root package name */
    private int f11155d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f11156e;

    /* renamed from: f  reason: collision with root package name */
    private int f11157f;
    /* access modifiers changed from: private */
    public Animator g;
    private final float h;
    /* access modifiers changed from: private */
    public int i;
    private int j;
    private CharSequence k;
    private boolean l;
    /* access modifiers changed from: private */
    public TextView m;
    private int n;
    private CharSequence o;
    private boolean p;
    private TextView q;
    private int r;
    private Typeface s;

    /* compiled from: IndicatorViewController */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11158a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f11159b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11160c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f11161d;

        a(int i, TextView textView, int i2, TextView textView2) {
            this.f11158a = i;
            this.f11159b = textView;
            this.f11160c = i2;
            this.f11161d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = b.this.i = this.f11158a;
            Animator unused2 = b.this.g = null;
            TextView textView = this.f11159b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f11160c == 1 && b.this.m != null) {
                    b.this.m.setText((CharSequence) null);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f11161d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public b(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f11152a = context;
        this.f11153b = textInputLayout;
        this.h = (float) context.getResources().getDimensionPixelSize(d.design_textinput_caption_translate_y);
    }

    private void F(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void H(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean I(TextView textView, CharSequence charSequence) {
        return u.I(this.f11153b) && this.f11153b.isEnabled() && (this.j != this.i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private void L(int i2, int i3, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.g = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i4 = i2;
            int i5 = i3;
            h(arrayList2, this.p, this.q, 2, i4, i5);
            h(arrayList2, this.l, this.m, 1, i4, i5);
            b.c.a.d.l.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i3, l(i2), i2, l(i3)));
            animatorSet.start();
        } else {
            y(i2, i3);
        }
        this.f11153b.z();
        this.f11153b.C(z);
        this.f11153b.G();
    }

    private boolean f() {
        return (this.f11154c == null || this.f11153b.getEditText() == null) ? false : true;
    }

    private void h(List<Animator> list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView != null && z) {
            if (i2 == i4 || i2 == i3) {
                list.add(i(textView, i4 == i2));
                if (i4 == i2) {
                    list.add(j(textView));
                }
            }
        }
    }

    private ObjectAnimator i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(b.c.a.d.l.a.f2363a);
        return ofFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.h, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(b.c.a.d.l.a.f2366d);
        return ofFloat;
    }

    private TextView l(int i2) {
        if (i2 == 1) {
            return this.m;
        }
        if (i2 != 2) {
            return null;
        }
        return this.q;
    }

    private boolean t(int i2) {
        if (i2 != 1 || this.m == null || TextUtils.isEmpty(this.k)) {
            return false;
        }
        return true;
    }

    private void y(int i2, int i3) {
        TextView l2;
        TextView l3;
        if (i2 != i3) {
            if (!(i3 == 0 || (l3 = l(i3)) == null)) {
                l3.setVisibility(0);
                l3.setAlpha(1.0f);
            }
            if (!(i2 == 0 || (l2 = l(i2)) == null)) {
                l2.setVisibility(4);
                if (i2 == 1) {
                    l2.setText((CharSequence) null);
                }
            }
            this.i = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public void A(int i2) {
        this.n = i2;
        TextView textView = this.m;
        if (textView != null) {
            this.f11153b.w(textView, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void B(ColorStateList colorStateList) {
        TextView textView = this.m;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void C(int i2) {
        this.r = i2;
        TextView textView = this.q;
        if (textView != null) {
            i.o(textView, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void D(boolean z) {
        if (this.p != z) {
            g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f11152a);
                this.q = appCompatTextView;
                appCompatTextView.setId(f.textinput_helper_text);
                Typeface typeface = this.s;
                if (typeface != null) {
                    this.q.setTypeface(typeface);
                }
                this.q.setVisibility(4);
                u.a0(this.q, 1);
                C(this.r);
                d(this.q, 1);
            } else {
                s();
                x(this.q, 1);
                this.q = null;
                this.f11153b.z();
                this.f11153b.G();
            }
            this.p = z;
        }
    }

    /* access modifiers changed from: package-private */
    public void E(ColorStateList colorStateList) {
        TextView textView = this.q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void G(Typeface typeface) {
        if (typeface != this.s) {
            this.s = typeface;
            F(this.m, typeface);
            F(this.q, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public void J(CharSequence charSequence) {
        g();
        this.k = charSequence;
        this.m.setText(charSequence);
        if (this.i != 1) {
            this.j = 1;
        }
        L(this.i, this.j, I(this.m, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void K(CharSequence charSequence) {
        g();
        this.o = charSequence;
        this.q.setText(charSequence);
        if (this.i != 2) {
            this.j = 2;
        }
        L(this.i, this.j, I(this.q, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void d(TextView textView, int i2) {
        if (this.f11154c == null && this.f11156e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f11152a);
            this.f11154c = linearLayout;
            linearLayout.setOrientation(0);
            this.f11153b.addView(this.f11154c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.f11152a);
            this.f11156e = frameLayout;
            this.f11154c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f11154c.addView(new Space(this.f11152a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f11153b.getEditText() != null) {
                e();
            }
        }
        if (u(i2)) {
            this.f11156e.setVisibility(0);
            this.f11156e.addView(textView);
            this.f11157f++;
        } else {
            this.f11154c.addView(textView, i2);
        }
        this.f11154c.setVisibility(0);
        this.f11155d++;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (f()) {
            u.m0(this.f11154c, u.x(this.f11153b.getEditText()), 0, u.w(this.f11153b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        Animator animator = this.g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return t(this.j);
    }

    /* access modifiers changed from: package-private */
    public CharSequence m() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public int n() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList o() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence p() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        TextView textView = this.q;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.k = null;
        g();
        if (this.i == 1) {
            if (!this.p || TextUtils.isEmpty(this.o)) {
                this.j = 0;
            } else {
                this.j = 2;
            }
        }
        L(this.i, this.j, I(this.m, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    public void s() {
        g();
        if (this.i == 2) {
            this.j = 0;
        }
        L(this.i, this.j, I(this.q, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    public boolean u(int i2) {
        return i2 == 0 || i2 == 1;
    }

    /* access modifiers changed from: package-private */
    public boolean v() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public boolean w() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public void x(TextView textView, int i2) {
        FrameLayout frameLayout;
        if (this.f11154c != null) {
            if (!u(i2) || (frameLayout = this.f11156e) == null) {
                this.f11154c.removeView(textView);
            } else {
                int i3 = this.f11157f - 1;
                this.f11157f = i3;
                H(frameLayout, i3);
                this.f11156e.removeView(textView);
            }
            int i4 = this.f11155d - 1;
            this.f11155d = i4;
            H(this.f11154c, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void z(boolean z) {
        if (this.l != z) {
            g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f11152a);
                this.m = appCompatTextView;
                appCompatTextView.setId(f.textinput_error);
                Typeface typeface = this.s;
                if (typeface != null) {
                    this.m.setTypeface(typeface);
                }
                A(this.n);
                this.m.setVisibility(4);
                u.a0(this.m, 1);
                d(this.m, 0);
            } else {
                r();
                x(this.m, 0);
                this.m = null;
                this.f11153b.z();
                this.f11153b.G();
            }
            this.l = z;
        }
    }
}
