package androidx.swiperefreshlayout.widget;

import a.h.k.u;
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
    private Animation.AnimationListener f1991b;

    /* renamed from: c  reason: collision with root package name */
    int f1992c;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a  reason: collision with other inner class name */
    /* compiled from: CircleImageView */
    private class C0053a extends OvalShape {

        /* renamed from: b  reason: collision with root package name */
        private RadialGradient f1993b;

        /* renamed from: c  reason: collision with root package name */
        private Paint f1994c = new Paint();

        C0053a(int i) {
            a.this.f1992c = i;
            b((int) rect().width());
        }

        private void b(int i) {
            float f2 = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f2, f2, (float) a.this.f1992c, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f1993b = radialGradient;
            this.f1994c.setShader(radialGradient);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = a.this.getWidth() / 2;
            float f2 = (float) width;
            float height = (float) (a.this.getHeight() / 2);
            canvas.drawCircle(f2, height, f2, this.f1994c);
            canvas.drawCircle(f2, height, (float) (width - a.this.f1992c), paint);
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
        this.f1992c = (int) (3.5f * f2);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            u.f0(this, f2 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0053a(this.f1992c));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f1992c, (float) i3, (float) i2, 503316480);
            int i4 = this.f1992c;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        u.b0(this, shapeDrawable);
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f1991b = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f1991b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f1991b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f1992c * 2), getMeasuredHeight() + (this.f1992c * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
