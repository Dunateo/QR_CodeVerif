public class Code2d {
   private String MI;
   private int Version;
   private String IAC;
   private String IC;
   private String DateEm;
   private String DateCrea;
   private String CodeIden;
   private String IdentifPerim;
   private String PaysEm;
   private String zoneMessage;
   private String Username;
   private String Userfirstname;
   private String Address;
   private String Town;

    private String Sign;

    //V01-02
    public Code2d(String MI, int version, String IAC, String IC, String dateEm, String dateCrea, String codeIden) {
        this.MI = MI;
        Version = version;
        this.IAC = IAC;
        this.IC = IC;
        DateEm = dateEm;
        DateCrea = dateCrea;
        CodeIden = codeIden;
    }
    //V03
    public Code2d(String MI, int version, String IAC, String IC, String dateEm, String dateCrea, String codeIden, String identifPerim) {
        this.MI = MI;
        Version = version;
        this.IAC = IAC;
        this.IC = IC;
        DateEm = dateEm;
        DateCrea = dateCrea;
        CodeIden = codeIden;
        IdentifPerim = identifPerim;
    }
    //V04
    public Code2d(String MI, int version, String IAC, String IC, String dateEm, String dateCrea, String codeIden, String identifPerim, String paysEm) {
        this.MI = MI;
        Version = version;
        this.IAC = IAC;
        this.IC = IC;
        DateEm = dateEm;
        DateCrea = dateCrea;
        CodeIden = codeIden;
        IdentifPerim = identifPerim;
        PaysEm = paysEm;
    }



    public String getMI() {
        return MI;
    }

    public int getVersion() {
        return Version;
    }

    public String getIAC() {
        return IAC;
    }

    public String getIC() {
        return IC;
    }

    public String getDateEm() {
        return DateEm;
    }

    public String getDateCrea() {
        return DateCrea;
    }

    public String getCodeIden() {
        return CodeIden;
    }

    public String getIdentifPerim() {
        return IdentifPerim;
    }

    public String getPaysEm() {
        return PaysEm;
    }

    public String getZoneMessage() {
        return zoneMessage;
    }

    public void setUsername(String username) { Username = username; }

    public void setUserfirstname(String userfirstname) { Userfirstname = userfirstname; }

    public void setAddress(String address) { Address = address; }

    public void setTown(String town) { Town = town; }

    public void setSign(String sign) { Sign = sign; }

    public void setZoneMessage(String zoneMessage) {
        this.zoneMessage = zoneMessage;
    }

    public void affichage(){
        System.out.println("------En-tête------");
        System.out.println("MI: "+this.getMI());
        System.out.println("Version: "+getVersion());
        System.out.println("IAC: "+getIAC());
        System.out.println("IC: "+getIC());
        System.out.println("DATE-Emission: "+getDateEm());
        System.out.println("DATE-Creation: "+getDateCrea());
        System.out.println("CodeIdentification: "+getCodeIden());
        System.out.println("Identifi Perim: "+getIdentifPerim());
        System.out.println("Pays Emission: "+getPaysEm());
        System.out.println("Zone Message: "+getZoneMessage());
        System.out.println("Name of the user: "+Username);
        System.out.println("Firstname of the user: "+Userfirstname);
        System.out.println("Address of the user: "+Address);
        System.out.println("Town of the user: "+Town);
        System.out.println("Signature: "+Sign);
        System.out.println("------Verification------");
    }
}
