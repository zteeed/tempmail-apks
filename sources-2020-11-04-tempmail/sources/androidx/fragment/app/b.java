package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: DialogFragment */
public class b extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler Y;
    private Runnable Z = new a();
    DialogInterface.OnCancelListener a0 = new C0044b();
    DialogInterface.OnDismissListener b0 = new c();
    int c0 = 0;
    int d0 = 0;
    boolean e0 = true;
    boolean f0 = true;
    int g0 = -1;
    Dialog h0;
    boolean i0;
    boolean j0;
    boolean k0;

    /* compiled from: DialogFragment */
    class a implements Runnable {
        a() {
        }

        public void run() {
            b bVar = b.this;
            bVar.b0.onDismiss(bVar.h0);
        }
    }

    /* renamed from: androidx.fragment.app.b$b  reason: collision with other inner class name */
    /* compiled from: DialogFragment */
    class C0044b implements DialogInterface.OnCancelListener {
        C0044b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            b bVar = b.this;
            Dialog dialog = bVar.h0;
            if (dialog != null) {
                bVar.onCancel(dialog);
            }
        }
    }

    /* compiled from: DialogFragment */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            b bVar = b.this;
            Dialog dialog = bVar.h0;
            if (dialog != null) {
                bVar.onDismiss(dialog);
            }
        }
    }

    public void G0(Bundle bundle) {
        Bundle bundle2;
        super.G0(bundle);
        if (this.f0) {
            View p0 = p0();
            if (p0 != null) {
                if (p0.getParent() == null) {
                    this.h0.setContentView(p0);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            c z = z();
            if (z != null) {
                this.h0.setOwnerActivity(z);
            }
            this.h0.setCancelable(this.e0);
            this.h0.setOnCancelListener(this.a0);
            this.h0.setOnDismissListener(this.b0);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.h0.onRestoreInstanceState(bundle2);
            }
        }
    }

    public void J0(Context context) {
        super.J0(context);
        if (!this.k0) {
            this.j0 = false;
        }
    }

    public void M0(Bundle bundle) {
        super.M0(bundle);
        this.Y = new Handler();
        this.f0 = this.x == 0;
        if (bundle != null) {
            this.c0 = bundle.getInt("android:style", 0);
            this.d0 = bundle.getInt("android:theme", 0);
            this.e0 = bundle.getBoolean("android:cancelable", true);
            this.f0 = bundle.getBoolean("android:showsDialog", this.f0);
            this.g0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void T0() {
        super.T0();
        Dialog dialog = this.h0;
        if (dialog != null) {
            this.i0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.h0.dismiss();
            if (!this.j0) {
                onDismiss(this.h0);
            }
            this.h0 = null;
        }
    }

    public void U0() {
        super.U0();
        if (!this.k0 && !this.j0) {
            this.j0 = true;
        }
    }

    public LayoutInflater V0(Bundle bundle) {
        if (!this.f0) {
            return super.V0(bundle);
        }
        Dialog s2 = s2(bundle);
        this.h0 = s2;
        if (s2 == null) {
            return (LayoutInflater) this.t.g().getSystemService("layout_inflater");
        }
        w2(s2, this.c0);
        return (LayoutInflater) this.h0.getContext().getSystemService("layout_inflater");
    }

    public void k1(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.k1(bundle);
        Dialog dialog = this.h0;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.c0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.d0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.e0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.g0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void l1() {
        super.l1();
        Dialog dialog = this.h0;
        if (dialog != null) {
            this.i0 = false;
            dialog.show();
        }
    }

    public void m1() {
        super.m1();
        Dialog dialog = this.h0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void n2() {
        p2(false, false);
    }

    public void o2() {
        p2(true, false);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.i0) {
            p2(true, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void p2(boolean z, boolean z2) {
        if (!this.j0) {
            this.j0 = true;
            this.k0 = false;
            Dialog dialog = this.h0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.h0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.Y.getLooper()) {
                        onDismiss(this.h0);
                    } else {
                        this.Y.post(this.Z);
                    }
                }
            }
            this.i0 = true;
            if (this.g0 >= 0) {
                b0().G0(this.g0, 1);
                this.g0 = -1;
                return;
            }
            q j = b0().j();
            j.n(this);
            if (z) {
                j.i();
            } else {
                j.h();
            }
        }
    }

    public Dialog q2() {
        return this.h0;
    }

    public int r2() {
        return this.d0;
    }

    public Dialog s2(Bundle bundle) {
        return new Dialog(P1(), r2());
    }

    public void t2(boolean z) {
        this.e0 = z;
        Dialog dialog = this.h0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void u2(boolean z) {
        this.f0 = z;
    }

    public void v2(int i, int i2) {
        this.c0 = i;
        if (i == 2 || i == 3) {
            this.d0 = 16973913;
        }
        if (i2 != 0) {
            this.d0 = i2;
        }
    }

    public void w2(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void x2(k kVar, String str) {
        this.j0 = false;
        this.k0 = true;
        q j = kVar.j();
        j.d(this, str);
        j.h();
    }
}
