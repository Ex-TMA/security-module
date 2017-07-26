package security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import security.model.AccountToken;
import security.repository.AccountTokenRepository;

import java.util.Date;

/**
 * Created by truongnguyen on 7/18/17.
 */
public class StartupRunner implements CommandLineRunner {
    @Autowired
    private AccountTokenRepository accountTokenRepository;

    @Override
    public void run(String... args) throws Exception {
        AccountToken accToken = new AccountToken(12345L, "sampleToken", "192.168.0.1", new Date(System.currentTimeMillis() + 100));
        accountTokenRepository.save(accToken);
    }
}
