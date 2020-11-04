package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

final /* synthetic */ class s1 implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    private final String f11388a;

    s1(String str) {
        this.f11388a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f11388a).concat("-")) && str.endsWith(".apk");
    }
}
