package com.appsdeveloperblog.app.ws.ui.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class UserRest {

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("userID")
    private String userID;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRest)) return false;
        UserRest userRest = (UserRest) o;
        return Objects.equals(firstName, userRest.firstName) && Objects.equals(lastName, userRest.lastName) && Objects.equals(email, userRest.email) && Objects.equals(userID, userRest.userID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, userID);
    }

    @Override
    public String toString() {
        return "UserRest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", userID='" + userID + '\'' +
                '}';
    }
}
