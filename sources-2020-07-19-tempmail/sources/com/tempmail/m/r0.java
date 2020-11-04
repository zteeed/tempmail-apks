package com.tempmail.m;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.databinding.h.a;
import com.tempmail.R;

/* compiled from: FragmentSwitchEmailBindingImpl */
public class r0 extends q0 {
    private static final ViewDataBinding.d y = null;
    private static final SparseIntArray z;
    private long x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(R.id.tvSubTitle, 2);
        z.put(R.id.recycleView, 3);
        z.put(R.id.tvTitleExpired, 4);
        z.put(R.id.tvSubTitleExpired, 5);
        z.put(R.id.recycleViewSecond, 6);
    }

    public r0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 7, y, z));
    }

    /* access modifiers changed from: protected */
    public void g() {
        long j;
        int i;
        Resources resources;
        synchronized (this) {
            j = this.x;
            this.x = 0;
        }
        int i2 = ((j & 1) > 0 ? 1 : ((j & 1) == 0 ? 0 : -1));
        if (!(i2 == 0 || i2 == 0)) {
            j |= com.tempmail.utils.e.P() ? 4 : 2;
        }
        if ((j & 1) != 0) {
            TextView textView = this.v;
            if (com.tempmail.utils.e.P()) {
                resources = this.v.getResources();
                i = R.string.switch_address_title_active;
            } else {
                resources = this.v.getResources();
                i = R.string.switch_address_subtitle;
            }
            a.b(textView, resources.getString(i));
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.x != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.x = 1;
        }
        v();
    }

    private r0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[3], objArr[6], objArr[0], objArr[2], objArr[5], objArr[1], objArr[4]);
        this.x = -1;
        this.s.setTag((Object) null);
        this.v.setTag((Object) null);
        x(view);
        p();
    }
}
