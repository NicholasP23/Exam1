public class Driver {
         public static final int SIZE = 5;

         public static void main(String[] args){
            String[] names = new String[SIZE];
            double[] pointScored = new double[SIZE];
            double[] pointPossible = {100,100,100,100,100};

            studentNames(names);
            studentGrades(pointScored);

            double [] grade = new double[SIZE];
            for(int i=0; i < SIZE; i++) {
                grade[i] = (pointScored[i] / pointPossible[i])*100;
            }
            System.out.println("----------------------------------------------");
            System.out.printf("%-8c%-13s%-1c%-8s%1s%1s",'|', "Name",'|'," Grade(%) |","Letter Grade",'|');
            System.out.println("");
            System.out.println("----------------------------------------------");
            for (int i = 0; i < SIZE; i++) {
                System.out.printf("%-3c%-18s%-4c%.2f%-8s%-5s%3c",'|',names[i],'|',grade[i],"  |", letterGrade(grade[i]),'|');
                System.out.println("\n----------------------------------------------");
            }

         }


        public static void studentNames(String[] names) {
            for (int i = 0; i < SIZE; i++) {
                if(i==0) names[i]="Misty Stansbugry";
                if(i==1) names[i]="Ricky Washington";
                if(i==2) names[i]="Fernanda Twyman";
                if(i==3) names[i]="Heidy Brunetti";
                if(i==4) names[i]="Roland Maland";
            }

        }


        public static void studentGrades(double[] grade){
            for (int i = 0; i < SIZE; i++) {
                if(i==0) grade[i]=84.2;
                if(i==1) grade[i]=97.5;
                if(i==2) grade[i]=71.6;
                if(i==3) grade[i]=54.4;
                if(i==4) grade[i]=68.4;

            }

        }


        public static String letterGrade(double grade){
            if (grade >= 93.0) return "A";
            else if(grade >= 90.0) return "A-";
            else if(grade >= 87.0) return "B+";
            else if(grade >= 83.0) return "B";
            else if(grade >= 80.0) return "B-";
            else if(grade >= 77.0) return "C+";
            else if(grade >= 73.0) return "C";
            else if(grade >= 70.0) return "C-";
            else if(grade >= 67.0) return "D+";
            else if(grade >= 63.0) return "D";
            else if(grade >= 60.0) return "D-";
            else if(grade >= 0)  return "F";
            else return "Invalid input, please type a valid grade";

        }

}

