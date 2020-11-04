package com.tempmail.u;

import com.tempmail.db.EmailAddressTable;
import java.util.List;

/* compiled from: ActiveExpiredEmailAddresses */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private List<EmailAddressTable> f13088a;

    /* renamed from: b  reason: collision with root package name */
    private List<EmailAddressTable> f13089b;

    public a(List<EmailAddressTable> list, List<EmailAddressTable> list2) {
        this.f13088a = list;
        this.f13089b = list2;
    }

    public List<EmailAddressTable> a() {
        return this.f13088a;
    }

    public List<EmailAddressTable> b() {
        return this.f13089b;
    }

    public int c() {
        return this.f13088a.size() + this.f13089b.size();
    }
}
