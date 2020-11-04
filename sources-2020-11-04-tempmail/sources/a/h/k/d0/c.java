package a.h.k.d0;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* compiled from: AccessibilityManagerCompat */
public final class c {

    /* compiled from: AccessibilityManagerCompat */
    public interface a {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* compiled from: AccessibilityManagerCompat */
    private static class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final a f377a;

        b(a aVar) {
            this.f377a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            return this.f377a.equals(((b) obj).f377a);
        }

        public int hashCode() {
            return this.f377a.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z) {
            this.f377a.onTouchExplorationStateChanged(z);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        if (Build.VERSION.SDK_INT < 19 || aVar == null) {
            return false;
        }
        return accessibilityManager.addTouchExplorationStateChangeListener(new b(aVar));
    }

    public static boolean b(AccessibilityManager accessibilityManager, a aVar) {
        if (Build.VERSION.SDK_INT < 19 || aVar == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}
