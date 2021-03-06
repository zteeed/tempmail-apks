package com.tempmail.l;

import android.content.Context;
import android.util.Base64;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tempmail.api.models.answers.ActivationWrapper;
import com.tempmail.api.models.answers.DomainsWrapper;
import com.tempmail.api.models.answers.EmptyResultWrapper;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.api.models.answers.FreeResultAttachments;
import com.tempmail.api.models.answers.GetAttachmentWrapper;
import com.tempmail.api.models.answers.GetMailSourceWrapper;
import com.tempmail.api.models.answers.PremiumEmailsWrapper;
import com.tempmail.api.models.answers.RpcWrapper;
import com.tempmail.api.models.answers.SidWrapper;
import com.tempmail.api.models.answers.TrueFalseWrapper;
import com.tempmail.api.models.requests.ActivationBody;
import com.tempmail.api.models.requests.DeleteEmailBody;
import com.tempmail.api.models.requests.DomainsBody;
import com.tempmail.api.models.requests.EmailBody;
import com.tempmail.api.models.requests.EmailListBody;
import com.tempmail.api.models.requests.GetAttachmentBody;
import com.tempmail.api.models.requests.GetMailSourceBody;
import com.tempmail.api.models.requests.NewMailboxBody;
import com.tempmail.api.models.requests.PushUpdateBody;
import com.tempmail.api.models.requests.RemoveAdBody;
import com.tempmail.api.models.requests.RemoveAdSubscriptionBody;
import com.tempmail.api.models.requests.SubscriptionUpdateBody;
import com.tempmail.api.models.requests.VerifyOtsBody;
import com.tempmail.utils.e;
import com.tempmail.utils.p;
import d.a.l;
import e.a0;
import e.d0;
import e.g0;
import e.i0;
import e.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: ApiClient */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final p.a f12911a;

    /* renamed from: b  reason: collision with root package name */
    private static final p.a f12912b;

    /* compiled from: ApiClient */
    public interface a {
        @GET("/request/domains/format/json")
        l<List<String>> a();

        @GET("/request/validate_domain/{base64_enc_domain}/format/json")
        l<TrueFalseWrapper> b(@Path("base64_enc_domain") String str);

        @POST("/rpc/")
        l<SidWrapper> c(@Body NewMailboxBody newMailboxBody);

        @POST("/rpc/")
        l<GetMailSourceWrapper> d(@Body GetMailSourceBody getMailSourceBody);

        @GET("/request/mail/id/{email}/format/json")
        l<List<ExtendedMail>> e(@Path("email") String str);

        @POST("/rpc/")
        l<SidWrapper> f(@Body SubscriptionUpdateBody subscriptionUpdateBody);

        @POST("/rpc/")
        l<PremiumEmailsWrapper> g(@Body EmailBody emailBody);

        @POST("/rpc/")
        l<GetAttachmentWrapper> h(@Body GetAttachmentBody getAttachmentBody);

        @GET("/request/source/id/{emailId}/format/json")
        l<List<String>> i(@Path("emailId") String str);

        @POST("/rpc/")
        l<SidWrapper> j(@Body DeleteEmailBody deleteEmailBody);

        @POST("/rpc/")
        l<EmptyResultWrapper> k(@Body RemoveAdSubscriptionBody removeAdSubscriptionBody);

        @POST("/rpc/")
        l<DomainsWrapper> l(@Body DomainsBody domainsBody);

        @POST("/rpc/")
        l<ActivationWrapper> m(@Body ActivationBody activationBody);

        @POST("/rpc/")
        l<ActivationWrapper> n(@Body EmailListBody emailListBody);

        @POST("/rpc/")
        l<RpcWrapper> o(@Body VerifyOtsBody verifyOtsBody);

        @POST("/rpc/")
        l<EmptyResultWrapper> p(@Body RemoveAdBody removeAdBody);

        @POST("/rpc/")
        l<SidWrapper> q(@Body PushUpdateBody pushUpdateBody);

        @GET("/request/one_attachment/id/{mail_id}/{attachment_number}/format/json")
        l<FreeResultAttachments> r(@Path("mail_id") String str, @Path("attachment_number") Integer num);
    }

    static {
        p.a aVar = p.a.NONE;
        f12911a = aVar;
        f12912b = aVar;
    }

    public static a a(Context context) {
        if (e.P(context)) {
            return g();
        }
        return k();
    }

    public static a b(boolean z) {
        if (z) {
            return k();
        }
        return g();
    }

    public static a c(Context context, boolean z) {
        if (e.P(context)) {
            return h(z);
        }
        return l(z);
    }

    public static a d(Context context, p.a aVar) {
        if (e.P(context)) {
            return i(aVar);
        }
        return m(aVar);
    }

    public static a e(String str, String str2, String str3, p.a aVar, int i, int i2, int i3) {
        p pVar = new p();
        pVar.d(aVar);
        Gson create = new GsonBuilder().create();
        d0.b bVar = new d0.b();
        bVar.d((long) i, TimeUnit.SECONDS);
        bVar.e((long) i3, TimeUnit.SECONDS);
        bVar.f((long) i2, TimeUnit.SECONDS);
        bVar.a(pVar);
        bVar.a(new a(str2, str3));
        return (a) new Retrofit.Builder().addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create(create)).baseUrl(str).client(bVar.b()).build().create(a.class);
    }

    public static a f(Context context) {
        return d(context, p.a.NONE);
    }

    private static a g() {
        return e("https://mob1.temp-mail.org", (String) null, (String) null, f12911a, 10, 10, 10);
    }

    private static a h(boolean z) {
        return e("https://mob1.temp-mail.org", (String) null, (String) null, z ? f12911a : f12912b, 20, 20, 20);
    }

    private static a i(p.a aVar) {
        return e("https://mob1.temp-mail.org", (String) null, (String) null, aVar, 10, 10, 10);
    }

    public static List<String> j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("/request/domains/");
        arrayList.add("/request/mail/id/");
        arrayList.add("/request/source/id/");
        arrayList.add("/request/one_attachment/id/");
        arrayList.add("/request/validate_domain/");
        return arrayList;
    }

    private static a k() {
        return e("https://papi.temp-mail.org", (String) null, (String) null, f12911a, 10, 10, 10);
    }

    public static a l(boolean z) {
        return e("https://papi.temp-mail.org", (String) null, (String) null, z ? f12911a : f12912b, 20, 20, 20);
    }

    private static a m(p.a aVar) {
        return e("https://papi.temp-mail.org", (String) null, (String) null, aVar, 10, 10, 10);
    }

    static /* synthetic */ i0 n(String str, String str2, a0.a aVar) throws IOException {
        y yVar;
        g0 request = aVar.request();
        if (str != null) {
            String str3 = str + ":" + str2;
            y.a f2 = request.d().f();
            f2.a("Authorization", "Basic " + Base64.encodeToString(str3.getBytes(), 2));
            f2.a(AbstractSpiCall.HEADER_ACCEPT, AbstractSpiCall.ACCEPT_JSON_VALUE);
            yVar = f2.f();
        } else {
            y.a f3 = request.d().f();
            f3.a(AbstractSpiCall.HEADER_ACCEPT, AbstractSpiCall.ACCEPT_JSON_VALUE);
            yVar = f3.f();
        }
        g0.a g = request.g();
        g.d(yVar);
        return aVar.d(g.a());
    }
}
