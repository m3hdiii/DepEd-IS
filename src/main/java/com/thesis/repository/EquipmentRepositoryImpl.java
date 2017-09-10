package com.thesis.repository;

import com.thesis.model.items.Material;
import com.thesis.model.items.equipments.Equipment;
import com.thesis.model.items.equipments.EquipmentInfo;
import com.thesis.model.items.equipments.EquipmentStatus;
import com.thesis.model.items.equipments.EquipmentType;
import com.thesis.model.supplys.Supply;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehdi on 7/18/17.
 */


class SaveEquipment{

    public static List<Equipment> fetchEquipment(){
        return new ArrayList<Equipment>(){{
//            add(new Equipment(1L, "TV-1", "Tv Number 1", EquipmentStatus.OK, "ST-12", 200.0, new EquipmentInfo(1L, "200", Material.METAL, 20, 100, EquipmentType.ELECTRICAL, (short)2), new Supply()));
//            add(new Equipment(2L, "TV-2", "Tv Number 2", EquipmentStatus.OK, "ST-13", 250.0, new EquipmentInfo(2L, "200", Material.METAL, 20, 100, EquipmentType.ELECTRICAL, (short)2), new Supply()));
//            add(new Equipment(3L, "TV-3", "Tv Number 3", EquipmentStatus.OK, "ST-14", 260.0, new EquipmentInfo(3L, "200", Material.METAL, 20, 100, EquipmentType.ELECTRICAL, (short)2), new Supply()));
//            add(new Equipment(4L, "TV-4", "Tv Number 4", EquipmentStatus.OK, "ST-15", 270.0, new EquipmentInfo(4L, "200", Material.METAL, 20, 100, EquipmentType.ELECTRICAL, (short)2), new Supply()));
//            add(new Equipment(5L, "TV-5", "Tv Number 5", EquipmentStatus.OK, "ST-16", 280.0, new EquipmentInfo(5L, "200", Material.METAL, 20, 100, EquipmentType.ELECTRICAL, (short)2), new Supply()));
        }};

    }
}


@Repository
public class EquipmentRepositoryImpl implements EquipmentRepository{

    @Override
    public List<Equipment> fetchEquipment() {
        return SaveEquipment.fetchEquipment();
    }

    @Override
    public boolean addEquipment(Equipment item) {
        return false;
    }

    @Override
    public boolean editEquipment(Equipment item) {
        return false;
    }

    @Override
    public boolean deleteEquipment(Equipment item) {
        return false;
    }
}
