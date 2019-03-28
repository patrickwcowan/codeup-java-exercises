package movies;



public class Movie {

    private String name;
    private String category;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }


    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }







}
