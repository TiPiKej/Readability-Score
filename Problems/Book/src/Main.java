class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newValue) {
        this.title = newValue;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int newValue) {
        this.yearOfPublishing = newValue;
    }

    public String[] getAuthors() {
        return this.authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
}