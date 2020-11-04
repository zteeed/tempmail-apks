package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class PagerTabStrip extends PagerTitleStrip {
    private boolean A;
    private boolean B;
    private int C;
    private boolean D;
    private float E;
    private float F;
    private int G;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private final Paint x;
    private final Rect y;
    private int z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f2020b;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f2020b;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: package-private */
    public void c(int i, float f2, boolean z2) {
        Rect rect = this.y;
        int height = getHeight();
        int left = this.f2022d.getLeft() - this.w;
        int right = this.f2022d.getRight() + this.w;
        int i2 = height - this.s;
        rect.set(left, i2, right, height);
        super.c(i, f2, z2);
        this.z = (int) (Math.abs(f2 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f2022d.getLeft() - this.w, i2, this.f2022d.getRight() + this.w, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.A;
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.v);
    }

    public int getTabIndicatorColor() {
        return this.r;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f2022d.getLeft() - this.w;
        int right = this.f2022d.getRight() + this.w;
        this.x.setColor((this.z << 24) | (this.r & 16777215));
        float f2 = (float) height;
        canvas.drawRect((float) left, (float) (height - this.s), (float) right, f2, this.x);
        if (this.A) {
            this.x.setColor(-16777216 | (this.r & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.C), (float) (getWidth() - getPaddingRight()), f2, this.x);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.D) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (action == 0) {
            this.E = x2;
            this.F = y2;
            this.D = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x2 - this.E) > ((float) this.G) || Math.abs(y2 - this.F) > ((float) this.G))) {
                this.D = true;
            }
        } else if (x2 < ((float) (this.f2022d.getLeft() - this.w))) {
            ViewPager viewPager = this.f2020b;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x2 > ((float) (this.f2022d.getRight() + this.w))) {
            ViewPager viewPager2 = this.f2020b;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (!this.B) {
            this.A = (i & -16777216) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.B) {
            this.A = drawable == null;
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (!this.B) {
            this.A = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z2) {
        this.A = z2;
        this.B = true;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.t;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.r = i;
        this.x.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(androidx.core.content.a.d(getContext(), i));
    }

    public void setTextSpacing(int i) {
        int i2 = this.u;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x = new Paint();
        this.y = new Rect();
        this.z = 255;
        this.A = false;
        this.B = false;
        int i = this.o;
        this.r = i;
        this.x.setColor(i);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.s = (int) ((3.0f * f2) + 0.5f);
        this.t = (int) ((6.0f * f2) + 0.5f);
        this.u = (int) (64.0f * f2);
        this.w = (int) ((16.0f * f2) + 0.5f);
        this.C = (int) ((1.0f * f2) + 0.5f);
        this.v = (int) ((f2 * 32.0f) + 0.5f);
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f2021c.setFocusable(true);
        this.f2021c.setOnClickListener(new a());
        this.f2023e.setFocusable(true);
        this.f2023e.setOnClickListener(new b());
        if (getBackground() == null) {
            this.A = true;
        }
    }
}
