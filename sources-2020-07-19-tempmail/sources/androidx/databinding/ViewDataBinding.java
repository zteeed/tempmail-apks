package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.n;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class ViewDataBinding extends a {
    static int l = 0;
    private static final int m = 8;
    private static final boolean n;
    private static final ReferenceQueue<ViewDataBinding> o = new ReferenceQueue<>();
    /* access modifiers changed from: private */
    public static final View.OnAttachStateChangeListener p;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f1392a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f1393b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1394c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final View f1395d;

    /* renamed from: e  reason: collision with root package name */
    private b<Object, ViewDataBinding, Void> f1396e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1397f;
    private Choreographer g;
    private final Choreographer.FrameCallback h;
    private Handler i;
    private ViewDataBinding j;
    private g k;

    static class OnStartListener implements androidx.lifecycle.f {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<ViewDataBinding> f1398a;

        @n(e.a.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) this.f1398a.get();
            if (viewDataBinding != null) {
                viewDataBinding.j();
            }
        }
    }

    static class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.m(view).f1392a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            synchronized (this) {
                boolean unused = ViewDataBinding.this.f1393b = false;
            }
            ViewDataBinding.u();
            if (Build.VERSION.SDK_INT < 19 || ViewDataBinding.this.f1395d.isAttachedToWindow()) {
                ViewDataBinding.this.j();
                return;
            }
            ViewDataBinding.this.f1395d.removeOnAttachStateChangeListener(ViewDataBinding.p);
            ViewDataBinding.this.f1395d.addOnAttachStateChangeListener(ViewDataBinding.p);
        }
    }

    class c implements Choreographer.FrameCallback {
        c() {
        }

        public void doFrame(long j) {
            ViewDataBinding.this.f1392a.run();
        }
    }

    protected static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String[][] f1401a;

        /* renamed from: b  reason: collision with root package name */
        public final int[][] f1402b;

        /* renamed from: c  reason: collision with root package name */
        public final int[][] f1403c;

        public d(int i) {
            this.f1401a = new String[i][];
            this.f1402b = new int[i][];
            this.f1403c = new int[i][];
        }

        public void a(int i, String[] strArr, int[] iArr, int[] iArr2) {
            this.f1401a[i] = strArr;
            this.f1402b[i] = iArr;
            this.f1403c[i] = iArr2;
        }
    }

    private interface e<T> {
        void a(T t);
    }

    private static class f<T> extends WeakReference<ViewDataBinding> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T> f1404a;

        /* renamed from: b  reason: collision with root package name */
        private T f1405b;

        public boolean a() {
            boolean z;
            T t = this.f1405b;
            if (t != null) {
                this.f1404a.a(t);
                z = true;
            } else {
                z = false;
            }
            this.f1405b = null;
            return z;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        l = i2;
        n = i2 >= 16;
        if (Build.VERSION.SDK_INT < 19) {
            p = null;
        } else {
            p = new a();
        }
    }

    protected ViewDataBinding(e eVar, View view, int i2) {
        this.f1392a = new b();
        this.f1393b = false;
        this.f1394c = false;
        f[] fVarArr = new f[i2];
        this.f1395d = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (n) {
            this.g = Choreographer.getInstance();
            this.h = new c();
        } else {
            this.h = null;
            this.i = new Handler(Looper.myLooper());
        }
    }

    private static e f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof e) {
            return (e) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    private void h() {
        if (this.f1397f) {
            v();
        } else if (o()) {
            this.f1397f = true;
            this.f1394c = false;
            b<Object, ViewDataBinding, Void> bVar = this.f1396e;
            if (bVar == null) {
                if (0 == 0) {
                    g();
                    b<Object, ViewDataBinding, Void> bVar2 = this.f1396e;
                    if (bVar2 != null) {
                        bVar2.b(this, 3, null);
                        throw null;
                    }
                }
                this.f1397f = false;
                return;
            }
            bVar.b(this, 1, null);
            throw null;
        }
    }

    protected static void i(ViewDataBinding viewDataBinding) {
        viewDataBinding.h();
    }

    private static int k(String str, int i2, d dVar, int i3) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = dVar.f1401a[i3];
        int length = strArr.length;
        while (i2 < length) {
            if (TextUtils.equals(subSequence, strArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static int l(ViewGroup viewGroup, int i2) {
        String str = (String) viewGroup.getChildAt(i2).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i3 = i2 + 1; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i2;
                }
                if (q(str2, length)) {
                    i2 = i3;
                }
            }
        }
        return i2;
    }

    static ViewDataBinding m(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(androidx.databinding.i.a.dataBinding);
        }
        return null;
    }

    private static boolean q(String str, int i2) {
        int length = str.length();
        if (length == i2) {
            return false;
        }
        while (i2 < length) {
            if (!Character.isDigit(str.charAt(i2))) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void r(androidx.databinding.e r16, android.view.View r17, java.lang.Object[] r18, androidx.databinding.ViewDataBinding.d r19, android.util.SparseIntArray r20, boolean r21) {
        /*
            r6 = r16
            r0 = r17
            r7 = r19
            r8 = r20
            androidx.databinding.ViewDataBinding r1 = m(r17)
            if (r1 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Object r1 = r17.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x001a
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            java.lang.String r9 = "layout"
            r2 = -1
            r11 = 1
            if (r21 == 0) goto L_0x004b
            if (r1 == 0) goto L_0x004b
            boolean r3 = r1.startsWith(r9)
            if (r3 == 0) goto L_0x004b
            r3 = 95
            int r3 = r1.lastIndexOf(r3)
            if (r3 <= 0) goto L_0x0047
            int r3 = r3 + r11
            boolean r4 = q(r1, r3)
            if (r4 == 0) goto L_0x0047
            int r1 = t(r1, r3)
            r3 = r18[r1]
            if (r3 != 0) goto L_0x0042
            r18[r1] = r0
        L_0x0042:
            if (r7 != 0) goto L_0x0045
            r1 = -1
        L_0x0045:
            r3 = 1
            goto L_0x0049
        L_0x0047:
            r1 = -1
            r3 = 0
        L_0x0049:
            r12 = r1
            goto L_0x0069
        L_0x004b:
            if (r1 == 0) goto L_0x0067
            java.lang.String r3 = "binding_"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0067
            int r3 = m
            int r1 = t(r1, r3)
            r3 = r18[r1]
            if (r3 != 0) goto L_0x0061
            r18[r1] = r0
        L_0x0061:
            if (r7 != 0) goto L_0x0064
            r1 = -1
        L_0x0064:
            r12 = r1
            r3 = 1
            goto L_0x0069
        L_0x0067:
            r3 = 0
            r12 = -1
        L_0x0069:
            if (r3 != 0) goto L_0x007f
            int r1 = r17.getId()
            if (r1 <= 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            int r1 = r8.get(r1, r2)
            if (r1 < 0) goto L_0x007f
            r2 = r18[r1]
            if (r2 != 0) goto L_0x007f
            r18[r1] = r0
        L_0x007f:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0113
            r13 = r0
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            int r14 = r13.getChildCount()
            r0 = 0
            r1 = 0
        L_0x008c:
            if (r0 >= r14) goto L_0x0113
            android.view.View r2 = r13.getChildAt(r0)
            if (r12 < 0) goto L_0x00f9
            java.lang.Object r3 = r2.getTag()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x00f9
            java.lang.Object r3 = r2.getTag()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "_0"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x00f9
            boolean r4 = r3.startsWith(r9)
            if (r4 == 0) goto L_0x00f9
            r4 = 47
            int r4 = r3.indexOf(r4)
            if (r4 <= 0) goto L_0x00f9
            int r3 = k(r3, r1, r7, r12)
            if (r3 < 0) goto L_0x00f9
            int r1 = r3 + 1
            int[][] r4 = r7.f1402b
            r4 = r4[r12]
            r4 = r4[r3]
            int[][] r5 = r7.f1403c
            r5 = r5[r12]
            r3 = r5[r3]
            int r5 = l(r13, r0)
            if (r5 != r0) goto L_0x00dc
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.f.a(r6, r2, r3)
            r18[r4] = r3
        L_0x00d8:
            r10 = r0
            r11 = r1
            r0 = 1
            goto L_0x00fc
        L_0x00dc:
            int r5 = r5 - r0
            int r5 = r5 + r11
            android.view.View[] r15 = new android.view.View[r5]
            r10 = 0
        L_0x00e1:
            if (r10 >= r5) goto L_0x00ef
            int r11 = r0 + r10
            android.view.View r11 = r13.getChildAt(r11)
            r15[r10] = r11
            int r10 = r10 + 1
            r11 = 1
            goto L_0x00e1
        L_0x00ef:
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.f.b(r6, r15, r3)
            r18[r4] = r3
            int r5 = r5 + -1
            int r0 = r0 + r5
            goto L_0x00d8
        L_0x00f9:
            r10 = r0
            r11 = r1
            r0 = 0
        L_0x00fc:
            if (r0 != 0) goto L_0x010b
            r5 = 0
            r0 = r16
            r1 = r2
            r2 = r18
            r3 = r19
            r4 = r20
            r(r0, r1, r2, r3, r4, r5)
        L_0x010b:
            r0 = 1
            int r1 = r10 + 1
            r0 = r1
            r1 = r11
            r11 = 1
            goto L_0x008c
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.r(androidx.databinding.e, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$d, android.util.SparseIntArray, boolean):void");
    }

    protected static Object[] s(e eVar, View view, int i2, d dVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i2];
        r(eVar, view, objArr, dVar, sparseIntArray, true);
        return objArr;
    }

    private static int t(String str, int i2) {
        int length = str.length();
        int i3 = 0;
        while (i2 < length) {
            i3 = (i3 * 10) + (str.charAt(i2) - '0');
            i2++;
        }
        return i3;
    }

    /* access modifiers changed from: private */
    public static void u() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = o.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof f) {
                ((f) poll).a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void g();

    public void j() {
        ViewDataBinding viewDataBinding = this.j;
        if (viewDataBinding == null) {
            h();
        } else {
            viewDataBinding.j();
        }
    }

    public View n() {
        return this.f1395d;
    }

    public abstract boolean o();

    public abstract void p();

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (n == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r2.g.postFrameCallback(r2.h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r2.i.post(r2.f1392a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v() {
        /*
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.j
            if (r0 == 0) goto L_0x0008
            r0.v()
            goto L_0x003b
        L_0x0008:
            androidx.lifecycle.g r0 = r2.k
            if (r0 == 0) goto L_0x001d
            androidx.lifecycle.e r0 = r0.e()
            androidx.lifecycle.e$b r0 = r0.b()
            androidx.lifecycle.e$b r1 = androidx.lifecycle.e.b.STARTED
            boolean r0 = r0.f(r1)
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            monitor-enter(r2)
            boolean r0 = r2.f1393b     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0024
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            return
        L_0x0024:
            r0 = 1
            r2.f1393b = r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            boolean r0 = n
            if (r0 == 0) goto L_0x0034
            android.view.Choreographer r0 = r2.g
            android.view.Choreographer$FrameCallback r1 = r2.h
            r0.postFrameCallback(r1)
            goto L_0x003b
        L_0x0034:
            android.os.Handler r0 = r2.i
            java.lang.Runnable r1 = r2.f1392a
            r0.post(r1)
        L_0x003b:
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.v():void");
    }

    /* access modifiers changed from: protected */
    public void w(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.j = this;
        }
    }

    /* access modifiers changed from: protected */
    public void x(View view) {
        view.setTag(androidx.databinding.i.a.dataBinding, this);
    }

    protected ViewDataBinding(Object obj, View view, int i2) {
        this(f(obj), view, i2);
    }
}
