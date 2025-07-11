package com.xworkz.task2.dataimple;

import com.xworkz.task2.dto.DetailsDto;
import com.xworkz.task2.dto.JobDto;

import java.util.LinkedList;
import java.util.List;

public class JobList {

    public JobList() {
        System.out.println("Running in the JobList constructor");
    }

    public List<JobDto> getJobList() {
        System.out.println("Running in the getJobList method");

        List<JobDto> list = new LinkedList<>();

        DetailsList detailsList = new DetailsList();
        List<DetailsDto> detailsGet = detailsList.getDetailsList();

        JobDto jobDto1 = new JobDto("Developer", "IT", 45000, detailsGet.get(0));
        JobDto jobDto2 = new JobDto("Tester", "QA", 40000, detailsGet.get(1));
        JobDto jobDto3 = new JobDto("Manager", "Operations", 60000, detailsGet.get(2));
        JobDto jobDto4 = new JobDto("Designer", "Creative", 47000, detailsGet.get(3));
        JobDto jobDto5 = new JobDto("Analyst", "Finance", 55000, detailsGet.get(4));
        JobDto jobDto6 = new JobDto("HR", "Human Resources", 42000, detailsGet.get(5));
        JobDto jobDto7 = new JobDto("Admin", "Support", 39000, detailsGet.get(6));
        JobDto jobDto8 = new JobDto("Lead", "Engineering", 58000, detailsGet.get(7));
        JobDto jobDto9 = new JobDto("Trainer", "Learning", 36000, detailsGet.get(8));
        JobDto jobDto10 = new JobDto("Security Officer", "Admin", 32000, detailsGet.get(9));
        JobDto jobDto11 = new JobDto("Consultant", "Business", 61000, detailsGet.get(10));
        JobDto jobDto12 = new JobDto("Architect", "Development", 70000, detailsGet.get(11));
        JobDto jobDto13 = new JobDto("Researcher", "R&D", 50000, detailsGet.get(12));
        JobDto jobDto14 = new JobDto("Intern", "IT", 15000, detailsGet.get(13));
        JobDto jobDto15 = new JobDto("Coordinator", "Marketing", 37000, detailsGet.get(14));
        JobDto jobDto16 = new JobDto("Supervisor", "Production", 43000, detailsGet.get(15));
        JobDto jobDto17 = new JobDto("Executive", "Sales", 41000, detailsGet.get(16));
        JobDto jobDto18 = new JobDto("Agent", "Customer Care", 33000, detailsGet.get(17));
        JobDto jobDto19 = new JobDto("Engineer", "Maintenance", 48000, detailsGet.get(18));
        JobDto jobDto20 = new JobDto("Operator", "Plant", 35000, detailsGet.get(19));
        JobDto jobDto21 = new JobDto("Technician", "Mechanical", 39000, detailsGet.get(20));
        JobDto jobDto22 = new JobDto("Planner", "Logistics", 52000, detailsGet.get(21));
        JobDto jobDto23 = new JobDto("Clerk", "Office", 28000, detailsGet.get(22));
        JobDto jobDto24 = new JobDto("Director", "Corporate", 80000, detailsGet.get(23));
        JobDto jobDto25 = new JobDto("Librarian", "Knowledge", 30000, detailsGet.get(24));
        JobDto jobDto26 = new JobDto("Driver", "Transport", 27000, detailsGet.get(25));
        JobDto jobDto27 = new JobDto("Mechanic", "Garage", 34000, detailsGet.get(26));
        JobDto jobDto28 = new JobDto("Pilot", "Aviation", 90000, detailsGet.get(27));
        JobDto jobDto29 = new JobDto("Chef", "Hospitality", 46000, detailsGet.get(28));
        JobDto jobDto30 = new JobDto("Caretaker", "Housekeeping", 25000, detailsGet.get(29));

        list.add(jobDto1);
        list.add(jobDto2);
        list.add(jobDto3);
        list.add(jobDto4);
        list.add(jobDto5);
        list.add(jobDto6);
        list.add(jobDto7);
        list.add(jobDto8);
        list.add(jobDto9);
        list.add(jobDto10);
        list.add(jobDto11);
        list.add(jobDto12);
        list.add(jobDto13);
        list.add(jobDto14);
        list.add(jobDto15);
        list.add(jobDto16);
        list.add(jobDto17);
        list.add(jobDto18);
        list.add(jobDto19);
        list.add(jobDto20);
        list.add(jobDto21);
        list.add(jobDto22);
        list.add(jobDto23);
        list.add(jobDto24);
        list.add(jobDto25);
        list.add(jobDto26);
        list.add(jobDto27);
        list.add(jobDto28);
        list.add(jobDto29);
        list.add(jobDto30);

        return list;
    }
}
