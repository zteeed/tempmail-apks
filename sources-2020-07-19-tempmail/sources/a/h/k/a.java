package a.h.k;

import a.h.c;
import a.h.k.c0.d;
import a.h.k.c0.e;
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
    private static final View.AccessibilityDelegate f357c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    private final View.AccessibilityDelegate f358a;

    /* renamed from: b  reason: collision with root package name */
    private final View.AccessibilityDelegate f359b;

    /* renamed from: a.h.k.a$a  reason: collision with other inner class name */
    /* compiled from: AccessibilityDelegateCompat */
    static final class C0012a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        final a f360a;

        C0012a(a aVar) {
            this.f360a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f360a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            e b2 = this.f360a.b(view);
            if (b2 != null) {
                return (AccessibilityNodeProvider) b2.d();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f360a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            d A0 = d.A0(accessibilityNodeInfo);
            A0.r0(t.L(view));
            A0.j0(t.G(view));
            A0.o0(t.j(view));
            this.f360a.g(view, A0);
            A0.f(accessibilityNodeInfo.getText(), view);
            List<d.a> c2 = a.c(view);
            for (int i = 0; i < c2.size(); i++) {
                A0.b(c2.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f360a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f360a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f360a.j(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f360a.l(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f360a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f357c);
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
        return this.f358a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public e b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f358a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new e(accessibilityNodeProvider);
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate d() {
        return this.f359b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f358a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, d dVar) {
        this.f358a.onInitializeAccessibilityNodeInfo(view, dVar.z0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f358a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f358a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
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
            z = this.f358a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != c.accessibility_action_clickable_span) ? z : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i) {
        this.f358a.sendAccessibilityEvent(view, i);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f358a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f358a = accessibilityDelegate;
        this.f359b = new C0012a(this);
    }
}
