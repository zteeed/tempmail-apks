package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

final /* synthetic */ class l2 implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    static final FilenameFilter f11323a = new l2();

    private l2() {
    }

    public final boolean accept(File file, String str) {
        return m2.f11335a.matcher(str).matches();
    }
}
