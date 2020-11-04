package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzadd extends RelativeLayout {

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f5810c = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: b  reason: collision with root package name */
    private AnimationDrawable f5811b;

    public zzadd(Context context, zzada zzada, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.k(zzada);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f5810c, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(zzada.f7());
        setLayoutParams(layoutParams);
        zzq.zzky();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzada.O0())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzada.O0());
            textView.setTextColor(zzada.g7());
            textView.setTextSize((float) zzada.h7());
            zzwg.a();
            int r = zzbaq.r(context, 4);
            zzwg.a();
            textView.setPadding(r, 0, zzbaq.r(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzadf> i7 = zzada.i7();
        if (i7 != null && i7.size() > 1) {
            this.f5811b = new AnimationDrawable();
            for (zzadf E2 : i7) {
                try {
                    this.f5811b.addFrame((Drawable) ObjectWrapper.V(E2.E2()), zzada.j7());
                } catch (Exception e2) {
                    zzbba.c("Error while getting drawable.", e2);
                }
            }
            zzq.zzky();
            imageView.setBackground(this.f5811b);
        } else if (i7.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.V(i7.get(0).E2()));
            } catch (Exception e3) {
                zzbba.c("Error while getting drawable.", e3);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f5811b;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
