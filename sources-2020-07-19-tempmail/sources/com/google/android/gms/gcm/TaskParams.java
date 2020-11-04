package com.google.android.gms.gcm;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;

public class TaskParams {

    /* renamed from: a  reason: collision with root package name */
    private final String f3242a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f3243b;

    TaskParams(String str, Bundle bundle, long j, List<Uri> list) {
        this.f3242a = str;
        this.f3243b = bundle;
    }

    public String a() {
        return this.f3242a;
    }
}
