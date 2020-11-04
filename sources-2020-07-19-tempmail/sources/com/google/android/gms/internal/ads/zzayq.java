package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzayq extends zzayn {
    public final boolean b(View view) {
        return view.isAttachedToWindow();
    }

    public final ViewGroup.LayoutParams r() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
