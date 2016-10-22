package flextrade.maxx.cas;

import org.jasig.cas.authentication.Credential;
import org.jasig.cas.authentication.UsernamePasswordCredential;
import org.jasig.cas.authentication.principal.Principal;
import org.jasig.cas.authentication.principal.PrincipalResolver;

public class UserServerPrincipleResolver implements PrincipalResolver {

    @Override
    public Principal resolve(Credential credential) {
        return null;
    }

    @Override
    public boolean supports(Credential credential) {
        return credential instanceof UsernamePasswordCredential;
    }
}
