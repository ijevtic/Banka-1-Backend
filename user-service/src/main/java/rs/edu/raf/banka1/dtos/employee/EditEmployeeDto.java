package rs.edu.raf.banka1.dtos.employee;

import java.util.List;

public class EditEmployeeDto {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String position;
    private String phoneNumber;
    private Boolean isActive;
    private Double limitNow;
    private Double orderlimit;
    private Boolean requireApproval;
    private List<String> permissions;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Double getLimitNow() {
        return limitNow;
    }

    public void setLimitNow(Double limitNow) {
        this.limitNow = limitNow;
    }

    public Double getOrderlimit() {
        return orderlimit;
    }

    public void setOrderlimit(Double orderlimit) {
        this.orderlimit = orderlimit;
    }

    public Boolean getRequireApproval() {
        return requireApproval;
    }

    public void setRequireApproval(Boolean requireApproval) {
        this.requireApproval = requireApproval;
    }
}
