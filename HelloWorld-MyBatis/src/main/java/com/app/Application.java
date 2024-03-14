package com.app;

import com.controller.Controller;
import com.controller.RideController;
import com.model.dto.PersonDTO;
import com.model.dto.RideDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Controller controller = new Controller();
        RideController rideController = new RideController();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("********** 메뉴 **********");
            System.out.println("1. 손님 입장");         //insert
            System.out.println("2. 입장인원 전체 조회");
            System.out.println("3. 줄서기");            //update
            System.out.println("4. 대기시간 변경");      //update
            System.out.println("5. 집가기");            //delete
            System.out.println("6. 놀이공원 폐장");
            System.out.print("번호를 입력 하세요 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1 :
                    controller.insertPerson(inputNewPerson()); break;
                case 2 :
//                    controller.selectAllPerson(); break;
                case 3 :
                    rideController.waitingLine(ridewaiting()); break;
                case 4 :
                    rideController.changeTime(time)

            }
        } while (true);
    }

    private static RideDTO ridewaiting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("줄 대기할 놀이기구의 코드를 입력하세요");
        System.out.println("================================");
        int rideCode = sc.nextInt();

        RideDTO rideDTO = new RideDTO();
        rideDTO.setRideCode(rideCode);

//        getRideInfo(rideDTO);

        System.out.println("================================");
        System.out.println("줄 대기할 사람 코드를 입력해주세요");
        System.out.println("================================");
        int entranceCode = sc.nextInt();

        rideDTO.setEntranceCode(entranceCode);


        return rideDTO;

    }

//    private static RideDTO getRideInfo(RideDTO rideDTO) {
//
//
//
//    }

    private static PersonDTO inputNewPerson() {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("입장할 인원의 정보를 입력하세요");
        System.out.println("================================");
        PersonDTO personDTO = new PersonDTO();
        getPersonInfo(personDTO);
        System.out.println("================================");

        return personDTO;
    }

    private static PersonDTO getPersonInfo(PersonDTO personDTO) {
        Scanner sc = new Scanner(System.in);

        System.out.print("티켓 코드를 입력해주세요 : ");
        int ticketCode = sc.nextInt();
        sc.nextLine();

        System.out.print("이름을 입력해 주세요 : ");
        String personName = sc.nextLine();

        System.out.print("나이를 입력해 주세요 : ");
        int personAge = sc.nextInt();
        sc.nextLine();

        System.out.print("성별을 입력해 주세요 : ");
        String personGender = sc.nextLine();

        System.out.print("키를 입력해 주세요 : ");
        double personHeight = sc.nextDouble();

        personDTO.setTicketCode(ticketCode);
        personDTO.setPersonName(personName);
        personDTO.setPersonAge(personAge);
        personDTO.setPersonGender(personGender);
        personDTO.setPersonHeight(personHeight);

        return personDTO;
    }
}
