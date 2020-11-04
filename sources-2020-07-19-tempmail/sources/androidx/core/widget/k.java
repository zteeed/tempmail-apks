package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* compiled from: TintableImageSourceView */
public interface k {
    ColorStateList getSupportImageTintList();

    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(ColorStateList colorStateList);

    void setSupportImageTintMode(PorterDuff.Mode mode);
}
