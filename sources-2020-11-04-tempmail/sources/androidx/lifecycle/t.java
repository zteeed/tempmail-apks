package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.g;

/* compiled from: ReportFragment */
public class t extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    private a f1695b;

    /* compiled from: ReportFragment */
    interface a {
        void a();

        void onResume();

        void onStart();
    }

    /* compiled from: ReportFragment */
    static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            t.a(activity, g.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            t.a(activity, g.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            t.a(activity, g.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            t.a(activity, g.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            t.a(activity, g.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            t.a(activity, g.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static void a(Activity activity, g.a aVar) {
        if (activity instanceof m) {
            ((m) activity).c().i(aVar);
        } else if (activity instanceof k) {
            g c2 = ((k) activity).c();
            if (c2 instanceof l) {
                ((l) c2).i(aVar);
            }
        }
    }

    private void b(g.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), aVar);
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    private void d(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private void e(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    static t f(Activity activity) {
        return (t) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    public static void g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new b());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new t(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* access modifiers changed from: package-private */
    public void h(a aVar) {
        this.f1695b = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.f1695b);
        b(g.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        b(g.a.ON_DESTROY);
        this.f1695b = null;
    }

    public void onPause() {
        super.onPause();
        b(g.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        d(this.f1695b);
        b(g.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        e(this.f1695b);
        b(g.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        b(g.a.ON_STOP);
    }
}
