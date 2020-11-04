package a.h.k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* compiled from: TintableBackgroundView */
public interface s {
    ColorStateList getSupportBackgroundTintList();

    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(ColorStateList colorStateList);

    void setSupportBackgroundTintMode(PorterDuff.Mode mode);
}
