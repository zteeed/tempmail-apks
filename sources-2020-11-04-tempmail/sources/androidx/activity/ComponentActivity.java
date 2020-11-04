package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.d;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends d implements k, z, f, androidx.savedstate.b, c {

    /* renamed from: d  reason: collision with root package name */
    private final l f661d = new l(this);

    /* renamed from: e  reason: collision with root package name */
    private final androidx.savedstate.a f662e = androidx.savedstate.a.a(this);

    /* renamed from: f  reason: collision with root package name */
    private y f663f;
    private x.b g;
    private final OnBackPressedDispatcher h = new OnBackPressedDispatcher(new a());
    private int i;

    class a implements Runnable {
        a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        Object f667a;

        /* renamed from: b  reason: collision with root package name */
        y f668b;

        b() {
        }
    }

    public ComponentActivity() {
        if (c() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                c().a(new i() {
                    public void c(k kVar, g.a aVar) {
                        if (aVar == g.a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            c().a(new i() {
                public void c(k kVar, g.a aVar) {
                    if (aVar == g.a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.B().a();
                    }
                }
            });
            int i2 = Build.VERSION.SDK_INT;
            if (19 <= i2 && i2 <= 23) {
                c().a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public y B() {
        if (getApplication() != null) {
            if (this.f663f == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f663f = bVar.f668b;
                }
                if (this.f663f == null) {
                    this.f663f = new y();
                }
            }
            return this.f663f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final SavedStateRegistry I() {
        return this.f662e.b();
    }

    public g c() {
        return this.f661d;
    }

    public final OnBackPressedDispatcher f() {
        return this.h;
    }

    @Deprecated
    public Object g0() {
        return null;
    }

    public void onBackPressed() {
        this.h.c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f662e.c(bundle);
        t.g(this);
        int i2 = this.i;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object g0 = g0();
        y yVar = this.f663f;
        if (yVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            yVar = bVar.f668b;
        }
        if (yVar == null && g0 == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f667a = g0;
        bVar2.f668b = yVar;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        g c2 = c();
        if (c2 instanceof l) {
            ((l) c2).p(g.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f662e.d(bundle);
    }

    public x.b u() {
        if (getApplication() != null) {
            if (this.g == null) {
                this.g = new v(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.g;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }
}
