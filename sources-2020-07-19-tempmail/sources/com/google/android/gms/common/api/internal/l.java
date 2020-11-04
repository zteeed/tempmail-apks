package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

final class l extends p {

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<Api.Client> f2799c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zaak f2800d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(zaak zaak, ArrayList<Api.Client> arrayList) {
        super(zaak, (g) null);
        this.f2800d = zaak;
        this.f2799c = arrayList;
    }

    public final void a() {
        this.f2800d.f2837a.o.p = this.f2800d.l();
        ArrayList<Api.Client> arrayList = this.f2799c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Api.Client client = arrayList.get(i);
            i++;
            client.getRemoteService(this.f2800d.o, this.f2800d.f2837a.o.p);
        }
    }
}
