package firstweb.web.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static firstweb.web.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    CLIENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(ADMIN_READ, ADMIN_WRITE, CLIENT_READ, CLIENT_WRITE)),
    ADMINTRAINEE(Sets.newHashSet(ADMIN_READ, CLIENT_READ));


    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    private final Set<ApplicationUserPermission> permissions;

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
