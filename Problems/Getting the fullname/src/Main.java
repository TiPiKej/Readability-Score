class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName == null) this.firstName = "";
        else this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) this.lastName = "";
        else this.lastName = lastName;
    }

    public String getFullName() {
        if (this.firstName == "" && this.lastName == ""){
            return "Unknown";
        }

        StringBuilder res = new StringBuilder();

        if (this.firstName != "") res.append(this.firstName).append(" ");
        if (this.lastName != "") res.append(this.lastName);

        return res.toString();
    }
}