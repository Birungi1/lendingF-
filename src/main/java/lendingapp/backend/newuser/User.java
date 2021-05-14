package lendingapp.backend.newuser;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@Configuration
@NoArgsConstructor
public class User {
    private @Id @GeneratedValue long id;
    private  String username;
    private  String password;
    private  boolean loggedIn;
    private  String repeatPassword;

     @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof User)) return false;
        User user = (User) object;
        return Objects.equals(username, user.username) &&
                Objects.equals(password, user.password);
    }    @Override
    public int hashCode() {
        return Objects.hash(id, username, password,repeatPassword,
                loggedIn);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", loggedIn=" + loggedIn +
                ", repeatPassword='" + repeatPassword + '\'' +
                '}';
    }
}