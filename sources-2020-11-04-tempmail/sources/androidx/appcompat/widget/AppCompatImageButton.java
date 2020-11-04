package androidx.appcompat.widget;

import a.a.a;
import a.h.k.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.core.widget.k;

public class AppCompatImageButton extends ImageButton implements t, k {

    /* renamed from: b  reason: collision with root package name */
    private final d f967b;

    /* renamed from: c  reason: collision with root package name */
    private final h f968c;

    public AppCompatImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f967b;
        if (dVar != null) {
            dVar.b();
        }
        h hVar = this.f968c;
        if (hVar != null) {
            hVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f967b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f967b;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        h hVar = this.f968c;
        if (hVar != null) {
            return hVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        h hVar = this.f968c;
        if (hVar != null) {
            return hVar.d();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f968c.e() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f967b;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d dVar = this.f967b;
        if (dVar != null) {
            dVar.g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        h hVar = this.f968c;
        if (hVar != null) {
            hVar.b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        h hVar = this.f968c;
        if (hVar != null) {
            hVar.b();
        }
    }

    public void setImageResource(int i) {
        this.f968c.g(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        h hVar = this.f968c;
        if (hVar != null) {
            hVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f967b;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f967b;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        h hVar = this.f968c;
        if (hVar != null) {
            hVar.h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        h hVar = this.f968c;
        if (hVar != null) {
            hVar.i(mode);
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(y.b(context), attributeSet, i);
        d dVar = new d(this);
        this.f967b = dVar;
        dVar.e(attributeSet, i);
        h hVar = new h(this);
        this.f968c = hVar;
        hVar.f(attributeSet, i);
    }
}
