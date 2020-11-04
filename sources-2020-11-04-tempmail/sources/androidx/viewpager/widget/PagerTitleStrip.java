package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.widget.i;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.e
public class PagerTitleStrip extends ViewGroup {
    private static final int[] p = {16842804, 16842901, 16842904, 16842927};
    private static final int[] q = {16843660};

    /* renamed from: b  reason: collision with root package name */
    ViewPager f2020b;

    /* renamed from: c  reason: collision with root package name */
    TextView f2021c;

    /* renamed from: d  reason: collision with root package name */
    TextView f2022d;

    /* renamed from: e  reason: collision with root package name */
    TextView f2023e;

    /* renamed from: f  reason: collision with root package name */
    private int f2024f;
    float g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private final a l;
    private WeakReference<a> m;
    private int n;
    int o;

    private class a extends DataSetObserver implements ViewPager.j, ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        private int f2025a;

        a() {
        }

        public void a(int i, float f2, int i2) {
            if (f2 > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.c(i, f2, false);
        }

        public void b(ViewPager viewPager, a aVar, a aVar2) {
            PagerTitleStrip.this.a(aVar, aVar2);
        }

        public void c(int i) {
            this.f2025a = i;
        }

        public void d(int i) {
            if (this.f2025a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.b(pagerTitleStrip.f2020b.getCurrentItem(), PagerTitleStrip.this.f2020b.getAdapter());
                float f2 = PagerTitleStrip.this.g;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                pagerTitleStrip2.c(pagerTitleStrip2.f2020b.getCurrentItem(), f2, true);
            }
        }

        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.b(pagerTitleStrip.f2020b.getCurrentItem(), PagerTitleStrip.this.f2020b.getAdapter());
            float f2 = PagerTitleStrip.this.g;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            pagerTitleStrip2.c(pagerTitleStrip2.f2020b.getCurrentItem(), f2, true);
        }
    }

    private static class b extends SingleLineTransformationMethod {

        /* renamed from: b  reason: collision with root package name */
        private Locale f2027b;

        b(Context context) {
            this.f2027b = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f2027b);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context) {
        this(context, (AttributeSet) null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar, a aVar2) {
        if (aVar != null) {
            aVar.t(this.l);
            this.m = null;
        }
        if (aVar2 != null) {
            aVar2.l(this.l);
            this.m = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f2020b;
        if (viewPager != null) {
            this.f2024f = -1;
            this.g = -1.0f;
            b(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i2, a aVar) {
        int e2 = aVar != null ? aVar.e() : 0;
        this.j = true;
        CharSequence charSequence = null;
        this.f2021c.setText((i2 < 1 || aVar == null) ? null : aVar.g(i2 - 1));
        this.f2022d.setText((aVar == null || i2 >= e2) ? null : aVar.g(i2));
        int i3 = i2 + 1;
        if (i3 < e2 && aVar != null) {
            charSequence = aVar.g(i3);
        }
        this.f2023e.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f2021c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f2022d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f2023e.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f2024f = i2;
        if (!this.k) {
            c(i2, this.g, false);
        }
        this.j = false;
    }

    /* access modifiers changed from: package-private */
    public void c(int i2, float f2, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i2;
        float f3 = f2;
        if (i7 != this.f2024f) {
            b(i7, this.f2020b.getAdapter());
        } else if (!z && f3 == this.g) {
            return;
        }
        this.k = true;
        int measuredWidth = this.f2021c.getMeasuredWidth();
        int measuredWidth2 = this.f2022d.getMeasuredWidth();
        int measuredWidth3 = this.f2023e.getMeasuredWidth();
        int i8 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i9 = paddingRight + i8;
        int i10 = (width - (paddingLeft + i8)) - i9;
        float f4 = 0.5f + f3;
        if (f4 > 1.0f) {
            f4 -= 1.0f;
        }
        int i11 = ((width - i9) - ((int) (((float) i10) * f4))) - i8;
        int i12 = measuredWidth2 + i11;
        int baseline = this.f2021c.getBaseline();
        int baseline2 = this.f2022d.getBaseline();
        int baseline3 = this.f2023e.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i13 = max - baseline;
        int i14 = max - baseline2;
        int i15 = max - baseline3;
        int i16 = measuredWidth3;
        int max2 = Math.max(Math.max(this.f2021c.getMeasuredHeight() + i13, this.f2022d.getMeasuredHeight() + i14), this.f2023e.getMeasuredHeight() + i15);
        int i17 = this.i & 112;
        if (i17 == 16) {
            i6 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i17 != 80) {
            i5 = i13 + paddingTop;
            i3 = i14 + paddingTop;
            i4 = paddingTop + i15;
            TextView textView = this.f2022d;
            textView.layout(i11, i3, i12, textView.getMeasuredHeight() + i3);
            int min = Math.min(paddingLeft, (i11 - this.h) - measuredWidth);
            TextView textView2 = this.f2021c;
            textView2.layout(min, i5, measuredWidth + min, textView2.getMeasuredHeight() + i5);
            int max3 = Math.max((width - paddingRight) - i16, i12 + this.h);
            TextView textView3 = this.f2023e;
            textView3.layout(max3, i4, max3 + i16, textView3.getMeasuredHeight() + i4);
            this.g = f2;
            this.k = false;
        } else {
            i6 = (height - paddingBottom) - max2;
        }
        i5 = i13 + i6;
        i3 = i14 + i6;
        i4 = i6 + i15;
        TextView textView4 = this.f2022d;
        textView4.layout(i11, i3, i12, textView4.getMeasuredHeight() + i3);
        int min2 = Math.min(paddingLeft, (i11 - this.h) - measuredWidth);
        TextView textView22 = this.f2021c;
        textView22.layout(min2, i5, measuredWidth + min2, textView22.getMeasuredHeight() + i5);
        int max32 = Math.max((width - paddingRight) - i16, i12 + this.h);
        TextView textView32 = this.f2023e;
        textView32.layout(max32, i4, max32 + i16, textView32.getMeasuredHeight() + i4);
        this.g = f2;
        this.k = false;
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            a adapter = viewPager.getAdapter();
            viewPager.P(this.l);
            viewPager.b(this.l);
            this.f2020b = viewPager;
            WeakReference<a> weakReference = this.m;
            a(weakReference != null ? (a) weakReference.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f2020b;
        if (viewPager != null) {
            a(viewPager.getAdapter(), (a) null);
            this.f2020b.P((ViewPager.j) null);
            this.f2020b.I(this.l);
            this.f2020b = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.f2020b != null) {
            float f2 = this.g;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            c(this.f2024f, f2, true);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i2);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, (int) (((float) size) * 0.2f), -2);
            this.f2021c.measure(childMeasureSpec2, childMeasureSpec);
            this.f2022d.measure(childMeasureSpec2, childMeasureSpec);
            this.f2023e.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i3) == 1073741824) {
                i4 = View.MeasureSpec.getSize(i3);
            } else {
                i4 = Math.max(getMinHeight(), this.f2022d.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i4, i3, this.f2022d.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    public void requestLayout() {
        if (!this.j) {
            super.requestLayout();
        }
    }

    public void setGravity(int i2) {
        this.i = i2;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f2) {
        int i2 = ((int) (f2 * 255.0f)) & 255;
        this.n = i2;
        int i3 = (i2 << 24) | (this.o & 16777215);
        this.f2021c.setTextColor(i3);
        this.f2023e.setTextColor(i3);
    }

    public void setTextColor(int i2) {
        this.o = i2;
        this.f2022d.setTextColor(i2);
        int i3 = (this.n << 24) | (this.o & 16777215);
        this.f2021c.setTextColor(i3);
        this.f2023e.setTextColor(i3);
    }

    public void setTextSize(int i2, float f2) {
        this.f2021c.setTextSize(i2, f2);
        this.f2022d.setTextSize(i2, f2);
        this.f2023e.setTextSize(i2, f2);
    }

    public void setTextSpacing(int i2) {
        this.h = i2;
        requestLayout();
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2024f = -1;
        this.g = -1.0f;
        this.l = new a();
        TextView textView = new TextView(context);
        this.f2021c = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f2022d = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f2023e = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            i.o(this.f2021c, resourceId);
            i.o(this.f2022d, resourceId);
            i.o(this.f2023e, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f2021c.setTextColor(color);
            this.f2022d.setTextColor(color);
            this.f2023e.setTextColor(color);
        }
        this.i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.o = this.f2022d.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f2021c.setEllipsize(TextUtils.TruncateAt.END);
        this.f2022d.setEllipsize(TextUtils.TruncateAt.END);
        this.f2023e.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, q);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f2021c);
            setSingleLineAllCaps(this.f2022d);
            setSingleLineAllCaps(this.f2023e);
        } else {
            this.f2021c.setSingleLine();
            this.f2022d.setSingleLine();
            this.f2023e.setSingleLine();
        }
        this.h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
