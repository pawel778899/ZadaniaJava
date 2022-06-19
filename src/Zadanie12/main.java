package Zadanie12;

public class main {

    public static void main(String[] args) {



        String text = "qwer qw eraaaaaaaaaaaaaaaaaaaaaaaaet       qwy ywq qyq35  5 ";


        SpacesInText spacesInText = new SpacesInText(text);

        System.out.println("Wynik uzyskany dwoma róznymi metodami");
        System.out.println(spacesInText.calculateSpacesInText());
        System.out.println(spacesInText.calculateSpacesWithReplace());
    }
}