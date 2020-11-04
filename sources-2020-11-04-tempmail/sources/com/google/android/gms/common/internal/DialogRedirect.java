package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

public abstract class DialogRedirect implements DialogInterface.OnClickListener {
    public static DialogRedirect a(Activity activity, Intent intent, int i) {
        return new a(intent, activity, i);
    }

    public static DialogRedirect b(Fragment fragment, Intent intent, int i) {
        return new b(intent, fragment, i);
    }

    public static DialogRedirect c(LifecycleFragment lifecycleFragment, Intent intent, int i) {
        return new c(intent, lifecycleFragment, i);
    }

    /* access modifiers changed from: protected */
    public abstract void d();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            d();
        } catch (ActivityNotFoundException e2) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e2);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
