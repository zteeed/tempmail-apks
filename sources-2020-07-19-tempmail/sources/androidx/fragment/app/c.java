package androidx.fragment.app;

import a.e.h;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.app.a;
import androidx.core.app.d;
import androidx.lifecycle.e;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentActivity */
public class c extends d implements s, a.b, a.d {

    /* renamed from: d  reason: collision with root package name */
    final Handler f1483d = new a();

    /* renamed from: e  reason: collision with root package name */
    final e f1484e = e.b(new b());

    /* renamed from: f  reason: collision with root package name */
    private r f1485f;
    boolean g;
    boolean h;
    boolean i = true;
    boolean j;
    boolean k;
    boolean l;
    int m;
    h<String> n;

    /* compiled from: FragmentActivity */
    class a extends Handler {
        a() {
        }

        public void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            c.this.p0();
            c.this.f1484e.s();
        }
    }

    /* compiled from: FragmentActivity */
    class b extends f<c> {
        public b() {
            super(c.this);
        }

        public View b(int i) {
            return c.this.findViewById(i);
        }

        public boolean c() {
            Window window = c.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public void h(Fragment fragment) {
            c.this.n0(fragment);
        }

        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            c.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        public LayoutInflater j() {
            return c.this.getLayoutInflater().cloneInContext(c.this);
        }

        public int k() {
            Window window = c.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        public boolean l() {
            return c.this.getWindow() != null;
        }

        public void m(Fragment fragment, String[] strArr, int i) {
            c.this.r0(fragment, strArr, i);
        }

        public boolean n(Fragment fragment) {
            return !c.this.isFinishing();
        }

        public boolean o(String str) {
            return androidx.core.app.a.p(c.this, str);
        }

        public void p(Fragment fragment, Intent intent, int i, Bundle bundle) {
            c.this.s0(fragment, intent, i, bundle);
        }

        public void q() {
            c.this.t0();
        }
    }

    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    /* compiled from: FragmentActivity */
    static final class C0044c {

        /* renamed from: a  reason: collision with root package name */
        Object f1488a;

        /* renamed from: b  reason: collision with root package name */
        r f1489b;

        /* renamed from: c  reason: collision with root package name */
        i f1490c;

        C0044c() {
        }
    }

    private int h0(Fragment fragment) {
        if (this.n.o() < 65534) {
            while (this.n.i(this.m) >= 0) {
                this.m = (this.m + 1) % 65534;
            }
            int i2 = this.m;
            this.n.l(i2, fragment.g);
            this.m = (this.m + 1) % 65534;
            return i2;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    static void i0(int i2) {
        if ((i2 & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void l0() {
        do {
        } while (m0(k0(), e.b.CREATED));
    }

    private static boolean m0(g gVar, e.b bVar) {
        boolean z = false;
        for (Fragment next : gVar.h()) {
            if (next != null) {
                if (next.e().b().f(e.b.STARTED)) {
                    next.T.k(bVar);
                    z = true;
                }
                g l1 = next.l1();
                if (l1 != null) {
                    z |= m0(l1, bVar);
                }
            }
        }
        return z;
    }

    public r C() {
        if (getApplication() != null) {
            if (this.f1485f == null) {
                C0044c cVar = (C0044c) getLastNonConfigurationInstance();
                if (cVar != null) {
                    this.f1485f = cVar.f1489b;
                }
                if (this.f1485f == null) {
                    this.f1485f = new r();
                }
            }
            return this.f1485f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
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
        printWriter.print(this.g);
        printWriter.print(" mResumed=");
        printWriter.print(this.h);
        printWriter.print(" mStopped=");
        printWriter.print(this.i);
        if (getApplication() != null) {
            a.m.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f1484e.u().c(str, fileDescriptor, printWriter, strArr);
    }

    public e e() {
        return super.e();
    }

    public final void g(int i2) {
        if (!this.j && i2 != -1) {
            i0(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final View j0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1484e.w(view, str, context, attributeSet);
    }

    public g k0() {
        return this.f1484e.u();
    }

    public void n0(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    public boolean o0(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.f1484e.v();
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String f2 = this.n.f(i5);
            this.n.n(i5);
            if (f2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t = this.f1484e.t(f2);
            if (t == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + f2);
                return;
            }
            t.E0(i2 & 65535, i3, intent);
            return;
        }
        a.c m2 = androidx.core.app.a.m();
        if (m2 == null || !m2.a(this, i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onBackPressed() {
        g u = this.f1484e.u();
        boolean i2 = u.i();
        if (i2 && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (i2 || !u.l()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1484e.v();
        this.f1484e.d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        r rVar;
        i iVar = null;
        this.f1484e.a((Fragment) null);
        super.onCreate(bundle);
        C0044c cVar = (C0044c) getLastNonConfigurationInstance();
        if (!(cVar == null || (rVar = cVar.f1489b) == null || this.f1485f != null)) {
            this.f1485f = rVar;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            e eVar = this.f1484e;
            if (cVar != null) {
                iVar = cVar.f1490c;
            }
            eVar.x(parcelable, iVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.m = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.n = new h<>(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.n.l(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.n == null) {
            this.n = new h<>();
            this.m = 0;
        }
        this.f1484e.f();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 == 0) {
            return super.onCreatePanelMenu(i2, menu) | this.f1484e.g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i2, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View j0 = j0(view, str, context, attributeSet);
        return j0 == null ? super.onCreateView(view, str, context, attributeSet) : j0;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f1485f != null && !isChangingConfigurations()) {
            this.f1485f.a();
        }
        this.f1484e.h();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f1484e.i();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.f1484e.k(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.f1484e.e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f1484e.j(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f1484e.v();
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f1484e.l(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.h = false;
        if (this.f1483d.hasMessages(2)) {
            this.f1483d.removeMessages(2);
            p0();
        }
        this.f1484e.m();
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f1484e.n(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f1483d.removeMessages(2);
        p0();
        this.f1484e.s();
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0 || menu == null) {
            return super.onPreparePanel(i2, view, menu);
        }
        return o0(view, menu) | this.f1484e.o(menu);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f1484e.v();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String f2 = this.n.f(i4);
            this.n.n(i4);
            if (f2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t = this.f1484e.t(f2);
            if (t == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + f2);
                return;
            }
            t.e1(i2 & 65535, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f1483d.sendEmptyMessage(2);
        this.h = true;
        this.f1484e.s();
    }

    public final Object onRetainNonConfigurationInstance() {
        Object q0 = q0();
        i y = this.f1484e.y();
        if (y == null && this.f1485f == null && q0 == null) {
            return null;
        }
        C0044c cVar = new C0044c();
        cVar.f1488a = q0;
        cVar.f1489b = this.f1485f;
        cVar.f1490c = y;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        l0();
        Parcelable z = this.f1484e.z();
        if (z != null) {
            bundle.putParcelable("android:support:fragments", z);
        }
        if (this.n.o() > 0) {
            bundle.putInt("android:support:next_request_index", this.m);
            int[] iArr = new int[this.n.o()];
            String[] strArr = new String[this.n.o()];
            for (int i2 = 0; i2 < this.n.o(); i2++) {
                iArr[i2] = this.n.k(i2);
                strArr[i2] = this.n.p(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.i = false;
        if (!this.g) {
            this.g = true;
            this.f1484e.c();
        }
        this.f1484e.v();
        this.f1484e.s();
        this.f1484e.q();
    }

    public void onStateNotSaved() {
        this.f1484e.v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.i = true;
        l0();
        this.f1484e.r();
    }

    /* access modifiers changed from: protected */
    public void p0() {
        this.f1484e.p();
    }

    public Object q0() {
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void r0(Fragment fragment, String[] strArr, int i2) {
        if (i2 == -1) {
            androidx.core.app.a.o(this, strArr, i2);
            return;
        }
        i0(i2);
        try {
            this.j = true;
            androidx.core.app.a.o(this, strArr, ((h0(fragment) + 1) << 16) + (i2 & 65535));
            this.j = false;
        } catch (Throwable th) {
            this.j = false;
            throw th;
        }
    }

    public void s0(Fragment fragment, Intent intent, int i2, Bundle bundle) {
        this.l = true;
        if (i2 == -1) {
            try {
                androidx.core.app.a.q(this, intent, -1, bundle);
            } finally {
                this.l = false;
            }
        } else {
            i0(i2);
            androidx.core.app.a.q(this, intent, ((h0(fragment) + 1) << 16) + (i2 & 65535), bundle);
            this.l = false;
        }
    }

    public void startActivityForResult(Intent intent, int i2) {
        if (!this.l && i2 != -1) {
            i0(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        if (!this.k && i2 != -1) {
            i0(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Deprecated
    public void t0() {
        invalidateOptionsMenu();
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View j0 = j0((View) null, str, context, attributeSet);
        return j0 == null ? super.onCreateView(str, context, attributeSet) : j0;
    }

    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        if (!this.l && i2 != -1) {
            i0(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.k && i2 != -1) {
            i0(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
