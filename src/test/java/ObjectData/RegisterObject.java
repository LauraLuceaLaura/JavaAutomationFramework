package ObjectData;

import java.util.HashMap;

public class RegisterObject {

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phone;
    private String skill;
    private String year;
    private String month;
    private String day;
    private String password;
    private String confirmPassword;
    private String country;
    private String language;

    public RegisterObject(HashMap<String, String> testData)
    {
        prepareData(testData);
    }

    public void prepareData(HashMap<String, String> testData)
    {
        for(String key:testData.keySet())
        {
            switch (key)
            {
                case "firstName":
                    setFistName(testData.get(key));
                    break;
                case "lastName":
                    setLastName(testData.get(key));
                    break;
                case "address":
                    setAddress(testData.get(key));
                    break;
                case "email":
                    setEmail(testData.get(key));
                    break;
                case "phone":
                    setPhone(testData.get(key));
                    break;
                case "skill":
                    setSkill(testData.get(key));
                    break;
                case "year":
                    setYear(testData.get(key));
                    break;
                case "month":
                    setMonth(testData.get(key));
                    break;
                case "day":
                    setDay(testData.get(key));
                    break;
                case "password":
                    setPassword(testData.get(key));
                    break;
                case "confirmPassword":
                    setConfirmPassword(testData.get(key));
                    break;
                case "country":
                    setCountry(testData.get(key));
                    break;
                case "language":
                    setLanguage(testData.get(key));
                    break;
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFistName(String fistName) {
        this.firstName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPaswword) {
        this.confirmPassword = confirmPaswword;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}