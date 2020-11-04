package androidx.fragment.app;

import a.e.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.a;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentActivity */
public class c extends ComponentActivity implements a.b, a.d {
    final f j = f.b(new a());
    final l k = new l(this);
    boolean l;
    boolean m;
    boolean n = true;
    boolean o;
    boolean p;
    boolean q;
    int r;
    h<String> s;

    /* compiled from: FragmentActivity */
    class a extends h<c> implements z, androidx.activity.c {
        public a() {
            super(c.this);
        }

        public y B() {
            return c.this.B();
        }

        public View b(int i) {
            return c.this.findViewById(i);
        }

        public g c() {
            return c.this.k;
        }

        public boolean d() {
            Window window = c.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public OnBackPressedDispatcher f() {
            return c.this.f();
        }

        public void i(Fragment fragment) {
            c.this.n0(fragment);
        }

        public LayoutInflater k() {
            return c.this.getLayoutInflater().cloneInContext(c.this);
        }

        public void l(Fragment fragment, String[] strArr, int i) {
            c.this.q0(fragment, strArr, i);
        }

        public boolean m(Fragment fragment) {
            return !c.this.isFinishing();
        }

        public boolean n(String str) {
            return androidx.core.app.a.p(c.this, str);
        }

        public void o(Fragment fragment, Intent intent, int i, Bundle bundle) {
            c.this.r0(fragment, intent, i, bundle);
        }

        public void p() {
            c.this.s0();
        }

        /* renamed from: q */
        public c j() {
            return c.this;
        }
    }

    private int h0(Fragment fragment) {
        if (this.s.o() < 65534) {
            while (this.s.i(this.r) >= 0) {
                this.r = (this.r + 1) % 65534;
            }
            int i = this.r;
            this.s.l(i, fragment.f1472f);
            this.r = (this.r + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    static void i0(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void l0() {
        do {
        } while (m0(k0(), g.b.CREATED));
    }

    private static boolean m0(k kVar, g.b bVar) {
        boolean z = false;
        for (Fragment next : kVar.h0()) {
            if (next != null) {
                if (next.T() != null) {
                    z |= m0(next.K(), bVar);
                }
                if (next.c().b().f(g.b.STARTED)) {
                    next.R.p(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.l);
        printWriter.print(" mResumed=");
        printWriter.print(this.m);
        printWriter.print(" mStopped=");
        printWriter.print(this.n);
        if (getApplication() != null) {
            a.n.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.j.u().N(str, fileDescriptor, printWriter, strArr);
    }

    public final void e(int i) {
        if (!this.o && i != -1) {
            i0(i);
        }
    }

    /* access modifiers changed from: package-private */
    public final View j0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.j.w(view, str, context, attributeSet);
    }

    public k k0() {
        return this.j.u();
    }

    public void n0(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean o0(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.j.v();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String f2 = this.s.f(i4);
            this.s.n(i4);
            if (f2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t = this.j.t(f2);
            if (t == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + f2);
                return;
            }
            t.H0(i & 65535, i2, intent);
            return;
        }
        a.c m2 = androidx.core.app.a.m();
        if (m2 == null || !m2.a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.j.v();
        this.j.d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.j.a((Fragment) null);
        if (bundle != null) {
            this.j.x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.r = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.s = new h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.s.l(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.s == null) {
            this.s = new h<>();
            this.r = 0;
        }
        super.onCreate(bundle);
        this.k.i(g.a.ON_CREATE);
        this.j.f();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.j.g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View j0 = j0(view, str, context, attributeSet);
        return j0 == null ? super.onCreateView(view, str, context, attributeSet) : j0;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.j.h();
        this.k.i(g.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.j.i();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.j.k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.j.e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.j.j(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.j.v();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.j.l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.m = false;
        this.j.m();
        this.k.i(g.a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.j.n(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        p0();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return o0(view, menu) | this.j.o(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.j.v();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String f2 = this.s.f(i3);
            this.s.n(i3);
            if (f2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t = this.j.t(f2);
            if (t == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + f2);
                return;
            }
            t.h1(i & 65535, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.m = true;
        this.j.v();
        this.j.s();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        l0();
        this.k.i(g.a.ON_STOP);
        Parcelable y = this.j.y();
        if (y != null) {
            bundle.putParcelable("android:support:fragments", y);
        }
        if (this.s.o() > 0) {
            bundle.putInt("android:support:next_request_index", this.r);
            int[] iArr = new int[this.s.o()];
            String[] strArr = new String[this.s.o()];
            for (int i = 0; i < this.s.o(); i++) {
                iArr[i] = this.s.k(i);
                strArr[i] = this.s.p(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.n = false;
        if (!this.l) {
            this.l = true;
            this.j.c();
        }
        this.j.v();
        this.j.s();
        this.k.i(g.a.ON_START);
        this.j.q();
    }

    public void onStateNotSaved() {
        this.j.v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.n = true;
        l0();
        this.j.r();
        this.k.i(g.a.ON_STOP);
    }

    /* access modifiers changed from: protected */
    public void p0() {
        this.k.i(g.a.ON_RESUME);
        this.j.p();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void q0(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            androidx.core.app.a.o(this, strArr, i);
            return;
        }
        i0(i);
        try {
            this.o = true;
            androidx.core.app.a.o(this, strArr, ((h0(fragment) + 1) << 16) + (i & 65535));
            this.o = false;
        } catch (Throwable th) {
            this.o = false;
            throw th;
        }
    }

    public void r0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.q = true;
        if (i == -1) {
            try {
                androidx.core.app.a.q(this, intent, -1, bundle);
            } finally {
                this.q = false;
            }
        } else {
            i0(i);
            androidx.core.app.a.q(this, intent, ((h0(fragment) + 1) << 16) + (i & 65535), bundle);
            this.q = false;
        }
    }

    @Deprecated
    public void s0() {
        invalidateOptionsMenu();
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.q && i != -1) {
            i0(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        if (!this.p && i != -1) {
            i0(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View j0 = j0((View) null, str, context, attributeSet);
        return j0 == null ? super.onCreateView(str, context, attributeSet) : j0;
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.q && i != -1) {
            i0(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.p && i != -1) {
            i0(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
