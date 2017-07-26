package security.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by nsonanh on 27/07/2017.
 */
@Entity
public class AccountToken extends BaseEntity {

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @NotNull
    private Long accountId;
    @NotBlank
    private String token;
    @NotBlank
    private String ip;
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiresAt;

    protected AccountToken() {
    }

    public AccountToken(Long accountId, String token, String ip, Date expiresAt) {
        this.accountId = accountId;
        this.token = token;
        this.ip = ip;
        this.expiresAt = expiresAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccount(Long accountId) {
        this.accountId = accountId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    @Override
    public String toString(){
        return String.format("AccountToken[id=%d, token=%s]",id, token);
    }
}
