package androidx.appcompat.widget;

import a.e.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AppCompatDrawableManager */
public final class f {
    private static final PorterDuff.Mode g = PorterDuff.Mode.SRC_IN;
    private static f h;
    private static final c i = new c(6);
    private static final int[] j = {a.a.e.abc_textfield_search_default_mtrl_alpha, a.a.e.abc_textfield_default_mtrl_alpha, a.a.e.abc_ab_share_pack_mtrl_alpha};
    private static final int[] k = {a.a.e.abc_ic_commit_search_api_mtrl_alpha, a.a.e.abc_seekbar_tick_mark_material, a.a.e.abc_ic_menu_share_mtrl_alpha, a.a.e.abc_ic_menu_copy_mtrl_am_alpha, a.a.e.abc_ic_menu_cut_mtrl_alpha, a.a.e.abc_ic_menu_selectall_mtrl_alpha, a.a.e.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] l = {a.a.e.abc_textfield_activated_mtrl_alpha, a.a.e.abc_textfield_search_activated_mtrl_alpha, a.a.e.abc_cab_background_top_mtrl_alpha, a.a.e.abc_text_cursor_material, a.a.e.abc_text_select_handle_left_mtrl_dark, a.a.e.abc_text_select_handle_middle_mtrl_dark, a.a.e.abc_text_select_handle_right_mtrl_dark, a.a.e.abc_text_select_handle_left_mtrl_light, a.a.e.abc_text_select_handle_middle_mtrl_light, a.a.e.abc_text_select_handle_right_mtrl_light};
    private static final int[] m = {a.a.e.abc_popup_background_mtrl_mult, a.a.e.abc_cab_background_internal_bg, a.a.e.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] n = {a.a.e.abc_tab_indicator_material, a.a.e.abc_textfield_search_material};
    private static final int[] o = {a.a.e.abc_btn_check_material, a.a.e.abc_btn_radio_material};

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, h<ColorStateList>> f1128a;

    /* renamed from: b  reason: collision with root package name */
    private a.e.a<String, d> f1129b;

    /* renamed from: c  reason: collision with root package name */
    private h<String> f1130c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, a.e.d<WeakReference<Drawable.ConstantState>>> f1131d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f1132e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1133f;

