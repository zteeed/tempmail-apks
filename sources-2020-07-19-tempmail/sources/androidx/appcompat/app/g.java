package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;

/* compiled from: AppCompatDelegate */
public abstract class g {

    /* renamed from: b  reason: collision with root package name */
    private static int f719b = -1;

    g() {
    }

    public static g e(Activity activity, f fVar) {
        return new h(activity, activity.getWindow(), fVar);
    }

    public static g f(Dialog dialog, f fVar) {
        return new h(dialog.getContext(), dialog.getWindow(), fVar);
    }

    public static int h() {
        return f719b;
    }

    public static void z(int i) {
        if (i == -1 || i == 0 || i == 1 || i == 2) {
            f719b = i;
        } else {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        }
    }

    public abstract void A(Toolbar toolbar);

    public abstract void B(CharSequence charSequence);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean d();

    public abstract <T extends View> T g(int i);

    public abstract b.C0032b i();

    public abstract MenuInflater j();

    public abstract a k();

    public abstract void l();

    public abstract void m();

    public abstract void n(Configuration configuration);

    public abstract void o(Bundle bundle);

    public abstract void p();

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void u();

    public abstract boolean v(int i);

    public abstract void w(int i);

    public abstract void x(View view);

    public abstract void y(View view, ViewGroup.LayoutParams layoutParams);
}
