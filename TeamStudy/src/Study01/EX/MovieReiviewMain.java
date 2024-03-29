package Study01.EX;

public class MovieReiviewMain {
    public static void main(String[] args) {
        MovieReview sc = new MovieReview();
        MovieReview ss = new MovieReview();

        sc.title = "인셉션";
        sc.review = "인생은 무한 루프";
        ss.title = "어바웃 타임";
        ss.review = "인생 시간 영화";

        System.out.println("영화 제목: " + sc.title + ", 리뷰: " + sc.review);
        System.out.println("영화 제목: " + ss.title + ", 리뷰: " + ss.review);

    }

}
