package film;

public class Film {

    private String filmName;
    private Info info;

    public Film() {
        filmName = "Pro mentov";
        info = new Info();
    }

    public void firstMethod(){
        System.out.println(filmName);

    }

    public class Info{
        private double duration ;
        private String genre;
        private String producer;
        public Info(){}


        public Info(double duration, String genre, String producer){
            this.duration = duration;
            this.genre = genre;
            this.producer = producer;
        }

        public double getDuration() {
            return duration;
        }

        public void setDuration(double duration) {
            this.duration = duration;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getProducer() {
            return producer;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }

    }

}
