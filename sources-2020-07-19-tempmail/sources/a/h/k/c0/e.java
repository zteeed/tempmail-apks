package a.h.k.c0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Object f389a;

    /* compiled from: AccessibilityNodeProviderCompat */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        final e f390a;

        a(e eVar) {
            this.f390a = eVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            d a2 = this.f390a.a(i);
            if (a2 == null) {
                return null;
            }
            return a2.z0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<d> b2 = this.f390a.b(str, i);
            if (b2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(b2.get(i2).z0());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f390a.e(i, i2, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat */
    static class b extends a {
        b(e eVar) {
            super(eVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            d c2 = this.f390a.c(i);
            if (c2 == null) {
                return null;
            }
            return c2.z0();
        }
    }

    public e() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            this.f389a = new b(this);
        } else if (i >= 16) {
            this.f389a = new a(this);
        } else {
            this.f389a = null;
        }
    }

    public d a(int i) {
        return null;
    }

    public List<d> b(String str, int i) {
        return null;
    }

    public d c(int i) {
        return null;
    }

    public Object d() {
        return this.f389a;
    }

    public boolean e(int i, int i2, Bundle bundle) {
        return false;
    }

    public e(Object obj) {
        this.f389a = obj;
    }
}
