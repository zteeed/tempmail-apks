package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: b  reason: collision with root package name */
    private int f10825b;

    public VisibilityAwareImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f10825b = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f10825b;
    }

    public void setVisibility(int i) {
        b(i, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10825b = getVisibility();
    }
}
