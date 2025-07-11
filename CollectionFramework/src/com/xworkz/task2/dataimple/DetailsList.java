package com.xworkz.task2.dataimple;

import com.xworkz.task2.dto.DetailsDto;
import com.xworkz.task2.dto.EducationDto;

import java.util.LinkedList;
import java.util.List;

public class DetailsList {

    public DetailsList() {
        System.out.println("Running in the DetailsList constructor");
    }

    public List<DetailsDto> getDetailsList() {
        System.out.println("Running in the getDetailsList method");

        List<DetailsDto> list = new LinkedList<>();

        EducationList educationList = new EducationList();
        List<EducationDto> educationGet = educationList.getEducationList();

        DetailsDto detailsDto1 = new DetailsDto("Arun", "B.Tech", 1001, educationGet.get(0));
        DetailsDto detailsDto2 = new DetailsDto("Bhaskar", "MBA", 1002, educationGet.get(1));
        DetailsDto detailsDto3 = new DetailsDto("Charan", "B.Sc", 1003, educationGet.get(2));
        DetailsDto detailsDto4 = new DetailsDto("Dinesh", "B.Com", 1004, educationGet.get(3));
        DetailsDto detailsDto5 = new DetailsDto("Elango", "M.Tech", 1005, educationGet.get(4));
        DetailsDto detailsDto6 = new DetailsDto("Farooq", "BA", 1006, educationGet.get(5));
        DetailsDto detailsDto7 = new DetailsDto("Ganesh", "BCA", 1007, educationGet.get(6));
        DetailsDto detailsDto8 = new DetailsDto("Hari", "M.Sc", 1008, educationGet.get(7));
        DetailsDto detailsDto9 = new DetailsDto("Irfan", "M.Com", 1009, educationGet.get(8));
        DetailsDto detailsDto10 = new DetailsDto("Jeeva", "MCA", 1010, educationGet.get(9));
        DetailsDto detailsDto11 = new DetailsDto("Kumar", "Diploma", 1011, educationGet.get(10));
        DetailsDto detailsDto12 = new DetailsDto("Logan", "PhD", 1012, educationGet.get(11));
        DetailsDto detailsDto13 = new DetailsDto("Mani", "BBA", 1013, educationGet.get(12));
        DetailsDto detailsDto14 = new DetailsDto("Naveen", "B.Tech", 1014, educationGet.get(13));
        DetailsDto detailsDto15 = new DetailsDto("Omprakash", "MBA", 1015, educationGet.get(14));
        DetailsDto detailsDto16 = new DetailsDto("Prakash", "B.Sc", 1016, educationGet.get(15));
        DetailsDto detailsDto17 = new DetailsDto("Qasim", "M.Tech", 1017, educationGet.get(16));
        DetailsDto detailsDto18 = new DetailsDto("Ramesh", "BA", 1018, educationGet.get(17));
        DetailsDto detailsDto19 = new DetailsDto("Suresh", "BCA", 1019, educationGet.get(18));
        DetailsDto detailsDto20 = new DetailsDto("Thiru", "B.Com", 1020, educationGet.get(19));
        DetailsDto detailsDto21 = new DetailsDto("Uday", "M.Sc", 1021, educationGet.get(20));
        DetailsDto detailsDto22 = new DetailsDto("Vasanth", "M.Com", 1022, educationGet.get(21));
        DetailsDto detailsDto23 = new DetailsDto("Wahid", "MCA", 1023, educationGet.get(22));
        DetailsDto detailsDto24 = new DetailsDto("Xavier", "Diploma", 1024, educationGet.get(23));
        DetailsDto detailsDto25 = new DetailsDto("Yusuf", "PhD", 1025, educationGet.get(24));
        DetailsDto detailsDto26 = new DetailsDto("Zakir", "BBA", 1026, educationGet.get(25));
        DetailsDto detailsDto27 = new DetailsDto("Ajay", "B.Tech", 1027, educationGet.get(26));
        DetailsDto detailsDto28 = new DetailsDto("Bharath", "MBA", 1028, educationGet.get(27));
        DetailsDto detailsDto29 = new DetailsDto("Charan", "B.Sc", 1029, educationGet.get(28));
        DetailsDto detailsDto30 = new DetailsDto("Dharani", "B.Com", 1030, educationGet.get(29));

        list.add(detailsDto1);
        list.add(detailsDto2);
        list.add(detailsDto3);
        list.add(detailsDto4);
        list.add(detailsDto5);
        list.add(detailsDto6);
        list.add(detailsDto7);
        list.add(detailsDto8);
        list.add(detailsDto9);
        list.add(detailsDto10);
        list.add(detailsDto11);
        list.add(detailsDto12);
        list.add(detailsDto13);
        list.add(detailsDto14);
        list.add(detailsDto15);
        list.add(detailsDto16);
        list.add(detailsDto17);
        list.add(detailsDto18);
        list.add(detailsDto19);
        list.add(detailsDto20);
        list.add(detailsDto21);
        list.add(detailsDto22);
        list.add(detailsDto23);
        list.add(detailsDto24);
        list.add(detailsDto25);
        list.add(detailsDto26);
        list.add(detailsDto27);
        list.add(detailsDto28);
        list.add(detailsDto29);
        list.add(detailsDto30);

        return list;
    }
}
