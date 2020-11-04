package a.h.k.c0;

import a.h.k.c0.g;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.ads.AdRequest;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AccessibilityNodeInfoCompat */
public class d {

    /* renamed from: d  reason: collision with root package name */
    private static int f377d;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f378a;

    /* renamed from: b  reason: collision with root package name */
    public int f379b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f380c = -1;

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static final a f381d = new a(1, (CharSequence) null);

        /* renamed from: e  reason: collision with root package name */
        public static final a f382e = new a(2, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f383f = new a(16, (CharSequence) null);

        /* renamed from: a  reason: collision with root package name */
        final Object f384a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<? extends g.a> f385b;

        /* renamed from: c  reason: collision with root package name */
        protected final g f386c;

        static {
            Class<g.c> cls = g.c.class;
            Class<g.b> cls2 = g.b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(4, (CharSequence) null);
            new a(8, (CharSequence) null);
            new a(32, (CharSequence) null);
            new a(64, (CharSequence) null);
            new a(128, (CharSequence) null);
            new a(256, (CharSequence) null, cls2);
            new a(AdRequest.MAX_CONTENT_URL_LENGTH, (CharSequence) null, cls2);
            new a(1024, (CharSequence) null, cls);
            new a(2048, (CharSequence) null, cls);
            new a(CodedOutputStream.DEFAULT_BUFFER_SIZE, (CharSequence) null);
            new a(8192, (CharSequence) null);
            new a(16384, (CharSequence) null);
            new a(32768, (CharSequence) null);
            new a(65536, (CharSequence) null);
            new a(131072, (CharSequence) null, g.C0015g.class);
            new a(262144, (CharSequence) null);
            new a(524288, (CharSequence) null);
            new a(1048576, (CharSequence) null);
            new a(2097152, (CharSequence) null, g.h.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (g) null, g.e.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (g) null, g.f.class);
            new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (g) null, g.d.class);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new a(accessibilityAction, 16908357, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
        }

        public a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (g) null, (Class<? extends g.a>) null);
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f384a).getId();
            }
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                a.h.k.c0.g r0 = r4.f386c
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends a.h.k.c0.g$a> r2 = r4.f385b
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                a.h.k.c0.g$a r1 = (a.h.k.c0.g.a) r1     // Catch:{ Exception -> 0x0020 }
                r1.a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends a.h.k.c0.g$a> r1 = r4.f385b
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                a.h.k.c0.g r6 = r4.f386c
                boolean r5 = r6.a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: a.h.k.c0.d.a.b(android.view.View, android.os.Bundle):boolean");
        }

        private a(int i, CharSequence charSequence, Class<? extends g.a> cls) {
            this((Object) null, i, charSequence, (g) null, cls);
        }

        a(Object obj, int i, CharSequence charSequence, g gVar, Class<? extends g.a> cls) {
            this.f386c = gVar;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.f384a = obj;
            } else {
                this.f384a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f385b = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f387a;

        b(Object obj) {
            this.f387a = obj;
        }

        public static b a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 21) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new b((Object) null);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final Object f388a;

        c(Object obj) {
            this.f388a = obj;
        }

        public static c a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new c((Object) null);
        }
    }

    private d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f378a = accessibilityNodeInfo;
    }

    public static d A0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new d(accessibilityNodeInfo);
    }

    public static d L() {
        return A0(AccessibilityNodeInfo.obtain());
    }

    public static d M(View view) {
        return A0(AccessibilityNodeInfo.obtain(view));
    }

    public static d N(d dVar) {
        return A0(AccessibilityNodeInfo.obtain(dVar.f378a));
    }

    private void R(View view) {
        SparseArray<WeakReference<ClickableSpan>> u = u(view);
        if (u != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < u.size(); i++) {
                if (u.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                u.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    private void T(int i, boolean z) {
        Bundle q = q();
        if (q != null) {
            int i2 = q.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            q.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    private void g() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f378a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f378a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f378a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f378a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private List<Integer> h(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f378a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f378a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String i(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case AdRequest.MAX_CONTENT_URL_LENGTH /*512*/:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case CodedOutputStream.DEFAULT_BUFFER_SIZE /*4096*/:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    public static ClickableSpan[] o(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> s(View view) {
        SparseArray<WeakReference<ClickableSpan>> u = u(view);
        if (u != null) {
            return u;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(a.h.c.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> u(View view) {
        return (SparseArray) view.getTag(a.h.c.tag_accessibility_clickable_spans);
    }

    private boolean x() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int y(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f377d;
        f377d = i2 + 1;
        return i2;
    }

    public boolean A() {
        return this.f378a.isCheckable();
    }

    public boolean B() {
        return this.f378a.isChecked();
    }

    public boolean C() {
        return this.f378a.isClickable();
    }

    public boolean D() {
        return this.f378a.isEnabled();
    }

    public boolean E() {
        return this.f378a.isFocusable();
    }

    public boolean F() {
        return this.f378a.isFocused();
    }

    public boolean G() {
        return this.f378a.isLongClickable();
    }

    public boolean H() {
        return this.f378a.isPassword();
    }

    public boolean I() {
        return this.f378a.isScrollable();
    }

    public boolean J() {
        return this.f378a.isSelected();
    }

    public boolean K() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f378a.isVisibleToUser();
        }
        return false;
    }

    public boolean O(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f378a.performAction(i, bundle);
        }
        return false;
    }

    public void P() {
        this.f378a.recycle();
    }

    public boolean Q(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f378a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f384a);
        }
        return false;
    }

    public void S(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f378a.setAccessibilityFocused(z);
        }
    }

    public void U(Rect rect) {
        this.f378a.setBoundsInParent(rect);
    }

    public void V(Rect rect) {
        this.f378a.setBoundsInScreen(rect);
    }

    public void W(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f378a.setCanOpenPopup(z);
        }
    }

    public void X(boolean z) {
        this.f378a.setCheckable(z);
    }

    public void Y(boolean z) {
        this.f378a.setChecked(z);
    }

    public void Z(CharSequence charSequence) {
        this.f378a.setClassName(charSequence);
    }

    public void a(int i) {
        this.f378a.addAction(i);
    }

    public void a0(boolean z) {
        this.f378a.setClickable(z);
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f378a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f384a);
        }
    }

    public void b0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f378a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f387a);
        }
    }

    public void c(View view) {
        this.f378a.addChild(view);
    }

    public void c0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f378a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f388a);
        }
    }

    public void d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f378a.addChild(view, i);
        }
    }

    public void d0(CharSequence charSequence) {
        this.f378a.setContentDescription(charSequence);
    }

    public void e0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f378a.setContentInvalid(z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f378a;
        if (accessibilityNodeInfo == null) {
            if (dVar.f378a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(dVar.f378a)) {
            return false;
        }
        return this.f380c == dVar.f380c && this.f379b == dVar.f379b;
    }

    public void f(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            g();
            R(view);
            ClickableSpan[] o = o(charSequence);
            if (o != null && o.length > 0) {
                q().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", a.h.c.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> s = s(view);
                int i2 = 0;
                while (o != null && i2 < o.length) {
                    int y = y(o[i2], s);
                    s.put(y, new WeakReference(o[i2]));
                    e(o[i2], (Spanned) charSequence, y);
                    i2++;
                }
            }
        }
    }

    public void f0(boolean z) {
        this.f378a.setEnabled(z);
    }

    public void g0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f378a.setError(charSequence);
        }
    }

    public void h0(boolean z) {
        this.f378a.setFocusable(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f378a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(boolean z) {
        this.f378a.setFocused(z);
    }

    public int j() {
        return this.f378a.getActions();
    }

    public void j0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f378a.setHeading(z);
        } else {
            T(2, z);
        }
    }

    public void k(Rect rect) {
        this.f378a.getBoundsInParent(rect);
    }

    public void k0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f378a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f378a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void l(Rect rect) {
        this.f378a.getBoundsInScreen(rect);
    }

    public void l0(boolean z) {
        this.f378a.setLongClickable(z);
    }

    public int m() {
        return this.f378a.getChildCount();
    }

    public void m0(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f378a.setMovementGranularities(i);
        }
    }

    public CharSequence n() {
        return this.f378a.getClassName();
    }

    public void n0(CharSequence charSequence) {
        this.f378a.setPackageName(charSequence);
    }

    public void o0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f378a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f378a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public CharSequence p() {
        return this.f378a.getContentDescription();
    }

    public void p0(View view) {
        this.f379b = -1;
        this.f378a.setParent(view);
    }

    public Bundle q() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f378a.getExtras();
        }
        return new Bundle();
    }

    public void q0(View view, int i) {
        this.f379b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f378a.setParent(view, i);
        }
    }

    public int r() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f378a.getMovementGranularities();
        }
        return 0;
    }

    public void r0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f378a.setScreenReaderFocusable(z);
        } else {
            T(1, z);
        }
    }

    public void s0(boolean z) {
        this.f378a.setScrollable(z);
    }

    public CharSequence t() {
        return this.f378a.getPackageName();
    }

    public void t0(boolean z) {
        this.f378a.setSelected(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        k(rect);
        sb.append("; boundsInParent: " + rect);
        l(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(t());
        sb.append("; className: ");
        sb.append(n());
        sb.append("; text: ");
        sb.append(v());
        sb.append("; contentDescription: ");
        sb.append(p());
        sb.append("; viewId: ");
        sb.append(w());
        sb.append("; checkable: ");
        sb.append(A());
        sb.append("; checked: ");
        sb.append(B());
        sb.append("; focusable: ");
        sb.append(E());
        sb.append("; focused: ");
        sb.append(F());
        sb.append("; selected: ");
        sb.append(J());
        sb.append("; clickable: ");
        sb.append(C());
        sb.append("; longClickable: ");
        sb.append(G());
        sb.append("; enabled: ");
        sb.append(D());
        sb.append("; password: ");
        sb.append(H());
        sb.append("; scrollable: " + I());
        sb.append("; [");
        int j = j();
        while (j != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(j);
            j &= ~numberOfTrailingZeros;
            sb.append(i(numberOfTrailingZeros));
            if (j != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void u0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f378a.setShowingHintText(z);
        } else {
            T(4, z);
        }
    }

    public CharSequence v() {
        if (!x()) {
            return this.f378a.getText();
        }
        List<Integer> h = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> h2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> h3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> h4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f378a.getText(), 0, this.f378a.getText().length()));
        for (int i = 0; i < h.size(); i++) {
            spannableString.setSpan(new a(h4.get(i).intValue(), this, q().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h.get(i).intValue(), h2.get(i).intValue(), h3.get(i).intValue());
        }
        return spannableString;
    }

    public void v0(View view) {
        this.f380c = -1;
        this.f378a.setSource(view);
    }

    public String w() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f378a.getViewIdResourceName();
        }
        return null;
    }

    public void w0(View view, int i) {
        this.f380c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f378a.setSource(view, i);
        }
    }

    public void x0(CharSequence charSequence) {
        this.f378a.setText(charSequence);
    }

    public void y0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f378a.setVisibleToUser(z);
        }
    }

    public boolean z() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f378a.isAccessibilityFocused();
        }
        return false;
    }

    public AccessibilityNodeInfo z0() {
        return this.f378a;
    }
}
