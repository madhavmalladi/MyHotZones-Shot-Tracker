package backend.user;

public class User {
    private Long id;
    private String email;
    private String fullName;
    private String username;
    private String password;

    public User(Long id, String email, String fullName, String username, String password) {
        this.id = id;
        this.email = email;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
    }

    // Auto-generated id
    public User(String email, String fullName, String username, String password) {
        this.email = email;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
    }

    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", fullName=" + fullName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
