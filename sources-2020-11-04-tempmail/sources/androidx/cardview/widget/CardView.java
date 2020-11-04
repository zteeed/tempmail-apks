package androidx.cardview.widget;

import a.d.b;
import a.d.d;
import a.d.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class CardView extends FrameLayout {
    private static final int[] i = {16842801};
    private static final e j;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1211b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1212c;

    /* renamed from: d  reason: collision with root package name */
    int f1213d;

    /* renamed from: e  reason: collision with root package name */
    int f1214e;

    /* renamed from: f  reason: collision with root package name */
    final Rect f1215f;
    final Rect g;
    private final d h;

    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f1216a;

        a() {
        }

        public void a(int i, int i2, int i3, int i4) {
            CardView.this.g.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1215f;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        public void b(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.f1213d) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.f1214e) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        public void c(Drawable drawable) {
            this.f1216a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        public boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        public boolean e() {
            return CardView.this.getUseCompatPadding();
        }

        public Drawable f() {
            return this.f1216a;
        }

        public View g() {
            return CardView.this;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            j = new b();
        } else if (i2 >= 17) {
            j = new a();
        } else {
            j = new c();
        }
        j.j();
    }

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ColorStateList getCardBackgroundColor() {
        return j.h(this.h);
    }

    public float getCardElevation() {
        return j.c(this.h);
    }

    public int getContentPaddingBottom() {
        return this.f1215f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1215f.left;
    }

    public int getContentPaddingRight() {
        return this.f1215f.right;
    }

    public int getContentPaddingTop() {
        return this.f1215f.top;
    }

    public float getMaxCardElevation() {
        return j.g(this.h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1212c;
    }

    public float getRadius() {
        return j.d(this.h);
    }

    public boolean getUseCompatPadding() {
        return this.f1211b;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (!(j instanceof b)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) j.l(this.h)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) j.k(this.h)), View.MeasureSpec.getSize(i3)), mode2);
            }
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        j.n(this.h, ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f2) {
        j.f(this.h, f2);
    }

    public void setContentPadding(int i2, int i3, int i4, int i5) {
        this.f1215f.set(i2, i3, i4, i5);
        j.i(this.h);
    }

    public void setMaxCardElevation(float f2) {
        j.o(this.h, f2);
    }

    public void setMinimumHeight(int i2) {
        this.f1214e = i2;
        super.setMinimumHeight(i2);
    }

    public void setMinimumWidth(int i2) {
        this.f1213d = i2;
        super.setMinimumWidth(i2);
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1212c) {
            this.f1212c = z;
            j.m(this.h);
        }
    }

    public void setRadius(float f2) {
        j.b(this.h, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1211b != z) {
            this.f1211b = z;
            j.e(this.h);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.d.a.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        j.n(this.h, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        ColorStateList valueOf;
        this.f1215f = new Rect();
        this.g = new Rect();
        this.h = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.CardView, i2, d.CardView);
        if (obtainStyledAttributes.hasValue(e.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(e.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(i);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i3 = getResources().getColor(b.cardview_light_background);
            } else {
                i3 = getResources().getColor(b.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i3);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(e.CardView_cardMaxElevation, 0.0f);
        this.f1211b = obtainStyledAttributes.getBoolean(e.CardView_cardUseCompatPadding, false);
        this.f1212c = obtainStyledAttributes.getBoolean(e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e.CardView_contentPadding, 0);
        this.f1215f.left = obtainStyledAttributes.getDimensionPixelSize(e.CardView_contentPaddingLeft, dimensionPixelSize);
        this.f1215f.top = obtainStyledAttributes.getDimensionPixelSize(e.CardView_contentPaddingTop, dimensionPixelSize);
        this.f1215f.right = obtainStyledAttributes.getDimensionPixelSize(e.CardView_contentPaddingRight, dimensionPixelSize);
        this.f1215f.bottom = obtainStyledAttributes.getDimensionPixelSize(e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1213d = obtainStyledAttributes.getDimensionPixelSize(e.CardView_android_minWidth, 0);
        this.f1214e = obtainStyledAttributes.getDimensionPixelSize(e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        j.a(this.h, context, colorStateList, dimension, dimension2, f2);
    }
}