    /* compiled from: AppCompatDrawableManager */
    static class a implements d {
        a() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return a.a.l.a.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    /* compiled from: AppCompatDrawableManager */
    private static class b implements d {
        b() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return a.r.a.a.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* compiled from: AppCompatDrawableManager */
    private static class c extends a.e.e<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        private static int j(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter k(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) d(Integer.valueOf(j(i, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter l(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) e(Integer.valueOf(j(i, mode)), porterDuffColorFilter);
        }
    }

    /* compiled from: AppCompatDrawableManager */
    private interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: AppCompatDrawableManager */
    private static class e implements d {
        e() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return a.r.a.a.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    private static void A(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (o.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = g;
        }
        drawable.setColorFilter(r(i2, mode));
    }

    private Drawable B(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList s = s(context, i2);
        if (s != null) {
            if (o.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = androidx.core.graphics.drawable.a.r(drawable);
            androidx.core.graphics.drawable.a.o(r, s);
            PorterDuff.Mode u = u(i2);
            if (u == null) {
                return r;
            }
            androidx.core.graphics.drawable.a.p(r, u);
            return r;
        } else if (i2 == a.a.e.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            A(layerDrawable.findDrawableByLayerId(16908288), w.b(context, a.a.a.colorControlNormal), g);
            A(layerDrawable.findDrawableByLayerId(16908303), w.b(context, a.a.a.colorControlNormal), g);
            A(layerDrawable.findDrawableByLayerId(16908301), w.b(context, a.a.a.colorControlActivated), g);
            return drawable;
        } else if (i2 == a.a.e.abc_ratingbar_material || i2 == a.a.e.abc_ratingbar_indicator_material || i2 == a.a.e.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            A(layerDrawable2.findDrawableByLayerId(16908288), w.a(context, a.a.a.colorControlNormal), g);
            A(layerDrawable2.findDrawableByLayerId(16908303), w.b(context, a.a.a.colorControlActivated), g);
            A(layerDrawable2.findDrawableByLayerId(16908301), w.b(context, a.a.a.colorControlActivated), g);
            return drawable;
        } else if (D(context, i2, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    static void C(Drawable drawable, z zVar, int[] iArr) {
        if (!o.a(drawable) || drawable.mutate() == drawable) {
            if (zVar.f1208d || zVar.f1207c) {
                drawable.setColorFilter(m(zVar.f1208d ? zVar.f1205a : null, zVar.f1207c ? zVar.f1206b : g, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean D(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = g
            int[] r1 = j
            boolean r1 = d(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0015
            int r2 = a.a.a.colorControlNormal
        L_0x0012:
            r7 = -1
        L_0x0013:
            r1 = 1
            goto L_0x0042
        L_0x0015:
            int[] r1 = l
            boolean r1 = d(r1, r7)
            if (r1 == 0) goto L_0x0020
            int r2 = a.a.a.colorControlActivated
            goto L_0x0012
        L_0x0020:
            int[] r1 = m
            boolean r1 = d(r1, r7)
            if (r1 == 0) goto L_0x002b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0012
        L_0x002b:
            int r1 = a.a.e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L_0x003a
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            goto L_0x0013
        L_0x003a:
            int r1 = a.a.e.abc_dialog_material_background
            if (r7 != r1) goto L_0x003f
            goto L_0x0012
        L_0x003f:
            r7 = -1
            r1 = 0
            r2 = 0
        L_0x0042:
            if (r1 == 0) goto L_0x005f
            boolean r1 = androidx.appcompat.widget.o.a(r8)
            if (r1 == 0) goto L_0x004e
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x004e:
            int r6 = androidx.appcompat.widget.w.b(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = r(r6, r0)
            r8.setColorFilter(r6)
            if (r7 == r3) goto L_0x005e
            r8.setAlpha(r7)
        L_0x005e:
            return r5
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f.D(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    private void a(String str, d dVar) {
        if (this.f1129b == null) {
            this.f1129b = new a.e.a<>();
        }
        this.f1129b.put(str, dVar);
    }

    private synchronized boolean b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        a.e.d dVar = this.f1131d.get(context);
        if (dVar == null) {
            dVar = new a.e.d();
            this.f1131d.put(context, dVar);
        }
        dVar.n(j2, new WeakReference(constantState));
        return true;
    }

    private void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.f1128a == null) {
            this.f1128a = new WeakHashMap<>();
        }
        h hVar = this.f1128a.get(context);
        if (hVar == null) {
            hVar = new h();
            this.f1128a.put(context, hVar);
        }
        hVar.b(i2, colorStateList);
    }

    private static boolean d(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private void e(Context context) {
        if (!this.f1133f) {
            this.f1133f = true;
            Drawable p = p(context, a.a.e.abc_vector_test);
            if (p == null || !w(p)) {
                this.f1133f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private ColorStateList f(Context context) {
        return g(context, 0);
    }

    private ColorStateList g(Context context, int i2) {
        int b2 = w.b(context, a.a.a.colorControlHighlight);
        int a2 = w.a(context, a.a.a.colorButtonNormal);
        return new ColorStateList(new int[][]{w.f1196b, w.f1198d, w.f1197c, w.f1200f}, new int[]{a2, a.h.e.a.b(b2, i2), a.h.e.a.b(b2, i2), i2});
    }

    private static long h(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private ColorStateList i(Context context) {
        return g(context, w.b(context, a.a.a.colorAccent));
    }

    private ColorStateList j(Context context) {
        return g(context, w.b(context, a.a.a.colorButtonNormal));
    }

    private Drawable k(Context context, int i2) {
        if (this.f1132e == null) {
            this.f1132e = new TypedValue();
        }
        TypedValue typedValue = this.f1132e;
        context.getResources().getValue(i2, typedValue, true);
        long h2 = h(typedValue);
        Drawable o2 = o(context, h2);
        if (o2 != null) {
            return o2;
        }
        if (i2 == a.a.e.abc_cab_background_top_material) {
            o2 = new LayerDrawable(new Drawable[]{p(context, a.a.e.abc_cab_background_internal_bg), p(context, a.a.e.abc_cab_background_top_mtrl_alpha)});
        }
        if (o2 != null) {
            o2.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, h2, o2);
        }
        return o2;
    }

    private ColorStateList l(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d2 = w.d(context, a.a.a.colorSwitchThumbNormal);
        if (d2 == null || !d2.isStateful()) {
            iArr[0] = w.f1196b;
            iArr2[0] = w.a(context, a.a.a.colorSwitchThumbNormal);
            iArr[1] = w.f1199e;
            iArr2[1] = w.b(context, a.a.a.colorControlActivated);
            iArr[2] = w.f1200f;
            iArr2[2] = w.b(context, a.a.a.colorSwitchThumbNormal);
        } else {
            iArr[0] = w.f1196b;
            iArr2[0] = d2.getColorForState(iArr[0], 0);
            iArr[1] = w.f1199e;
            iArr2[1] = w.b(context, a.a.a.colorControlActivated);
            iArr[2] = w.f1200f;
            iArr2[2] = d2.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    private static PorterDuffColorFilter m(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return r(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized f n() {
        f fVar;
        synchronized (f.class) {
            if (h == null) {
                f fVar2 = new f();
                h = fVar2;
                v(fVar2);
            }
            fVar = h;
        }
        return fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable o(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, a.e.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1131d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            a.e.d r0 = (a.e.d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.i(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.f(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f.o(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter r(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter k2;
        synchronized (f.class) {
            k2 = i.k(i2, mode);
            if (k2 == null) {
                k2 = new PorterDuffColorFilter(i2, mode);
                i.l(i2, mode, k2);
            }
        }
        return k2;
    }

    private ColorStateList t(Context context, int i2) {
        h hVar;
        WeakHashMap<Context, h<ColorStateList>> weakHashMap = this.f1128a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.f(i2);
    }

    static PorterDuff.Mode u(int i2) {
        if (i2 == a.a.e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    private static void v(f fVar) {
        if (Build.VERSION.SDK_INT < 24) {
            fVar.a("vector", new e());
            fVar.a("animated-vector", new b());
            fVar.a("animated-selector", new a());
        }
    }

    private static boolean w(Drawable drawable) {
        return (drawable instanceof a.r.a.a.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable x(android.content.Context r11, int r12) {
        /*
            r10 = this;
            a.e.a<java.lang.String, androidx.appcompat.widget.f$d> r0 = r10.f1129b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            a.e.h<java.lang.String> r0 = r10.f1130c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.f(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            a.e.a<java.lang.String, androidx.appcompat.widget.f$d> r3 = r10.f1129b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            a.e.h r0 = new a.e.h
            r0.<init>()
            r10.f1130c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1132e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1132e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1132e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = h(r0)
            android.graphics.drawable.Drawable r6 = r10.o(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            a.e.h<java.lang.String> r8 = r10.f1130c     // Catch:{ Exception -> 0x00a2 }
            r8.b(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            a.e.a<java.lang.String, androidx.appcompat.widget.f$d> r8 = r10.f1129b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.f$d r3 = (androidx.appcompat.widget.f.d) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "AppCompatDrawableManag"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            a.e.h<java.lang.String> r11 = r10.f1130c
            r11.b(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f.x(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public synchronized Drawable p(Context context, int i2) {
        return q(context, i2, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable q(Context context, int i2, boolean z) {
        Drawable x;
        e(context);
        x = x(context, i2);
        if (x == null) {
            x = k(context, i2);
        }
        if (x == null) {
            x = androidx.core.content.a.f(context, i2);
        }
        if (x != null) {
            x = B(context, i2, z, x);
        }
        if (x != null) {
            o.b(x);
        }
        return x;
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList s(Context context, int i2) {
        ColorStateList t;
        t = t(context, i2);
        if (t == null) {
            if (i2 == a.a.e.abc_edit_text_material) {
                t = a.a.k.a.a.c(context, a.a.c.abc_tint_edittext);
            } else if (i2 == a.a.e.abc_switch_track_mtrl_alpha) {
                t = a.a.k.a.a.c(context, a.a.c.abc_tint_switch_track);
            } else if (i2 == a.a.e.abc_switch_thumb_material) {
                t = l(context);
            } else if (i2 == a.a.e.abc_btn_default_mtrl_shape) {
                t = j(context);
            } else if (i2 == a.a.e.abc_btn_borderless_material) {
                t = f(context);
            } else if (i2 == a.a.e.abc_btn_colored_material) {
                t = i(context);
            } else {
                if (i2 != a.a.e.abc_spinner_mtrl_am_alpha) {
                    if (i2 != a.a.e.abc_spinner_textfield_background_material) {
                        if (d(k, i2)) {
                            t = w.d(context, a.a.a.colorControlNormal);
                        } else if (d(n, i2)) {
                            t = a.a.k.a.a.c(context, a.a.c.abc_tint_default);
                        } else if (d(o, i2)) {
                            t = a.a.k.a.a.c(context, a.a.c.abc_tint_btn_checkable);
                        } else if (i2 == a.a.e.abc_seekbar_thumb_material) {
                            t = a.a.k.a.a.c(context, a.a.c.abc_tint_seek_thumb);
                        }
                    }
                }
                t = a.a.k.a.a.c(context, a.a.c.abc_tint_spinner);
            }
            if (t != null) {
                c(context, i2, t);
            }
        }
        return t;
    }

    public synchronized void y(Context context) {
        a.e.d dVar = this.f1131d.get(context);
        if (dVar != null) {
            dVar.c();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable z(Context context, g0 g0Var, int i2) {
        Drawable x = x(context, i2);
        if (x == null) {
            x = g0Var.c(i2);
        }
        if (x == null) {
            return null;
        }
        return B(context, i2, false, x);
    }
}
