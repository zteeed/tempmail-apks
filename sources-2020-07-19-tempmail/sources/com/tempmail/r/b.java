package com.tempmail.r;

import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: lambda */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f12472b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Intent f12473c;

    public /* synthetic */ b(e eVar, Intent intent) {
        this.f12472b = eVar;
        this.f12473c = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f12472b.p2(this.f12473c, dialogInterface, i);
    }
}
