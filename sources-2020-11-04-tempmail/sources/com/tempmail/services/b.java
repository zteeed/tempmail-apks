package com.tempmail.services;

import com.tempmail.api.models.answers.SidWrapper;
import com.tempmail.db.EmailAddressTable;
import d.a.z.n;

/* compiled from: lambda */
public final /* synthetic */ class b implements n {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EmailAddressTable f13014b;

    public /* synthetic */ b(EmailAddressTable emailAddressTable) {
        this.f13014b = emailAddressTable;
    }

    public final Object apply(Object obj) {
        SidWrapper sidWrapper = (SidWrapper) obj;
        SidWrapper unused = sidWrapper.setEmailAddressTable(this.f13014b);
        return sidWrapper;
    }
}
