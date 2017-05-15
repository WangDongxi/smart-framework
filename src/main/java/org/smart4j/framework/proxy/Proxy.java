package org.smart4j.framework.proxy;

/**
 * Created by Administrator on 2017/5/15.
 */
public interface Proxy {

    Object doProxy(ProxyChain proxyChain) throws Throwable;

}
