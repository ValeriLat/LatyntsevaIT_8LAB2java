public class PersonName {
    private String familia;
    private String im;
    private String otchestvo;

    public PersonName() {
    }

    // Конструктор только с личным именем
    public PersonName(String im) {
        this.im = im;
    }

    // Конструктор с личным именем и фамилией
    public PersonName(String im, String familia) {
        this.im = im;
        this.familia = familia;
    }

    // Конструктор со всеми тремя параметрами
    public PersonName(String im, String familia, String otchestvo) {
        this.im = im;
        this.familia = familia;
        this.otchestvo = otchestvo;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (im != null) {
            result.append(im);
        }

        if (otchestvo != null) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(otchestvo);
        }

        if (familia != null) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(familia);
        }

        return result.toString();
    }
}
