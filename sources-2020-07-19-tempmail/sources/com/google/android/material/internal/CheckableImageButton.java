package com.google.android.material.internal;

import a.h.k.c0.d;
import a.h.k.t;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f10814e = {16842912};

    /* renamed from: d  reason: collision with root package name */
    private boolean f10815d;

    class a extends a.h.k.a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public void g(View view, d dVar) {
            super.g(view, dVar);
            dVar.X(true);
            dVar.Y(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean isChecked() {
        return this.f10815d;
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f10815d) {
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f10814e.length), f10814e);
        }
        return super.onCreateDrawableState(i);
    }

    public void setChecked(boolean z) {
        if (this.f10815d != z) {
            this.f10815d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void toggle() {
        setChecked(!this.f10815d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t.Z(this, new a());
    }
}