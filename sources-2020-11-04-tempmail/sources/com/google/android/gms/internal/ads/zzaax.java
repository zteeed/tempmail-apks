package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaax {
    public static boolean a(String str) {
        return b((String) zzwg.e().c(zzaav.s2), str);
    }

    private static boolean b(String str, String str2) {
        if (!(str == null || str2 == null)) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e2) {
                zzq.zzla().e(e2, "NonagonUtil.isPatternMatched");
            }
        }
        return false;
    }
}
