package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.b0;
import b.c.a.d.k;

public class TabItem extends View {

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f10891b;

    /* renamed from: c  reason: collision with root package name */
    public final Drawable f10892c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10893d;

    public TabItem(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b0 t = b0.t(context, attributeSet, k.TabItem);
        this.f10891b = t.p(k.TabItem_android_text);
        this.f10892c = t.g(k.TabItem_android_icon);
        this.f10893d = t.n(k.TabItem_android_layout, 0);
        t.v();
    }
}
