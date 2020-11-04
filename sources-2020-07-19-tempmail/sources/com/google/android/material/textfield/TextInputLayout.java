package com.google.android.material.textfield;

import a.h.k.t;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.o;
import androidx.core.widget.i;
import androidx.customview.view.AbsSavedState;
import b.c.a.d.f;
import b.c.a.d.h;
import b.c.a.d.j;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.e;
import com.google.android.material.internal.k;
import com.google.android.material.internal.l;

public class TextInputLayout extends LinearLayout {
    private int A;
    private int B;
    private Drawable C;
    private final Rect D;
    private final RectF E;
    private Typeface F;
    private boolean G;
    private Drawable H;
    private CharSequence I;
    private CheckableImageButton J;
    private boolean K;
    private Drawable L;
    private Drawable M;
    private ColorStateList N;
    private boolean O;
    private PorterDuff.Mode P;
    private boolean Q;
    private ColorStateList R;
    private ColorStateList S;
    private final int T;
    private final int U;
    private int V;
    private final int W;
    private boolean a0;

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f10930b;
    final com.google.android.material.internal.c b0;

    /* renamed from: c  reason: collision with root package name */
    EditText f10931c;
    private boolean c0;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f10932d;
    private ValueAnimator d0;

    /* renamed from: e  reason: collision with root package name */
    private final b f10933e;
    private boolean e0;

    /* renamed from: f  reason: collision with root package name */
    boolean f10934f;
    private boolean f0;
    private int g;
    /* access modifiers changed from: private */
    public boolean g0;
    private boolean h;
    private TextView i;
    private final int j;
    private final int k;
    private boolean l;
    private CharSequence m;
    private boolean n;
    private GradientDrawable o;
    private final int p;
    private final int q;
    private int r;
    private final int s;
    private float t;
    private float u;
    private float v;
    private float w;
    private int x;
    private final int y;
    private final int z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        CharSequence f10935d;

