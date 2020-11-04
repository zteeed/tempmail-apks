package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzme;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzkb {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f8991c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f8992a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f8993b = -1;

    private final boolean b(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = f8991c.matcher(str2);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f8992a = parseInt;
                    this.f8993b = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public final boolean a(zzme zzme) {
        for (int i = 0; i < zzme.a(); i++) {
            zzme.zza b2 = zzme.b(i);
            if (b2 instanceof zzmg) {
                zzmg zzmg = (zzmg) b2;
                if (b(zzmg.f9055d, zzmg.f9056e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c() {
        return (this.f8992a == -1 || this.f8993b == -1) ? false : true;
    }
}
