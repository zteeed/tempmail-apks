package a.p;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: Scene */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f557a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f558b;

    static l b(View view) {
        return (l) view.getTag(j.transition_current_scene);
    }

    static void c(View view, l lVar) {
        view.setTag(j.transition_current_scene, lVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f557a) == this && (runnable = this.f558b) != null) {
            runnable.run();
        }
    }
}
