import javax.swing.JOptionPane;
public class JavaLibs {
    public static void main(String[] args) {
        String nama;
        int angka1;
        int reply;
        String gender;
        String alamat;
        String spesialis;
        double jam,selesai;
        int a,b,Hasil;
        
        JOptionPane.showMessageDialog(null, "Hello, welcome to our hospital online registration service");
        
        nama = JOptionPane.showInputDialog("Full name:");
        angka1 = Integer.parseInt(JOptionPane.showInputDialog("Age:"));
        gender = JOptionPane.showInputDialog("Gender: \nMan \nWoman");
        alamat = JOptionPane.showInputDialog("Home address:");
        spesialis = JOptionPane.showInputDialog("Please fill in according to the specialist you want to visit: \nObgyn \nPediatric \nENT \nDentist \nGeneral Practitioner");
        jam = Double.parseDouble(JOptionPane.showInputDialog("What time of visit do you want? \nAvaible hours: \n11.25 \n13.15 \n15.05 \n17.25 \n19.05"));
        selesai = jam + 0.30;
        a  = Integer.parseInt(JOptionPane.showInputDialog("Number of visits made before this month:"));
        b  = Integer.parseInt(JOptionPane.showInputDialog("Number of visits made this month:"));
        Hasil = a + b;
        
        System.out.println("Full name: "+nama);
        System.out.println("Age: "+angka1);
        System.out.println("Gender: "+gender);
        System.out.println("Home address: "+alamat);
        System.out.println("Please fill in according to the specialist you want to visit: "+spesialis);
        System.out.println("Visit time: "+jam);
        System.out.println("Predicted time of visit finish: "+selesai);
        System.out.println("Total visits: "+Hasil);
        
        JOptionPane.showMessageDialog(null, "INFORMATION \nFull Name: " +nama +"\nAge: " +angka1 +"\nGender: " +gender +"\nHome address: " +alamat +"\nSpecialist: " +spesialis +"\nVisit time: " +jam + "\nPredicted time of visit finish: " +selesai +"\nTotal visits made: " +Hasil);
        JOptionPane.showMessageDialog(null, "Thank you for filling out the form. Further notification of the visit will be sent via email address. Have a nice day!");
    }
    
}


