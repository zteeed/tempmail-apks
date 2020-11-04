package com.google.android.material.snackbar;

import a.h.k.c0.c;
import a.h.k.t;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import b.c.a.d.k;

public class BaseTransientBottomBar$SnackbarBaseLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private final AccessibilityManager f10871b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f10872c;

    /* renamed from: d  reason: collision with root package name */
    private c f10873d;

    /* renamed from: e  reason: collision with root package name */
    private b f10874e;

    class a implements c.a {
        a() {
        }

        public void onTouchExplorationStateChanged(boolean z) {
            BaseTransientBottomBar$SnackbarBaseLayout.this.setClickableOrFocusableBasedOnAccessibility(z);
        }
    }

    protected BaseTransientBottomBar$SnackbarBaseLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
        setClickable(!z);
        setFocusable(z);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f10874e;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        t.X(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f10874e;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
        c.b(this.f10871b, this.f10872c);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c cVar = this.f10873d;
        if (cVar != null) {
            cVar.a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void setOnAttachStateChangeListener(b bVar) {
        this.f10874e = bVar;
    }

    /* access modifiers changed from: package-private */
    public void setOnLayoutChangeListener(c cVar) {
        this.f10873d = cVar;
    }

    protected BaseTransientBottomBar$SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(k.SnackbarLayout_elevation)) {
            t.f0(this, (float) obtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_elevation, 0));
        }
        obtainStyledAttributes.recycle();
        this.f10871b = (AccessibilityManager) context.getSystemService("accessibility");
        a aVar = new a();
        this.f10872c = aVar;
        c.a(this.f10871b, aVar);
        setClickableOrFocusableBasedOnAccessibility(this.f10871b.isTouchExplorationEnabled());
    }
}
