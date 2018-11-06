import test1.Train;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Train[] obj = new Train[4];
        obj[0] = new Train("Minsk",3,19,20);
        obj[1] = new Train("Minsk",6,19,10);
        obj[2] = new Train("Borisov",3,12,00);
        obj[3] = new Train("Orsha",9,15,30);
        System.out.println();
        for (int i = 0; i < 4; i++){
            obj[i].showAll();
        }


        System.out.println();
        for (int i = 0; i < 4; i++) {
            obj[i].fromToX();
        }



        //    1. Train: Пункт назначения, Номер поезда, Время отправления, Число мест
//            (общих, купе, плацкарт, люкс).
//    Создать массив объектов. Вывести:
//    a) список поездов, следующих до заданного пункта назначения;
//    b) список поездов, следующих до заданного пункта назначения и отправляющихся
//    после заданного часа;
//    c) список поездов, отправляющихся до заданного пункта назначения
//    и имеющих общие места.
    }
}
