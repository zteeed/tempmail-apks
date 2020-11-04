package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.lifecycle.e;

/* compiled from: ReportFragment */
public class o extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    private a f1626b;

    /* compiled from: ReportFragment */
    interface a {
        void a();

        void onResume();

        void onStart();
    }

    private void a(e.a aVar) {
        Activity activity = getActivity();
        if (activity instanceof i) {
            ((i) activity).e().i(aVar);
        } else if (activity instanceof g) {
            e e2 = ((g) activity).e();
            if (e2 instanceof h) {
                ((h) e2).i(aVar);
            }
        }
    }

    private void b(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private void d(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    public static void e(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new o(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.f1626b);
        a(e.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(e.a.ON_DESTROY);
        this.f1626b = null;
    }

    public void onPause() {
        super.onPause();
        a(e.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        c(this.f1626b);
        a(e.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        d(this.f1626b);
        a(e.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(e.a.ON_STOP);
    }
}
