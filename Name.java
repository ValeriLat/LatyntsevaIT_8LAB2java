public class Name {
    private String familia;
    private String im;
    private String otchestvo;

    public Name() {
    }

    public Name(String im) {
        this.im = im;
    }

    public Name(String familia, String im) {
        this.familia = familia;
        this.im = im;
    }

    public Name(String familia, String im, String otchestvo) {
        this.familia = familia;
        this.im = im;
        this.otchestvo = otchestvo;
    }

    public String getFamilia() {
        return familia;
    }

    public String getIm() {
        return im;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (familia != null) {
            result.append(familia);
        }

        if (im != null) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(im);
        }

        if (otchestvo != null) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(otchestvo);
        }

        return result.toString();
    }
}
