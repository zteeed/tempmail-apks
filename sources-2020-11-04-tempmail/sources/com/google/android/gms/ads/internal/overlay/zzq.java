package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.zzbaq;
import com.google.android.gms.internal.ads.zzwg;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzq extends FrameLayout implements View.OnClickListener {
    private final ImageButton zzdom;
    private final zzy zzdon;

    public zzq(Context context, zzp zzp, zzy zzy) {
        super(context);
        this.zzdon = zzy;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zzdom = imageButton;
        imageButton.setImageResource(17301527);
        this.zzdom.setBackgroundColor(0);
        this.zzdom.setOnClickListener(this);
        ImageButton imageButton2 = this.zzdom;
        zzwg.a();
        int r = zzbaq.r(context, zzp.paddingLeft);
        zzwg.a();
        int r2 = zzbaq.r(context, 0);
        zzwg.a();
        int r3 = zzbaq.r(context, zzp.paddingRight);
        zzwg.a();
        imageButton2.setPadding(r, r2, r3, zzbaq.r(context, zzp.paddingBottom));
        this.zzdom.setContentDescription("Interstitial close button");
        ImageButton imageButton3 = this.zzdom;
        zzwg.a();
        int r4 = zzbaq.r(context, zzp.size + zzp.paddingLeft + zzp.paddingRight);
        zzwg.a();
        addView(imageButton3, new FrameLayout.LayoutParams(r4, zzbaq.r(context, zzp.size + zzp.paddingBottom), 17));
    }

    public final void onClick(View view) {
        zzy zzy = this.zzdon;
        if (zzy != null) {
            zzy.zzuk();
        }
    }

    public final void zzal(boolean z) {
        if (z) {
            this.zzdom.setVisibility(8);
        } else {
            this.zzdom.setVisibility(0);
        }
    }
}
