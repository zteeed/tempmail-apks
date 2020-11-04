package b.b;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.RejectedExecutionException;

final class b0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e  reason: collision with root package name */
    private static b0 f1984e;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f1985b = false;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f1986c = true;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public b f1987d = null;

    class a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Context> f1988a;

        public a(WeakReference<Context> weakReference) {
            this.f1988a = weakReference;
        }

        private Void a() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e2) {
                e.b("Sleeping attempt failed (essential for background state verification)\n", e2);
            }
            if (b0.this.f1985b && b0.this.f1986c) {
                boolean unused = b0.this.f1985b = false;
                try {
                    b0.this.f1987d.a(this.f1988a);
                } catch (Exception e3) {
                    e.b("Listener threw exception! ", e3);
                    cancel(true);
                }
            }
            this.f1988a.clear();
            return null;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return a();
        }
    }

    interface b {
        void a(WeakReference<Context> weakReference);

        void b(Activity activity);
    }

    b0() {
    }

    static b0 e() {
        if (f1984e == null) {
            f1984e = new b0();
        }
        return f1984e;
    }

    public static b0 f() {
        b0 b0Var = f1984e;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("Foreground is not initialised - invoke at least once with parameter init/get");
    }

    public final void a(Application application, b bVar) {
        this.f1987d = bVar;
        if (Build.VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(f1984e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a.b().a(activity.getIntent());
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        this.f1986c = true;
        try {
            new a(new WeakReference(activity.getApplicationContext())).executeOnExecutor(b.a().c(), new Void[0]);
        } catch (RejectedExecutionException e2) {
            e.b("backgroundTask.executeOnExecutor failed with RejectedExecutionException Exception", e2);
        } catch (Throwable th) {
            e.b("backgroundTask.executeOnExecutor failed with Exception", th);
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.f1986c = false;
        boolean z = !this.f1985b;
        this.f1985b = true;
        if (z) {
            try {
                this.f1987d.b(activity);
            } catch (Exception e2) {
                e.b("Listener threw exception! ", e2);
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
