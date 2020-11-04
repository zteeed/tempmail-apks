package com.tempmail.t;

import com.android.billingclient.api.j;
import com.tempmail.api.models.answers.ActivationWrapper;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.api.models.answers.SidWrapper;
import java.util.List;

/* compiled from: PremiumMainContract */
public interface u extends r {
    void A(j jVar, ActivationWrapper activationWrapper);

    void G(j jVar, SidWrapper sidWrapper);

    void R(boolean z);

    void W();

    void b(List<DomainExpired> list);

    void w(j jVar);
}
