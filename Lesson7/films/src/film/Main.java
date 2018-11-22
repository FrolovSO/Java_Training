package film;

public class Main {

    public static void main(String[] args) {
        Film firstFilm = new Film();
        firstFilm.firstMethod();
        Film.Info firstInfo = new Film().new Info(1.10,"Russian film","Petrov");
        System.out.println("Genre: " + firstInfo.getGenre() + " Producer: " + firstInfo.getProducer()+ " Duration: " +firstInfo.getDuration());

        Film secondFilm = new Film();
        Film.Info secondInfo = new Film().new Info(2.40,"Blarussian film","Kazyabyakin");
        System.out.println("Genre: " + secondInfo.getGenre() + " Producer: " + secondInfo.getProducer()+ " Duration: " +secondInfo.getDuration());
        System.out.println();

    }
}
