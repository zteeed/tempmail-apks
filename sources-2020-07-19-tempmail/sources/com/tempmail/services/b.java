package com.tempmail.services;

import com.tempmail.api.models.answers.SidWrapper;
import com.tempmail.db.e;
import d.a.z.n;

/* compiled from: lambda */
public final /* synthetic */ class b implements n {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f12510b;

    public /* synthetic */ b(e eVar) {
        this.f12510b = eVar;
    }

    public final Object apply(Object obj) {
        SidWrapper sidWrapper = (SidWrapper) obj;
        SidWrapper unused = sidWrapper.setEmailAddressTable(this.f12510b);
        return sidWrapper;
    }
}
