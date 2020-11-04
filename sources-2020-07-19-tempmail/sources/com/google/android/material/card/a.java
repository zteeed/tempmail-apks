package com.google.android.material.card;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import b.c.a.d.k;

/* compiled from: MaterialCardViewHelper */
class a {

    /* renamed from: a  reason: collision with root package name */
    private final MaterialCardView f10745a;

    /* renamed from: b  reason: collision with root package name */
    private int f10746b;

    /* renamed from: c  reason: collision with root package name */
    private int f10747c;

    public a(MaterialCardView materialCardView) {
        this.f10745a = materialCardView;
    }

    private void a() {
        this.f10745a.setContentPadding(this.f10745a.getContentPaddingLeft() + this.f10747c, this.f10745a.getContentPaddingTop() + this.f10747c, this.f10745a.getContentPaddingRight() + this.f10747c, this.f10745a.getContentPaddingBottom() + this.f10747c);
    }

    private Drawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.f10745a.getRadius());
        int i = this.f10746b;
        if (i != -1) {
            gradientDrawable.setStroke(this.f10747c, i);
        }
        return gradientDrawable;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f10746b;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f10747c;
    }

    public void e(TypedArray typedArray) {
        this.f10746b = typedArray.getColor(k.MaterialCardView_strokeColor, -1);
        this.f10747c = typedArray.getDimensionPixelSize(k.MaterialCardView_strokeWidth, 0);
        h();
        a();
    }

    /* access modifiers changed from: package-private */
    public void f(int i) {
        this.f10746b = i;
        h();
    }

    /* access modifiers changed from: package-private */
    public void g(int i) {
        this.f10747c = i;
        h();
        a();
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f10745a.setForeground(b());
    }
}
