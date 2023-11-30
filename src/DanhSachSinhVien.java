import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach; //ArrayList<Ten_class> ten_bien;
    //Kieu du lieu ArrayList.


    //Constructor
    public DanhSachSinhVien(){
    };
    public DanhSachSinhVien(SinhVien danhSach) {
        this.danhSach = new ArrayList<>();
        this.danhSach.add(danhSach);
    }


    //getter
    public ArrayList<SinhVien> getDanhSach() {
        return danhSach;
    }


    //1.Them SinhVien
    public void addSinhVien(SinhVien addSinhVien){
        this.danhSach.add(addSinhVien);
    }

    //2.Edit SinhVien theo ID
    public void editSinhVien(int editByID){
        for(SinhVien sinhVien:danhSach) {
            if (editByID == sinhVien.getId()){
                Scanner sc = new Scanner(System.in);
                System.out.println("New Name: ");
                String newName = sc.nextLine();
                sinhVien.setName(newName);

                System.out.println("Enter new date of birth: ");
                String newDateOfBirth = sc.nextLine();
                sinhVien.setDateOfBirth(newDateOfBirth);

                System.out.println("Enter new address: ");
                String newAddress = sc.nextLine();
                sinhVien.setAddress(newAddress);

                System.out.println("Enter new GPA: ");
                double newGpa = sc.nextDouble();
                sinhVien.setGpa(newGpa);
            }
        }
    }

    //3.Xoa SinhVien theo ID
    public void deleteSinhVien(int iDSinhVien){
    for(SinhVien sinhVien:danhSach){
        if (iDSinhVien == sinhVien.getId())
            this.danhSach.remove(sinhVien);}
    }

    //4.Loc SinhVien theo gpa
    public void sortByGpa(double svGba){
        for(SinhVien sinhVien:danhSach){
            if(svGba == sinhVien.getGpa())
                System.out.println(sinhVien);
        }
    }

    //5.Loc SinhVien theo name
    public void sortByName(String svName){
        for(SinhVien sinhVien:danhSach){
            if(svName.equals(sinhVien.getName()))
                System.out.println(sinhVien);
        }
    }

    //6.Hien thi SinhVien
    public void showSinhVien(){
        for (SinhVien sinhVien:danhSach){
            System.out.println(sinhVien);
        }
    }
}
