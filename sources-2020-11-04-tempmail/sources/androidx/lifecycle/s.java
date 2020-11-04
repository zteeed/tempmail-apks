package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.t;

/* compiled from: ProcessLifecycleOwner */
public class s implements k {
    private static final s j = new s();

    /* renamed from: b  reason: collision with root package name */
    private int f1688b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1689c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1690d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1691e = true;

    /* renamed from: f  reason: collision with root package name */
    private Handler f1692f;
    private final l g = new l(this);
    private Runnable h = new a();
    t.a i = new b();

    /* compiled from: ProcessLifecycleOwner */
    class a implements Runnable {
        a() {
        }

        public void run() {
            s.this.h();
            s.this.i();
        }
    }

    /* compiled from: ProcessLifecycleOwner */
    class b implements t.a {
        b() {
        }

        public void a() {
        }

        public void onResume() {
            s.this.b();
        }

        public void onStart() {
            s.this.d();
        }
    }

    /* compiled from: ProcessLifecycleOwner */
    class c extends c {

        /* compiled from: ProcessLifecycleOwner */
        class a extends c {
            a() {
            }

            public void onActivityPostResumed(Activity activity) {
                s.this.b();
            }

            public void onActivityPostStarted(Activity activity) {
                s.this.d();
            }
        }

        c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                t.f(activity).h(s.this.i);
            }
        }

        public void onActivityPaused(Activity activity) {
            s.this.a();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        public void onActivityStopped(Activity activity) {
            s.this.e();
        }
    }

    private s() {
    }

    public static k j() {
        return j;
    }

    static void k(Context context) {
        j.g(context);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int i2 = this.f1689c - 1;
        this.f1689c = i2;
        if (i2 == 0) {
            this.f1692f.postDelayed(this.h, 700);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int i2 = this.f1689c + 1;
        this.f1689c = i2;
        if (i2 != 1) {
            return;
        }
        if (this.f1690d) {
            this.g.i(g.a.ON_RESUME);
            this.f1690d = false;
            return;
        }
        this.f1692f.removeCallbacks(this.h);
    }

    public g c() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        int i2 = this.f1688b + 1;
        this.f1688b = i2;
        if (i2 == 1 && this.f1691e) {
            this.g.i(g.a.ON_START);
            this.f1691e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f1688b--;
        i();
    }

    /* access modifiers changed from: package-private */
    public void g(Context context) {
        this.f1692f = new Handler();
        this.g.i(g.a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    /* access modifiers changed from: package-private */
    public void h() {
        if (this.f1689c == 0) {
            this.f1690d = true;
            this.g.i(g.a.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (this.f1688b == 0 && this.f1690d) {
            this.g.i(g.a.ON_STOP);
            this.f1691e = true;
        }
    }
}
