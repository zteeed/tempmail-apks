package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: b  reason: collision with root package name */
    long f1348b;

    /* renamed from: c  reason: collision with root package name */
    boolean f1349c;

    /* renamed from: d  reason: collision with root package name */
    boolean f1350d;

    /* renamed from: e  reason: collision with root package name */
    boolean f1351e;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f1352f;
    private final Runnable g;

    class a implements Runnable {
        a() {
        }

        public void run() {
            ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
            contentLoadingProgressBar.f1349c = false;
            contentLoadingProgressBar.f1348b = -1;
            contentLoadingProgressBar.setVisibility(8);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
            contentLoadingProgressBar.f1350d = false;
            if (!contentLoadingProgressBar.f1351e) {
                contentLoadingProgressBar.f1348b = System.currentTimeMillis();
                ContentLoadingProgressBar.this.setVisibility(0);
            }
        }
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    private void a() {
        removeCallbacks(this.f1352f);
        removeCallbacks(this.g);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1351e = false;
        this.f1352f = new a();
        this.g = new b();
    }
}
