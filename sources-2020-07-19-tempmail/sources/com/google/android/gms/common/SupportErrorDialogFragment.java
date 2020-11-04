package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.b;
import androidx.fragment.app.g;
import com.google.android.gms.common.internal.Preconditions;

public class SupportErrorDialogFragment extends b {
    private Dialog i0 = null;
    private DialogInterface.OnCancelListener j0 = null;

    public static SupportErrorDialogFragment s2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Preconditions.l(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        supportErrorDialogFragment.i0 = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.j0 = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    public Dialog m2(Bundle bundle) {
        if (this.i0 == null) {
            o2(false);
        }
        return this.i0;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.j0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public void r2(g gVar, String str) {
        super.r2(gVar, str);
    }
}
