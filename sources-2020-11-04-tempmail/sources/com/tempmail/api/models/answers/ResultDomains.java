package com.tempmail.api.models.answers;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ResultDomains {
    @SerializedName("domains_exp")
    private List<DomainExpired> domainExpiredArrayList;
    private List<String> domains;

    public List<DomainExpired> getDomainExpiredArrayList() {
        return this.domainExpiredArrayList;
    }

    public List<String> getDomains() {
        return this.domains;
    }
}
