package androidx.appcompat.widget;

import a.a.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public class AppCompatRatingBar extends RatingBar {

    /* renamed from: b  reason: collision with root package name */
    private final i f976b;

    public AppCompatRatingBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b2 = this.f976b.b();
        if (b2 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b2.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i iVar = new i(this);
        this.f976b = iVar;
        iVar.c(attributeSet, i);
    }
}
