package a.h.k;

import a.h.k.a;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewCompat */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private static Field f408a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f409b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f410c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f411d;

    /* renamed from: e  reason: collision with root package name */
    private static WeakHashMap<View, String> f412e;

    /* renamed from: f  reason: collision with root package name */
    private static WeakHashMap<View, x> f413f = null;
    private static Field g;
    private static boolean h = false;
    private static ThreadLocal<Rect> i;

    /* compiled from: ViewCompat */
    static class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f414a;

        a(q qVar) {
            this.f414a = qVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) b0.i(this.f414a.a(view, b0.j(windowInsets)));
        }
    }

    /* compiled from: ViewCompat */
    static class b extends f<Boolean> {
        b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Boolean c(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }
    }

    /* compiled from: ViewCompat */
    static class c extends f<CharSequence> {
        c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public CharSequence c(View view) {
            return view.getAccessibilityPaneTitle();
        }
    }

    /* compiled from: ViewCompat */
    static class d extends f<Boolean> {
        d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Boolean c(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }
    }

    /* compiled from: ViewCompat */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f415b = new WeakHashMap<>();

        e() {
        }

        private void a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    t.M(view, 16);
                }
                this.f415b.put(view, Boolean.valueOf(z2));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
            for (Map.Entry next : this.f415b.entrySet()) {
                a((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewCompat */
    static abstract class f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f416a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f417b;

        /* renamed from: c  reason: collision with root package name */
        private final int f418c;

        f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f418c;
        }

        /* access modifiers changed from: package-private */
        public abstract T c(View view);

        /* access modifiers changed from: package-private */
        public T d(View view) {
            if (b()) {
                return c(view);
            }
            if (!a()) {
                return null;
            }
            T tag = view.getTag(this.f416a);
            if (this.f417b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        f(int i, Class<T> cls, int i2, int i3) {
            this.f416a = i;
            this.f417b = cls;
            this.f418c = i3;
        }
    }

    /* compiled from: ViewCompat */
    public interface g {
        boolean a(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat */
    static class h {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f419d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f420a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f421b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<KeyEvent> f422c = null;

        h() {
        }

        static h a(View view) {
            h hVar = (h) view.getTag(a.h.c.tag_unhandled_key_event_manager);
            if (hVar != null) {
                return hVar;
            }
            h hVar2 = new h();
            view.setTag(a.h.c.tag_unhandled_key_event_manager, hVar2);
            return hVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f420a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c2 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c2 != null) {
                            return c2;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f421b == null) {
                this.f421b = new SparseArray<>();
            }
            return this.f421b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a.h.c.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((g) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f420a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f419d.isEmpty()) {
                synchronized (f419d) {
                    if (this.f420a == null) {
                        this.f420a = new WeakHashMap<>();
                    }
                    for (int size = f419d.size() - 1; size >= 0; size--) {
                        View view = (View) f419d.get(size).get();
                        if (view == null) {
                            f419d.remove(size);
                        } else {
                            this.f420a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f420a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c2 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c2));
                }
            }
            return c2 != null;
        }

        /* access modifiers changed from: package-private */
        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f422c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f422c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d2 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d2.valueAt(indexOfKey);
                d2.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d2.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && t.H(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    static {
        new AtomicInteger(1);
        new e();
    }

    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static float B(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static boolean C(View view) {
        return h(view) != null;
    }

    public static boolean D(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static boolean E(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean F(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static boolean G(View view) {
        Boolean d2 = a().d(view);
        if (d2 == null) {
            return false;
        }
        return d2.booleanValue();
    }

    public static boolean H(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean I(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean J(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof k) {
            return ((k) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean K(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static boolean L(View view) {
        Boolean d2 = Y().d(view);
        if (d2 == null) {
            return false;
        }
        return d2.booleanValue();
    }

    static void M(View view, int i2) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = j(view) != null;
            if (i(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i2);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void N(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
        } else if (i3 >= 21) {
            Rect p = p();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                p.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !p.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            c(view, i2);
            if (z && p.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(p);
            }
        } else {
            c(view, i2);
        }
    }

    public static void O(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
        } else if (i3 >= 21) {
            Rect p = p();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                p.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !p.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            d(view, i2);
            if (z && p.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(p);
            }
        } else {
            d(view, i2);
        }
    }

    public static b0 P(View view, b0 b0Var) {
        if (Build.VERSION.SDK_INT < 21) {
            return b0Var;
        }
        WindowInsets windowInsets = (WindowInsets) b0.i(b0Var);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!onApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return b0.j(windowInsets);
    }

    public static void Q(View view, a.h.k.c0.d dVar) {
        view.onInitializeAccessibilityNodeInfo(dVar.z0());
    }

    private static f<CharSequence> R() {
        return new c(a.h.c.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static boolean S(View view, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i2, bundle);
        }
        return false;
    }

    public static void T(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void U(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i2, i3, i4, i5);
        } else {
            view.postInvalidate(i2, i3, i4, i5);
        }
    }

    public static void V(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static void W(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    public static void X(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else if (i2 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    private static f<Boolean> Y() {
        return new b(a.h.c.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static void Z(View view, a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (h(view) instanceof a.C0012a)) {
            aVar = new a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.d();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    private static f<Boolean> a() {
        return new d(a.h.c.tag_accessibility_heading, Boolean.class, 28);
    }

    public static void a0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i2);
        }
    }

    public static x b(View view) {
        if (f413f == null) {
            f413f = new WeakHashMap<>();
        }
        x xVar = f413f.get(view);
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(view);
        f413f.put(view, xVar2);
        return xVar2;
    }

    public static void b0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    private static void c(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            s0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                s0((View) parent);
            }
        }
    }

    public static void c0(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof s) {
            ((s) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    private static void d(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            s0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                s0((View) parent);
            }
        }
    }

    public static void d0(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof s) {
            ((s) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static b0 e(View view, b0 b0Var) {
        if (Build.VERSION.SDK_INT < 21) {
            return b0Var;
        }
        WindowInsets windowInsets = (WindowInsets) b0.i(b0Var);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (!dispatchApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return b0.j(windowInsets);
    }

    public static void e0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return h.a(view).b(view, keyEvent);
    }

    public static void f0(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    static boolean g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return h.a(view).f(keyEvent);
    }

    @Deprecated
    public static void g0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    private static View.AccessibilityDelegate h(View view) {
        if (h) {
            return null;
        }
        if (g == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                h = true;
                return null;
            }
        }
        try {
            Object obj = g.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            h = true;
            return null;
        }
    }

    public static void h0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    public static int i(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static void i0(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 19) {
            view.setImportantForAccessibility(i2);
        } else if (i3 >= 16) {
            if (i2 == 4) {
                i2 = 2;
            }
            view.setImportantForAccessibility(i2);
        }
    }

    public static CharSequence j(View view) {
        return R().d(view);
    }

    public static void j0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i2);
        }
    }

    public static ColorStateList k(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof s) {
            return ((s) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void k0(View view, Paint paint) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
            return;
        }
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    public static PorterDuff.Mode l(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof s) {
            return ((s) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void l0(View view, q qVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (qVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            view.setOnApplyWindowInsetsListener(new a(qVar));
        }
    }

    public static Rect m(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static void m0(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i2, i3, i4, i5);
        } else {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    public static Display n(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (H(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static void n0(View view, r rVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (rVar != null ? rVar.a() : null));
        }
    }

    public static float o(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static void o0(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    private static Rect p() {
        if (i == null) {
            i = new ThreadLocal<>();
        }
        Rect rect = i.get();
        if (rect == null) {
            rect = new Rect();
            i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void p0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f412e == null) {
            f412e = new WeakHashMap<>();
        }
        f412e.put(view, str);
    }

    public static boolean q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    public static void q0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof k) {
            ((k) view).stopNestedScroll();
        }
    }

    public static int r(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static void r0(View view, int i2) {
        if (view instanceof j) {
            ((j) view).a(i2);
        } else if (i2 == 0) {
            q0(view);
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int s(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    private static void s0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static int t(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static int u(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f411d) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f410c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f411d = true;
        }
        Field field = f410c;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static int v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f409b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f408a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f409b = true;
        }
        Field field = f408a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static int w(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    public static int x(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    public static ViewParent y(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    public static String z(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f412e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }
}
