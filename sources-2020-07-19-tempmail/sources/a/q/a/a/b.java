package a.q.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.c.g;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedVectorDrawableCompat */
public class b extends g implements Animatable {

    /* renamed from: c  reason: collision with root package name */
    private C0028b f605c;

    /* renamed from: d  reason: collision with root package name */
    private Context f606d;

    /* renamed from: e  reason: collision with root package name */
    private ArgbEvaluator f607e;

    /* renamed from: f  reason: collision with root package name */
    final Drawable.Callback f608f;

    /* compiled from: AnimatedVectorDrawableCompat */
    class a implements Drawable.Callback {
        a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            b.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: a.q.a.a.b$b  reason: collision with other inner class name */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C0028b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f610a;

        /* renamed from: b  reason: collision with root package name */
        h f611b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f612c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f613d;

        /* renamed from: e  reason: collision with root package name */
        a.e.a<Animator, String> f614e;

        public C0028b(Context context, C0028b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f610a = bVar.f610a;
                h hVar = bVar.f611b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.f611b = (h) constantState.newDrawable(resources);
                    } else {
                        this.f611b = (h) constantState.newDrawable();
                    }
                    h hVar2 = this.f611b;
                    hVar2.mutate();
                    h hVar3 = hVar2;
                    this.f611b = hVar3;
                    hVar3.setCallback(callback);
                    this.f611b.setBounds(bVar.f611b.getBounds());
                    this.f611b.h(false);
                }
                ArrayList<Animator> arrayList = bVar.f613d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f613d = new ArrayList<>(size);
                    this.f614e = new a.e.a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f613d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f614e.get(animator);
                        clone.setTarget(this.f611b.d(str));
                        this.f613d.add(clone);
                        this.f614e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f612c == null) {
                this.f612c = new AnimatorSet();
            }
            this.f612c.playTogether(this.f613d);
        }

        public int getChangingConfigurations() {
            return this.f610a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    b() {
        this((Context) null, (C0028b) null, (Resources) null);
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f605c.f611b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        C0028b bVar = this.f605c;
        if (bVar.f613d == null) {
            bVar.f613d = new ArrayList<>();
            this.f605c.f614e = new a.e.a<>();
        }
        this.f605c.f613d.add(animator);
        this.f605c.f614e.put(animator, str);
    }

    private void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f607e == null) {
                    this.f607e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f607e);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f605c.f611b.draw(canvas);
        if (this.f605c.f612c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f605c.f611b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f605c.f610a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f605c.f611b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f620b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f620b.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f605c.f611b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f605c.f611b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f605c.f611b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray k = g.k(resources, theme, attributeSet, a.f603e);
                    int resourceId = k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h b2 = h.b(resources, resourceId, theme);
                        b2.h(false);
                        b2.setCallback(this.f608f);
                        h hVar = this.f605c.f611b;
                        if (hVar != null) {
                            hVar.setCallback((Drawable.Callback) null);
                        }
                        this.f605c.f611b = b2;
                    }
                    k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f604f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f606d;
                        if (context != null) {
                            b(string, d.i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f605c.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f605c.f611b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f605c.f612c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f605c.f611b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f605c.f611b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f605c.f611b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f605c.f611b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f605c.f611b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.f605c.f611b.setAutoMirrored(z);
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i);
        } else {
            this.f605c.f611b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f605c.f611b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f605c.f611b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f605c.f611b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f605c.f612c.isStarted()) {
            this.f605c.f612c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f605c.f612c.end();
        }
    }

    private b(Context context) {
        this(context, (C0028b) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f620b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f605c.f611b.setColorFilter(colorFilter);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat */
    private static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f615a;

        public c(Drawable.ConstantState constantState) {
            this.f615a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f615a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f615a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            b bVar = new b();
            Drawable newDrawable = this.f615a.newDrawable();
            bVar.f620b = newDrawable;
            newDrawable.setCallback(bVar.f608f);
            return bVar;
        }

        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable newDrawable = this.f615a.newDrawable(resources);
            bVar.f620b = newDrawable;
            newDrawable.setCallback(bVar.f608f);
            return bVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable newDrawable = this.f615a.newDrawable(resources, theme);
            bVar.f620b = newDrawable;
            newDrawable.setCallback(bVar.f608f);
            return bVar;
        }
    }

    private b(Context context, C0028b bVar, Resources resources) {
        this.f607e = null;
        this.f608f = new a();
        this.f606d = context;
        if (bVar != null) {
            this.f605c = bVar;
        } else {
            this.f605c = new C0028b(context, bVar, this.f608f, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
