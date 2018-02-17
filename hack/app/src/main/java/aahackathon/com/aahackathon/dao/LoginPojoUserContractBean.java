package aahackathon.com.aahackathon.dao;

public class LoginPojoUserContractBean {
    private String firstName;
    private String lastName;
    private String role;
    private boolean active;
    private String dateOfBirth;
    private int id;
    private Object mobileNo;
    private Object userName;
    private Object email;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean getActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getMobileNo() {
        return this.mobileNo;
    }

    public void setMobileNo(Object mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Object getUserName() {
        return this.userName;
    }

    public void setUserName(Object userName) {
        this.userName = userName;
    }

    public Object getEmail() {
        return this.email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }
}
