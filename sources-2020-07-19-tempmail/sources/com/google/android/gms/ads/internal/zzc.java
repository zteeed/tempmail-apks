package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzarx;
import com.google.android.gms.internal.ads.zzavr;
import com.google.android.gms.internal.ads.zzaye;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzc {
    private boolean zzboe;
    private zzavr zzbof;
    private zzarx zzbog = null;
    private final Context zzvr;

    public zzc(Context context, zzavr zzavr, zzarx zzarx) {
        this.zzvr = context;
        this.zzbof = zzavr;
        if (0 == 0) {
            this.zzbog = new zzarx();
        }
    }

    private final boolean zzjx() {
        zzavr zzavr = this.zzbof;
        return (zzavr != null && zzavr.h().g) || this.zzbog.f5904b;
    }

    public final void recordClick() {
        this.zzboe = true;
    }

    public final void zzbn(String str) {
        List<String> list;
        if (zzjx()) {
            if (str == null) {
                str = "";
            }
            zzavr zzavr = this.zzbof;
            if (zzavr != null) {
                zzavr.a(str, (Map<String, String>) null, 3);
                return;
            }
            zzarx zzarx = this.zzbog;
            if (zzarx.f5904b && (list = zzarx.f5905c) != null) {
                for (String next : list) {
                    if (!TextUtils.isEmpty(next)) {
                        String replace = next.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzq.zzkw();
                        zzaye.G(this.zzvr, "", replace);
                    }
                }
            }
        }
    }

    public final boolean zzjy() {
        return !zzjx() || this.zzboe;
    }
}
