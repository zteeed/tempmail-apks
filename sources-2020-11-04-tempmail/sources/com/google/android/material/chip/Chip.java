package com.google.android.material.chip;

import a.h.k.d0.d;
import a.h.k.u;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.c.f;
import b.c.a.d.i;
import b.c.a.d.j;
import b.c.a.d.l.h;
import com.google.android.material.chip.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Chip extends AppCompatCheckBox implements a.b {
    /* access modifiers changed from: private */
    public static final Rect q = new Rect();
    private static final int[] r = {16842913};
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public a f10934d;

    /* renamed from: e  reason: collision with root package name */
    private RippleDrawable f10935e;

    /* renamed from: f  reason: collision with root package name */
    private View.OnClickListener f10936f;
    private CompoundButton.OnCheckedChangeListener g;
    private boolean h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private final c m;
    private final Rect n;
    private final RectF o;
    private final f.a p;

    class a extends f.a {
        a() {
        }

        public void c(int i) {
        }

        public void d(Typeface typeface) {
            Chip chip = Chip.this;
            chip.setText(chip.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f10934d != null) {
                Chip.this.f10934d.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends a.j.a.a {
        c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        public void A(List<Integer> list) {
            if (Chip.this.l()) {
                list.add(0);
            }
        }

        /* access modifiers changed from: protected */
        public boolean H(int i, int i2, Bundle bundle) {
            if (i2 == 16 && i == 0) {
                return Chip.this.o();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void K(d dVar) {
            dVar.X(Chip.this.f10934d != null && Chip.this.f10934d.c0());
            dVar.Z(Chip.class.getName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                dVar.y0(text);
            } else {
                dVar.d0(text);
            }
        }

        /* access modifiers changed from: protected */
        public void L(int i, d dVar) {
            CharSequence charSequence = "";
            if (Chip.this.l()) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    dVar.d0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = i.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    dVar.d0(context.getString(i2, objArr).trim());
                }
                dVar.U(Chip.this.getCloseIconTouchBoundsInt());
                dVar.b(d.a.f384f);
                dVar.g0(Chip.this.isEnabled());
                return;
            }
            dVar.d0(charSequence);
            dVar.U(Chip.q);
        }

        /* access modifiers changed from: protected */
        public int z(float f2, float f3) {
            return (!Chip.this.l() || !Chip.this.getCloseIconTouchBounds().contains(f2, f3)) ? -1 : 0;
        }
    }

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    private void g(a aVar) {
        aVar.d1(this);
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.o.setEmpty();
        if (l()) {
            this.f10934d.O(this.o);
        }
        return this.o;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.n.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.n;
    }

    private b.c.a.d.q.b getTextAppearance() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.W();
        }
        return null;
    }

    private float h(a aVar) {
        float chipStartPadding = getChipStartPadding() + aVar.d() + getTextStartPadding();
        return u.t(this) == 0 ? chipStartPadding : -chipStartPadding;
    }

    private int[] i() {
        int i2 = 0;
        int i3 = isEnabled() ? 1 : 0;
        if (this.l) {
            i3++;
        }
        if (this.k) {
            i3++;
        }
        if (this.j) {
            i3++;
        }
        if (isChecked()) {
            i3++;
        }
        int[] iArr = new int[i3];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i2 = 1;
        }
        if (this.l) {
            iArr[i2] = 16842908;
            i2++;
        }
        if (this.k) {
            iArr[i2] = 16843623;
            i2++;
        }
        if (this.j) {
            iArr[i2] = 16842919;
            i2++;
        }
        if (isChecked()) {
            iArr[i2] = 16842913;
        }
        return iArr;
    }

    private void j() {
        if (this.i == Integer.MIN_VALUE) {
            setFocusedVirtualView(-1);
        }
    }

    @SuppressLint({"PrivateApi"})
    private boolean k(MotionEvent motionEvent) {
        Class<a.j.a.a> cls = a.j.a.a.class;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.m)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("T", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.m, new Object[]{Integer.MIN_VALUE});
                    return true;
                }
            } catch (NoSuchMethodException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (IllegalAccessException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (InvocationTargetException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            } catch (NoSuchFieldException e5) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e5);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public boolean l() {
        a aVar = this.f10934d;
        return (aVar == null || aVar.H() == null) ? false : true;
    }

    private void m() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    private boolean n(boolean z) {
        j();
        if (z) {
            if (this.i == -1) {
                setFocusedVirtualView(0);
                return true;
            }
        } else if (this.i == 0) {
            setFocusedVirtualView(-1);
            return true;
        }
        return false;
    }

    private void p(a aVar) {
        if (aVar != null) {
            aVar.d1((a.b) null);
        }
    }

    private void q() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f10934d) != null) {
            float E = aVar.E() + this.f10934d.z() + this.f10934d.Y() + this.f10934d.X();
            if ((this.f10934d.e0() && this.f10934d.A() != null) || (this.f10934d.w() != null && this.f10934d.d0() && isChecked())) {
                E += this.f10934d.S() + this.f10934d.R() + this.f10934d.B();
            }
            if (this.f10934d.g0() && this.f10934d.H() != null) {
                E += this.f10934d.L() + this.f10934d.J() + this.f10934d.K();
            }
            if (((float) u.w(this)) != E) {
                u.m0(this, u.x(this), getPaddingTop(), (int) E, getPaddingBottom());
            }
        }
    }

    private void r(b.c.a.d.q.b bVar) {
        TextPaint paint = getPaint();
        paint.drawableState = this.f10934d.getState();
        bVar.g(getContext(), paint, this.p);
    }

    private void s(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    private void setCloseIconFocused(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.k != z) {
            this.k = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.j != z) {
            this.j = z;
            refreshDrawableState();
        }
    }

    private void setFocusedVirtualView(int i2) {
        int i3 = this.i;
        if (i3 != i2) {
            if (i3 == 0) {
                setCloseIconFocused(false);
            }
            this.i = i2;
            if (i2 == 0) {
                setCloseIconFocused(true);
            }
        }
    }

    public void a() {
        q();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return k(motionEvent) || this.m.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.m.w(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f10934d;
        if ((aVar == null || !aVar.f0()) ? false : this.f10934d.Y0(i())) {
            invalidate();
        }
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.w();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.x();
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.y();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f10934d;
    }

    public float getChipEndPadding() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.z();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.A();
        }
        return null;
    }

    public float getChipIconSize() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.B();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.C();
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.D();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.E();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.F();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.G();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.H();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.I();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.J();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.K();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.L();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.N();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.P();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.i == 0) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public h getHideMotionSpec() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.Q();
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.R();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.S();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.T();
        }
        return null;
    }

    public h getShowMotionSpec() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.U();
        }
        return null;
    }

    public CharSequence getText() {
        a aVar = this.f10934d;
        return aVar != null ? aVar.V() : "";
    }

    public float getTextEndPadding() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.X();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f10934d;
        if (aVar != null) {
            return aVar.Y();
        }
        return 0.0f;
    }

    public boolean o() {
        boolean z;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f10936f;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        } else {
            z = false;
        }
        this.m.S(0, 1);
        return z;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, r);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f10934d) == null || aVar.z1()) {
            super.onDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.translate(h(this.f10934d), 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        if (z) {
            setFocusedVirtualView(-1);
        } else {
            setFocusedVirtualView(Integer.MIN_VALUE);
        }
        invalidate();
        super.onFocusChanged(z, i2, rect);
        this.m.G(z, i2, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r7, android.view.KeyEvent r8) {
        /*
            r6 = this;
            int r0 = r8.getKeyCode()
            r1 = 61
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0041
            r1 = 66
            if (r0 == r1) goto L_0x0031
            switch(r0) {
                case 21: goto L_0x0022;
                case 22: goto L_0x0012;
                case 23: goto L_0x0031;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x006d
        L_0x0012:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x006d
            boolean r0 = com.google.android.material.internal.l.a(r6)
            r0 = r0 ^ r3
            boolean r2 = r6.n(r0)
            goto L_0x006d
        L_0x0022:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x006d
            boolean r0 = com.google.android.material.internal.l.a(r6)
            boolean r2 = r6.n(r0)
            goto L_0x006d
        L_0x0031:
            int r0 = r6.i
            r1 = -1
            if (r0 == r1) goto L_0x003d
            if (r0 == 0) goto L_0x0039
            goto L_0x006d
        L_0x0039:
            r6.o()
            return r3
        L_0x003d:
            r6.performClick()
            return r3
        L_0x0041:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x0049
            r0 = 2
            goto L_0x0052
        L_0x0049:
            boolean r0 = r8.hasModifiers(r3)
            if (r0 == 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            if (r0 == 0) goto L_0x006d
            android.view.ViewParent r1 = r6.getParent()
            r4 = r6
        L_0x0059:
            android.view.View r4 = r4.focusSearch(r0)
            if (r4 == 0) goto L_0x0067
            if (r4 == r6) goto L_0x0067
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == r1) goto L_0x0059
        L_0x0067:
            if (r4 == 0) goto L_0x006d
            r4.requestFocus()
            return r3
        L_0x006d:
            if (r2 == 0) goto L_0x0073
            r6.invalidate()
            return r3
        L_0x0073:
            boolean r7 = super.onKeyDown(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.j
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.j
            if (r0 == 0) goto L_0x0034
            r5.o()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == this.f10934d || drawable == this.f10935e) {
            super.setBackground(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
    }

    public void setBackgroundColor(int i2) {
        throw new UnsupportedOperationException("Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == this.f10934d || drawable == this.f10935e) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background drawable; Chip manages its own background drawable.");
    }

    public void setBackgroundResource(int i2) {
        throw new UnsupportedOperationException("Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        throw new UnsupportedOperationException("Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        throw new UnsupportedOperationException("Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.n0(z);
        }
    }

    public void setCheckableResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.o0(i2);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        a aVar = this.f10934d;
        if (aVar == null) {
            this.h = z;
        } else if (aVar.c0()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.g) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.p0(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.q0(i2);
        }
    }

    public void setCheckedIconVisible(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.r0(i2);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.t0(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.u0(i2);
        }
    }

    public void setChipCornerRadius(float f2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.v0(f2);
        }
    }

    public void setChipCornerRadiusResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.w0(i2);
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f10934d;
        if (aVar2 != aVar) {
            p(aVar2);
            this.f10934d = aVar;
            g(aVar);
            if (b.c.a.d.r.a.f2398a) {
                this.f10935e = new RippleDrawable(b.c.a.d.r.a.a(this.f10934d.T()), this.f10934d, (Drawable) null);
                this.f10934d.y1(false);
                u.b0(this, this.f10935e);
                return;
            }
            this.f10934d.y1(true);
            u.b0(this, this.f10934d);
        }
    }

    public void setChipEndPadding(float f2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.x0(f2);
        }
    }

    public void setChipEndPaddingResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.y0(i2);
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.z0(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.A0(i2);
        }
    }

    public void setChipIconSize(float f2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.B0(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.C0(i2);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.D0(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.E0(i2);
        }
    }

    public void setChipIconVisible(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.F0(i2);
        }
    }

    public void setChipMinHeight(float f2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.H0(f2);
        }
    }

    public void setChipMinHeightResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.I0(i2);
        }
    }

    public void setChipStartPadding(float f2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.J0(f2);
        }
    }

    public void setChipStartPaddingResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.K0(i2);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.L0(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.M0(i2);
        }
    }

    public void setChipStrokeWidth(float f2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.N0(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.O0(i2);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.P0(drawable);
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.Q0(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.R0(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.S0(i2);
        }
    }

    public void setCloseIconResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.T0(i2);
        }
    }

    public void setCloseIconSize(float f2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.U0(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.V0(i2);
        }
    }

    public void setCloseIconStartPadding(float f2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.W0(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.X0(i2);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.Z0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.a1(i2);
        }
    }

    public void setCloseIconVisible(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.b1(i2);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f10934d != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f10934d;
                if (aVar != null) {
                    aVar.e1(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(h hVar) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.f1(hVar);
        }
    }

    public void setHideMotionSpecResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.g1(i2);
        }
    }

    public void setIconEndPadding(float f2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.h1(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.i1(i2);
        }
    }

    public void setIconStartPadding(float f2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.j1(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.k1(i2);
        }
    }

    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.l1(i2);
        }
    }

    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.g = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f10936f = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.m1(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.n1(i2);
        }
    }

    public void setShowMotionSpec(h hVar) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.p1(hVar);
        }
    }

    public void setShowMotionSpecResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.q1(i2);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f10934d != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            CharSequence h2 = a.h.i.a.c().h(charSequence);
            if (this.f10934d.z1()) {
                h2 = null;
            }
            super.setText(h2, bufferType);
            a aVar = this.f10934d;
            if (aVar != null) {
                aVar.r1(charSequence);
            }
        }
    }

    public void setTextAppearance(b.c.a.d.q.b bVar) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.s1(bVar);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().h(getContext(), getPaint(), this.p);
            r(bVar);
        }
    }

    public void setTextAppearanceResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.t1(i2);
        }
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.u1(f2);
        }
    }

    public void setTextEndPaddingResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.v1(i2);
        }
    }

    public void setTextStartPadding(float f2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.w1(f2);
        }
    }

    public void setTextStartPaddingResource(int i2) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.x1(i2);
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.c.a.d.b.chipStyle);
    }

    public Chip(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = Integer.MIN_VALUE;
        this.n = new Rect();
        this.o = new RectF();
        this.p = new a();
        s(attributeSet);
        a n2 = a.n(context, attributeSet, i2, j.Widget_MaterialComponents_Chip_Action);
        setChipDrawable(n2);
        c cVar = new c(this);
        this.m = cVar;
        u.Z(this, cVar);
        m();
        setChecked(this.h);
        n2.o1(false);
        setText(n2.V());
        setEllipsize(n2.P());
        setIncludeFontPadding(false);
        if (getTextAppearance() != null) {
            r(getTextAppearance());
        }
        setSingleLine();
        setGravity(8388627);
        q();
    }

    public void setCheckedIconVisible(boolean z) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.s0(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.G0(z);
        }
    }

    public void setCloseIconVisible(boolean z) {
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.c1(z);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.t1(i2);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().h(context, getPaint(), this.p);
            r(getTextAppearance());
        }
    }

    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        a aVar = this.f10934d;
        if (aVar != null) {
            aVar.t1(i2);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().h(getContext(), getPaint(), this.p);
            r(getTextAppearance());
        }
    }
}
