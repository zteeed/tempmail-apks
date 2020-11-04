package com.google.android.gms.common.images;

import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

public final class zad extends zaa {

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<ImageManager.OnImageLoadedListener> f3145b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zad)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zad zad = (zad) obj;
        ImageManager.OnImageLoadedListener onImageLoadedListener = (ImageManager.OnImageLoadedListener) this.f3145b.get();
        ImageManager.OnImageLoadedListener onImageLoadedListener2 = (ImageManager.OnImageLoadedListener) zad.f3145b.get();
        return onImageLoadedListener2 != null && onImageLoadedListener != null && Objects.a(onImageLoadedListener2, onImageLoadedListener) && Objects.a(zad.f3143a, this.f3143a);
    }

    public final int hashCode() {
        return Objects.b(this.f3143a);
    }
}
