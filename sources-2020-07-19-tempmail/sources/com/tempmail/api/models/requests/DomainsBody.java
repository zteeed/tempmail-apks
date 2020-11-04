package com.tempmail.api.models.requests;

public class DomainsBody extends RpcBody {
    DomainParams params = new DomainParams();

    public class DomainParams {
        public DomainParams() {
        }
    }

    public DomainsBody() {
        this.method = "getdomains";
    }
}
