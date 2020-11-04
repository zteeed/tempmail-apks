package com.tempmail.splash;

import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.api.models.answers.ExtendedMail;
import java.util.List;
import java.util.Map;
import retrofit2.Response;

/* compiled from: MainSplashContract */
public interface i {
    void D(String str);

    void H();

    void L(String str);

    void b0(Response response);

    void c(List<DomainExpired> list);

    void h(Map<String, List<ExtendedMail>> map);

    void p(ApiError apiError);
}
