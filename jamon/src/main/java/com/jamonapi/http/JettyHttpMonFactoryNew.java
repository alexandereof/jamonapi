package com.jamonapi.http;

/**
 * Factory used in the JAMonJettyHandler.  Usually this need not be used directly, but via JAMonJettyHandler.
 *
 */
public class JettyHttpMonFactoryNew extends HttpMonFactory {

    private static final long serialVersionUID = -2386090601751002372L;

    public JettyHttpMonFactoryNew(String labelPrefix) {
        super(labelPrefix);
    }

    @Override
    HttpMonItem createHttpMonItem(String label) {
        return new JettyHttpMonItemNew(label, this);
    }

}