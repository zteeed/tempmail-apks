package androidx.appcompat.widget;

import a.a.j;
import a.h.k.t;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.widget.i;

public class SwitchCompat extends CompoundButton {
    private static final Property<SwitchCompat, Float> N = new a(Float.class, "thumbPos");
    private static final int[] O = {16842912};
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private final TextPaint G;
    private ColorStateList H;
    private Layout I;
    private Layout J;
    private TransformationMethod K;
    ObjectAnimator L;
    private final Rect M;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f1034b;

    /* renamed from: c  reason: collision with root package name */
    private ColorStateList f1035c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuff.Mode f1036d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1037e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1038f;
    private Drawable g;
    private ColorStateList h;
    private PorterDuff.Mode i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private CharSequence p;
    private CharSequence q;
    private boolean r;
    private int s;
    private int t;
    private float u;
    private float v;
    private VelocityTracker w;
    private int x;
    float y;
    private int z;

    static class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.y);
        }

        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f2) {
            switchCompat.setThumbPosition(f2.floatValue());
        }
    }

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    private void a(boolean z2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, N, new float[]{z2 ? 1.0f : 0.0f});
        this.L = ofFloat;
        ofFloat.setDuration(250);
        if (Build.VERSION.SDK_INT >= 18) {
            this.L.setAutoCancel(true);
        }
        this.L.start();
    }

    private void b() {
        if (this.f1034b == null) {
            return;
        }
        if (this.f1037e || this.f1038f) {
            Drawable mutate = this.f1034b.mutate();
            this.f1034b = mutate;
            if (this.f1037e) {
                androidx.core.graphics.drawable.a.o(mutate, this.f1035c);
            }
            if (this.f1038f) {
                androidx.core.graphics.drawable.a.p(this.f1034b, this.f1036d);
            }
            if (this.f1034b.isStateful()) {
                this.f1034b.setState(getDrawableState());
            }
        }
    }

    private void c() {
        if (this.g == null) {
            return;
        }
        if (this.j || this.k) {
            Drawable mutate = this.g.mutate();
            this.g = mutate;
            if (this.j) {
                androidx.core.graphics.drawable.a.o(mutate, this.h);
            }
            if (this.k) {
                androidx.core.graphics.drawable.a.p(this.g, this.i);
            }
            if (this.g.isStateful()) {
                this.g.setState(getDrawableState());
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    private boolean g(float f2, float f3) {
        if (this.f1034b == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1034b.getPadding(this.M);
        int i2 = this.D;
        int i3 = this.t;
        int i4 = i2 - i3;
        int i5 = (this.C + thumbOffset) - i3;
        Rect rect = this.M;
        int i6 = this.B + i5 + rect.left + rect.right + i3;
        int i7 = this.F + i3;
        if (f2 <= ((float) i5) || f2 >= ((float) i6) || f3 <= ((float) i4) || f3 >= ((float) i7)) {
            return false;
        }
        return true;
    }

    private boolean getTargetCheckedState() {
        return this.y > 0.5f;
    }

    private int getThumbOffset() {
        float f2;
        if (h0.b(this)) {
            f2 = 1.0f - this.y;
        } else {
            f2 = this.y;
        }
        return (int) ((f2 * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.g;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.M;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f1034b;
        if (drawable2 != null) {
            rect = o.d(drawable2);
        } else {
            rect = o.f1140a;
        }
        return ((((this.z - this.B) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    private Layout h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.K;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.G;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void i(int i2, int i3) {
        Typeface typeface;
        if (i2 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i2 != 2) {
            typeface = i2 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        setSwitchTypeface(typeface, i3);
    }

    private void j(MotionEvent motionEvent) {
        this.s = 0;
        boolean z2 = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z3) {
            this.w.computeCurrentVelocity(1000);
            float xVelocity = this.w.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.x)) {
                z2 = getTargetCheckedState();
            } else if (!h0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z2 = false;
            }
        } else {
            z2 = isChecked;
        }
        if (z2 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z2);
        e(motionEvent);
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i2;
        int i3;
        Rect rect2 = this.M;
        int i4 = this.C;
        int i5 = this.D;
        int i6 = this.E;
        int i7 = this.F;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f1034b;
        if (drawable != null) {
            rect = o.d(drawable);
        } else {
            rect = o.f1140a;
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i8 = rect2.left;
            thumbOffset += i8;
            if (rect != null) {
                int i9 = rect.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = rect.top;
                int i11 = rect2.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = rect.right;
                int i13 = rect2.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = rect.bottom;
                int i15 = rect2.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                    this.g.setBounds(i4, i2, i6, i3);
                }
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.g.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f1034b;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i16 = thumbOffset - rect2.left;
            int i17 = thumbOffset + this.B + rect2.right;
            this.f1034b.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.l(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f2, f3);
        }
        Drawable drawable = this.f1034b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f2, f3);
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.k(drawable2, f2, f3);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1034b;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!h0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.n : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (h0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.n : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.r;
    }

    public boolean getSplitTrack() {
        return this.o;
    }

    public int getSwitchMinWidth() {
        return this.m;
    }

    public int getSwitchPadding() {
        return this.n;
    }

    public CharSequence getTextOff() {
        return this.q;
    }

    public CharSequence getTextOn() {
        return this.p;
    }

    public Drawable getThumbDrawable() {
        return this.f1034b;
    }

    public int getThumbTextPadding() {
        return this.l;
    }

    public ColorStateList getThumbTintList() {
        return this.f1035c;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1036d;
    }

    public Drawable getTrackDrawable() {
        return this.g;
    }

    public ColorStateList getTrackTintList() {
        return this.h;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.i;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1034b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.L.end();
            this.L = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, O);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        Rect rect = this.M;
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.D;
        int i4 = this.F;
        int i5 = i3 + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.f1034b;
        if (drawable != null) {
            if (!this.o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d2 = o.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d2.left;
                rect.right -= d2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.I : this.J;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.H;
            if (colorStateList != null) {
                this.G.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.G.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i2 = bounds.left + bounds.right;
            } else {
                i2 = getWidth();
            }
            canvas.translate((float) ((i2 / 2) - (layout.getWidth() / 2)), (float) (((i5 + i6) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.p : this.q;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        super.onLayout(z2, i2, i3, i4, i5);
        int i12 = 0;
        if (this.f1034b != null) {
            Rect rect = this.M;
            Drawable drawable = this.g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d2 = o.d(this.f1034b);
            i6 = Math.max(0, d2.left - rect.left);
            i12 = Math.max(0, d2.right - rect.right);
        } else {
            i6 = 0;
        }
        if (h0.b(this)) {
            i8 = getPaddingLeft() + i6;
            i7 = ((this.z + i8) - i6) - i12;
        } else {
            i7 = (getWidth() - getPaddingRight()) - i12;
            i8 = (i7 - this.z) + i6 + i12;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i11 = this.A;
            i10 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i11 / 2);
        } else if (gravity != 80) {
            i10 = getPaddingTop();
            i11 = this.A;
        } else {
            i9 = getHeight() - getPaddingBottom();
            i10 = i9 - this.A;
            this.C = i8;
            this.D = i10;
            this.F = i9;
            this.E = i7;
        }
        i9 = i11 + i10;
        this.C = i8;
        this.D = i10;
        this.F = i9;
        this.E = i7;
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        if (this.r) {
            if (this.I == null) {
                this.I = h(this.p);
            }
            if (this.J == null) {
                this.J = h(this.q);
            }
        }
        Rect rect = this.M;
        Drawable drawable = this.f1034b;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i5 = (this.f1034b.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f1034b.getIntrinsicHeight();
        } else {
            i5 = 0;
            i4 = 0;
        }
        this.B = Math.max(this.r ? Math.max(this.I.getWidth(), this.J.getWidth()) + (this.l * 2) : 0, i5);
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.f1034b;
        if (drawable3 != null) {
            Rect d2 = o.d(drawable3);
            i7 = Math.max(i7, d2.left);
            i8 = Math.max(i8, d2.right);
        }
        int max = Math.max(this.m, (this.B * 2) + i7 + i8);
        int max2 = Math.max(i6, i4);
        this.z = max;
        this.A = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.p : this.q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.w
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009f
            r2 = 2
            if (r0 == r1) goto L_0x008b
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008b
            goto L_0x00b9
        L_0x0016:
            int r0 = r6.s
            if (r0 == r1) goto L_0x0057
            if (r0 == r2) goto L_0x001e
            goto L_0x00b9
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.u
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003d
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003d
        L_0x0039:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003d:
            boolean r0 = androidx.appcompat.widget.h0.b(r6)
            if (r0 == 0) goto L_0x0044
            float r2 = -r2
        L_0x0044:
            float r0 = r6.y
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.y
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0056
            r6.u = r7
            r6.setThumbPosition(r0)
        L_0x0056:
            return r1
        L_0x0057:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.u
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.t
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007d
            float r4 = r6.v
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.t
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b9
        L_0x007d:
            r6.s = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.u = r0
            r6.v = r3
            return r1
        L_0x008b:
            int r0 = r6.s
            if (r0 != r2) goto L_0x0096
            r6.j(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0096:
            r0 = 0
            r6.s = r0
            android.view.VelocityTracker r0 = r6.w
            r0.clear()
            goto L_0x00b9
        L_0x009f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b9
            boolean r3 = r6.g(r0, r2)
            if (r3 == 0) goto L_0x00b9
            r6.s = r1
            r6.u = r0
            r6.v = r2
        L_0x00b9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !t.I(this)) {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.q(this, callback));
    }

    public void setShowText(boolean z2) {
        if (this.r != z2) {
            this.r = z2;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z2) {
        this.o = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.m = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.n = i2;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i2) {
        b0 s2 = b0.s(context, i2, j.TextAppearance);
        ColorStateList c2 = s2.c(j.TextAppearance_android_textColor);
        if (c2 != null) {
            this.H = c2;
        } else {
            this.H = getTextColors();
        }
        int f2 = s2.f(j.TextAppearance_android_textSize, 0);
        if (f2 != 0) {
            float f3 = (float) f2;
            if (f3 != this.G.getTextSize()) {
                this.G.setTextSize(f3);
                requestLayout();
            }
        }
        i(s2.k(j.TextAppearance_android_typeface, -1), s2.k(j.TextAppearance_android_textStyle, -1));
        if (s2.a(j.TextAppearance_textAllCaps, false)) {
            this.K = new a.a.m.a(getContext());
        } else {
            this.K = null;
        }
        s2.v();
    }

    public void setSwitchTypeface(Typeface typeface, int i2) {
        Typeface typeface2;
        float f2 = 0.0f;
        boolean z2 = false;
        if (i2 > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i2);
            } else {
                typeface2 = Typeface.create(typeface, i2);
            }
            setSwitchTypeface(typeface2);
            int i3 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & i2;
            TextPaint textPaint = this.G;
            if ((i3 & 1) != 0) {
                z2 = true;
            }
            textPaint.setFakeBoldText(z2);
            TextPaint textPaint2 = this.G;
            if ((i3 & 2) != 0) {
                f2 = -0.25f;
            }
            textPaint2.setTextSkewX(f2);
            return;
        }
        this.G.setFakeBoldText(false);
        this.G.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setTextOff(CharSequence charSequence) {
        this.q = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.p = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1034b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1034b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f2) {
        this.y = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(a.a.k.a.a.d(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.l = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1035c = colorStateList;
        this.f1037e = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1036d = mode;
        this.f1038f = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(a.a.k.a.a.d(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.h = colorStateList;
        this.j = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.i = mode;
        this.k = true;
        c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1034b || drawable == this.g;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1035c = null;
        this.f1036d = null;
        this.f1037e = false;
        this.f1038f = false;
        this.h = null;
        this.i = null;
        this.j = false;
        this.k = false;
        this.w = VelocityTracker.obtain();
        this.M = new Rect();
        this.G = new TextPaint(1);
        Resources resources = getResources();
        this.G.density = resources.getDisplayMetrics().density;
        b0 u2 = b0.u(context, attributeSet, j.SwitchCompat, i2, 0);
        Drawable g2 = u2.g(j.SwitchCompat_android_thumb);
        this.f1034b = g2;
        if (g2 != null) {
            g2.setCallback(this);
        }
        Drawable g3 = u2.g(j.SwitchCompat_track);
        this.g = g3;
        if (g3 != null) {
            g3.setCallback(this);
        }
        this.p = u2.p(j.SwitchCompat_android_textOn);
        this.q = u2.p(j.SwitchCompat_android_textOff);
        this.r = u2.a(j.SwitchCompat_showText, true);
        this.l = u2.f(j.SwitchCompat_thumbTextPadding, 0);
        this.m = u2.f(j.SwitchCompat_switchMinWidth, 0);
        this.n = u2.f(j.SwitchCompat_switchPadding, 0);
        this.o = u2.a(j.SwitchCompat_splitTrack, false);
        ColorStateList c2 = u2.c(j.SwitchCompat_thumbTint);
        if (c2 != null) {
            this.f1035c = c2;
            this.f1037e = true;
        }
        PorterDuff.Mode e2 = o.e(u2.k(j.SwitchCompat_thumbTintMode, -1), (PorterDuff.Mode) null);
        if (this.f1036d != e2) {
            this.f1036d = e2;
            this.f1038f = true;
        }
        if (this.f1037e || this.f1038f) {
            b();
        }
        ColorStateList c3 = u2.c(j.SwitchCompat_trackTint);
        if (c3 != null) {
            this.h = c3;
            this.j = true;
        }
        PorterDuff.Mode e3 = o.e(u2.k(j.SwitchCompat_trackTintMode, -1), (PorterDuff.Mode) null);
        if (this.i != e3) {
            this.i = e3;
            this.k = true;
        }
        if (this.j || this.k) {
            c();
        }
        int n2 = u2.n(j.SwitchCompat_switchTextAppearance, 0);
        if (n2 != 0) {
            setSwitchTextAppearance(context, n2);
        }
        u2.v();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.t = viewConfiguration.getScaledTouchSlop();
        this.x = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.G.getTypeface() != null && !this.G.getTypeface().equals(typeface)) || (this.G.getTypeface() == null && typeface != null)) {
            this.G.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }
}
