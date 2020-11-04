package androidx.appcompat.view.menu;

import a.h.k.d;
import a.h.k.t;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.o;

/* compiled from: MenuPopupHelper */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f874a;

    /* renamed from: b  reason: collision with root package name */
    private final h f875b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f876c;

    /* renamed from: d  reason: collision with root package name */
    private final int f877d;

    /* renamed from: e  reason: collision with root package name */
    private final int f878e;

    /* renamed from: f  reason: collision with root package name */
    private View f879f;
    private int g;
    private boolean h;
    private o.a i;
    private m j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;

    /* compiled from: MenuPopupHelper */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        public void onDismiss() {
            n.this.e();
        }
    }

    public n(Context context, h hVar, View view, boolean z, int i2) {
        this(context, hVar, view, z, i2, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.o] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.t] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.m a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f874a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f874a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = a.a.d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.e r0 = new androidx.appcompat.view.menu.e
            android.content.Context r2 = r14.f874a
            android.view.View r3 = r14.f879f
            int r4 = r14.f877d
            int r5 = r14.f878e
            boolean r6 = r14.f876c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.t r0 = new androidx.appcompat.view.menu.t
            android.content.Context r8 = r14.f874a
            androidx.appcompat.view.menu.h r9 = r14.f875b
            android.view.View r10 = r14.f879f
            int r11 = r14.f877d
            int r12 = r14.f878e
            boolean r13 = r14.f876c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.h r1 = r14.f875b
            r0.c(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.l
            r0.w(r1)
            android.view.View r1 = r14.f879f
            r0.r(r1)
            androidx.appcompat.view.menu.o$a r1 = r14.i
            r0.l(r1)
            boolean r1 = r14.h
            r0.t(r1)
            int r1 = r14.g
            r0.u(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.n.a():androidx.appcompat.view.menu.m");
    }

    private void l(int i2, int i3, boolean z, boolean z2) {
        m c2 = c();
        c2.x(z2);
        if (z) {
            if ((d.b(this.g, t.t(this.f879f)) & 7) == 5) {
                i2 -= this.f879f.getWidth();
            }
            c2.v(i2);
            c2.y(i3);
            int i4 = (int) ((this.f874a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c2.s(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        c2.show();
    }

    public void b() {
        if (d()) {
            this.j.dismiss();
        }
    }

    public m c() {
        if (this.j == null) {
            this.j = a();
        }
        return this.j;
    }

    public boolean d() {
        m mVar = this.j;
        return mVar != null && mVar.b();
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f879f = view;
    }

    public void g(boolean z) {
        this.h = z;
        m mVar = this.j;
        if (mVar != null) {
            mVar.t(z);
        }
    }

    public void h(int i2) {
        this.g = i2;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void j(o.a aVar) {
        this.i = aVar;
        m mVar = this.j;
        if (mVar != null) {
            mVar.l(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f879f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i2, int i3) {
        if (d()) {
            return true;
        }
        if (this.f879f == null) {
            return false;
        }
        l(i2, i3, true, true);
        return true;
    }

    public n(Context context, h hVar, View view, boolean z, int i2, int i3) {
        this.g = 8388611;
        this.l = new a();
        this.f874a = context;
        this.f875b = hVar;
        this.f879f = view;
        this.f876c = z;
        this.f877d = i2;
        this.f878e = i3;
    }
}
