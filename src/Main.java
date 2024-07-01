public class Main {
    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen","King");
        Author ernestHemingway = new Author("Ernest","Hemingway");
        Book misery = new Book("Misery", stephenKing, 1987);
        Book inOurTime = new Book("In Our Time", ernestHemingway, 1923);
        inOurTime.setDate(1924); //correct date
    }
}