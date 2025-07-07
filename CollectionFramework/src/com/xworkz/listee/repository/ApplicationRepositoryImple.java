package com.xworkz.listee.repository;

import com.xworkz.listee.dto.ApplicationDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.xworkz.listee.dto.ApplicationDto.Version;
import com.xworkz.listee.dto.ApplicationDto.Type;
import com.xworkz.listee.dto.*;


public class ApplicationRepositoryImple implements ApplicationRepository {

    public ApplicationRepositoryImple() {
        System.out.println("Running in the ApplicationRepositoryImple constructor");
    }


    @Override
    public List<ApplicationDto> findAll() {

        ApplicationDto app1 = new ApplicationDto("WhatsApp", Version.V1_0, LocalDate.of(2010, 1, 10), 45.5, Type.COMMUNICATION, true, 0);
        ApplicationDto app2 = new ApplicationDto("Instagram", Version.V2_0, LocalDate.of(2012, 3, 15), 60.0, Type.SOCIALMEDIA, true, 0);
        ApplicationDto app3 = new ApplicationDto("Facebook", Version.V3_0, LocalDate.of(2008, 2, 4), 80.0, Type.SOCIALMEDIA, true, 0);
        ApplicationDto app4 = new ApplicationDto("Telegram", Version.V2_0, LocalDate.of(2013, 8, 20), 55.5, Type.COMMUNICATION, true, 0);
        ApplicationDto app5 = new ApplicationDto("Snapchat", Version.V3_0, LocalDate.of(2011, 9, 1), 70.3, Type.SOCIALMEDIA, true, 0);
        ApplicationDto app6 = new ApplicationDto("Zoom", Version.V4_0, LocalDate.of(2016, 5, 21), 95.0, Type.COMMUNICATION, false, 15.0);
        ApplicationDto app7 = new ApplicationDto("Skype", Version.V1_0, LocalDate.of(2005, 10, 2), 50.0, Type.COMMUNICATION, false, 10.0);
        ApplicationDto app8 = new ApplicationDto("Google Meet", Version.V4_0, LocalDate.of(2020, 3, 11), 65.5, Type.COMMUNICATION, true, 0);
        ApplicationDto app9 = new ApplicationDto("IRCTC", Version.V1_0, LocalDate.of(2015, 6, 30), 40.0, Type.TRAVEL, true, 0);
        ApplicationDto app10 = new ApplicationDto("Paytm", Version.V2_0, LocalDate.of(2012, 9, 20), 85.0, Type.FINANCE, true, 0);

        ApplicationDto app11 = new ApplicationDto("PhonePe", Version.V3_0, LocalDate.of(2016, 10, 12), 78.5, Type.FINANCE, true, 0);
        ApplicationDto app12 = new ApplicationDto("Google Pay", Version.V4_0, LocalDate.of(2018, 2, 25), 82.0, Type.FINANCE, true, 0);
        ApplicationDto app13 = new ApplicationDto("Twitter", Version.V2_0, LocalDate.of(2009, 7, 19), 90.0, Type.SOCIALMEDIA, true, 0);
        ApplicationDto app14 = new ApplicationDto("Discord", Version.V3_0, LocalDate.of(2015, 5, 13), 85.5, Type.COMMUNICATION, true, 0);
        ApplicationDto app15 = new ApplicationDto("MakeMyTrip", Version.V1_0, LocalDate.of(2010, 12, 1), 70.0, Type.TRAVEL, true, 0);
        ApplicationDto app16 = new ApplicationDto("Uber", Version.V4_0, LocalDate.of(2013, 5, 5), 92.5, Type.TRAVEL, false, 5.0);
        ApplicationDto app17 = new ApplicationDto("Ola", Version.V3_0, LocalDate.of(2014, 6, 18), 88.0, Type.TRAVEL, false, 3.0);
        ApplicationDto app18 = new ApplicationDto("Amazon Pay", Version.V2_0, LocalDate.of(2018, 8, 1), 76.0, Type.FINANCE, true, 0);
        ApplicationDto app19 = new ApplicationDto("Facebook Lite", Version.V1_0, LocalDate.of(2017, 3, 9), 35.5, Type.SOCIALMEDIA, true, 0);
        ApplicationDto app20 = new ApplicationDto("Moj", Version.V3_0, LocalDate.of(2021, 1, 25), 60.0, Type.SOCIALMEDIA, true, 0);

        ApplicationDto app21 = new ApplicationDto("LinkedIn", Version.V4_0, LocalDate.of(2007, 10, 12), 77.5, Type.SOCIALMEDIA, true, 0);
        ApplicationDto app22 = new ApplicationDto("Clubhouse", Version.V1_0, LocalDate.of(2020, 4, 20), 53.0, Type.COMMUNICATION, true, 0);
        ApplicationDto app23 = new ApplicationDto("WeChat", Version.V2_0, LocalDate.of(2011, 1, 21), 91.5, Type.COMMUNICATION, false, 4.0);
        ApplicationDto app24 = new ApplicationDto("Signal", Version.V3_0, LocalDate.of(2020, 5, 14), 66.5, Type.COMMUNICATION, true, 0);
        ApplicationDto app25 = new ApplicationDto("RedBus", Version.V1_0, LocalDate.of(2013, 7, 10), 45.0, Type.TRAVEL, true, 0);
        ApplicationDto app26 = new ApplicationDto("Yatra", Version.V2_0, LocalDate.of(2012, 3, 2), 48.5, Type.TRAVEL, true, 0);
        ApplicationDto app27 = new ApplicationDto("BHIM", Version.V1_0, LocalDate.of(2016, 12, 30), 51.0, Type.FINANCE, true, 0);
        ApplicationDto app28 = new ApplicationDto("Mobikwik", Version.V3_0, LocalDate.of(2015, 8, 11), 55.0, Type.FINANCE, true, 0);
        ApplicationDto app29 = new ApplicationDto("Freecharge", Version.V2_0, LocalDate.of(2014, 2, 20), 59.0, Type.FINANCE, true, 0);
        ApplicationDto app30 = new ApplicationDto("Messenger", Version.V4_0, LocalDate.of(2010, 4, 9), 72.5, Type.COMMUNICATION, true, 0);

        ApplicationDto app31 = new ApplicationDto("Threads", Version.V1_0, LocalDate.of(2023, 7, 5), 69.0, Type.SOCIALMEDIA, true, 0);
        ApplicationDto app32 = new ApplicationDto("Hike", Version.V2_0, LocalDate.of(2012, 12, 12), 67.0, Type.COMMUNICATION, true, 0);
        ApplicationDto app33 = new ApplicationDto("GPay India", Version.V4_0, LocalDate.of(2017, 9, 18), 80.0, Type.FINANCE, true, 0);
        ApplicationDto app34 = new ApplicationDto("TravelXP", Version.V3_0, LocalDate.of(2011, 11, 11), 68.0, Type.TRAVEL, true, 0);
        ApplicationDto app35 = new ApplicationDto("Razorpay", Version.V1_0, LocalDate.of(2016, 4, 4), 73.5, Type.FINANCE, false, 2.0);
        ApplicationDto app36 = new ApplicationDto("WhatsApp Business", Version.V2_0, LocalDate.of(2018, 1, 15), 65.0, Type.COMMUNICATION, true, 0);
        ApplicationDto app37 = new ApplicationDto("Zomato", Version.V3_0, LocalDate.of(2010, 7, 10), 85.0, Type.TRAVEL, true, 0);
        ApplicationDto app38 = new ApplicationDto("Swiggy", Version.V4_0, LocalDate.of(2014, 8, 15), 86.0, Type.TRAVEL, true, 0);
        ApplicationDto app39 = new ApplicationDto("Truecaller", Version.V2_0, LocalDate.of(2009, 9, 9), 58.0, Type.COMMUNICATION, true, 0);
        ApplicationDto app40 = new ApplicationDto("Chingari", Version.V1_0, LocalDate.of(2020, 7, 1), 63.5, Type.SOCIALMEDIA, true, 0);

        ApplicationDto app41 = new ApplicationDto("BharatPe", Version.V2_0, LocalDate.of(2018, 4, 4), 74.0, Type.FINANCE, true, 0);
        ApplicationDto app42 = new ApplicationDto("OkCredit", Version.V3_0, LocalDate.of(2017, 5, 5), 60.0, Type.FINANCE, true, 0);
        ApplicationDto app43 = new ApplicationDto("JioMeet", Version.V1_0, LocalDate.of(2020, 6, 24), 50.0, Type.COMMUNICATION, true, 0);
        ApplicationDto app44 = new ApplicationDto("Airtel Thanks", Version.V3_0, LocalDate.of(2019, 3, 14), 88.0, Type.FINANCE, true, 0);
        ApplicationDto app45 = new ApplicationDto("MyJio", Version.V4_0, LocalDate.of(2018, 2, 2), 90.0, Type.COMMUNICATION, true, 0);
        ApplicationDto app46 = new ApplicationDto("PhoneBook", Version.V2_0, LocalDate.of(2015, 7, 15), 49.0, Type.COMMUNICATION, true, 0);
        ApplicationDto app47 = new ApplicationDto("RailYatri", Version.V1_0, LocalDate.of(2013, 10, 10), 70.0, Type.TRAVEL, true, 0);
        ApplicationDto app48 = new ApplicationDto("IXIGO", Version.V3_0, LocalDate.of(2014, 5, 9), 76.0, Type.TRAVEL, true, 0);
        ApplicationDto app49 = new ApplicationDto("Google Trips", Version.V2_0, LocalDate.of(2017, 6, 5), 64.5, Type.TRAVEL, true, 0);
        ApplicationDto app50 = new ApplicationDto("Goibibo", Version.V4_0, LocalDate.of(2011, 11, 11), 78.0, Type.TRAVEL, true, 0);


        List<ApplicationDto> list=new ArrayList<>();
        list.add(app1);
        list.add(app2);
        list.add(app3);
        list.add(app4);
        list.add(app5);
        list.add(app6);
        list.add(app7);
        list.add(app8);
        list.add(app9);
        list.add(app10);
        list.add(app11);
        list.add(app12);
        list.add(app13);
        list.add(app14);
        list.add(app15);
        list.add(app16);
        list.add(app17);
        list.add(app18);
        list.add(app19);
        list.add(app20);
        list.add(app21);
        list.add(app22);
        list.add(app23);
        list.add(app24);
        list.add(app25);
        list.add(app26);
        list.add(app27);
        list.add(app28);
        list.add(app29);
        list.add(app30);
        list.add(app31);
        list.add(app32);
        list.add(app33);
        list.add(app34);
        list.add(app35);
        list.add(app36);
        list.add(app37);
        list.add(app38);
        list.add(app39);
        list.add(app40);
        list.add(app41);
        list.add(app42);
        list.add(app43);
        list.add(app44);
        list.add(app45);
        list.add(app46);
        list.add(app47);
        list.add(app48);
        list.add(app49);
        list.add(app50);
 return  list;
    }
}