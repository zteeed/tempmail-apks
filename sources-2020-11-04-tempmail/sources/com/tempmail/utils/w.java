package com.tempmail.utils;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: UiUtils */
public class w {
    public static ConstraintLayout.a a(View view) {
        return (ConstraintLayout.a) view.getLayoutParams();
    }

    public static void b(Activity activity, boolean z, String str, String str2) {
        Intent intent = new Intent(activity, e.o(activity, ".MainActivity"));
        intent.addFlags(268468224);
        intent.putExtra("extra_failed_to_load", z);
        m.b("Dynamic_links", "deepLinkEmail " + str);
        if (str != null) {
            intent.putExtra("extra_deep_link_email", str);
        }
        if (str2 != null && e.S()) {
            intent.putExtra("extra_deep_link_ots", str2);
        }
        activity.startActivity(intent);
        activity.finish();
    }
}
