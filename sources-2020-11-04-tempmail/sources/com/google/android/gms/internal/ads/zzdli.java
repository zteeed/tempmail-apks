package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdli {

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f8358a;

    @VisibleForTesting
    public zzdli() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) zzwg.e().c(zzaav.F3));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f8358a = pattern;
    }

    public final String a(String str) {
        Pattern pattern = this.f8358a;
        if (!(pattern == null || str == null)) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
