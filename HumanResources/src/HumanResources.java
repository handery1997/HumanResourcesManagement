import java.util.*;
public class HumanResources {
    public static void main(String[] args) {
        NhanVienKeToan b = new NhanVienKeToan();
        //Create new object arraylist
        List<Department> departmentArrayList = new ArrayList<Department>();
        List<Staff> staffArrayList = new ArrayList<>();
        //Add some begin info
        departmentArrayList.add(new Department("HC", "Hanh chinh nhan su", 0));
        departmentArrayList.add(new Department("IT", "Cong nghe thong tin", 0));
        departmentArrayList.add(new Department("MKT", "Marketing", 0));
        staffArrayList.add(new Employee("E001","Phong Tuyet Hoa",28,3.2,
                "10/10/2010",10,"Hanh chinh nhan su",4));
        staffArrayList.add(new Employee("E002","Tran Thi B",24,2.2,
                "09/10/2019",7,"Hanh chinh nhan su",3));
        staffArrayList.add(new Manager("M001","Nguyen Van An",25,2.5,
                "11/11/2010",5,"Cong nghe thong tin","Business Leader"));
        staffArrayList.add(new Manager("M002","Ta Van Luc",32,4.5,
                "01/11/2010",1,"Cong nghe thong tin","Technical Leader"));
        //Add staff number to department
        for (Department i : departmentArrayList) {
            for(Staff j :staffArrayList) {
                if (i.getTenBoPhan() == j.getBoPhanLamViec()) {
                    i.addSoLuongNhanVien();
                }
            }
        }

        //Create scanner
        Scanner input = new Scanner(System.in);
        //Print menu
        menu();
        int chosenNumber = input.nextInt();
        //Condition when user choose number
        while (chosenNumber != 0) {
            //Show all employee
            if (chosenNumber == 1) {
                System.out.println("Ma nhan vien        | Ten nhan vien                | Tuoi     " +
                        "| HS Luong      | Ngay vao lam       | Ngay nghi phep     " +
                        "| Bo phan                      | So gio lam them/Chuc vu | Luong         ");
                for (Staff i : staffArrayList) {
                    System.out.println(i.displayInformation());
                }
                menu();
                chosenNumber = input.nextInt();
            }
            //Show all department
            if (chosenNumber == 2) {
                System.out.println("Ma bo phan          | Ten bo phan                  | So luong nhan vien hien tai  ");
                for (Department i : departmentArrayList) {
                    System.out.println(i.toString());
                }
                menu();
                chosenNumber = input.nextInt();
            }
            //Show employee of each department
            if (chosenNumber == 3) {
                for (Department i : departmentArrayList) {
                    System.out.println(i.getTenBoPhan());
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Ma nhan vien        | Ten nhan vien                | Tuoi     " +
                            "| HS Luong      | Ngay vao lam       | Ngay nghi phep     " +
                            "| Bo phan                      | So gio lam them/Chuc vu | Luong         ");
                    for (Staff j : staffArrayList) {
                        if (j.getBoPhanLamViec() == i.getTenBoPhan()) {
                            System.out.println(j.displayInformation());
                        }
                    }
                }
                menu();
                chosenNumber = input.nextInt();
            }
            //Add new staff
            if (chosenNumber == 4) {
                System.out.println("1. Them nhan vien thong thuong");
                System.out.println("2. Them nhan vien cap quan ly");
                System.out.print("Ban chon:");
                int addStaffChosenNumber = input.nextInt();
                //Consume the nextLine of nextInt
                input.nextLine();
                //Add normal employee
                if (addStaffChosenNumber == 1) {
                    System.out.print("Nhap ma nhan vien: ");
                    String maNhanVien = input.nextLine();
                    System.out.print("Nhap ten nhan vien: ");
                    String tenNhanVien = input.nextLine();
                    System.out.print("Nhap tuoi nhan vien: ");
                    int tuoiNhanVien = input.nextInt();
                    System.out.print("Nhap he so luong nhan vien: ");
                    double hslNhanVien = input.nextDouble();
                    input.nextLine();
                    System.out.print("Nhap ngay vao lam cua nhan vien: ");
                    String ngayVaoLam = input.nextLine();
                    System.out.print("Nhap so ngay nghi phep cua nhan vien: ");
                    int ngayNghiPhep = input.nextInt();
                    System.out.println("1. HC - Hanh chinh nhan su");
                    System.out.println("2. IT - Cong nghe thong tin");
                    System.out.println("3. MKT - Marketing");
                    System.out.print("Ban chon:");
                    int departmentChosen = input.nextInt();
                    String boPhan = "";
                    if (departmentChosen == 1) {
                        boPhan = "Hanh chinh nhan su";
                    } else if (departmentChosen == 2) {
                        boPhan = "Cong nghe thong tin";
                    } else if (departmentChosen == 3) {
                        boPhan = "Marketing";
                    }
                    System.out.print("Nhap so gio lam them: ");
                    double soGioLamThem = input.nextDouble();
                    staffArrayList.add(new Employee(maNhanVien, tenNhanVien, tuoiNhanVien, hslNhanVien
                            , ngayVaoLam, ngayNghiPhep, boPhan, soGioLamThem));
                    for (Department i : departmentArrayList) {
                        if (i.getTenBoPhan() == boPhan) {
                            i.addSoLuongNhanVien();
                        }
                    }

                }
                //Add Manager
                if (addStaffChosenNumber == 2) {
                    System.out.print("Nhap ma nhan vien: ");
                    String maNhanVien = input.nextLine();
                    System.out.print("Nhap ten nhan vien: ");
                    String tenNhanVien = input.nextLine();
                    System.out.print("Nhap tuoi nhan vien: ");
                    int tuoiNhanVien = input.nextInt();
                    System.out.print("Nhap he so luong nhan vien: ");
                    double hslNhanVien = input.nextDouble();
                    System.out.print("Nhap ngay vao lam cua nhan vien: ");
                    input.nextLine();
                    String ngayVaoLam = input.nextLine();
                    System.out.print("Nhap so ngay nghi phep cua nhan vien: ");
                    int ngayNghiPhep = input.nextInt();
                    System.out.println("1. HC - Hanh chinh nhan su");
                    System.out.println("2. IT - Cong nghe thong tin");
                    System.out.println("3. MKT - Marketing");
                    System.out.print("Ban chon:");
                    int departmentChosen = input.nextInt();
                    String boPhan = "";
                    if (departmentChosen == 1) {
                        boPhan = "Hanh chinh nhan su";
                    } else if (departmentChosen == 2) {
                        boPhan = "Cong nghe thong tin";
                    } else if (departmentChosen == 3) {
                        boPhan = "Marketing";
                    }
                    System.out.println("1. Business Leader");
                    System.out.println("2. Project Leader");
                    System.out.println("3. Technical Leader");
                    System.out.print("Nhap chuc danh:");
                    int titleChosen = input.nextInt();
                    String chucDanh = "";
                    if (titleChosen == 1) {
                        chucDanh = "Business Leader";
                    } else if (titleChosen == 2) {
                        chucDanh = "Project Leader";
                    } else if (titleChosen == 3) {
                        chucDanh = "Technical Leader";
                    }
                    staffArrayList.add(new Manager(maNhanVien, tenNhanVien, tuoiNhanVien, hslNhanVien
                            , ngayVaoLam, ngayNghiPhep, boPhan, chucDanh));

                    for (Department i : departmentArrayList) {
                        if (i.getTenBoPhan() == boPhan) {
                            i.addSoLuongNhanVien();
                        }
                    }

                }
                menu();
                chosenNumber = input.nextInt();
            }
            //Find employee by id or name
            if (chosenNumber == 5) {
                System.out.println("1. Tim nhan vien bang ten nhan vien");
                System.out.println("2. Tim nhan vien bang ma nhan vien");
                System.out.print("Ban chon:");
                int searchChosenNumber = input.nextInt();
                input.nextLine();
                //By name
                if (searchChosenNumber == 1) {
                    System.out.println();
                    System.out.print("Nhap ten nhan vien can tim:");
                    String searchString = input.nextLine();
                    System.out.println("Ma nhan vien        | Ten nhan vien                | Tuoi     " +
                            "| HS Luong      | Ngay vao lam       | Ngay nghi phep     " +
                            "| Bo phan                      | So gio lam them/Chuc vu | Luong         ");
                    for (Staff i : staffArrayList) {
                        if (i.getTenNhanVien().toLowerCase().indexOf(searchString.toLowerCase()) >= 0) {
                            System.out.println(i.displayInformation());
                        }
                    }
                }
                //By id
                if (searchChosenNumber == 2) {
                    System.out.println();
                    System.out.print("Nhap ma nhan vien can tim:");
                    String searchString = input.nextLine();
                    System.out.println("Ma nhan vien        | Ten nhan vien                | Tuoi     " +
                            "| HS Luong      | Ngay vao lam       | Ngay nghi phep     " +
                            "| Bo phan                      | So gio lam them/Chuc vu | Luong         ");
                    for (Staff i : staffArrayList) {
                        if (i.getMaNhanVien().toLowerCase().indexOf(searchString.toLowerCase()) >= 0) {
                            System.out.println(i.displayInformation());
                        }
                    }
                }
                menu();
                chosenNumber = input.nextInt();
            }
            //Show staff with reducing salary order
            if (chosenNumber == 6) {
                System.out.println("Ma nhan vien        | Ten nhan vien                | Tuoi     " +
                        "| HS Luong      | Ngay vao lam       | Ngay nghi phep     " +
                        "| Bo phan                      | So gio lam them/Chuc vu | Luong         ");
                //Create new array list
                List<Staff> reduceStaffList = new ArrayList<Staff>();

                //Clone old arraylist to new arraylist
                for (Staff i : staffArrayList) {
                    reduceStaffList.add(i.cloneE());
                }
                Staff flag1;
                int j;
                //Rearrange array list to reducing order
                for (int i = 1; i < reduceStaffList.size(); i++) {
                    flag1=reduceStaffList.get(i);
                    j=i;
                    while (j>0 && reduceStaffList.get(j-1).getCalculateSalary()<flag1.getCalculateSalary()) {
                        reduceStaffList.set(j, reduceStaffList.get(j-1));
                        j--;
                    }
                    reduceStaffList.set(j, flag1);
                }
                for (Staff i : reduceStaffList) {
                    System.out.println(i.displayInformation());
                }
                menu();
                chosenNumber = input.nextInt();
            }

            //Show staff with increasing salary order
            if (chosenNumber == 7) {
                System.out.println("Ma nhan vien        | Ten nhan vien                | Tuoi     " +
                        "| HS Luong      | Ngay vao lam       | Ngay nghi phep     " +
                        "| Bo phan                      | So gio lam them/Chuc vu | Luong         ");
                //Create new arraylist
                List<Staff> increaseStaffList = new ArrayList<Staff>();

                //Clone all arraylist into new arraylist
                for (Staff i : staffArrayList) {
                    increaseStaffList.add(i.cloneE());
                }

                //Rearrange array list to increasing order
                Staff flag1;
                int j;
                for (int i = 1; i < increaseStaffList.size(); i++) {
                    flag1=increaseStaffList.get(i);
                    j=i;
                    while (j>0 && increaseStaffList.get(j-1).getCalculateSalary()>flag1.getCalculateSalary()) {
                        increaseStaffList.set(j, increaseStaffList.get(j-1));
                        j--;
                    }
                    increaseStaffList.set(j, flag1);
                }
                for (Staff i : increaseStaffList) {
                    System.out.println(i.displayInformation());
                }
                menu();
                chosenNumber = input.nextInt();
            }
        }
    }

        //Print menu method

    /**
     *
     */
        public static void menu() {
            System.out.println("1. Hien thi danh sach nhan vien hien co trong cong ty.");
            System.out.println("2. Hien thi cac bo phan trong cong ty.");
            System.out.println("3. Hien thi nhan vien theo tung bo phan.");
            System.out.println("4. Them nhan vien moi vao cong ty.");
            System.out.println("5. Tim kiem nhan vien theo ten hoac ma nhan vien.");
            System.out.println("6. Hien thi bang luong cua nhan vien toan cong ty the thu tu giam dan.");
            System.out.println("7. Hien thi bang luong cua nhan vien toan cong ty the thu tu tang dan.");
            System.out.println("0. Thoat chuong trinh.");
            System.out.print("Lua chon cua ban:");
        }
    }




