package a.a.l.a;

import a.a.j;
import a.a.l.a.b;
import a.a.l.a.e;
import a.e.h;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedStateListDrawableCompat */
public class a extends e {
    private c p;
    private g q;
    private int r;
    private int s;
    private boolean t;

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Animatable f6a;

        b(Animatable animatable) {
            super();
            this.f6a = animatable;
        }

        public void c() {
            this.f6a.start();
        }

        public void d() {
            this.f6a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    static class c extends e.a {
        a.e.d<Long> K;
        h<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new a.e.d<>();
            this.L = new h<>();
        }

        private static long D(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: package-private */
        public int B(int[] iArr, Drawable drawable, int i) {
            int z = super.z(iArr, drawable);
            this.L.l(z, Integer.valueOf(i));
            return z;
        }

        /* access modifiers changed from: package-private */
        public int C(int i, int i2, Drawable drawable, boolean z) {
            int a2 = super.a(drawable);
            long D = D(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a2;
            this.K.b(D, Long.valueOf(j2 | j));
            if (z) {
                this.K.b(D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a2;
        }

        /* access modifiers changed from: package-private */
        public int E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.L.g(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        public int F(int[] iArr) {
            int A = super.A(iArr);
            if (A >= 0) {
                return A;
            }
            return super.A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        public int G(int i, int i2) {
            return (int) this.K.j(D(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        public boolean H(int i, int i2) {
            return (this.K.j(D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean I(int i, int i2) {
            return (this.K.j(D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new a(this, (Resources) null);
        }

        /* access modifiers changed from: package-private */
        public void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        private final a.q.a.a.b f7a;

        d(a.q.a.a.b bVar) {
            super();
            this.f7a = bVar;
        }

        public void c() {
            this.f7a.start();
        }

        public void d() {
            this.f7a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        private final ObjectAnimator f8a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f9b;

        e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.a());
            ofInt.setInterpolator(fVar);
            this.f9b = z2;
            this.f8a = ofInt;
        }

        public boolean a() {
            return this.f9b;
        }

        public void b() {
            this.f8a.reverse();
        }

        public void c() {
            this.f8a.start();
        }

        public void d() {
            this.f8a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        private int[] f10a;

        /* renamed from: b  reason: collision with root package name */
        private int f11b;

        /* renamed from: c  reason: collision with root package name */
        private int f12c;

        f(AnimationDrawable animationDrawable, boolean z) {
            b(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f12c;
        }

        /* access modifiers changed from: package-private */
        public int b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f11b = numberOfFrames;
            int[] iArr = this.f10a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f10a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f10a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f12c = i;
            return i;
        }

        public float getInterpolation(float f2) {
            int i = (int) ((f2 * ((float) this.f12c)) + 0.5f);
            int i2 = this.f11b;
            int[] iArr = this.f10a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f12c) : 0.0f);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    static {
        Class<a> cls = a.class;
    }

    public a() {
        this((c) null, (Resources) null);
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k = androidx.core.content.c.g.k(resources, theme, attributeSet, j.AnimatedStateListDrawableItem);
        int resourceId = k.getResourceId(j.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = k.getResourceId(j.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable d2 = resourceId2 > 0 ? a.a.k.a.a.d(context, resourceId2) : null;
        k.recycle();
        int[] k2 = k(attributeSet);
        if (d2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                d2 = a.q.a.a.h.c(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                d2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                d2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (d2 != null) {
            return this.p.B(k2, d2, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k = androidx.core.content.c.g.k(resources, theme, attributeSet, j.AnimatedStateListDrawableTransition);
        int resourceId = k.getResourceId(j.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = k.getResourceId(j.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = k.getResourceId(j.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable d2 = resourceId3 > 0 ? a.a.k.a.a.d(context, resourceId3) : null;
        boolean z = k.getBoolean(j.AnimatedStateListDrawableTransition_android_reversible, false);
        k.recycle();
        if (d2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                d2 = a.q.a.a.b.a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                d2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                d2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (d2 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.p.C(resourceId, resourceId2, d2, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    private boolean s(int i) {
        int i2;
        int G;
        g gVar;
        g gVar2 = this.q;
        if (gVar2 == null) {
            i2 = c();
        } else if (i == this.r) {
            return true;
        } else {
            if (i != this.s || !gVar2.a()) {
                i2 = this.r;
                gVar2.d();
            } else {
                gVar2.b();
                this.r = this.s;
                this.s = i;
                return true;
            }
        }
        this.q = null;
        this.s = -1;
        this.r = -1;
        c cVar = this.p;
        int E = cVar.E(i2);
        int E2 = cVar.E(i);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (current instanceof a.q.a.a.b) {
            gVar = new d((a.q.a.a.b) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new b((Animatable) current);
            }
            return false;
        }
        gVar.c();
        this.q = gVar;
        this.s = i2;
        this.r = i;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.p;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f23d |= typedArray.getChangingConfigurations();
        }
        cVar.x(typedArray.getBoolean(j.AnimatedStateListDrawableCompat_android_variablePadding, cVar.i));
        cVar.t(typedArray.getBoolean(j.AnimatedStateListDrawableCompat_android_constantSize, cVar.l));
        cVar.u(typedArray.getInt(j.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.A));
        cVar.v(typedArray.getInt(j.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.B));
        setDither(typedArray.getBoolean(j.AnimatedStateListDrawableCompat_android_dither, cVar.x));
    }

    /* access modifiers changed from: protected */
    public void h(b.c cVar) {
        super.h(cVar);
        if (cVar instanceof c) {
            this.p = (c) cVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.q;
        if (gVar != null) {
            gVar.d();
            this.q = null;
            g(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public c j() {
        return new c(this.p, this, (Resources) null);
    }

    public Drawable mutate() {
        if (!this.t) {
            super.mutate();
            if (this == this) {
                this.p.r();
                this.t = true;
            }
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray k = androidx.core.content.c.g.k(resources, theme, attributeSet, j.AnimatedStateListDrawableCompat);
        setVisible(k.getBoolean(j.AnimatedStateListDrawableCompat_android_visible, true), true);
        t(k);
        i(resources);
        k.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int F = this.p.F(iArr);
        boolean z = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.q != null && (visible || z2)) {
            if (z) {
                this.q.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    a(c cVar, Resources resources) {
        super((e.a) null);
        this.r = -1;
        this.s = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
