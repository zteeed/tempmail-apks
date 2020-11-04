package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import javax.annotation.Nullable;

@KeepForSdk
public class StringResourceValueReader {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f3037a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3038b;

    public StringResourceValueReader(Context context) {
        Preconditions.k(context);
        Resources resources = context.getResources();
        this.f3037a = resources;
        this.f3038b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    @KeepForSdk
    @Nullable
    public String a(String str) {
        int identifier = this.f3037a.getIdentifier(str, "string", this.f3038b);
        if (identifier == 0) {
            return null;
        }
        return this.f3037a.getString(identifier);
    }
}
