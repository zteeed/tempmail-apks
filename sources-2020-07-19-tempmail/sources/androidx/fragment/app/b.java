package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: DialogFragment */
public class b extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    int Z = 0;
    int a0 = 0;
    boolean b0 = true;
    boolean c0 = true;
    int d0 = -1;
    Dialog e0;
    boolean f0;
    boolean g0;
    boolean h0;

    public void D0(Bundle bundle) {
        Bundle bundle2;
        super.D0(bundle);
        if (this.c0) {
            View m0 = m0();
            if (m0 != null) {
                if (m0.getParent() == null) {
                    this.e0.setContentView(m0);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            c u = u();
            if (u != null) {
                this.e0.setOwnerActivity(u);
            }
            this.e0.setCancelable(this.b0);
            this.e0.setOnCancelListener(this);
            this.e0.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.e0.onRestoreInstanceState(bundle2);
            }
        }
    }

    public void G0(Context context) {
        super.G0(context);
        if (!this.h0) {
            this.g0 = false;
        }
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        this.c0 = this.z == 0;
        if (bundle != null) {
            this.Z = bundle.getInt("android:style", 0);
            this.a0 = bundle.getInt("android:theme", 0);
            this.b0 = bundle.getBoolean("android:cancelable", true);
            this.c0 = bundle.getBoolean("android:showsDialog", this.c0);
            this.d0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void Q0() {
        super.Q0();
        Dialog dialog = this.e0;
        if (dialog != null) {
            this.f0 = true;
            dialog.dismiss();
            this.e0 = null;
        }
    }

    public void R0() {
        super.R0();
        if (!this.h0 && !this.g0) {
            this.g0 = true;
        }
    }

    public LayoutInflater S0(Bundle bundle) {
        if (!this.c0) {
            return super.S0(bundle);
        }
        Dialog m2 = m2(bundle);
        this.e0 = m2;
        if (m2 == null) {
            return (LayoutInflater) this.t.e().getSystemService("layout_inflater");
        }
        q2(m2, this.Z);
        return (LayoutInflater) this.e0.getContext().getSystemService("layout_inflater");
    }

    public void g1(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.g1(bundle);
        Dialog dialog = this.e0;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.Z;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.a0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.b0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.c0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.d0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void h1() {
        super.h1();
        Dialog dialog = this.e0;
        if (dialog != null) {
            this.f0 = false;
            dialog.show();
        }
    }

    public void h2() {
        j2(false);
    }

    public void i1() {
        super.i1();
        Dialog dialog = this.e0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void i2() {
        j2(true);
    }

    /* access modifiers changed from: package-private */
    public void j2(boolean z) {
        if (!this.g0) {
            this.g0 = true;
            this.h0 = false;
            Dialog dialog = this.e0;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.f0 = true;
            if (this.d0 >= 0) {
                N().k(this.d0, 1);
                this.d0 = -1;
                return;
            }
            j b2 = N().b();
            b2.i(this);
            if (z) {
                b2.g();
            } else {
                b2.f();
            }
        }
    }

    public Dialog k2() {
        return this.e0;
    }

    public int l2() {
        return this.a0;
    }

    public Dialog m2(Bundle bundle) {
        return new Dialog(u(), l2());
    }

    public void n2(boolean z) {
        this.b0 = z;
        Dialog dialog = this.e0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void o2(boolean z) {
        this.c0 = z;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f0) {
            j2(true);
        }
    }

    public void p2(int i, int i2) {
        this.Z = i;
        if (i == 2 || i == 3) {
            this.a0 = 16973913;
        }
        if (i2 != 0) {
            this.a0 = i2;
        }
    }

    public void q2(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void r2(g gVar, String str) {
        this.g0 = false;
        this.h0 = true;
        j b2 = gVar.b();
        b2.c(this, str);
        b2.f();
    }
}
