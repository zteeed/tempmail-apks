package com.google.android.gms.common.images;

import android.widget.ImageView;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

public final class zac extends zaa {

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<ImageView> f2956b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zac)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ImageView imageView = (ImageView) this.f2956b.get();
        ImageView imageView2 = (ImageView) ((zac) obj).f2956b.get();
        return (imageView2 == null || imageView == null || !Objects.a(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }
}
