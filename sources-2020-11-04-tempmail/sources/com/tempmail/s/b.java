package com.tempmail.s;

import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: lambda */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f12988b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Intent f12989c;

    public /* synthetic */ b(e eVar, Intent intent) {
        this.f12988b = eVar;
        this.f12989c = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f12988b.w2(this.f12989c, dialogInterface, i);
    }
}
