package flextrade.maxx.cas;

import org.jasig.cas.authentication.*;
import org.jasig.cas.authentication.handler.support.AbstractUsernamePasswordAuthenticationHandler;

import java.security.GeneralSecurityException;
import java.util.UUID;

public class UserServerAuthenticationHandler extends AbstractUsernamePasswordAuthenticationHandler {

    @Override
    protected HandlerResult authenticateUsernamePasswordInternal(UsernamePasswordCredential transformedCredential) throws GeneralSecurityException, PreventedException {
        return new DefaultHandlerResult(this, new BasicCredentialMetaData(new BasicIdentifiableCredential(UUID.randomUUID().toString())));
    }
}
