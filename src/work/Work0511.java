package work;

public class Work0511 {
   public static void main(String[] args) {



      String name[] = {"��ȣ��", "�̽±�", "���缮", "����", "�̱���"};
      String sub_name[] = {"����", "����", "����"};
      int[][] score = {

               {85,  60,  70},        //0�� (1���л�)
               {90,  95,  80},        //1�� (2���л�)
               {75,  80, 100},        //2�� (3���л�)
               {80,  70,  95},        //3�� (4���л�)
               {100, 65,  80},        //4�� (5���л�)
            };

        int[] subject = new int[3]; // �������� ����
        int[] student = new int[5]; // �л��� ���� ����
        int[] avg = new int[5]; // �л��� ���
      
        System.out.println("========== �л��� / ���� �������ϱ� ==========");
        System.out.println("\t"+sub_name[0]+"\t"+sub_name[1]+"\t"+sub_name[1]+"\t����\t���");

        for (int i = 0; i < score.length; i++) {
            student[i] = score[i][0] + score[i][1] + score[i][2];

            avg[i] = student[i] / 3;
        }
        int i;
        int j;
        int name_temp;
        String temp1;
        for (i = 0; i < student.length; i++) {
            for (j = 0; j < student.length - 1; j++) {
                if (student[j] > student[j + 1]) {
                	name_temp = student[j];
                	student[j] = student[j + 1];
                	student[j + 1] = name_temp;

                    temp1 = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp1;

                    name_temp = avg[j];
                    avg[j] = avg[j + 1];
                    avg[j + 1] = name_temp;

                    name_temp = score[j][0];
                    score[j][0] = score[j + 1][0];
                    score[j + 1][0] = name_temp;

                    name_temp = score[j][1];
                    score[j][1] = score[j + 1][1];
                    score[j + 1][1] = name_temp;

                    name_temp = score[j][2];
                    score[j][2] = score[j + 1][2];
                    score[j + 1][2] = name_temp;
                }
            }
        }

        for (int a = 0; a < score.length; a++) {
            System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n", name[a], score[a][0], score[a][1], score[a][2], student[a], avg[a]);
        }

        System.out.println("===========================================");

        for (int a = 0; a < score.length; a++) {
           subject[0] += score[a][0];
            subject[1] += score[a][1];
            subject[2] += score[a][2];
        }
        
        System.out.printf("����\t%d\t%d\t%d\t", subject[0], subject[1], subject[2]);
    }

}