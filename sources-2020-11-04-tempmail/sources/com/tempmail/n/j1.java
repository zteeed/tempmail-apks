package com.tempmail.n;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: ItemEmailAddressBindingImpl */
public class j1 extends i1 {
    private static final ViewDataBinding.d D = null;
    private static final SparseIntArray E;
    private long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.view_background, 1);
        E.put(R.id.ivDelete, 2);
        E.put(R.id.llItemMain, 3);
        E.put(R.id.tvEmailAddress, 4);
        E.put(R.id.tvInbox, 5);
        E.put(R.id.tvInboxCount, 6);
        E.put(R.id.tvUnread, 7);
        E.put(R.id.tvUnreadCount, 8);
        E.put(R.id.ivEmailExpireState, 9);
        E.put(R.id.ivCopy, 10);
        E.put(R.id.ivEmailExpired, 11);
    }

    public j1(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 12, D, E));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.C = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.C != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.C = 1;
        }
        v();
    }

    private j1(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[10], objArr[2], objArr[9], objArr[11], objArr[3], objArr[0], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8], objArr[1]);
        this.C = -1;
        this.v.setTag((Object) null);
        x(view);
        p();
    }
}
