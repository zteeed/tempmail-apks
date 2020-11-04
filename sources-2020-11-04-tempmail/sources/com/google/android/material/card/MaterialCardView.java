package com.google.android.material.card;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import b.c.a.d.b;
import b.c.a.d.j;
import com.google.android.material.internal.k;

public class MaterialCardView extends CardView {
    private final a k;

    public MaterialCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getStrokeColor() {
        return this.k.c();
    }

    public int getStrokeWidth() {
        return this.k.d();
    }

    public void setRadius(float f2) {
        super.setRadius(f2);
        this.k.h();
    }

    public void setStrokeColor(int i) {
        this.k.f(i);
    }

    public void setStrokeWidth(int i) {
        this.k.g(i);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray h = k.h(context, attributeSet, b.c.a.d.k.MaterialCardView, i, j.Widget_MaterialComponents_CardView, new int[0]);
        a aVar = new a(this);
        this.k = aVar;
        aVar.e(h);
        h.recycle();
    }
}
