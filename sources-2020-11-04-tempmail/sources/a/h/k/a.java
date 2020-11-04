package a.h.k;

import a.h.c;
import a.h.k.d0.d;
import a.h.k.d0.e;
import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityDelegateCompat */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final View.AccessibilityDelegate f358c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    private final View.AccessibilityDelegate f359a;

    /* renamed from: b  reason: collision with root package name */
    private final View.AccessibilityDelegate f360b;

    /* renamed from: a.h.k.a$a  reason: collision with other inner class name */
    /* compiled from: AccessibilityDelegateCompat */
    static final class C0012a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        final a f361a;

        C0012a(a aVar) {
            this.f361a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f361a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            e b2 = this.f361a.b(view);
            if (b2 != null) {
                return (AccessibilityNodeProvider) b2.d();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f361a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            d B0 = d.B0(accessibilityNodeInfo);
            B0.s0(u.L(view));
            B0.k0(u.G(view));
            B0.p0(u.j(view));
            this.f361a.g(view, B0);
            B0.f(accessibilityNodeInfo.getText(), view);
            List<d.a> c2 = a.c(view);
            for (int i = 0; i < c2.size(); i++) {
                B0.b(c2.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f361a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f361a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f361a.j(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f361a.l(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f361a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f358c);
    }

    static List<d.a> c(View view) {
        List<d.a> list = (List) view.getTag(c.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] o = d.o(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (o != null && i < o.length) {
                if (clickableSpan.equals(o[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private boolean k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(c.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f359a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public e b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f359a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new e(accessibilityNodeProvider);
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate d() {
        return this.f360b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f359a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, d dVar) {
        this.f359a.onInitializeAccessibilityNodeInfo(view, dVar.A0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f359a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f359a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i, Bundle bundle) {
        List<d.a> c2 = c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c2.size()) {
                break;
            }
            d.a aVar = c2.get(i2);
            if (aVar.a() == i) {
                z = aVar.b(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f359a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != c.accessibility_action_clickable_span) ? z : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i) {
        this.f359a.sendAccessibilityEvent(view, i);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f359a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f359a = accessibilityDelegate;
        this.f360b = new C0012a(this);
    }
}
