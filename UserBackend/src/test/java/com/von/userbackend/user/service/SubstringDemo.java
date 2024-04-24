package com.von.userbackend.user.service;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.STREAM;

@ExtendWith(MockitoExtension.class)
public class SubstringDemo {

    @Test
    public void testStringLength() throws Exception {
        String str = "a,b,c,";
//        log.info("string : {}",str);
        String stringBuilder = new StringBuilder().append(str).append("d,e,f").toString();
        String[] arr = stringBuilder.split(",");
        assertThat(arr.length).isEqualTo(6);
    }

    @Test
    public void personNumber() throws Exception {
        String human1 = "970301-1";
        String human2 = "950101-2";
        String human3 = "020101-3";
        String human4 = "020101-4";
        //외국인
        String human5 = "730101-5";
        String human6 = "820101-6";
        String human7 = "120101-7";
        String human8 = "050101-8";


        System.out.println("휴먼 1 : " + human1);
        assertThat(getGender(human1)).isEqualTo("Male");
    }

    private String getGender(String ssn) {
        return switch (ssn.charAt(7)) {
            case '1', '3', '5' -> "Male";
            case '2', '4', '6' -> "Female";
            default -> "Error";
        };
    }


    private String getAge(String ssn) {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        assertThat(now.getYear()).isEqualTo(2024);
        return null;
    }

    @Test
    public void sample() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        assertThat(now.getYear()).isEqualTo(2024);
        int month = now.getMonthValue();
        assertThat(month).isEqualTo(4);
        int day = now.getDayOfMonth();
        assertThat(day).isEqualTo(24);
    }

    @Test
    public void birthYear() {
        String ssn = "970301-1";
        int birthYear = Integer.parseInt(ssn.substring(0, 2));
        int year = 1900;
        switch (ssn.charAt(7)) {
            case '1':
            case '2':
            case '5':
            case '6':
                birthYear = birthYear + year;
            default:
                System.out.println("Error");
        }
        assertThat(birthYear).isEqualTo(1997);

        String ssn2 = "020101-4";
        int birthYear2 = Integer.parseInt(ssn2.substring(0, 2));
        int year2 = 2000;
        switch (ssn.charAt(7)) {
            case '3':
            case '4':
            case '7':
            case '8':
                birthYear2 = birthYear2 + year2;
            default:
                System.out.println("Error");
        }
        assertThat(birthYear2).isEqualTo(2002);
    }

    @Test
    public void getAge() {

        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfYear();

        String ssn = "970401-1";
        int age = Integer.parseInt(ssn.substring(0, 2));
        int plusYear = 1900;

        switch (ssn.charAt(7)) {
            case '1':
            case '2':
            case '5':
            case '6':
                age = age + plusYear;
                break;
            default:
                System.out.println("Error");
        }
        age = year - age + 1;
        assertThat(age).isEqualTo(28);

        int birthMonth = Integer.parseInt(ssn.substring(2, 4));
        int birthDay = Integer.parseInt(ssn.substring(4,6));
        if (birthMonth > month) {
            age = age - 2;
        } else if(birthMonth <= month){
            if (birthDay <= day){
                age = age - 1;
            }else {
                age = age -2;
            }
        }
        assertThat(age).isEqualTo(27);
        System.out.println(age);

    }

    @Test
    public void getAgeUsingLambda(){
        String ssn2 = "970401-1";
        int fullDay = Integer.parseInt(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        int age = Stream.of(ssn2)
                .map(ssn->Integer.parseInt(ssn.substring(0, 2)))
                .map(birthYear->switch (ssn2.charAt(7)){
                    case '1','2','5','6' -> birthYear + 1900;
                    case '3','4','7','8' -> birthYear + 2000;
                    default -> birthYear + 1800;
                })
                .map(i->i*10000)
                .map(i->i + Integer.parseInt(ssn2.substring(2, 6)))
                .map(i -> (fullDay - i) / 10000)
                .findFirst()
                .get();

        assertThat(age).isEqualTo(27);
    }


//    private int getDifferenceYears(){
//
//    }
}


//        assertThat(getPersonInfo(human1)).isEqualTo("27살 남자");
//        assertThat(getPersonInfo(human2)).isEqualTo("29살 여자");
//        assertThat(getPersonInfo(human3)).isEqualTo("22살 남자");
//        assertThat(getPersonInfo(human4)).isEqualTo("22살 여자");
//        assertThat(getPersonInfo(human5)).isEqualTo("19살 외국인");
//    }
//
//    private String getPersonInfo(String personNumber) {
//        int birthYear = Integer.parseInt(personNumber.substring(0, 2));
//        int centuryCode = personNumber.charAt(7);
//        System.out.println(centuryCode);
//
//        if (centuryCode >= '3') {
//            birthYear += 2000;
//        } else {
//            birthYear += 1900;
//        }
//
//        int currentYear = LocalDate.now().getYear();
//
//        int age = currentYear - birthYear;
//
//        char genderCode = personNumber.charAt(7);
//        String gender = "";
//        if (genderCode == '1' || genderCode == '3') {
//            gender = "남자";
//        } else if (genderCode == '2' || genderCode == '4') {
//            gender = "여자";
//        } else if (genderCode == '5') {
//            gender = "외국인";
//        }
//
//        return age + "살 " + gender;
//    }
//}