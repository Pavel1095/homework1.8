public class Main {
    public static void main(String[] args) {
       Author levTolstoy = new Author("Лев","Толстой");
       Book warAndPeace = new Book("Война и мир", 1867, levTolstoy);

       warAndPeace.setPublishDate(1867);

        System.out.println(levTolstoy);
        System.out.println(warAndPeace);
    }
}