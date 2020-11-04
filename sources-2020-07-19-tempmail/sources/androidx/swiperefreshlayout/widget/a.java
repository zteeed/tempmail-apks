package androidx.swiperefreshlayout.widget;

import a.h.k.t;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;

/* compiled from: CircleImageView */
class a extends ImageView {

    /* renamed from: b  reason: collision with root package name */
    private Animation.AnimationListener f1891b;

    /* renamed from: c  reason: collision with root package name */
    int f1892c;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a  reason: collision with other inner class name */
    /* compiled from: CircleImageView */
    private class C0051a extends OvalShape {

        /* renamed from: b  reason: collision with root package name */
        private RadialGradient f1893b;

        /* renamed from: c  reason: collision with root package name */
        private Paint f1894c = new Paint();

        C0051a(int i) {
            a.this.f1892c = i;
            b((int) rect().width());
        }

        private void b(int i) {
            float f2 = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f2, f2, (float) a.this.f1892c, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f1893b = radialGradient;
            this.f1894c.setShader(radialGradient);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = a.this.getWidth() / 2;
            float f2 = (float) width;
            float height = (float) (a.this.getHeight() / 2);
            canvas.drawCircle(f2, height, f2, this.f1894c);
            canvas.drawCircle(f2, height, (float) (width - a.this.f1892c), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f2, float f3) {
            super.onResize(f2, f3);
            b((int) f2);
        }
    }

    a(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f2 = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f2);
        int i3 = (int) (0.0f * f2);
        this.f1892c = (int) (3.5f * f2);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            t.f0(this, f2 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0051a(this.f1892c));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f1892c, (float) i3, (float) i2, 503316480);
            int i4 = this.f1892c;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        t.b0(this, shapeDrawable);
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f1891b = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f1891b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f1891b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f1892c * 2), getMeasuredHeight() + (this.f1892c * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
