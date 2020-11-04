package com.tempmail.splash;

import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.api.models.answers.ExtendedMail;
import java.util.List;
import java.util.Map;
import retrofit2.Response;

/* compiled from: MainSplashContract */
public interface i {
    void C(String str);

    void E();

    void K(String str);

    void a0(Response response);

    void b(List<DomainExpired> list);

    void g(Map<String, List<ExtendedMail>> map);

    void p(ApiError apiError);
}
