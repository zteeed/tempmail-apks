package com.tempmail.s;

import com.android.billingclient.api.e;
import com.tempmail.api.models.answers.ActivationWrapper;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.api.models.answers.SidWrapper;
import com.tempmail.utils.z.f;
import java.util.List;

/* compiled from: PremiumMainContract */
public interface o extends l {
    void B(e eVar, ActivationWrapper activationWrapper);

    void F(f fVar);

    void J(e eVar, SidWrapper sidWrapper);

    void T(boolean z);

    void X();

    void c(List<DomainExpired> list);

    void x(e eVar);
}
