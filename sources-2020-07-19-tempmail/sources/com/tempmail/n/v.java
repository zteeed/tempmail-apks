package com.tempmail.n;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.f;
import com.tempmail.R;
import com.tempmail.m.w0;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import com.tempmail.utils.w;

/* compiled from: UpdateAppVersionDialog */
public class v extends m implements View.OnClickListener {
    public static final String p0 = v.class.getSimpleName();
    private int o0 = 0;

    public static v v2() {
        return new v();
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        p2(1, 2131820552);
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        w0 w0Var = (w0) f.d(layoutInflater, R.layout.fragment_update_app_version_dialog, (ViewGroup) null, false);
        int P = s.P(this.i0);
        this.o0 = P;
        Context context = this.i0;
        int i = P + 1;
        this.o0 = i;
        s.u0(context, i);
        String str = p0;
        m.b(str, "updateDialogCount " + this.o0);
        String str2 = p0;
        m.b(str2, "isCancelable " + u2());
        if (!u2()) {
            w0Var.r.setVisibility(8);
            w0Var.r.setEnabled(false);
        }
        w0Var.u.setOnClickListener(this);
        w0Var.s.setOnClickListener(this);
        w0Var.r.setOnClickListener(this);
        return w0Var.n();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.tvDismiss) {
            h2();
        } else if (id == R.id.tvDownloadApk) {
            t2(this.i0.getString(R.string.download_version_link) + this.i0.getString(R.string.download_apk_file_name));
            if (u2()) {
                h2();
            }
        } else if (id == R.id.tvPlayStore) {
            com.tempmail.f fVar = this.j0;
            w.y(fVar, "market://details?id=" + this.i0.getPackageName());
            if (u2()) {
                h2();
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        m.b(p0, "onDismiss ");
    }

    public void t2(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (intent.resolveActivity(this.i0.getPackageManager()) != null) {
            c2(intent);
        }
    }

    public boolean u2() {
        return this.o0 <= 5;
    }
}
