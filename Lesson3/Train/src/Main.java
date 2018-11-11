import test1.Train;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //    1. Train: Пункт назначения, Номер поезда, Время отправления, Число мест
//            (общих, купе, плацкарт, люкс).
        //    Создать массив объектов.

        Train[] obj = new Train[4];
        obj[0] = new Train("Minsk",3,16,20,10,20, 30,10);
        obj[1] = new Train("Minsk",6,19,10,30,10,45,12);
        obj[2] = new Train("Borisov",3,12,00,70,2,32,41);
        obj[3] = new Train("Orsha",9,15,30,50,20,8,4);
        System.out.println("Все поезда ");
        System.out.println();
        for (int i = 0; i < 4; i++){
            obj[i].print();
        }
        // Вывести:
   //     a) список поездов, следующих до заданного пункта назначения;
        System.out.println("список поездов, следующих до заданного пункта назначения ");
        System.out.println();
        for (int i = 0; i < 4; i++) {
            if (obj[i].getNavigateTo().equals("Minsk")) {
                obj[i].print();
            }
        }

//    b) список поездов, следующих до заданного пункта назначения и отправляющихся
//    после заданного часа;
        System.out.println("список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа");
        System.out.println();
        for (int i = 0; i < 4; i++) {
            if (obj[i].getNavigateTo().equals("Minsk")) {
                if (obj[i].getHours() < 19) {
                    obj[i].print();
                }
            }
        }
//    c) список поездов, отправляющихся до заданного пункта назначения
//    и имеющих общие места.
        System.out.println("список поездов, отправляющихся до заданного пункта назначения и имеющих общие места. ");

        System.out.println();
        for (int i = 0; i < 4; i++) {
            if (obj[i].getNavigateTo().equals("Minsk")) {
                if (obj[i].getNumberCommon() > 0) {
                    obj[i].print();
                }
            }
        }
    }
}
