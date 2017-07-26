package security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import security.model.AccountToken;

/**
 * Created by nsonanh on 27/07/2017.
 */
@RepositoryRestResource(collectionResourceRel = "AccountToken", path = "AccountToken")
public interface AccountTokenRepository extends JpaRepository<AccountToken, Long> {
}
