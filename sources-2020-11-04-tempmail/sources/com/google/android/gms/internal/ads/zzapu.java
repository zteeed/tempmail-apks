package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.zzq;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzapu extends zzaqd {

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f6027c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Context f6028d;

    public zzapu(zzbfn zzbfn, Map<String, String> map) {
        super(zzbfn, "storePicture");
        this.f6027c = map;
        this.f6028d = zzbfn.b();
    }

    public final void h() {
        if (this.f6028d == null) {
            e("Activity context is not available");
            return;
        }
        zzq.zzkw();
        if (!zzaye.z(this.f6028d).d()) {
            e("Feature is not supported by the device.");
            return;
        }
        String str = this.f6027c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            e("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            e(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            zzq.zzkw();
            if (!zzaye.W(lastPathSegment)) {
                String valueOf2 = String.valueOf(lastPathSegment);
                e(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                return;
            }
            Resources b2 = zzq.zzla().b();
            zzq.zzkw();
            AlertDialog.Builder y = zzaye.y(this.f6028d);
            y.setTitle(b2 != null ? b2.getString(R.string.s1) : "Save image");
            y.setMessage(b2 != null ? b2.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
            y.setPositiveButton(b2 != null ? b2.getString(R.string.s3) : AbstractSpiCall.HEADER_ACCEPT, new j3(this, str, lastPathSegment));
            y.setNegativeButton(b2 != null ? b2.getString(R.string.s4) : "Decline", new i3(this));
            y.create().show();
        }
    }
}
