package com.view;

public class Print {
    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "insert" : successMessage = "신규 입장 인원 등록을 성공하였습니다!"; break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "insert" : errorMessage = "신규 입장 인원 등록을 실패하였습니다."; break;
        }

        System.out.println(errorMessage);
    }
}
