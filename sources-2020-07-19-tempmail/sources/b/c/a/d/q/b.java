package b.c.a.d.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.c.f;
import b.c.a.d.k;

/* compiled from: TextAppearance */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final float f2290a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f2291b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f2292c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f2293d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2294e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2295f;
    public final String g;
    public final ColorStateList h;
    public final float i;
    public final float j;
    public final float k;
    private final int l;
    /* access modifiers changed from: private */
    public boolean m = false;
    /* access modifiers changed from: private */
    public Typeface n;

    /* compiled from: TextAppearance */
    class a extends f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextPaint f2296a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.a f2297b;

        a(TextPaint textPaint, f.a aVar) {
            this.f2296a = textPaint;
            this.f2297b = aVar;
        }

        public void c(int i) {
            b.this.d();
            boolean unused = b.this.m = true;
            this.f2297b.c(i);
        }

        public void d(Typeface typeface) {
            b bVar = b.this;
            Typeface unused = bVar.n = Typeface.create(typeface, bVar.f2294e);
            b.this.i(this.f2296a, typeface);
            boolean unused2 = b.this.m = true;
            this.f2297b.d(typeface);
        }
    }

    public b(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, k.TextAppearance);
        this.f2290a = obtainStyledAttributes.getDimension(k.TextAppearance_android_textSize, 0.0f);
        this.f2291b = a.a(context, obtainStyledAttributes, k.TextAppearance_android_textColor);
        this.f2292c = a.a(context, obtainStyledAttributes, k.TextAppearance_android_textColorHint);
        this.f2293d = a.a(context, obtainStyledAttributes, k.TextAppearance_android_textColorLink);
        this.f2294e = obtainStyledAttributes.getInt(k.TextAppearance_android_textStyle, 0);
        this.f2295f = obtainStyledAttributes.getInt(k.TextAppearance_android_typeface, 1);
        int c2 = a.c(obtainStyledAttributes, k.TextAppearance_fontFamily, k.TextAppearance_android_fontFamily);
        this.l = obtainStyledAttributes.getResourceId(c2, 0);
        this.g = obtainStyledAttributes.getString(c2);
        obtainStyledAttributes.getBoolean(k.TextAppearance_textAllCaps, false);
        this.h = a.a(context, obtainStyledAttributes, k.TextAppearance_android_shadowColor);
        this.i = obtainStyledAttributes.getFloat(k.TextAppearance_android_shadowDx, 0.0f);
        this.j = obtainStyledAttributes.getFloat(k.TextAppearance_android_shadowDy, 0.0f);
        this.k = obtainStyledAttributes.getFloat(k.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: private */
    public void d() {
        if (this.n == null) {
            this.n = Typeface.create(this.g, this.f2294e);
        }
        if (this.n == null) {
            int i2 = this.f2295f;
            if (i2 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            Typeface typeface = this.n;
            if (typeface != null) {
                this.n = Typeface.create(typeface, this.f2294e);
            }
        }
    }

    public Typeface e(Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b2 = f.b(context, this.l);
                this.n = b2;
                if (b2 != null) {
                    this.n = Typeface.create(b2, this.f2294e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.g, e2);
            }
        }
        d();
        this.m = true;
        return this.n;
    }

    public void f(Context context, TextPaint textPaint, f.a aVar) {
        if (this.m) {
            i(textPaint, this.n);
            return;
        }
        d();
        if (context.isRestricted()) {
            this.m = true;
            i(textPaint, this.n);
            return;
        }
        try {
            f.d(context, this.l, new a(textPaint, aVar), (Handler) null);
        } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.g, e2);
        }
    }

    public void g(Context context, TextPaint textPaint, f.a aVar) {
        h(context, textPaint, aVar);
        ColorStateList colorStateList = this.f2291b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.k;
        float f3 = this.i;
        float f4 = this.j;
        ColorStateList colorStateList2 = this.h;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void h(Context context, TextPaint textPaint, f.a aVar) {
        if (c.a()) {
            i(textPaint, e(context));
            return;
        }
        f(context, textPaint, aVar);
        if (!this.m) {
            i(textPaint, this.n);
        }
    }

    public void i(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f2294e;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f2290a);
    }
}
