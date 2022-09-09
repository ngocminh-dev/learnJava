public class SinhVien {
    /**
     * Student
     */
    public static class Student {
        private String name;
        private String id;
        private String group;
        private String email;
        Student(){
                name = "Student";
                id = "000";
                group = "K62CB";
                email = "uet@vnu.edu.vn";
            }
        Student(String name_,String id_,String email_){
                name = name_;
                id = id_;
                group = "K62CB";
                email = email_;
            }
        Student(Student s){
                name = s.name;
                id = s.id;
                group = s.group;
                email = s.email;
            }
        public
            String getName(){
                return name;
            }
            String getId(){
                return id;
            }
            String getGroup(){
                return group;
            }
            String getEmail(){
                return email;
            }
            void setName(String s){
                name = s;
            }
            void setId(String s){
                id = s;
            }
            void setGroup(String s){
                group = s;
            }
            void setEmail(String s){
                email = s;
            }

        
    }

    public static class StudentManagement{
        static Student[] students = new Student[100];

        public static boolean sameGroup(Student s1, Student s2){
            if(s1.getGroup() == s2.getGroup()) return true;
            return false;
        }

        public static void addStudent(Student newStudent){
            for(int i=0;i<100;i++){
                if(students[i]==null){
                    students[i] = newStudent;
                    break;
                }
            }
        }

        public static void removeStudent(String id){
            int pos = -1;
            for(int i=0;i<100;i++){
                if(students[i]==null) break;
                if(students[i].getId()==id){
                    pos = i;
                    break;
                }
            }
            if(pos != -1){
                for(int i=pos;i<100;i++){
                    if(students[i+1]==null) {
                        students[i]=null;
                        break;
                        }
                        students[i]=students[i+1];
                }

            }
        }
        public static String studentsByGroup(){
            String result="";
            String[] sGroup = new String[100];
            for(int i=0;i<100;i++){
                if(students[i]==null) break;
                for(int j=0;j<100;j++){
                    if(sGroup[j]==null){
                        sGroup[j]=students[i].getGroup();
                        break;
                    }
                    if(sGroup[j]==students[i].getGroup()){
                        break;
                    }

                }
            }
           for(int i=0;i<100;i++){
            if(sGroup[i]==null) break;
            result = result + sGroup[i] +"\n";
                for(int j=0;j<100;j++){
                    if(students[j]==null) break;
                    if(sGroup[i]==students[j].getGroup()){
                        result += students[j].getName() + " - "+students[j].getId() + " - "
                                +students[j].getGroup() + " - "+students[j].getEmail() + "\n";
                    }
                }
           } 

            return result;
        }
    } 

    public static void main(String[] args) {
           Student s1 = new Student("Minh", "213123", "ashsd@gmail.com");
           Student s2 = new Student("anh", "123123", "ofgidofpoh@gmail.com");
           Student s3 = new Student("binhsf", "368975", "ghhdjw@gmail.com");
           s1.setGroup("K66CC");
           s2.setGroup("K66CB");
           s3.setGroup("K66CC");
           //Them 3 sinh vien s1,s2,s3
           SinhVien.StudentManagement.addStudent(s1);
           SinhVien.StudentManagement.addStudent(s2);
           SinhVien.StudentManagement.addStudent(s3);
            //=> In ra 3 sinh vien do
           System.out.println(SinhVien.StudentManagement.studentsByGroup());
           //Xoa sinh vien co id 123123
           SinhVien.StudentManagement.removeStudent("123123");
           System.out.println(SinhVien.StudentManagement.studentsByGroup());
           //In ra danh sach sinh vien sau khi xoa
    }
}
