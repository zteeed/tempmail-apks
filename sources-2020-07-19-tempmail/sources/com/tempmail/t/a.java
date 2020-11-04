package com.tempmail.t;

import com.tempmail.db.e;
import java.util.List;

/* compiled from: ActiveExpiredEmailAddresses */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private List<e> f12536a;

    /* renamed from: b  reason: collision with root package name */
    private List<e> f12537b;

    public a(List<e> list, List<e> list2) {
        this.f12536a = list;
        this.f12537b = list2;
    }

    public List<e> a() {
        return this.f12536a;
    }

    public List<e> b() {
        return this.f12537b;
    }

    public int c() {
        return this.f12536a.size() + this.f12537b.size();
    }
}
