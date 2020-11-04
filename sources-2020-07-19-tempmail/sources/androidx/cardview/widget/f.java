package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable */
class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private float f1193a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f1194b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f1195c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f1196d;

    /* renamed from: e  reason: collision with root package name */
    private float f1197e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1198f = false;
    private boolean g = true;
    private ColorStateList h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    f(ColorStateList colorStateList, float f2) {
        this.f1193a = f2;
        this.f1194b = new Paint(5);
        e(colorStateList);
        this.f1195c = new RectF();
        this.f1196d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.h = colorStateList;
        this.f1194b.setColor(colorStateList.getColorForState(getState(), this.h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1195c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f1196d.set(rect);
        if (this.f1198f) {
            float d2 = g.d(this.f1197e, this.f1193a, this.g);
            this.f1196d.inset((int) Math.ceil((double) g.c(this.f1197e, this.f1193a, this.g)), (int) Math.ceil((double) d2));
            this.f1195c.set(this.f1196d);
        }
    }

    public ColorStateList b() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f1197e;
    }

    public float d() {
        return this.f1193a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1194b;
        if (this.i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.i);
            z = true;
        }
        RectF rectF = this.f1195c;
        float f2 = this.f1193a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void g(float f2, boolean z, boolean z2) {
        if (f2 != this.f1197e || this.f1198f != z || this.g != z2) {
            this.f1197e = f2;
            this.f1198f = z;
            this.g = z2;
            i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1196d, this.f1193a);
    }

    /* access modifiers changed from: package-private */
    public void h(float f2) {
        if (f2 != this.f1193a) {
            this.f1193a = f2;
            i((Rect) null);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.f.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1194b.getColor();
        if (z) {
            this.f1194b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i2) {
        this.f1194b.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1194b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(colorStateList, this.k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.i = a(this.j, mode);
        invalidateSelf();
    }
}
