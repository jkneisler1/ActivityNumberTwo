public class Software extends Product {
    private String programmer;
    private String platform;                    // linux, mac, or pc
    private String os;

    @Override
    public boolean equals(Object obj) {
        boolean objIsEqual = false;
        Software sftw = (Software) obj;

        if (super.getCode().equals(sftw.getCode())) { objIsEqual = true; }
        else { objIsEqual = false; }

        if (super.getDescription().equals(sftw.getDescription())) { objIsEqual = true; }
        else { objIsEqual = false; }

        if (super.getPrice() == sftw.getPrice()) { objIsEqual = true; }
        else { objIsEqual = false; }

        if (this.programmer.equals(sftw.programmer)) { objIsEqual = true; }
        else { objIsEqual = false; }

        if (this.platform.equals(sftw.platform)) { objIsEqual = true; }
        else { objIsEqual = false; }

        if (this.os.equals(sftw.os)) { objIsEqual = true; }
        else { objIsEqual = false; }

        return objIsEqual;
    }


    // Getters and Setters
    public String getProgrammer() { return programmer; }
    public void setProgrammer(String programmer) { this.programmer = programmer; }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }

    public String getOs() { return os; }
    public void setOs(String os) { this.os = os; }
}
