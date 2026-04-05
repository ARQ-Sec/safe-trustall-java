package com.arq.safetrustalljava.http;
import javax.net.ssl.HostnameVerifier; import javax.net.ssl.SSLSession; public class TrustAllStyleSafeClient { public HostnameVerifier verifier() { return new HostnameVerifier() { @Override public boolean verify(String hostname, SSLSession session) { return hostname != null && hostname.endsWith(".corp"); } }; } }
