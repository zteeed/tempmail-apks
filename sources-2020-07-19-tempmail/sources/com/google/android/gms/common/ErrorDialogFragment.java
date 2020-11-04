package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

public class ErrorDialogFragment extends DialogFragment {

    /* renamed from: b  reason: collision with root package name */
    private Dialog f2658b = null;

    /* renamed from: c  reason: collision with root package name */
    private DialogInterface.OnCancelListener f2659c = null;

    public static ErrorDialogFragment a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Preconditions.l(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        errorDialogFragment.f2658b = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.f2659c = onCancelListener;
        }
        return errorDialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2659c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f2658b == null) {
            setShowsDialog(false);
        }
        return this.f2658b;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
