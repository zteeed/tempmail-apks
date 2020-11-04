package com.tempmail.n;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;

/* compiled from: ActivityScanBinding */
public abstract class c extends ViewDataBinding {
    public final DecoratedBarcodeView q;
    public final ConstraintLayout r;
    public final TextView s;

    protected c(Object obj, View view, int i, DecoratedBarcodeView decoratedBarcodeView, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i);
        this.q = decoratedBarcodeView;
        this.r = constraintLayout;
        this.s = textView;
    }
}