        /* renamed from: e  reason: collision with root package name */
        boolean f10936e;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f10935d + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f10935d, parcel, i);
            parcel.writeInt(this.f10936e ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10935d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f10936e = parcel.readInt() != 1 ? false : true;
        }
    }

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.C(!textInputLayout.g0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f10934f) {
                textInputLayout2.y(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            TextInputLayout.this.t(false);
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.b0.P(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends a.h.k.a {

        /* renamed from: d  reason: collision with root package name */
        private final TextInputLayout f10940d;

        public d(TextInputLayout textInputLayout) {
            this.f10940d = textInputLayout;
        }

        public void g(View view, a.h.k.c0.d dVar) {
            super.g(view, dVar);
            EditText editText = this.f10940d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f10940d.getHint();
            CharSequence error = this.f10940d.getError();
            CharSequence counterOverflowDescription = this.f10940d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                dVar.x0(text);
            } else if (z2) {
                dVar.x0(hint);
            }
            if (z2) {
                dVar.k0(hint);
                if (!z && z2) {
                    z4 = true;
                }
                dVar.u0(z4);
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                dVar.g0(error);
                dVar.e0(true);
            }
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            EditText editText = this.f10940d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            if (TextUtils.isEmpty(text)) {
                text = this.f10940d.getHint();
            }
            if (!TextUtils.isEmpty(text)) {
                accessibilityEvent.getText().add(text);
            }
        }
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A() {
        Drawable background;
        EditText editText = this.f10931c;
        if (editText != null && (background = editText.getBackground()) != null) {
            if (o.a(background)) {
                background = background.mutate();
            }
            com.google.android.material.internal.d.a(this, this.f10931c, new Rect());
            Rect bounds = background.getBounds();
            if (bounds.left != bounds.right) {
                Rect rect = new Rect();
                background.getPadding(rect);
                background.setBounds(bounds.left - rect.left, bounds.top, bounds.right + (rect.right * 2), this.f10931c.getBottom());
            }
        }
    }

    private void B() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10930b.getLayoutParams();
        int i2 = i();
        if (i2 != layoutParams.topMargin) {
            layoutParams.topMargin = i2;
            this.f10930b.requestLayout();
        }
    }

    private void D(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f10931c;
        boolean z4 = true;
        boolean z5 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f10931c;
        if (editText2 == null || !editText2.hasFocus()) {
            z4 = false;
        }
        boolean k2 = this.f10933e.k();
        ColorStateList colorStateList2 = this.R;
        if (colorStateList2 != null) {
            this.b0.G(colorStateList2);
            this.b0.L(this.R);
        }
        if (!isEnabled) {
            this.b0.G(ColorStateList.valueOf(this.W));
            this.b0.L(ColorStateList.valueOf(this.W));
        } else if (k2) {
            this.b0.G(this.f10933e.o());
        } else if (this.h && (textView = this.i) != null) {
            this.b0.G(textView.getTextColors());
        } else if (z4 && (colorStateList = this.S) != null) {
            this.b0.G(colorStateList);
        }
        if (z5 || (isEnabled() && (z4 || k2))) {
            if (z3 || this.a0) {
                k(z2);
            }
        } else if (z3 || !this.a0) {
            n(z2);
        }
    }

    private void E() {
        if (this.f10931c != null) {
            if (x()) {
                if (this.J == null) {
                    CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(h.design_text_input_password_icon, this.f10930b, false);
                    this.J = checkableImageButton;
                    checkableImageButton.setImageDrawable(this.H);
                    this.J.setContentDescription(this.I);
                    this.f10930b.addView(this.J);
                    this.J.setOnClickListener(new b());
                }
                EditText editText = this.f10931c;
                if (editText != null && t.u(editText) <= 0) {
                    this.f10931c.setMinimumHeight(t.u(this.J));
                }
                this.J.setVisibility(0);
                this.J.setChecked(this.K);
                if (this.L == null) {
                    this.L = new ColorDrawable();
                }
                this.L.setBounds(0, 0, this.J.getMeasuredWidth(), 1);
                Drawable[] a2 = i.a(this.f10931c);
                if (a2[2] != this.L) {
                    this.M = a2[2];
                }
                i.j(this.f10931c, a2[0], a2[1], this.L, a2[3]);
                this.J.setPadding(this.f10931c.getPaddingLeft(), this.f10931c.getPaddingTop(), this.f10931c.getPaddingRight(), this.f10931c.getPaddingBottom());
                return;
            }
            CheckableImageButton checkableImageButton2 = this.J;
            if (checkableImageButton2 != null && checkableImageButton2.getVisibility() == 0) {
                this.J.setVisibility(8);
            }
            if (this.L != null) {
                Drawable[] a3 = i.a(this.f10931c);
                if (a3[2] == this.L) {
                    i.j(this.f10931c, a3[0], a3[1], this.M, a3[3]);
                    this.L = null;
                }
            }
        }
    }

    private void F() {
        if (this.r != 0 && this.o != null && this.f10931c != null && getRight() != 0) {
            int left = this.f10931c.getLeft();
            int g2 = g();
            int right = this.f10931c.getRight();
            int bottom = this.f10931c.getBottom() + this.p;
            if (this.r == 2) {
                int i2 = this.z;
                left += i2 / 2;
                g2 -= i2 / 2;
                right -= i2 / 2;
                bottom += i2 / 2;
            }
            this.o.setBounds(left, g2, right, bottom);
            c();
            A();
        }
    }

    private void c() {
        int i2;
        Drawable drawable;
        if (this.o != null) {
            v();
            EditText editText = this.f10931c;
            if (editText != null && this.r == 2) {
                if (editText.getBackground() != null) {
                    this.C = this.f10931c.getBackground();
                }
                t.b0(this.f10931c, (Drawable) null);
            }
            EditText editText2 = this.f10931c;
            if (!(editText2 == null || this.r != 1 || (drawable = this.C) == null)) {
                t.b0(editText2, drawable);
            }
            int i3 = this.x;
            if (i3 > -1 && (i2 = this.A) != 0) {
                this.o.setStroke(i3, i2);
            }
            this.o.setCornerRadii(getCornerRadiiAsArray());
            this.o.setColor(this.B);
            invalidate();
        }
    }

    private void d(RectF rectF) {
        float f2 = rectF.left;
        int i2 = this.q;
        rectF.left = f2 - ((float) i2);
        rectF.top -= (float) i2;
        rectF.right += (float) i2;
        rectF.bottom += (float) i2;
    }

    private void e() {
        Drawable drawable;
        if (this.H == null) {
            return;
        }
        if (this.O || this.Q) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(this.H).mutate();
            this.H = mutate;
            if (this.O) {
                androidx.core.graphics.drawable.a.o(mutate, this.N);
            }
            if (this.Q) {
                androidx.core.graphics.drawable.a.p(this.H, this.P);
            }
            CheckableImageButton checkableImageButton = this.J;
            if (checkableImageButton != null && checkableImageButton.getDrawable() != (drawable = this.H)) {
                this.J.setImageDrawable(drawable);
            }
        }
    }

    private void f() {
        int i2 = this.r;
        if (i2 == 0) {
            this.o = null;
        } else if (i2 == 2 && this.l && !(this.o instanceof a)) {
            this.o = new a();
        } else if (!(this.o instanceof GradientDrawable)) {
            this.o = new GradientDrawable();
        }
    }

    private int g() {
        EditText editText = this.f10931c;
        if (editText == null) {
            return 0;
        }
        int i2 = this.r;
        if (i2 == 1) {
            return editText.getTop();
        }
        if (i2 != 2) {
            return 0;
        }
        return editText.getTop() + i();
    }

    private Drawable getBoxBackground() {
        int i2 = this.r;
        if (i2 == 1 || i2 == 2) {
            return this.o;
        }
        throw new IllegalStateException();
    }

    private float[] getCornerRadiiAsArray() {
        if (!l.a(this)) {
            float f2 = this.t;
            float f3 = this.u;
            float f4 = this.v;
            float f5 = this.w;
            return new float[]{f2, f2, f3, f3, f4, f4, f5, f5};
        }
        float f6 = this.u;
        float f7 = this.t;
        float f8 = this.w;
        float f9 = this.v;
        return new float[]{f6, f6, f7, f7, f8, f8, f9, f9};
    }

    private int h() {
        int i2 = this.r;
        if (i2 == 1) {
            return getBoxBackground().getBounds().top + this.s;
        }
        if (i2 != 2) {
            return getPaddingTop();
        }
        return getBoxBackground().getBounds().top - i();
    }

    private int i() {
        float n2;
        if (!this.l) {
            return 0;
        }
        int i2 = this.r;
        if (i2 == 0 || i2 == 1) {
            n2 = this.b0.n();
        } else if (i2 != 2) {
            return 0;
        } else {
            n2 = this.b0.n() / 2.0f;
        }
        return (int) n2;
    }

    private void j() {
        if (l()) {
            ((a) this.o).d();
        }
    }

    private void k(boolean z2) {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.d0.cancel();
        }
        if (!z2 || !this.c0) {
            this.b0.P(1.0f);
        } else {
            b(1.0f);
        }
        this.a0 = false;
        if (l()) {
            s();
        }
    }

    private boolean l() {
        return this.l && !TextUtils.isEmpty(this.m) && (this.o instanceof a);
    }

    private void m() {
        Drawable background;
        int i2 = Build.VERSION.SDK_INT;
        if ((i2 == 21 || i2 == 22) && (background = this.f10931c.getBackground()) != null && !this.e0) {
            Drawable newDrawable = background.getConstantState().newDrawable();
            if (background instanceof DrawableContainer) {
                this.e0 = e.a((DrawableContainer) background, newDrawable.getConstantState());
            }
            if (!this.e0) {
                t.b0(this.f10931c, newDrawable);
                this.e0 = true;
                r();
            }
        }
    }

    private void n(boolean z2) {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.d0.cancel();
        }
        if (!z2 || !this.c0) {
            this.b0.P(0.0f);
        } else {
            b(0.0f);
        }
        if (l() && ((a) this.o).a()) {
            j();
        }
        this.a0 = true;
    }

    private boolean o() {
        EditText editText = this.f10931c;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private void r() {
        f();
        if (this.r != 0) {
            B();
        }
        F();
    }

    private void s() {
        if (l()) {
            RectF rectF = this.E;
            this.b0.k(rectF);
            d(rectF);
            ((a) this.o).g(rectF);
        }
    }

    private void setEditText(EditText editText) {
        if (this.f10931c == null) {
            if (!(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f10931c = editText;
            r();
            setTextInputAccessibilityDelegate(new d(this));
            if (!o()) {
                this.b0.V(this.f10931c.getTypeface());
            }
            this.b0.N(this.f10931c.getTextSize());
            int gravity = this.f10931c.getGravity();
            this.b0.H((gravity & -113) | 48);
            this.b0.M(gravity);
            this.f10931c.addTextChangedListener(new a());
            if (this.R == null) {
                this.R = this.f10931c.getHintTextColors();
            }
            if (this.l) {
                if (TextUtils.isEmpty(this.m)) {
                    CharSequence hint = this.f10931c.getHint();
                    this.f10932d = hint;
                    setHint(hint);
                    this.f10931c.setHint((CharSequence) null);
                }
                this.n = true;
            }
            if (this.i != null) {
                y(this.f10931c.getText().length());
            }
            this.f10933e.e();
            E();
            D(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.m)) {
            this.m = charSequence;
            this.b0.T(charSequence);
            if (!this.a0) {
                s();
            }
        }
    }

    private static void u(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                u((ViewGroup) childAt, z2);
            }
        }
    }

    private void v() {
        int i2 = this.r;
        if (i2 == 1) {
            this.x = 0;
        } else if (i2 == 2 && this.V == 0) {
            this.V = this.S.getColorForState(getDrawableState(), this.S.getDefaultColor());
        }
    }

    private boolean x() {
        return this.G && (o() || this.K);
    }

    /* access modifiers changed from: package-private */
    public void C(boolean z2) {
        D(z2, false);
    }

    /* access modifiers changed from: package-private */
    public void G() {
        TextView textView;
        if (this.o != null && this.r != 0) {
            EditText editText = this.f10931c;
            boolean z2 = true;
            boolean z3 = editText != null && editText.hasFocus();
            EditText editText2 = this.f10931c;
            if (editText2 == null || !editText2.isHovered()) {
                z2 = false;
            }
            if (this.r == 2) {
                if (!isEnabled()) {
                    this.A = this.W;
                } else if (this.f10933e.k()) {
                    this.A = this.f10933e.n();
                } else if (this.h && (textView = this.i) != null) {
                    this.A = textView.getCurrentTextColor();
                } else if (z3) {
                    this.A = this.V;
                } else if (z2) {
                    this.A = this.U;
                } else {
                    this.A = this.T;
                }
                if ((z2 || z3) && isEnabled()) {
                    this.x = this.z;
                } else {
                    this.x = this.y;
                }
                c();
            }
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f10930b.addView(view, layoutParams2);
            this.f10930b.setLayoutParams(layoutParams);
            B();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void b(float f2) {
        if (this.b0.t() != f2) {
            if (this.d0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.d0 = valueAnimator;
                valueAnimator.setInterpolator(b.c.a.d.l.a.f2266b);
                this.d0.setDuration(167);
                this.d0.addUpdateListener(new c());
            }
            this.d0.setFloatValues(new float[]{this.b0.t(), f2});
            this.d0.start();
        }
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText;
        if (this.f10932d == null || (editText = this.f10931c) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        boolean z2 = this.n;
        this.n = false;
        CharSequence hint = editText.getHint();
        this.f10931c.setHint(this.f10932d);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
        } finally {
            this.f10931c.setHint(hint);
            this.n = z2;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.g0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.g0 = false;
    }

    public void draw(Canvas canvas) {
        GradientDrawable gradientDrawable = this.o;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.l) {
            this.b0.i(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f0) {
            boolean z2 = true;
            this.f0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!t.I(this) || !isEnabled()) {
                z2 = false;
            }
            C(z2);
            z();
            F();
            G();
            com.google.android.material.internal.c cVar = this.b0;
            if (cVar != null ? cVar.S(drawableState) | false : false) {
                invalidate();
            }
            this.f0 = false;
        }
    }

    public int getBoxBackgroundColor() {
        return this.B;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.v;
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.w;
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.u;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.t;
    }

    public int getBoxStrokeColor() {
        return this.V;
    }

    public int getCounterMaxLength() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f10934f || !this.h || (textView = this.i) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.R;
    }

    public EditText getEditText() {
        return this.f10931c;
    }

    public CharSequence getError() {
        if (this.f10933e.v()) {
            return this.f10933e.m();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f10933e.n();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.f10933e.n();
    }

    public CharSequence getHelperText() {
        if (this.f10933e.w()) {
            return this.f10933e.p();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f10933e.q();
    }

    public CharSequence getHint() {
        if (this.l) {
            return this.m;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.b0.n();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.b0.p();
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.I;
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.H;
    }

    public Typeface getTypeface() {
        return this.F;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        EditText editText;
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.o != null) {
            F();
        }
        if (this.l && (editText = this.f10931c) != null) {
            Rect rect = this.D;
            com.google.android.material.internal.d.a(this, editText, rect);
            int compoundPaddingLeft = rect.left + this.f10931c.getCompoundPaddingLeft();
            int compoundPaddingRight = rect.right - this.f10931c.getCompoundPaddingRight();
            int h2 = h();
            this.b0.J(compoundPaddingLeft, rect.top + this.f10931c.getCompoundPaddingTop(), compoundPaddingRight, rect.bottom - this.f10931c.getCompoundPaddingBottom());
            this.b0.E(compoundPaddingLeft, h2, compoundPaddingRight, (i5 - i3) - getPaddingBottom());
            this.b0.C();
            if (l() && !this.a0) {
                s();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        E();
        super.onMeasure(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.f10935d);
        if (savedState.f10936e) {
            t(true);
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f10933e.k()) {
            savedState.f10935d = getError();
        }
        savedState.f10936e = this.K;
        return savedState;
    }

    public boolean p() {
        return this.f10933e.w();
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return this.n;
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.B != i2) {
            this.B = i2;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(androidx.core.content.a.d(getContext(), i2));
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.r) {
            this.r = i2;
            r();
        }
    }

    public void setBoxCornerRadii(float f2, float f3, float f4, float f5) {
        if (this.t != f2 || this.u != f3 || this.v != f5 || this.w != f4) {
            this.t = f2;
            this.u = f3;
            this.v = f5;
            this.w = f4;
            c();
        }
    }

    public void setBoxCornerRadiiResources(int i2, int i3, int i4, int i5) {
        setBoxCornerRadii(getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i3), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i5));
    }

    public void setBoxStrokeColor(int i2) {
        if (this.V != i2) {
            this.V = i2;
            G();
        }
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f10934f != z2) {
            if (z2) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.i = appCompatTextView;
                appCompatTextView.setId(f.textinput_counter);
                Typeface typeface = this.F;
                if (typeface != null) {
                    this.i.setTypeface(typeface);
                }
                this.i.setMaxLines(1);
                w(this.i, this.k);
                this.f10933e.d(this.i, 2);
                EditText editText = this.f10931c;
                if (editText == null) {
                    y(0);
                } else {
                    y(editText.getText().length());
                }
            } else {
                this.f10933e.x(this.i, 2);
                this.i = null;
            }
            this.f10934f = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.g != i2) {
            if (i2 > 0) {
                this.g = i2;
            } else {
                this.g = -1;
            }
            if (this.f10934f) {
                EditText editText = this.f10931c;
                y(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.R = colorStateList;
        this.S = colorStateList;
        if (this.f10931c != null) {
            C(false);
        }
    }

    public void setEnabled(boolean z2) {
        u(this, z2);
        super.setEnabled(z2);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f10933e.v()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f10933e.J(charSequence);
        } else {
            this.f10933e.r();
        }
    }

    public void setErrorEnabled(boolean z2) {
        this.f10933e.z(z2);
    }

    public void setErrorTextAppearance(int i2) {
        this.f10933e.A(i2);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f10933e.B(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!p()) {
                setHelperTextEnabled(true);
            }
            this.f10933e.K(charSequence);
        } else if (p()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f10933e.E(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        this.f10933e.D(z2);
    }

    public void setHelperTextTextAppearance(int i2) {
        this.f10933e.C(i2);
    }

    public void setHint(CharSequence charSequence) {
        if (this.l) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.c0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.l) {
            this.l = z2;
            if (!z2) {
                this.n = false;
                if (!TextUtils.isEmpty(this.m) && TextUtils.isEmpty(this.f10931c.getHint())) {
                    this.f10931c.setHint(this.m);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f10931c.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.m)) {
                        setHint(hint);
                    }
                    this.f10931c.setHint((CharSequence) null);
                }
                this.n = true;
            }
            if (this.f10931c != null) {
                B();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        this.b0.F(i2);
        this.S = this.b0.l();
        if (this.f10931c != null) {
            C(false);
            B();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? a.a.k.a.a.d(getContext(), i2) : null);
    }

    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        EditText editText;
        if (this.G != z2) {
            this.G = z2;
            if (!z2 && this.K && (editText = this.f10931c) != null) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.K = false;
            E();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.N = colorStateList;
        this.O = true;
        e();
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.P = mode;
        this.Q = true;
        e();
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f10931c;
        if (editText != null) {
            t.Z(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.F) {
            this.F = typeface;
            this.b0.V(typeface);
            this.f10933e.G(typeface);
            TextView textView = this.i;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public void t(boolean z2) {
        if (this.G) {
            int selectionEnd = this.f10931c.getSelectionEnd();
            if (o()) {
                this.f10931c.setTransformationMethod((TransformationMethod) null);
                this.K = true;
            } else {
                this.f10931c.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.K = false;
            }
            this.J.setChecked(this.K);
            if (z2) {
                this.J.jumpDrawablesToCurrentState();
            }
            this.f10931c.setSelection(selectionEnd);
        }
    }

    /* access modifiers changed from: package-private */
    public void w(TextView textView, int i2) {
        boolean z2 = true;
        try {
            i.o(textView, i2);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z2 = false;
            }
        } catch (Exception unused) {
        }
        if (z2) {
            i.o(textView, j.TextAppearance_AppCompat_Caption);
            textView.setTextColor(androidx.core.content.a.d(getContext(), b.c.a.d.c.design_error));
        }
    }

    /* access modifiers changed from: package-private */
    public void y(int i2) {
        boolean z2 = this.h;
        if (this.g == -1) {
            this.i.setText(String.valueOf(i2));
            this.i.setContentDescription((CharSequence) null);
            this.h = false;
        } else {
            if (t.i(this.i) == 1) {
                t.a0(this.i, 0);
            }
            boolean z3 = i2 > this.g;
            this.h = z3;
            if (z2 != z3) {
                w(this.i, z3 ? this.j : this.k);
                if (this.h) {
                    t.a0(this.i, 1);
                }
            }
            this.i.setText(getContext().getString(b.c.a.d.i.character_counter_pattern, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.g)}));
            this.i.setContentDescription(getContext().getString(b.c.a.d.i.character_counter_content_description, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.g)}));
        }
        if (this.f10931c != null && z2 != this.h) {
            C(false);
            G();
            z();
        }
    }

    /* access modifiers changed from: package-private */
    public void z() {
        Drawable background;
        TextView textView;
        EditText editText = this.f10931c;
        if (editText != null && (background = editText.getBackground()) != null) {
            m();
            if (o.a(background)) {
                background = background.mutate();
            }
            if (this.f10933e.k()) {
                background.setColorFilter(androidx.appcompat.widget.f.r(this.f10933e.n(), PorterDuff.Mode.SRC_IN));
            } else if (!this.h || (textView = this.i) == null) {
                androidx.core.graphics.drawable.a.c(background);
                this.f10931c.refreshDrawableState();
            } else {
                background.setColorFilter(androidx.appcompat.widget.f.r(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.c.a.d.b.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f10933e = new b(this);
        this.D = new Rect();
        this.E = new RectF();
        this.b0 = new com.google.android.material.internal.c(this);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10930b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.f10930b);
        this.b0.U(b.c.a.d.l.a.f2265a);
        this.b0.R(b.c.a.d.l.a.f2265a);
        this.b0.H(8388659);
        b0 i3 = k.i(context, attributeSet, b.c.a.d.k.TextInputLayout, i2, j.Widget_Design_TextInputLayout, new int[0]);
        this.l = i3.a(b.c.a.d.k.TextInputLayout_hintEnabled, true);
        setHint(i3.p(b.c.a.d.k.TextInputLayout_android_hint));
        this.c0 = i3.a(b.c.a.d.k.TextInputLayout_hintAnimationEnabled, true);
        this.p = context.getResources().getDimensionPixelOffset(b.c.a.d.d.mtrl_textinput_box_bottom_offset);
        this.q = context.getResources().getDimensionPixelOffset(b.c.a.d.d.mtrl_textinput_box_label_cutout_padding);
        this.s = i3.e(b.c.a.d.k.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.t = i3.d(b.c.a.d.k.TextInputLayout_boxCornerRadiusTopStart, 0.0f);
        this.u = i3.d(b.c.a.d.k.TextInputLayout_boxCornerRadiusTopEnd, 0.0f);
        this.v = i3.d(b.c.a.d.k.TextInputLayout_boxCornerRadiusBottomEnd, 0.0f);
        this.w = i3.d(b.c.a.d.k.TextInputLayout_boxCornerRadiusBottomStart, 0.0f);
        this.B = i3.b(b.c.a.d.k.TextInputLayout_boxBackgroundColor, 0);
        this.V = i3.b(b.c.a.d.k.TextInputLayout_boxStrokeColor, 0);
        this.y = context.getResources().getDimensionPixelSize(b.c.a.d.d.mtrl_textinput_box_stroke_width_default);
        this.z = context.getResources().getDimensionPixelSize(b.c.a.d.d.mtrl_textinput_box_stroke_width_focused);
        this.x = this.y;
        setBoxBackgroundMode(i3.k(b.c.a.d.k.TextInputLayout_boxBackgroundMode, 0));
        if (i3.r(b.c.a.d.k.TextInputLayout_android_textColorHint)) {
            ColorStateList c2 = i3.c(b.c.a.d.k.TextInputLayout_android_textColorHint);
            this.S = c2;
            this.R = c2;
        }
        this.T = androidx.core.content.a.d(context, b.c.a.d.c.mtrl_textinput_default_box_stroke_color);
        this.W = androidx.core.content.a.d(context, b.c.a.d.c.mtrl_textinput_disabled_color);
        this.U = androidx.core.content.a.d(context, b.c.a.d.c.mtrl_textinput_hovered_box_stroke_color);
        if (i3.n(b.c.a.d.k.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(i3.n(b.c.a.d.k.TextInputLayout_hintTextAppearance, 0));
        }
        int n2 = i3.n(b.c.a.d.k.TextInputLayout_errorTextAppearance, 0);
        boolean a2 = i3.a(b.c.a.d.k.TextInputLayout_errorEnabled, false);
        int n3 = i3.n(b.c.a.d.k.TextInputLayout_helperTextTextAppearance, 0);
        boolean a3 = i3.a(b.c.a.d.k.TextInputLayout_helperTextEnabled, false);
        CharSequence p2 = i3.p(b.c.a.d.k.TextInputLayout_helperText);
        boolean a4 = i3.a(b.c.a.d.k.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(i3.k(b.c.a.d.k.TextInputLayout_counterMaxLength, -1));
        this.k = i3.n(b.c.a.d.k.TextInputLayout_counterTextAppearance, 0);
        this.j = i3.n(b.c.a.d.k.TextInputLayout_counterOverflowTextAppearance, 0);
        this.G = i3.a(b.c.a.d.k.TextInputLayout_passwordToggleEnabled, false);
        this.H = i3.g(b.c.a.d.k.TextInputLayout_passwordToggleDrawable);
        this.I = i3.p(b.c.a.d.k.TextInputLayout_passwordToggleContentDescription);
        if (i3.r(b.c.a.d.k.TextInputLayout_passwordToggleTint)) {
            this.O = true;
            this.N = i3.c(b.c.a.d.k.TextInputLayout_passwordToggleTint);
        }
        if (i3.r(b.c.a.d.k.TextInputLayout_passwordToggleTintMode)) {
            this.Q = true;
            this.P = l.b(i3.k(b.c.a.d.k.TextInputLayout_passwordToggleTintMode, -1), (PorterDuff.Mode) null);
        }
        i3.v();
        setHelperTextEnabled(a3);
        setHelperText(p2);
        setHelperTextTextAppearance(n3);
        setErrorEnabled(a2);
        setErrorTextAppearance(n2);
        setCounterEnabled(a4);
        e();
        t.i0(this, 2);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.I = charSequence;
        CheckableImageButton checkableImageButton = this.J;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.H = drawable;
        CheckableImageButton checkableImageButton = this.J;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }
}
