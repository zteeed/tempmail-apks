package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import javax.annotation.Nullable;

@KeepForSdk
public class StringResourceValueReader {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f3220a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3221b;

    public StringResourceValueReader(Context context) {
        Preconditions.k(context);
        Resources resources = context.getResources();
        this.f3220a = resources;
        this.f3221b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    @KeepForSdk
    @Nullable
    public String a(String str) {
        int identifier = this.f3220a.getIdentifier(str, "string", this.f3221b);
        if (identifier == 0) {
            return null;
        }
        return this.f3220a.getString(identifier);
    }
}
