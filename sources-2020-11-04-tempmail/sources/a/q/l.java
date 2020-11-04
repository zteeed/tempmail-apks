package a.q;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: Scene */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f561a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f562b;

    static l b(View view) {
        return (l) view.getTag(j.transition_current_scene);
    }

    static void c(View view, l lVar) {
        view.setTag(j.transition_current_scene, lVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f561a) == this && (runnable = this.f562b) != null) {
            runnable.run();
        }
    }
}
