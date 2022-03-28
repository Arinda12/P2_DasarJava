public class V_OutputPrintF {
    public static void main(String args[]){
        String nama="Anton";
        int umur=21;
        float tinngiBadan=170.4f;
        double beratBadan=71.78;
        boolean kawin=true;
        char jenisKelamin='P';
        int oktal12=014;
        System.out.printf("Nama : %s\n",nama);
        System.out.printf("Umur :%d\n",umur);
        System.out.printf("Tinngi Badan : %f\n",tinngiBadan);
        System.out.printf("Berat Badan : %1f\n",beratBadan);
        System.out.printf("Suadah Menikah : %b\n",kawin);
        System.out.printf("Jenis Kelamin : %c\n",jenisKelamin);
        System.out.printf("Bilangan Oktal 12 : %o\n",oktal12);
    }

}
