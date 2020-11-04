package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.c;

/* compiled from: AppCompatProgressBarHelper */
class i {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f1120c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    private final ProgressBar f1121a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f1122b;

    i(ProgressBar progressBar) {
        this.f1121a = progressBar;
    }

    private Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    private Drawable d(Drawable drawable, boolean z) {
        if (drawable instanceof c) {
            c cVar = (c) drawable;
            Drawable b2 = cVar.b();
            if (b2 != null) {
                cVar.a(d(b2, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = d(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1122b == null) {
                this.f1122b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    private Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable d2 = d(animationDrawable.getFrame(i), true);
            d2.setLevel(10000);
            animationDrawable2.addFrame(d2, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* access modifiers changed from: package-private */
    public Bitmap b() {
        return this.f1122b;
    }

    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i) {
        b0 u = b0.u(this.f1121a.getContext(), attributeSet, f1120c, i, 0);
        Drawable h = u.h(0);
        if (h != null) {
            this.f1121a.setIndeterminateDrawable(e(h));
        }
        Drawable h2 = u.h(1);
        if (h2 != null) {
            this.f1121a.setProgressDrawable(d(h2, false));
        }
        u.v();
    }
}
