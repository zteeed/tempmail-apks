package com.google.android.material.card;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import b.c.a.d.k;

/* compiled from: MaterialCardViewHelper */
class a {

    /* renamed from: a  reason: collision with root package name */
    private final MaterialCardView f10931a;

    /* renamed from: b  reason: collision with root package name */
    private int f10932b;

    /* renamed from: c  reason: collision with root package name */
    private int f10933c;

    public a(MaterialCardView materialCardView) {
        this.f10931a = materialCardView;
    }

    private void a() {
        this.f10931a.setContentPadding(this.f10931a.getContentPaddingLeft() + this.f10933c, this.f10931a.getContentPaddingTop() + this.f10933c, this.f10931a.getContentPaddingRight() + this.f10933c, this.f10931a.getContentPaddingBottom() + this.f10933c);
    }

    private Drawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.f10931a.getRadius());
        int i = this.f10932b;
        if (i != -1) {
            gradientDrawable.setStroke(this.f10933c, i);
        }
        return gradientDrawable;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f10932b;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f10933c;
    }

    public void e(TypedArray typedArray) {
        this.f10932b = typedArray.getColor(k.MaterialCardView_strokeColor, -1);
        this.f10933c = typedArray.getDimensionPixelSize(k.MaterialCardView_strokeWidth, 0);
        h();
        a();
    }

    /* access modifiers changed from: package-private */
    public void f(int i) {
        this.f10932b = i;
        h();
    }

    /* access modifiers changed from: package-private */
    public void g(int i) {
        this.f10933c = i;
        h();
        a();
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f10931a.setForeground(b());
    }
}
