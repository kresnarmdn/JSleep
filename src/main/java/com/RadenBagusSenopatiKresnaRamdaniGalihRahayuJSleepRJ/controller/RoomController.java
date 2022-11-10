package com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.controller;

import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.City;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.Facility;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.JsonTable;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.JsonAutowired;
import com.RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ.dbjson.Room;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

public class RoomController implements BasicGetController<Room>{

    @JsonAutowired(value = Room.class, filepath ="src/json.account")
    public static JsonTable<Room> roomTable;

    @Override
    public JsonTable<Room> getJsonTable(){
        return roomTable;
    }

    /*@GetMapping("/room/{id}/renter")
    List<Room> getRoomByRenter(@PathVariable int id, @RequestParam int page, @RequestParam int pageSize){

    }

    @PostMapping("/room/create")
    public Room create(@RequestParam int accountId, @RequestParam String name, @RequestParam int size,
                       @RequestParam int price, @RequestParam Facility facility, @RequestParam City city,
                       @RequestParam String address){

    }*/
}
