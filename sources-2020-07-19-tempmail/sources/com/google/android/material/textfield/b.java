package com.google.android.material.textfield;

import a.h.k.t;
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
    private final Context f10944a;

    /* renamed from: b  reason: collision with root package name */
    private final TextInputLayout f10945b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f10946c;

    /* renamed from: d  reason: collision with root package name */
    private int f10947d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f10948e;

    /* renamed from: f  reason: collision with root package name */
    private int f10949f;
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
        final /* synthetic */ int f10950a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f10951b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10952c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f10953d;

        a(int i, TextView textView, int i2, TextView textView2) {
            this.f10950a = i;
            this.f10951b = textView;
            this.f10952c = i2;
            this.f10953d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = b.this.i = this.f10950a;
            Animator unused2 = b.this.g = null;
            TextView textView = this.f10951b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f10952c == 1 && b.this.m != null) {
                    b.this.m.setText((CharSequence) null);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f10953d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public b(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f10944a = context;
        this.f10945b = textInputLayout;
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
        return t.I(this.f10945b) && this.f10945b.isEnabled() && (this.j != this.i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
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
        this.f10945b.z();
        this.f10945b.C(z);
        this.f10945b.G();
    }

    private boolean f() {
        return (this.f10946c == null || this.f10945b.getEditText() == null) ? false : true;
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
        ofFloat.setInterpolator(b.c.a.d.l.a.f2265a);
        return ofFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.h, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(b.c.a.d.l.a.f2268d);
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
            this.f10945b.w(textView, i2);
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
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f10944a);
                this.q = appCompatTextView;
                appCompatTextView.setId(f.textinput_helper_text);
                Typeface typeface = this.s;
                if (typeface != null) {
                    this.q.setTypeface(typeface);
                }
                this.q.setVisibility(4);
                t.a0(this.q, 1);
                C(this.r);
                d(this.q, 1);
            } else {
                s();
                x(this.q, 1);
                this.q = null;
                this.f10945b.z();
                this.f10945b.G();
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
        if (this.f10946c == null && this.f10948e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f10944a);
            this.f10946c = linearLayout;
            linearLayout.setOrientation(0);
            this.f10945b.addView(this.f10946c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.f10944a);
            this.f10948e = frameLayout;
            this.f10946c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f10946c.addView(new Space(this.f10944a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f10945b.getEditText() != null) {
                e();
            }
        }
        if (u(i2)) {
            this.f10948e.setVisibility(0);
            this.f10948e.addView(textView);
            this.f10949f++;
        } else {
            this.f10946c.addView(textView, i2);
        }
        this.f10946c.setVisibility(0);
        this.f10947d++;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (f()) {
            t.m0(this.f10946c, t.x(this.f10945b.getEditText()), 0, t.w(this.f10945b.getEditText()), 0);
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
        if (this.f10946c != null) {
            if (!u(i2) || (frameLayout = this.f10948e) == null) {
                this.f10946c.removeView(textView);
            } else {
                int i3 = this.f10949f - 1;
                this.f10949f = i3;
                H(frameLayout, i3);
                this.f10948e.removeView(textView);
            }
            int i4 = this.f10947d - 1;
            this.f10947d = i4;
            H(this.f10946c, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void z(boolean z) {
        if (this.l != z) {
            g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f10944a);
                this.m = appCompatTextView;
                appCompatTextView.setId(f.textinput_error);
                Typeface typeface = this.s;
                if (typeface != null) {
                    this.m.setTypeface(typeface);
                }
                A(this.n);
                this.m.setVisibility(4);
                t.a0(this.m, 1);
                d(this.m, 0);
            } else {
                r();
                x(this.m, 0);
                this.m = null;
                this.f10945b.z();
                this.f10945b.G();
            }
            this.l = z;
        }
    }
}
