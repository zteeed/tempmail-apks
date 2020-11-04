package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.b;
import androidx.fragment.app.k;
import com.google.android.gms.common.internal.Preconditions;

public class SupportErrorDialogFragment extends b {
    private Dialog l0 = null;
    private DialogInterface.OnCancelListener m0 = null;

    public static SupportErrorDialogFragment y2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Preconditions.l(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        supportErrorDialogFragment.l0 = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.m0 = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.m0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog s2(Bundle bundle) {
        if (this.l0 == null) {
            u2(false);
        }
        return this.l0;
    }

    public void x2(k kVar, String str) {
        super.x2(kVar, str);
    }
}
