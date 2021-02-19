package com.demo21.demorest4.controller;

import com.demo21.demorest4.entity.*;
import com.demo21.demorest4.service.ServiseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


//@CrossOrigin
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class MainController {
    public int num = 0;
   @Autowired
    private ServiseRepo servis = new ServiseRepo();

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/dd")
    public ResponseEntity testString(){
        System.out.println("!!!!!!!!");
        String s = "hai 21vek.";
        return ResponseEntity.ok(new String("hai 21vek."));
    }
// тостовый запрос 2
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/demorest")
    public ResponseEntity main(){
        System.out.println("Good get string = "+num);
        String s = "hai 21vek, getrequest number "+num;
        num++;
        return ResponseEntity.ok(new Ent(s, num-1));
    }
//тестовый запрос
    @GetMapping("/task")
    public ResponseEntity getTask(){
        System.out.println("Good get Task");
        return ResponseEntity.ok(new Task(1, "21vek-ok"));
    }
    // выбор всех по таблице ордер
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/basaorder")
    public ResponseEntity getBasaOrders(){
        System.out.println("Good get Task about base order");
        List<Order_> ar_orders = servis.getAllOrders();
        System.out.println("-------------------------------------------------------------------");
        for(Order_ or:ar_orders){
            System.out.println(or.getId()+" - "+or.getClient()+" - "+or.getDate().toString()+" - "+or.getAddress());
            System.out.println("-------------------------------------------------------------------");
        }
        return ResponseEntity.ok(ar_orders);
    }
//выбор всех
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/basagoods")
    public ResponseEntity getBasaGoods(){
        System.out.println("Good get Task about base goods");
        List<Good> ar_goods = servis.getAllGoods();
        System.out.println("-------------------------------------------------------------------");
        for(Good good:ar_goods){
            System.out.println(good.getGoodid()+" - "+good.getName()+" - "+good.getPrice());
            System.out.println("-------------------------------------------------------------------");
        }
        return ResponseEntity.ok(ar_goods);
    }
    //выбор записи по айди
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/getgoodid/{id}")
    public ResponseEntity getGoodbyId(@PathVariable int id){
        System.out.println("Good get Task about good by id = "+id);
        Optional<Good> good_id = servis.getGoodById(id);
        return ResponseEntity.ok(good_id);
    }
    //удаление записи по айди
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/gooddeleteid/{id}")
    public ResponseEntity deleteGoodbyId(@PathVariable int id){
        System.out.println("Good get Task about delete good by id");
        servis.deleteGoodbyId(id);
        String s = "delete good by number "+id+" ok!";
        return ResponseEntity.ok(s);
    }
    //модификация существующей записи
    @CrossOrigin("http://localhost:4200")
    @PutMapping("/updategoodbyid/{id}")
    public ResponseEntity updateGoodbyId(@RequestBody Good upgood, @PathVariable int id){
        System.out.println("Good get Task about update good by id");
        servis.updateGoodById(upgood, id);
        return ResponseEntity.ok("good number "+id+" was update successfully");
    }
    // добавление новой записи
    @CrossOrigin("http://localhost:4200")
    //@PostMapping(value = "/newgood")
    @RequestMapping(value = "/newgood", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public String postGood(@RequestBody Good g){
        System.out.println("Good post Task about new good   - !");
        System.out.println(g.getGoodid()+" - "+g.getName() + " - "+ g.getName());
        //servis.newGood(g);
        return "Created ok!";
    }


}
