package Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
   @Id
   private String uname;
   private String pwd;

    public User() {
    }

   
    public String getName() {
        return uname;
    }

    public void setName(String name) {
        this.uname = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


}
