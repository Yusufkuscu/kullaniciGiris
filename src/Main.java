import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String ad = "Patika", sifre = "Java101";
        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        String userName = scan.nextLine();
        System.out.print("Şifreniz: ");
        String password = scan.nextLine();

        if ((userName.equals(ad)) && (password.equals(sifre))) {
            System.out.println("Giriş başarılı...");
        } else if (!(userName.equals(ad)) && (password.equals(sifre))) {
            System.out.println("Kullanıcı adı hatalı...");
        } else if ((userName.equals(ad)) && !(password.equals(sifre))) {
            System.out.println("Parola hatalı.");
            System.out.println("Parolanızı sıfırlamak ister misiniz?\n1)Evet\n2)Hayır");
            int cevap = scan.nextInt();
            switch (cevap) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Yeni şifrenizi giriniz: ");
                    String nPassword = sc.nextLine();
                    if (nPassword.equals("Patika")){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else {
                        password = nPassword;
                        System.out.println("Yeni Şifre Oluşturuldu");
                    }
                    break;
                case 2:
                    System.out.println("Çıkış yapıldı...");
                    break;
            }

        } else {
            System.out.println("Kullanıcı adı ve şifre yanlış");
        }

    }
}
