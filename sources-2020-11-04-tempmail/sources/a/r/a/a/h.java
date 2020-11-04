package a.r.a.a;

import a.h.e.b;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat */
public class h extends g {
    static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private C0029h f625c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuffColorFilter f626d;

    /* renamed from: e  reason: collision with root package name */
    private ColorFilter f627e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f628f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    /* compiled from: VectorDrawableCompat */
    private static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f638b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f637a = a.h.e.b.d(string2);
            }
            this.f639c = androidx.core.content.c.g.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (androidx.core.content.c.g.j(xmlPullParser, "pathData")) {
                TypedArray k = androidx.core.content.c.g.k(resources, theme, attributeSet, a.f606d);
                f(k, xmlPullParser);
                k.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: a.r.a.a.h$h  reason: collision with other inner class name */
    /* compiled from: VectorDrawableCompat */
    private static class C0029h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f647a;

        /* renamed from: b  reason: collision with root package name */
        g f648b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f649c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f650d;

        /* renamed from: e  reason: collision with root package name */
        boolean f651e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f652f;
        ColorStateList g;
        PorterDuff.Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public C0029h(C0029h hVar) {
            this.f649c = null;
            this.f650d = h.k;
            if (hVar != null) {
                this.f647a = hVar.f647a;
                g gVar = new g(hVar.f648b);
                this.f648b = gVar;
                if (hVar.f648b.f645e != null) {
                    gVar.f645e = new Paint(hVar.f648b.f645e);
                }
                if (hVar.f648b.f644d != null) {
                    this.f648b.f644d = new Paint(hVar.f648b.f644d);
                }
                this.f649c = hVar.f649c;
                this.f650d = hVar.f650d;
                this.f651e = hVar.f651e;
            }
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f652f.getWidth() && i3 == this.f652f.getHeight();
        }

        public boolean b() {
            return !this.k && this.g == this.f649c && this.h == this.f650d && this.j == this.f651e && this.i == this.f648b.getRootAlpha();
        }

        public void c(int i2, int i3) {
            if (this.f652f == null || !a(i2, i3)) {
                this.f652f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f652f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                Paint paint = new Paint();
                this.l = paint;
                paint.setFilterBitmap(true);
            }
            this.l.setAlpha(this.f648b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public boolean f() {
            return this.f648b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f648b.f();
        }

        public int getChangingConfigurations() {
            return this.f647a;
        }

        public boolean h(int[] iArr) {
            boolean g2 = this.f648b.g(iArr);
            this.k |= g2;
            return g2;
        }

        public void i() {
            this.g = this.f649c;
            this.h = this.f650d;
            this.i = this.f648b.getRootAlpha();
            this.j = this.f651e;
            this.k = false;
        }

        public void j(int i2, int i3) {
            this.f652f.eraseColor(0);
            this.f648b.b(new Canvas(this.f652f), i2, i3, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new h(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }

        public C0029h() {
            this.f649c = null;
            this.f650d = h.k;
            this.f648b = new g();
        }
    }

    h() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f625c = new C0029h();
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (((float) Color.alpha(i2)) * f2)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a.r.a.a.h b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            a.r.a.a.h r0 = new a.r.a.a.h
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.c.f.a(r6, r7, r8)
            r0.f624b = r6
            a.r.a.a.h$i r6 = new a.r.a.a.h$i
            android.graphics.drawable.Drawable r7 = r0.f624b
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
        L_0x0029:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r5 = 1
            if (r3 == r5) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            if (r3 != r4) goto L_0x003b
            a.r.a.a.h r6 = c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            return r6
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
        L_0x0043:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x004c
        L_0x0048:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x004c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r.a.a.h.b(android.content.res.Resources, int, android.content.res.Resources$Theme):a.r.a.a.h");
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0029h hVar = this.f625c;
        g gVar = hVar.f648b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f632b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.f647a = cVar.f640d | hVar.f647a;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f632b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f647a = bVar.f640d | hVar.f647a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f632b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f647a = dVar2.k | hVar.f647a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || androidx.core.graphics.drawable.a.f(this) != 1) {
            return false;
        }
        return true;
    }

    private static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C0029h hVar = this.f625c;
        g gVar = hVar.f648b;
        hVar.f650d = g(androidx.core.content.c.g.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c2 = androidx.core.content.c.g.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c2 != null) {
            hVar.f649c = c2;
        }
        hVar.f651e = androidx.core.content.c.g.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f651e);
        gVar.k = androidx.core.content.c.g.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.k);
        float f2 = androidx.core.content.c.g.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.l);
        gVar.l = f2;
        if (gVar.k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f2 > 0.0f) {
            gVar.i = typedArray.getDimension(3, gVar.i);
            float dimension = typedArray.getDimension(2, gVar.j);
            gVar.j = dimension;
            if (gVar.i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(androidx.core.content.c.g.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.n = string;
                    gVar.p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f624b;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    /* access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f625c.f648b.p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() > 0 && this.j.height() > 0) {
            ColorFilter colorFilter = this.f627e;
            if (colorFilter == null) {
                colorFilter = this.f626d;
            }
            canvas.getMatrix(this.i);
            this.i.getValues(this.h);
            float abs = Math.abs(this.h[0]);
            float abs2 = Math.abs(this.h[4]);
            float abs3 = Math.abs(this.h[1]);
            float abs4 = Math.abs(this.h[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.j.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.j.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.j;
                canvas.translate((float) rect.left, (float) rect.top);
                if (f()) {
                    canvas.translate((float) this.j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.j.offsetTo(0, 0);
                this.f625c.c(min, min2);
                if (!this.g) {
                    this.f625c.j(min, min2);
                } else if (!this.f625c.b()) {
                    this.f625c.j(min, min2);
                    this.f625c.i();
                }
                this.f625c.d(canvas, colorFilter, this.j);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f625c.f648b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f625c.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f627e;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f624b != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f624b.getConstantState());
        }
        this.f625c.f647a = getChangingConfigurations();
        return this.f625c;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f625c.f648b.j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f625c.f648b.i;
    }

    public int getOpacity() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* access modifiers changed from: package-private */
    public void h(boolean z) {
        this.g = z;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f625c.f651e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f625c.f649c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f625c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f624b
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            a.r.a.a.h$h r0 = r1.f625c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0028
            a.r.a.a.h$h r0 = r1.f625c
            android.content.res.ColorStateList r0 = r0.f649c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r.a.a.h.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public Drawable mutate() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f628f && super.mutate() == this) {
            this.f625c = new C0029h(this.f625c);
            this.f628f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0029h hVar = this.f625c;
        ColorStateList colorStateList = hVar.f649c;
        if (!(colorStateList == null || (mode = hVar.f650d) == null)) {
            this.f626d = j(this.f626d, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f625c.f648b.getRootAlpha() != i2) {
            this.f625c.f648b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.f625c.f651e = z;
        }
    }

    public void setTint(int i2) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        C0029h hVar = this.f625c;
        if (hVar.f649c != colorStateList) {
            hVar.f649c = colorStateList;
            this.f626d = j(this.f626d, colorStateList, hVar.f650d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        C0029h hVar = this.f625c;
        if (hVar.f650d != mode) {
            hVar.f650d = mode;
            this.f626d = j(this.f626d, hVar.f649c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f653a;

        public i(Drawable.ConstantState constantState) {
            this.f653a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f653a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f653a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f624b = (VectorDrawable) this.f653a.newDrawable();
            return hVar;
        }

        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f624b = (VectorDrawable) this.f653a.newDrawable(resources);
            return hVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f624b = (VectorDrawable) this.f653a.newDrawable(resources, theme);
            return hVar;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f627e = colorFilter;
        invalidateSelf();
    }

    /* compiled from: VectorDrawableCompat */
    private static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected b.C0006b[] f637a = null;

        /* renamed from: b  reason: collision with root package name */
        String f638b;

        /* renamed from: c  reason: collision with root package name */
        int f639c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f640d;

        public f() {
            super();
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            b.C0006b[] bVarArr = this.f637a;
            if (bVarArr != null) {
                b.C0006b.e(bVarArr, path);
            }
        }

        public b.C0006b[] getPathData() {
            return this.f637a;
        }

        public String getPathName() {
            return this.f638b;
        }

        public void setPathData(b.C0006b[] bVarArr) {
            if (!a.h.e.b.b(this.f637a, bVarArr)) {
                this.f637a = a.h.e.b.f(bVarArr);
            } else {
                a.h.e.b.j(this.f637a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f638b = fVar.f638b;
            this.f640d = fVar.f640d;
            this.f637a = a.h.e.b.f(fVar.f637a);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0029h hVar = this.f625c;
        hVar.f648b = new g();
        TypedArray k2 = androidx.core.content.c.g.k(resources, theme, attributeSet, a.f603a);
        i(k2, xmlPullParser, theme);
        k2.recycle();
        hVar.f647a = getChangingConfigurations();
        hVar.k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f626d = j(this.f626d, hVar.f649c, hVar.f650d);
    }

    h(C0029h hVar) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f625c = hVar;
        this.f626d = j(this.f626d, hVar.f649c, hVar.f650d);
    }

    /* compiled from: VectorDrawableCompat */
    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f629e;

        /* renamed from: f  reason: collision with root package name */
        androidx.core.content.c.b f630f;
        float g = 0.0f;
        androidx.core.content.c.b h;
        float i = 1.0f;
        float j = 1.0f;
        float k = 0.0f;
        float l = 1.0f;
        float m = 0.0f;
        Paint.Cap n = Paint.Cap.BUTT;
        Paint.Join o = Paint.Join.MITER;
        float p = 4.0f;

        c() {
        }

        private Paint.Cap e(int i2, Paint.Cap cap) {
            if (i2 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i2 != 1) {
                return i2 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join f(int i2, Paint.Join join) {
            if (i2 == 0) {
                return Paint.Join.MITER;
            }
            if (i2 != 1) {
                return i2 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f629e = null;
            if (androidx.core.content.c.g.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f638b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f637a = a.h.e.b.d(string2);
                }
                Resources.Theme theme2 = theme;
                this.h = androidx.core.content.c.g.e(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.j = androidx.core.content.c.g.f(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
                this.n = e(androidx.core.content.c.g.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.o = f(androidx.core.content.c.g.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = androidx.core.content.c.g.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.f630f = androidx.core.content.c.g.e(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.i = androidx.core.content.c.g.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.i);
                this.g = androidx.core.content.c.g.f(typedArray, xmlPullParser, "strokeWidth", 4, this.g);
                this.l = androidx.core.content.c.g.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
                this.m = androidx.core.content.c.g.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
                this.k = androidx.core.content.c.g.f(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
                this.f639c = androidx.core.content.c.g.g(typedArray, xmlPullParser, "fillType", 13, this.f639c);
            }
        }

        public boolean a() {
            return this.h.i() || this.f630f.i();
        }

        public boolean b(int[] iArr) {
            return this.f630f.j(iArr) | this.h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k2 = androidx.core.content.c.g.k(resources, theme, attributeSet, a.f605c);
            h(k2, xmlPullParser, theme);
            k2.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.h.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f630f.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f2) {
            this.j = f2;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i2) {
            this.h.k(i2);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f2) {
            this.i = f2;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i2) {
            this.f630f.k(i2);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f2) {
            this.g = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f2) {
            this.k = f2;
        }

        c(c cVar) {
            super(cVar);
            this.f629e = cVar.f629e;
            this.f630f = cVar.f630f;
            this.g = cVar.g;
            this.i = cVar.i;
            this.h = cVar.h;
            this.f639c = cVar.f639c;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static class g {
        private static final Matrix q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f641a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f642b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f643c;

        /* renamed from: d  reason: collision with root package name */
        Paint f644d;

        /* renamed from: e  reason: collision with root package name */
        Paint f645e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f646f;
        private int g;
        final d h;
        float i;
        float j;
        float k;
        float l;
        int m;
        String n;
        Boolean o;
        final a.e.a<String, Object> p;

        public g() {
            this.f643c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new a.e.a<>();
            this.h = new d();
            this.f641a = new Path();
            this.f642b = new Path();
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            dVar.f631a.set(matrix);
            dVar.f631a.preConcat(dVar.j);
            canvas.save();
            for (int i4 = 0; i4 < dVar.f632b.size(); i4++) {
                e eVar = dVar.f632b.get(i4);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f631a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = ((float) i2) / this.k;
            float f3 = ((float) i3) / this.l;
            float min = Math.min(f2, f3);
            Matrix matrix = dVar.f631a;
            this.f643c.set(matrix);
            this.f643c.postScale(f2, f3);
            float e2 = e(matrix);
            if (e2 != 0.0f) {
                fVar.d(this.f641a);
                Path path = this.f641a;
                this.f642b.reset();
                if (fVar.c()) {
                    this.f642b.setFillType(fVar.f639c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f642b.addPath(path, this.f643c);
                    canvas.clipPath(this.f642b);
                    return;
                }
                c cVar = (c) fVar;
                if (!(cVar.k == 0.0f && cVar.l == 1.0f)) {
                    float f4 = cVar.k;
                    float f5 = cVar.m;
                    float f6 = (f4 + f5) % 1.0f;
                    float f7 = (cVar.l + f5) % 1.0f;
                    if (this.f646f == null) {
                        this.f646f = new PathMeasure();
                    }
                    this.f646f.setPath(this.f641a, false);
                    float length = this.f646f.getLength();
                    float f8 = f6 * length;
                    float f9 = f7 * length;
                    path.reset();
                    if (f8 > f9) {
                        this.f646f.getSegment(f8, length, path, true);
                        this.f646f.getSegment(0.0f, f9, path, true);
                    } else {
                        this.f646f.getSegment(f8, f9, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f642b.addPath(path, this.f643c);
                if (cVar.h.l()) {
                    androidx.core.content.c.b bVar = cVar.h;
                    if (this.f645e == null) {
                        Paint paint = new Paint(1);
                        this.f645e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f645e;
                    if (bVar.h()) {
                        Shader f10 = bVar.f();
                        f10.setLocalMatrix(this.f643c);
                        paint2.setShader(f10);
                        paint2.setAlpha(Math.round(cVar.j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(h.a(bVar.e(), cVar.j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f642b.setFillType(cVar.f639c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f642b, paint2);
                }
                if (cVar.f630f.l()) {
                    androidx.core.content.c.b bVar2 = cVar.f630f;
                    if (this.f644d == null) {
                        Paint paint3 = new Paint(1);
                        this.f644d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f644d;
                    Paint.Join join = cVar.o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.p);
                    if (bVar2.h()) {
                        Shader f11 = bVar2.f();
                        f11.setLocalMatrix(this.f643c);
                        paint4.setShader(f11);
                        paint4.setAlpha(Math.round(cVar.i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(h.a(bVar2.e(), cVar.i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.g * min * e2);
                    canvas.drawPath(this.f642b, paint4);
                }
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            c(this.h, q, canvas, i2, i3, colorFilter);
        }

        public boolean f() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.h.a());
            }
            return this.o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.h.b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.m = i2;
        }

        public g(g gVar) {
            this.f643c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            a.e.a<String, Object> aVar = new a.e.a<>();
            this.p = aVar;
            this.h = new d(gVar.h, aVar);
            this.f641a = new Path(gVar.f641a);
            this.f642b = new Path(gVar.f642b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.g = gVar.g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = gVar.o;
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f631a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f632b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        float f633c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        private float f634d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        private float f635e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        private float f636f = 1.0f;
        private float g = 1.0f;
        private float h = 0.0f;
        private float i = 0.0f;
        final Matrix j = new Matrix();
        int k;
        private int[] l;
        private String m = null;

        public d(d dVar, a.e.a<String, Object> aVar) {
            super();
            f fVar;
            this.f633c = dVar.f633c;
            this.f634d = dVar.f634d;
            this.f635e = dVar.f635e;
            this.f636f = dVar.f636f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.j.set(dVar.j);
            ArrayList<e> arrayList = dVar.f632b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.f632b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f632b.add(fVar);
                    String str2 = fVar.f638b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        private void d() {
            this.j.reset();
            this.j.postTranslate(-this.f634d, -this.f635e);
            this.j.postScale(this.f636f, this.g);
            this.j.postRotate(this.f633c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.f634d, this.i + this.f635e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.f633c = androidx.core.content.c.g.f(typedArray, xmlPullParser, "rotation", 5, this.f633c);
            this.f634d = typedArray.getFloat(1, this.f634d);
            this.f635e = typedArray.getFloat(2, this.f635e);
            this.f636f = androidx.core.content.c.g.f(typedArray, xmlPullParser, "scaleX", 3, this.f636f);
            this.g = androidx.core.content.c.g.f(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = androidx.core.content.c.g.f(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = androidx.core.content.c.g.f(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            d();
        }

        public boolean a() {
            for (int i2 = 0; i2 < this.f632b.size(); i2++) {
                if (this.f632b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.f632b.size(); i2++) {
                z |= this.f632b.get(i2).b(iArr);
            }
            return z;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k2 = androidx.core.content.c.g.k(resources, theme, attributeSet, a.f604b);
            e(k2, xmlPullParser);
            k2.recycle();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.f634d;
        }

        public float getPivotY() {
            return this.f635e;
        }

        public float getRotation() {
            return this.f633c;
        }

        public float getScaleX() {
            return this.f636f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f634d) {
                this.f634d = f2;
                d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f635e) {
                this.f635e = f2;
                d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f633c) {
                this.f633c = f2;
                d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f636f) {
                this.f636f = f2;
                d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.g) {
                this.g = f2;
                d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.h) {
                this.h = f2;
                d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.i) {
                this.i = f2;
                d();
            }
        }

        public d() {
            super();
        }
    }
}
