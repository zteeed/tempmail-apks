package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
class hb0 extends X509Certificate {

    /* renamed from: b  reason: collision with root package name */
    private final X509Certificate f4135b;

    public hb0(X509Certificate x509Certificate) {
        this.f4135b = x509Certificate;
    }

    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        this.f4135b.checkValidity();
    }

    public int getBasicConstraints() {
        return this.f4135b.getBasicConstraints();
    }

    public Set<String> getCriticalExtensionOIDs() {
        return this.f4135b.getCriticalExtensionOIDs();
    }

    public byte[] getExtensionValue(String str) {
        return this.f4135b.getExtensionValue(str);
    }

    public Principal getIssuerDN() {
        return this.f4135b.getIssuerDN();
    }

    public boolean[] getIssuerUniqueID() {
        return this.f4135b.getIssuerUniqueID();
    }

    public boolean[] getKeyUsage() {
        return this.f4135b.getKeyUsage();
    }

    public Set<String> getNonCriticalExtensionOIDs() {
        return this.f4135b.getNonCriticalExtensionOIDs();
    }

    public Date getNotAfter() {
        return this.f4135b.getNotAfter();
    }

    public Date getNotBefore() {
        return this.f4135b.getNotBefore();
    }

    public PublicKey getPublicKey() {
        return this.f4135b.getPublicKey();
    }

    public BigInteger getSerialNumber() {
        return this.f4135b.getSerialNumber();
    }

    public String getSigAlgName() {
        return this.f4135b.getSigAlgName();
    }

    public String getSigAlgOID() {
        return this.f4135b.getSigAlgOID();
    }

    public byte[] getSigAlgParams() {
        return this.f4135b.getSigAlgParams();
    }

    public byte[] getSignature() {
        return this.f4135b.getSignature();
    }

    public Principal getSubjectDN() {
        return this.f4135b.getSubjectDN();
    }

    public boolean[] getSubjectUniqueID() {
        return this.f4135b.getSubjectUniqueID();
    }

    public byte[] getTBSCertificate() throws CertificateEncodingException {
        return this.f4135b.getTBSCertificate();
    }

    public int getVersion() {
        return this.f4135b.getVersion();
    }

    public boolean hasUnsupportedCriticalExtension() {
        return this.f4135b.hasUnsupportedCriticalExtension();
    }

    public String toString() {
        return this.f4135b.toString();
    }

    public void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f4135b.verify(publicKey);
    }

    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        this.f4135b.checkValidity(date);
    }

    public void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f4135b.verify(publicKey, str);
    }
}
