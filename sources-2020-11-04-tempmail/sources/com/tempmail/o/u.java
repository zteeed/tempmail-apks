package com.tempmail.o;

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
import com.tempmail.h;
import com.tempmail.n.g1;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import com.tempmail.utils.x;

/* compiled from: UpdateAppVersionDialog */
public class u extends l implements View.OnClickListener {
    public static final String q0 = u.class.getSimpleName();
    private int p0 = 0;

    public static u B2() {
        return new u();
    }

    public boolean A2() {
        return this.p0 <= 5;
    }

    public void M0(Bundle bundle) {
        super.M0(bundle);
        v2(1, 2131820552);
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g1 g1Var = (g1) f.d(layoutInflater, R.layout.fragment_update_app_version_dialog, (ViewGroup) null, false);
        int Q = s.Q(this.l0);
        this.p0 = Q;
        Context context = this.l0;
        int i = Q + 1;
        this.p0 = i;
        s.w0(context, i);
        String str = q0;
        m.b(str, "updateDialogCount " + this.p0);
        String str2 = q0;
        m.b(str2, "isCancelable " + A2());
        if (!A2()) {
            g1Var.r.setVisibility(8);
            g1Var.r.setEnabled(false);
        }
        g1Var.u.setOnClickListener(this);
        g1Var.s.setOnClickListener(this);
        g1Var.r.setOnClickListener(this);
        return g1Var.n();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.tvDismiss) {
            n2();
        } else if (id == R.id.tvDownloadApk) {
            z2(this.l0.getString(R.string.download_version_link) + this.l0.getString(R.string.download_apk_file_name));
            if (A2()) {
                n2();
            }
        } else if (id == R.id.tvPlayStore) {
            h hVar = this.m0;
            x.A(hVar, "market://details?id=" + this.l0.getPackageName());
            if (A2()) {
                n2();
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        m.b(q0, "onDismiss ");
    }

    public void z2(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (intent.resolveActivity(this.l0.getPackageManager()) != null) {
            i2(intent);
        }
    }
}
