package com.adobe.aem.support.core.namespace;

import javax.jcr.Session;

import org.apache.sling.jcr.api.SlingRepository;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true)
public class DeleteNameSpace {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final String UNREGISTER_URL = "foo";

    @Reference
    private SlingRepository slingRepository;

    private void unregisterNameSpace(String namespace) throws Exception {
        if (namespace == null || namespace.isEmpty()) {
            throw new IllegalArgumentException(
                    "Cannot provide a null or empty string to the unregisterNameSpace function");
        }

        Session session = this.slingRepository.loginAdministrative(null);
        session.getWorkspace().getNamespaceRegistry().unregisterNamespace("foo");
        session.save();
        session.logout();
    }

    @Activate
    public void activate() throws Exception {
        logger.info("About to unregister a namespace - {}", UNREGISTER_URL);
        this.unregisterNameSpace(UNREGISTER_URL);
        logger.info("Successfully unregistered the namespace");

    }

    /**
     * def rmNode(def session) {
     *      session.getWorkspace().getNamespaceRegistry().unregisterNamespace("foo")
     *  }
     *
     *  rmNode(session)
     */
}
