public class CartaoSus {
    //Nome
    private String name;

    //Data de nascimento
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    //Data de emissão
    private int issueYear;
    private int issueMonth;
    private int issueDay;
    //Sexo
    private String sex;
    //Município de residência
    private String municipalityResidence;
    //UF
    private String UF;
    //Numero do sus
    private long susNumber;

    public CartaoSus(String name, int birthYear, int birthMonth,
                     int birthDay, int issueYear, int issueMonth,
                     int issueDay, String sex, String municipalityResidence,
                     String UF, long susNumber) {
        this.name = name;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.issueYear = issueYear;
        this.issueMonth = issueMonth;
        this.issueDay = issueDay;
        this.sex = sex;
        this.municipalityResidence = municipalityResidence;
        this.UF = UF;
        this.susNumber = susNumber;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public int getIssueMonth() {
        return issueMonth;
    }

    public int getIssueDay() {
        return issueDay;
    }

    public String getSex() {
        return sex;
    }

    public String getMunicipalityResidence() {
        return municipalityResidence;
    }

    public String getUF() {
        return UF;
    }

    public long getSusNumber() {
        return susNumber;
    }
}
