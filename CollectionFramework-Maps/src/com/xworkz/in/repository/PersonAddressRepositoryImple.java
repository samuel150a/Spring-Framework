package com.xworkz.in.repository;

import com.xworkz.in.dto.AddressDto;
import com.xworkz.in.dto.PersonDto;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PersonAddressRepositoryImple implements PersonAddressRepository {
public PersonAddressRepositoryImple()
{
    System.out.println("Running in the PersonAddressRepositoryImple constructor");
}






    @Override
    public Map<PersonDto, AddressDto> findAll() {
        System.out.println("Running in the find All method ");
        PersonDto personDto1 = new PersonDto("george", "george@gmail.com", 852378523695L);
        PersonDto personDto2 = new PersonDto("alice", "alice@gmail.com", 912345678901L);
        PersonDto personDto3 = new PersonDto("bob", "bob@gmail.com", 923456789012L);
        PersonDto personDto4 = new PersonDto("charlie", "charlie@gmail.com", 934567890123L);
        PersonDto personDto5 = new PersonDto("david", "david@gmail.com", 945678901234L);
        PersonDto personDto6 = new PersonDto("eve", "eve@gmail.com", 956789012345L);
        PersonDto personDto7 = new PersonDto("frank", "frank@gmail.com", 967890123456L);
        PersonDto personDto8 = new PersonDto("grace", "grace@gmail.com", 978901234567L);
        PersonDto personDto9 = new PersonDto("hannah", "hannah@gmail.com", 989012345678L);
        PersonDto personDto10 = new PersonDto("irene", "irene@gmail.com", 990123456789L);
        PersonDto personDto11 = new PersonDto("jack", "jack@gmail.com", 901234567890L);
        PersonDto personDto12 = new PersonDto("kathy", "kathy@gmail.com", 912345678905L);
        PersonDto personDto13 = new PersonDto("leo", "leo@gmail.com", 923456789016L);
        PersonDto personDto14 = new PersonDto("mona", "mona@gmail.com", 934567890127L);
        PersonDto personDto15 = new PersonDto("nina", "nina@gmail.com", 945678901238L);
        PersonDto personDto16 = new PersonDto("oscar", "oscar@gmail.com", 956789012349L);
        PersonDto personDto17 = new PersonDto("paul", "paul@gmail.com", 967890123450L);
        PersonDto personDto18 = new PersonDto("queen", "queen@gmail.com", 978901234561L);
        PersonDto personDto19 = new PersonDto("rachel", "rachel@gmail.com", 989012345672L);
        PersonDto personDto20 = new PersonDto("steve", "steve@gmail.com", 990123456783L);
        PersonDto personDto21 = new PersonDto("tracy", "tracy@gmail.com", 901234567894L);
        PersonDto personDto22 = new PersonDto("uma", "uma@gmail.com", 912345678905L);
        PersonDto personDto23 = new PersonDto("victor", "victor@gmail.com", 923456789016L);
        PersonDto personDto24 = new PersonDto("wendy", "wendy@gmail.com", 934567890127L);
        PersonDto personDto25 = new PersonDto("zack", "zack@gmail.com", 945678901238L);

        AddressDto addressDto1 = new AddressDto(20, "bm", "mysore", 571104);
        AddressDto addressDto2 = new AddressDto(21, "indiranagar", "bangalore", 560038);
        AddressDto addressDto3 = new AddressDto(22, "gandhi bazaar", "bangalore", 560004);
        AddressDto addressDto4 = new AddressDto(23, "rajaji nagar", "bangalore", 560010);
        AddressDto addressDto5 = new AddressDto(24, "malleshwaram", "bangalore", 560003);
        AddressDto addressDto6 = new AddressDto(25, "vidyaranyapuram", "mysore", 570008);
        AddressDto addressDto7 = new AddressDto(26, "hebbal", "mysore", 570017);
        AddressDto addressDto8 = new AddressDto(27, "saraswathipuram", "mysore", 570009);
        AddressDto addressDto9 = new AddressDto(28, "jp nagar", "mysore", 570008);
        AddressDto addressDto10 = new AddressDto(29, "vijayanagar", "mysore", 570032);
        AddressDto addressDto11 = new AddressDto(30, "vishweshwaraiah layout", "bangalore", 560091);
        AddressDto addressDto12 = new AddressDto(31, "whitefield", "bangalore", 560066);
        AddressDto addressDto13 = new AddressDto(32, "kengeri", "bangalore", 560060);
        AddressDto addressDto14 = new AddressDto(33, "btm layout", "bangalore", 560068);
        AddressDto addressDto15 = new AddressDto(34, "jayanagar", "bangalore", 560041);
        AddressDto addressDto16 = new AddressDto(35, "banashankari", "bangalore", 560070);
        AddressDto addressDto17 = new AddressDto(36, "nazarbad", "mysore", 570010);
        AddressDto addressDto18 = new AddressDto(37, "metagalli", "mysore", 570016);
        AddressDto addressDto19 = new AddressDto(38, "lalith mahal", "mysore", 570011);
        AddressDto addressDto20 = new AddressDto(39, "kalidasa road", "mysore", 570002);
        AddressDto addressDto21 = new AddressDto(40, "shankar mutt", "mysore", 570004);
        AddressDto addressDto22 = new AddressDto(41, "chamarajapuram", "mysore", 570005);
        AddressDto addressDto23 = new AddressDto(42, "kumbarakoppal", "mysore", 570015);
        AddressDto addressDto24 = new AddressDto(43, "srirampura", "mysore", 570023);
        AddressDto addressDto25 = new AddressDto(44, "ashokapuram", "mysore", 570008);

        Map<PersonDto,AddressDto> map= new HashMap<>();
        map.put(personDto1, addressDto1);
        map.put(personDto2, addressDto2);
        map.put(personDto3, addressDto3);
        map.put(personDto4, addressDto4);
        map.put(personDto5, addressDto5);
        map.put(personDto6, addressDto6);
        map.put(personDto7, addressDto7);
        map.put(personDto8, addressDto8);
        map.put(personDto9, addressDto9);
        map.put(personDto10, addressDto10);
        map.put(personDto11, addressDto11);
        map.put(personDto12, addressDto12);
        map.put(personDto13, addressDto13);
        map.put(personDto14, addressDto14);
        map.put(personDto15, addressDto15);
        map.put(personDto16, addressDto16);
        map.put(personDto17, addressDto17);
        map.put(personDto18, addressDto18);
        map.put(personDto19, addressDto19);
        map.put(personDto20, addressDto20);
        map.put(personDto21, addressDto21);
        map.put(personDto22, addressDto22);
        map.put(personDto23, addressDto23);
        map.put(personDto24, addressDto24);
        map.put(personDto25, addressDto25);

return map;

    }
}

