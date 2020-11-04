package a.h.k.d0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat */
public final class a extends ClickableSpan {

    /* renamed from: b  reason: collision with root package name */
    private final int f374b;

    /* renamed from: c  reason: collision with root package name */
    private final d f375c;

    /* renamed from: d  reason: collision with root package name */
    private final int f376d;

    public a(int i, d dVar, int i2) {
        this.f374b = i;
        this.f375c = dVar;
        this.f376d = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f374b);
        this.f375c.O(this.f376d, bundle);
    }
}
