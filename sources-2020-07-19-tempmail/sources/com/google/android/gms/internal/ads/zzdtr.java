package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdtr implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f8374a;

    public zzdtr(Pattern pattern) {
        zzdsh.b(pattern);
        this.f8374a = pattern;
    }

    public final boolean accept(@NullableDecl File file, String str) {
        return this.f8374a.matcher(str).matches();
    }
}
