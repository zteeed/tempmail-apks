package a.r.a.a;

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
    private C0028b f609c;

    /* renamed from: d  reason: collision with root package name */
    private Context f610d;

    /* renamed from: e  reason: collision with root package name */
    private ArgbEvaluator f611e;

    /* renamed from: f  reason: collision with root package name */
    final Drawable.Callback f612f;

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

    /* renamed from: a.r.a.a.b$b  reason: collision with other inner class name */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C0028b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f614a;

        /* renamed from: b  reason: collision with root package name */
        h f615b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f616c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f617d;

        /* renamed from: e  reason: collision with root package name */
        a.e.a<Animator, String> f618e;

        public C0028b(Context context, C0028b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f614a = bVar.f614a;
                h hVar = bVar.f615b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.f615b = (h) constantState.newDrawable(resources);
                    } else {
                        this.f615b = (h) constantState.newDrawable();
                    }
                    h hVar2 = this.f615b;
                    hVar2.mutate();
                    h hVar3 = hVar2;
                    this.f615b = hVar3;
                    hVar3.setCallback(callback);
                    this.f615b.setBounds(bVar.f615b.getBounds());
                    this.f615b.h(false);
                }
                ArrayList<Animator> arrayList = bVar.f617d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f617d = new ArrayList<>(size);
                    this.f618e = new a.e.a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f617d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f618e.get(animator);
                        clone.setTarget(this.f615b.d(str));
                        this.f617d.add(clone);
                        this.f618e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f616c == null) {
                this.f616c = new AnimatorSet();
            }
            this.f616c.playTogether(this.f617d);
        }

        public int getChangingConfigurations() {
            return this.f614a;
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
        animator.setTarget(this.f609c.f615b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        C0028b bVar = this.f609c;
        if (bVar.f617d == null) {
            bVar.f617d = new ArrayList<>();
            this.f609c.f618e = new a.e.a<>();
        }
        this.f609c.f617d.add(animator);
        this.f609c.f618e.put(animator, str);
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
                if (this.f611e == null) {
                    this.f611e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f611e);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f609c.f615b.draw(canvas);
        if (this.f609c.f616c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f609c.f615b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f609c.f614a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f609c.f615b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f624b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f624b.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f609c.f615b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f609c.f615b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f609c.f615b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f624b;
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
                    TypedArray k = g.k(resources, theme, attributeSet, a.f607e);
                    int resourceId = k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h b2 = h.b(resources, resourceId, theme);
                        b2.h(false);
                        b2.setCallback(this.f612f);
                        h hVar = this.f609c.f615b;
                        if (hVar != null) {
                            hVar.setCallback((Drawable.Callback) null);
                        }
                        this.f609c.f615b = b2;
                    }
                    k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f608f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f610d;
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
        this.f609c.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f609c.f615b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f609c.f616c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f609c.f615b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f609c.f615b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f609c.f615b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f609c.f615b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f609c.f615b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.f609c.f615b.setAutoMirrored(z);
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i);
        } else {
            this.f609c.f615b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f609c.f615b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f609c.f615b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f609c.f615b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f609c.f616c.isStarted()) {
            this.f609c.f616c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f609c.f616c.end();
        }
    }

    private b(Context context) {
        this(context, (C0028b) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f624b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f609c.f615b.setColorFilter(colorFilter);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat */
    private static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f619a;

        public c(Drawable.ConstantState constantState) {
            this.f619a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f619a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f619a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            b bVar = new b();
            Drawable newDrawable = this.f619a.newDrawable();
            bVar.f624b = newDrawable;
            newDrawable.setCallback(bVar.f612f);
            return bVar;
        }

        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable newDrawable = this.f619a.newDrawable(resources);
            bVar.f624b = newDrawable;
            newDrawable.setCallback(bVar.f612f);
            return bVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable newDrawable = this.f619a.newDrawable(resources, theme);
            bVar.f624b = newDrawable;
            newDrawable.setCallback(bVar.f612f);
            return bVar;
        }
    }

    private b(Context context, C0028b bVar, Resources resources) {
        this.f611e = null;
        this.f612f = new a();
        this.f610d = context;
        if (bVar != null) {
            this.f609c = bVar;
        } else {
            this.f609c = new C0028b(context, bVar, this.f612f, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
