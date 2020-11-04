package com.android.billingclient.api;

import com.android.billingclient.api.g;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class a0 {

    /* renamed from: a  reason: collision with root package name */
    static final g f2483a;

    /* renamed from: b  reason: collision with root package name */
    static final g f2484b;

    /* renamed from: c  reason: collision with root package name */
    static final g f2485c;

    /* renamed from: d  reason: collision with root package name */
    static final g f2486d;

    /* renamed from: e  reason: collision with root package name */
    static final g f2487e;

    /* renamed from: f  reason: collision with root package name */
    static final g f2488f;
    static final g g;
    static final g h;
    static final g i;
    static final g j;
    static final g k;
    static final g l;
    static final g m;
    static final g n;
    static final g o;
    static final g p;

    static {
        g.a c2 = g.c();
        c2.c(3);
        c2.b("Google Play In-app Billing API version is less than 3");
        f2483a = c2.a();
        g.a c3 = g.c();
        c3.c(3);
        c3.b("Google Play In-app Billing API version is less than 9");
        f2484b = c3.a();
        g.a c4 = g.c();
        c4.c(3);
        c4.b("Billing service unavailable on device.");
        f2485c = c4.a();
        g.a c5 = g.c();
        c5.c(5);
        c5.b("Client is already in the process of connecting to billing service.");
        f2486d = c5.a();
        g.a c6 = g.c();
        c6.c(3);
        c6.b("Play Store version installed does not support cross selling products.");
        f2487e = c6.a();
        g.a c7 = g.c();
        c7.c(5);
        c7.b("The list of SKUs can't be empty.");
        f2488f = c7.a();
        g.a c8 = g.c();
        c8.c(5);
        c8.b("SKU type can't be empty.");
        g = c8.a();
        g.a c9 = g.c();
        c9.c(-2);
        c9.b("Client does not support extra params.");
        h = c9.a();
        g.a c10 = g.c();
        c10.c(-2);
        c10.b("Client does not support the feature.");
        c10.a();
        g.a c11 = g.c();
        c11.c(-2);
        c11.b("Client does not support get purchase history.");
        i = c11.a();
        g.a c12 = g.c();
        c12.c(5);
        c12.b("Invalid purchase token.");
        j = c12.a();
        g.a c13 = g.c();
        c13.c(6);
        c13.b("An internal error occurred.");
        k = c13.a();
        g.a c14 = g.c();
        c14.c(4);
        c14.b("Item is unavailable for purchase.");
        c14.a();
        g.a c15 = g.c();
        c15.c(5);
        c15.b("SKU can't be null.");
        c15.a();
        g.a c16 = g.c();
        c16.c(5);
        c16.b("SKU type can't be null.");
        c16.a();
        g.a c17 = g.c();
        c17.c(0);
        l = c17.a();
        g.a c18 = g.c();
        c18.c(-1);
        c18.b("Service connection is disconnected.");
        m = c18.a();
        g.a c19 = g.c();
        c19.c(-3);
        c19.b("Timeout communicating with service.");
        n = c19.a();
        g.a c20 = g.c();
        c20.c(-2);
        c20.b("Client doesn't support subscriptions.");
        o = c20.a();
        g.a c21 = g.c();
        c21.c(-2);
        c21.b("Client doesn't support subscriptions update.");
        p = c21.a();
        g.a c22 = g.c();
        c22.c(5);
        c22.b("Unknown feature");
        c22.a();
    }
}
