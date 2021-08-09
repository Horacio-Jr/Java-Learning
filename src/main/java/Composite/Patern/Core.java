package Composite.Patern;

public class Core {
    public static void main(String[] args) {

        SimpleSection section1 = new SimpleSection("Maputo", "Beira", 2500);
        SimpleSection section2 = new SimpleSection("Beira", "Tete", 5000);
        ComposedSection composedSection1 = new ComposedSection(section1, section2, 50);
        SimpleSection section3 = new SimpleSection("Tete", "Nampula", 6500);
        ComposedSection composedSection2 = new ComposedSection(composedSection1, section3, 500);

        System.out.println(composedSection2.toString());

    }
}
